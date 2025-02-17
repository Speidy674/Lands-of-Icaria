package com.axanthic.icaria.common.world.feature.herb;

import com.axanthic.icaria.common.registry.IcariaBlocks;

import com.mojang.serialization.Codec;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.phys.AABB;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault

public class BolbosFeature extends Feature<NoneFeatureConfiguration> {
    public BolbosFeature(Codec<NoneFeatureConfiguration> pCodec) {
        super(pCodec);
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> pContext) {
        var level = pContext.level();
        var origin = pContext.origin();
        var random = pContext.random();
        var direction = Direction.Plane.HORIZONTAL.getRandomDirection(random);

        int size = 2;

        var aabb = AABB.ofSize(origin.getCenter(), 0, 16, 0);
        var list = level.getBlockStates(aabb).toList();

        boolean test = list.contains(IcariaBlocks.GRAINITE.get().defaultBlockState());

        for (int x = -size; x <= size; x++) {
            for (int y = -size; y <= size; y++) {
                for (int z = -size; z <= size; z++) {
                    if (test) {
                        this.placeHerb(level, origin.relative(direction, x).above(y).relative(direction.getClockWise(), z), 4);
                        this.placeRubble(level, origin.relative(direction, x).above(y).relative(direction.getClockWise(), z), 4);
                    }
                }
            }
        }

        return true;
    }

    public void placeHerb(WorldGenLevel pLevel, BlockPos pPos, int pChance) {
        if (pLevel.getRandom().nextInt(pChance) == 0) {
            this.placeHerb(pLevel, pPos);
        }
    }

    public void placeHerb(WorldGenLevel pLevel, BlockPos pPos) {
        if (pLevel.getBlockState(pPos).isAir() && pLevel.getBlockState(pPos.below()).is(IcariaBlocks.GRAINEL.get())) {
            this.setBlock(pLevel, pPos, IcariaBlocks.BOLBOS.get().defaultBlockState());
        }
    }

    public void placeRubble(WorldGenLevel pLevel, BlockPos pPos, int pChance) {
        if (pLevel.getRandom().nextInt(pChance) == 0) {
            this.placeRubble(pLevel, pPos);
        }
    }

    public void placeRubble(WorldGenLevel pLevel, BlockPos pPos) {
        if (pLevel.getBlockState(pPos).isAir() && pLevel.getBlockState(pPos.below()).is(IcariaBlocks.GRAINEL.get())) {
            this.setBlock(pLevel, pPos, IcariaBlocks.GRAINITE_RUBBLE.get().defaultBlockState());
        }
    }
}
