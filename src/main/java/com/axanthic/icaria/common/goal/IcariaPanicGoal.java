package com.axanthic.icaria.common.goal;

import net.minecraft.core.BlockPos;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.util.DefaultRandomPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.phys.Vec3;

import java.util.EnumSet;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault

public class IcariaPanicGoal extends Goal {
    public boolean isRunning;

    public double posX;
    public double posY;
    public double posZ;
    public double speedModifier;

    public PathfinderMob mob;

    public IcariaPanicGoal(PathfinderMob pMob, double pSpeedModifier) {
        this.mob = pMob;
        this.speedModifier = pSpeedModifier;
        this.setFlags(EnumSet.of(Goal.Flag.MOVE));
    }

    @Override
    public boolean canContinueToUse() {
        return !this.mob.getNavigation().isDone();
    }

    @Override
    public boolean canUse() {
        if (!this.shouldPanic()) {
            return false;
        } else {
            if (this.mob.isOnFire()) {
                BlockPos blockPos = this.lookForWater(this.mob.level, this.mob, 5);
                if (blockPos != null) {
                    this.posX = blockPos.getX();
                    this.posY = blockPos.getY();
                    this.posZ = blockPos.getZ();
                    return true;
                }
            }

            return this.findRandomPosition();
        }
    }

    public boolean findRandomPosition() {
        Vec3 vec3 = DefaultRandomPos.getPos(this.mob, 5, 4);
        if (vec3 == null) {
            return false;
        } else {
            this.posX = vec3.x;
            this.posY = vec3.y;
            this.posZ = vec3.z;
            return true;
        }
    }

    public boolean shouldPanic() {
        return this.mob.isOnFire();
    }

    @Override
    public void start() {
        this.isRunning = true;
        this.mob.getNavigation().moveTo(this.posX, this.posY, this.posZ, this.speedModifier);
    }

    @Override
    public void stop() {
        this.isRunning = false;
    }

    public BlockPos lookForWater(BlockGetter pLevel, Entity pEntity, int pRange) {
        BlockPos blockPos = pEntity.blockPosition();
        return !pLevel.getBlockState(blockPos).getCollisionShape(pLevel, blockPos).isEmpty() ? null : BlockPos.findClosestMatch(pEntity.blockPosition(), pRange, 1, (pPos) -> pLevel.getFluidState(pPos).is(FluidTags.WATER)).orElse(null);
    }
}
