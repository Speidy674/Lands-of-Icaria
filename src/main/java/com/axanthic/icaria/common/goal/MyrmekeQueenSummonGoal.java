package com.axanthic.icaria.common.goal;

import com.axanthic.icaria.common.entity.MyrmekeQueenEntity;
import com.axanthic.icaria.common.entity.MyrmekeSoldierEntity;
import com.axanthic.icaria.common.registry.IcariaEntityTypes;
import com.axanthic.icaria.common.spell.IcariaSummonSpell;
import com.axanthic.icaria.data.tags.IcariaBlockTags;

import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.targeting.TargetingConditions;

public class MyrmekeQueenSummonGoal extends Goal {
    public MyrmekeQueenEntity entity;

    public TargetingConditions targetingConditions = TargetingConditions.forNonCombat().range(16.0D).ignoreLineOfSight().ignoreInvisibilityTesting();

    public MyrmekeQueenSummonGoal(MyrmekeQueenEntity pEntity) {
        super();
        this.entity = pEntity;
    }

    @Override
    public boolean canUse() {
        return this.entity.level().getNearbyEntities(MyrmekeSoldierEntity.class, this.targetingConditions, this.entity, this.entity.getBoundingBox().inflate(32.0D)).size() <= 2;
    }

    @Override
    public void start() {
        this.entity.setCasting(IcariaSummonSpell.SUMMON);
    }

    @Override
    public void tick() {
        for (int i = 0; i < this.entity.getRandom().nextIntBetweenInclusive(3, 4); ++i) {
            var level = this.entity.level();
            var entity = IcariaEntityTypes.MYRMEKE_SOLDIER.get().create(level);
            var blockPos = this.entity.blockPosition().offset(-4 + this.entity.getRandom().nextInt(8), 0, -4 + this.entity.getRandom().nextInt(8));
            if (entity != null) {
                if (level.getBlockState(blockPos).canBeReplaced()) {
                    if (this.entity.getBlockStateOn().is(IcariaBlockTags.DIRT_AND_SAND)) {
                        entity.moveTo(blockPos, 0.0F, 0.0F);
                        level.addFreshEntity(entity);
                    }
                }
            }
        }
    }
}
