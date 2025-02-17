package com.axanthic.icaria.common.world.feature.pillar;

import com.axanthic.icaria.common.registry.IcariaBlocks;
import com.axanthic.icaria.data.tags.IcariaBlockTags;

import com.mojang.serialization.Codec;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

import javax.annotation.ParametersAreNonnullByDefault;

@SuppressWarnings("unused")
@ParametersAreNonnullByDefault

public class VerticalRelicstonePillarFeature extends Feature<NoneFeatureConfiguration> {
    public VerticalRelicstonePillarFeature(Codec<NoneFeatureConfiguration> pCodec) {
        super(pCodec);
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> pContext) {
        var level = pContext.level();
        var origin = pContext.origin();
        var random = pContext.random();

        int height = random.nextIntBetweenInclusive(2, 4);
        int offset = 0;

        this.placeHead(level, origin, Direction.UP);

        for (int i = 1; i <= height; ++i) {
            ++offset;
            this.placePillar(level, origin.above(offset), Direction.UP);
        }

        ++offset;
        this.placeHead(level, origin.above(offset), Direction.DOWN);

        return true;
    }

    public void placeHead(WorldGenLevel pLevel, BlockPos pPos, Direction pDirection, int pChance) {
        if (pLevel.getRandom().nextInt(pChance) == 0) {
            this.placeHead(pLevel, pPos, pDirection);
        }
    }

    public void placeHead(WorldGenLevel pLevel, BlockPos pPos, Direction pDirection) {
        if (pLevel.getBlockState(pPos).isAir() && (pLevel.getBlockState(pPos.below()).is(IcariaBlockTags.DIRT_AND_SAND) || pLevel.getBlockState(pPos.below()).is(IcariaBlocks.RELICSTONE_PILLAR.get()))) {
            this.setBlock(pLevel, pPos, IcariaBlocks.RELICSTONE_PILLAR_HEAD.get().defaultBlockState().setValue(BlockStateProperties.FACING, pDirection));
        }
    }

    public void placePillar(WorldGenLevel pLevel, BlockPos pPos, Direction pDirection, int pChance) {
        if (pLevel.getRandom().nextInt(pChance) == 0) {
            this.placePillar(pLevel, pPos, pDirection);
        }
    }

    public void placePillar(WorldGenLevel pLevel, BlockPos pPos, Direction pDirection) {
        if (pLevel.getBlockState(pPos).isAir() && (pLevel.getBlockState(pPos.below()).is(IcariaBlocks.RELICSTONE_PILLAR.get()) || pLevel.getBlockState(pPos.below()).is(IcariaBlocks.RELICSTONE_PILLAR_HEAD.get()))) {
            this.setBlock(pLevel, pPos, IcariaBlocks.RELICSTONE_PILLAR.get().defaultBlockState().setValue(BlockStateProperties.AXIS, pDirection.getAxis()));
        }
    }
}
