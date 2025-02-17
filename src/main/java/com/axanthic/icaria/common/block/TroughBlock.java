package com.axanthic.icaria.common.block;

import com.axanthic.icaria.common.registry.IcariaBlockStateProperties;
import com.axanthic.icaria.common.registry.IcariaItems;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.ParametersAreNonnullByDefault;

@SuppressWarnings("deprecation")
@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class TroughBlock extends Block {
    public static final VoxelShape SHAPE_NORTH = Block.box(0.0D, 0.0D, 8.0D, 16.0D, 5.0D, 16.0D);
    public static final VoxelShape SHAPE_EAST = Block.box(0.0D, 0.0D, 0.0D, 8.0D, 5.0D, 16.0D);
    public static final VoxelShape SHAPE_SOUTH = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 5.0D, 8.0D);
    public static final VoxelShape SHAPE_WEST = Block.box(8.0D, 0.0D, 0.0D, 16.0D, 5.0D, 16.0D);

    public TroughBlock(Properties pProperties) {
        super(pProperties);
        this.registerDefaultState(this.stateDefinition.any().setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).setValue(IcariaBlockStateProperties.TROUGH_WATER, false));
    }

    @Override
    public boolean hasAnalogOutputSignal(BlockState pState) {
        return true;
    }

    @Override
    public int getAnalogOutputSignal(BlockState pState, Level pLevel, BlockPos pPos) {
        return pState.getValue(IcariaBlockStateProperties.TROUGH_WATER) ? 15 : 0;
    }

    @Override
    public void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(BlockStateProperties.HORIZONTAL_FACING, IcariaBlockStateProperties.TROUGH_WATER);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        return this.defaultBlockState().setValue(BlockStateProperties.HORIZONTAL_FACING, pContext.getHorizontalDirection().getOpposite());
    }

    @Override
    public BlockState mirror(BlockState pState, Mirror pMirror) {
        return pState.setValue(BlockStateProperties.HORIZONTAL_FACING, pMirror.mirror(pState.getValue(BlockStateProperties.HORIZONTAL_FACING)));
    }

    @Override
    public BlockState rotate(BlockState pState, Rotation pRotation) {
        return pState.setValue(BlockStateProperties.HORIZONTAL_FACING, pRotation.rotate(pState.getValue(BlockStateProperties.HORIZONTAL_FACING)));
    }

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        var itemStack = pPlayer.getItemInHand(pHand);
        if (pState.getValue(IcariaBlockStateProperties.TROUGH_WATER)) {
            if (itemStack.is(Items.BUCKET)) {
                pLevel.playSound(null, pPos, SoundEvents.BUCKET_FILL, SoundSource.BLOCKS);
                pLevel.setBlockAndUpdate(pPos, pState.setValue(IcariaBlockStateProperties.TROUGH_WATER, false));
                pPlayer.awardStat(Stats.ITEM_USED.get(Items.BUCKET));
                if (!pPlayer.isCreative()) {
                    pPlayer.setItemInHand(pHand, new ItemStack(IcariaItems.MEDITERRANEAN_WATER_BUCKET.get()));
                }
            }
        } else {
            if (itemStack.is(IcariaItems.MEDITERRANEAN_WATER_BUCKET.get())) {
                pLevel.playSound(null, pPos, SoundEvents.BUCKET_EMPTY, SoundSource.BLOCKS);
                pLevel.setBlockAndUpdate(pPos, pState.setValue(IcariaBlockStateProperties.TROUGH_WATER, true));
                pPlayer.awardStat(Stats.ITEM_USED.get(IcariaItems.MEDITERRANEAN_WATER_BUCKET.get()));
                if (!pPlayer.isCreative()) {
                    pPlayer.setItemInHand(pHand, new ItemStack(Items.BUCKET));
                }
            }
        }

        return InteractionResult.SUCCESS;
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return switch (pState.getValue(BlockStateProperties.HORIZONTAL_FACING)) {
            case NORTH -> TroughBlock.SHAPE_NORTH;
            case EAST -> TroughBlock.SHAPE_EAST;
            case SOUTH -> TroughBlock.SHAPE_SOUTH;
            default ->  TroughBlock.SHAPE_WEST;
        };
    }
}
