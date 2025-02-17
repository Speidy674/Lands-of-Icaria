package com.axanthic.icaria.common.world.feature.vine;

import com.axanthic.icaria.common.block.IcariaVineBlock;
import com.axanthic.icaria.common.properties.Vine;
import com.axanthic.icaria.common.registry.IcariaBlockStateProperties;
import com.axanthic.icaria.common.registry.IcariaBlocks;

import com.mojang.serialization.Codec;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault

public class BrushyVineFeature extends IcariaVineFeature {
    public BrushyVineFeature(Codec<NoneFeatureConfiguration> pCodec) {
        super(pCodec, IcariaBlocks.BRUSHY_VINE.get());
    }

    @Override
    public void placeVine(WorldGenLevel pLevel, BlockPos pPos, Direction pDirection) {
        if (pLevel.getBlockState(pPos).isAir() && (pLevel.getBlockState(pPos.relative(pDirection)).is(BlockTags.LEAVES) || pLevel.getBlockState(pPos.relative(pDirection)).isSolidRender(pLevel, pPos.relative(pDirection))) && IcariaVineBlock.isAcceptableNeighbour(pLevel, pPos.relative(pDirection), pDirection)) {
            if (pLevel.getRandom().nextBoolean()) {
                if (pLevel.getRandom().nextInt(2) == 0) {
                    this.setBlock(pLevel, pPos, this.vine.defaultBlockState().setValue(IcariaVineBlock.getPropForFace(pDirection), true).setValue(IcariaBlockStateProperties.VINE, Vine.NONE));
                } else if (pLevel.getRandom().nextInt(2) == 1) {
                    this.setBlock(pLevel, pPos, this.vine.defaultBlockState().setValue(IcariaVineBlock.getPropForFace(pDirection), true).setValue(IcariaBlockStateProperties.VINE, Vine.RIPE));
                }
            } else {
                this.setBlock(pLevel, pPos, this.vine.defaultBlockState().setValue(IcariaVineBlock.getPropForFace(pDirection), true).setValue(IcariaBlockStateProperties.VINE, Vine.VINE));
            }
        }
    }
}
