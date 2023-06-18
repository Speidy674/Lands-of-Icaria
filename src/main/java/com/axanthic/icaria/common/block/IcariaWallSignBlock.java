package com.axanthic.icaria.common.block;

import com.axanthic.icaria.common.entity.IcariaSignBlockEntity;
import com.axanthic.icaria.common.registry.IcariaBlockStateProperties;
import com.axanthic.icaria.common.registry.IcariaFluids;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.*;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.ParametersAreNonnullByDefault;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class IcariaWallSignBlock extends WallSignBlock implements EntityBlock {
	public static final VoxelShape CEILING_NORTH = Block.box(0.0D, 14.0D, 4.5D, 16.0D, 16.0D, 12.5D);
	public static final VoxelShape CEILING_EAST = Block.box(3.5D, 14.0D, 0.0D, 11.5D, 16.0D, 16.0D);
	public static final VoxelShape CEILING_SOUTH = Block.box(0.0D, 14.0D, 3.5D, 16.0D, 16.0D, 11.5D);
	public static final VoxelShape CEILING_WEST = Block.box(4.5D, 14.0D, 0.0D, 12.5D, 16.0D, 16.0D);
	public static final VoxelShape FLOOR_NORTH = Block.box(0.0D, 0.0D, 3.5D, 16.0D, 2.0D, 11.5D);
	public static final VoxelShape FLOOR_EAST = Block.box(4.5D, 0.0D, 0.0D, 12.5D, 2.0D, 16.0D);
	public static final VoxelShape FLOOR_SOUTH = Block.box(0.0D, 0.0D, 4.5D, 16.0D, 2.0D, 12.5D);
	public static final VoxelShape FLOOR_WEST = Block.box(3.5D, 0.0D, 0.0D, 11.5D, 2.0D, 16.0D);
	public static final VoxelShape WALL_NORTH = Block.box(0.0D, 4.5D, 14.0D, 16.0D, 12.5D, 16.0D);
	public static final VoxelShape WALL_EAST = Block.box(0.0D, 4.5D, 0.0D, 2.0D, 12.5D, 16.0D);
	public static final VoxelShape WALL_SOUTH = Block.box(0.0D, 4.5D, 0.0D, 16.0D, 12.5D, 2.0D);
	public static final VoxelShape WALL_WEST = Block.box(14.0D, 4.5D, 0.0D, 16.0D, 12.5D, 16.0D);

	public IcariaWallSignBlock(Properties pProperties, WoodType pWoodType) {
		super(pProperties, pWoodType);
		this.registerDefaultState(this.stateDefinition.any().setValue(BlockStateProperties.ATTACH_FACE, AttachFace.WALL).setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).setValue(IcariaBlockStateProperties.MEDITERRANEAN_WATERLOGGED, false).setValue(BlockStateProperties.WATERLOGGED, false));
	}

	public boolean canAttach(LevelReader pLevel, BlockPos pPos, Direction pDirection) {
		var relativePos = pPos.relative(pDirection);
		return pLevel.getBlockState(relativePos).isFaceSturdy(pLevel, relativePos, pDirection.getOpposite());
	}

	@Override
	public boolean canSurvive(BlockState pState, LevelReader pLevel, BlockPos pPos) {
		return this.canAttach(pLevel, pPos, this.getConnectedDirection(pState).getOpposite());
	}

	@Override
	public void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
		pBuilder.add(BlockStateProperties.ATTACH_FACE, BlockStateProperties.HORIZONTAL_FACING, IcariaBlockStateProperties.MEDITERRANEAN_WATERLOGGED, BlockStateProperties.WATERLOGGED);
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
		return new IcariaSignBlockEntity(pPos, pState);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext pContext) {
		var clickedPos = pContext.getClickedPos();
		var level = pContext.getLevel();
		for (Direction direction : pContext.getNearestLookingDirections()) {
			BlockState blockState;
			if (direction.getAxis() == Direction.Axis.Y) {
				blockState = this.defaultBlockState().setValue(BlockStateProperties.ATTACH_FACE, direction == Direction.UP ? AttachFace.CEILING : AttachFace.FLOOR).setValue(BlockStateProperties.HORIZONTAL_FACING, pContext.getHorizontalDirection()).setValue(IcariaBlockStateProperties.MEDITERRANEAN_WATERLOGGED, level.getFluidState(clickedPos).getType() == IcariaFluids.MEDITERRANEAN_WATER.get()).setValue(BlockStateProperties.WATERLOGGED, level.getFluidState(clickedPos).getType() == Fluids.WATER);
			} else {
				blockState = this.defaultBlockState().setValue(BlockStateProperties.ATTACH_FACE, AttachFace.WALL).setValue(BlockStateProperties.HORIZONTAL_FACING, direction.getOpposite()).setValue(IcariaBlockStateProperties.MEDITERRANEAN_WATERLOGGED, level.getFluidState(clickedPos).getType() == IcariaFluids.MEDITERRANEAN_WATER.get()).setValue(BlockStateProperties.WATERLOGGED, level.getFluidState(clickedPos).getType() == Fluids.WATER);
			}

			if (blockState.canSurvive(pContext.getLevel(), pContext.getClickedPos())) {
				return blockState;
			}
		}

		return null;
	}

	@Override
	public FluidState getFluidState(BlockState pState) {
		return pState.getValue(IcariaBlockStateProperties.MEDITERRANEAN_WATERLOGGED) ? IcariaFluids.MEDITERRANEAN_WATER.get().getSource(false) : super.getFluidState(pState);
	}

	@Override
	public BlockState updateShape(BlockState pState, Direction pFacing, BlockState pFacingState, LevelAccessor pLevel, BlockPos pCurrentPos, BlockPos pFacingPos) {
		return this.getConnectedDirection(pState).getOpposite() == pFacing && !pState.canSurvive(pLevel, pCurrentPos) ? Blocks.AIR.defaultBlockState() : super.updateShape(pState, pFacing, pFacingState, pLevel, pCurrentPos, pFacingPos);
	}

	public Direction getConnectedDirection(BlockState pState) {
		return switch (pState.getValue(BlockStateProperties.ATTACH_FACE)) {
			default -> pState.getValue(BlockStateProperties.HORIZONTAL_FACING);
			case CEILING -> Direction.DOWN;
			case FLOOR -> Direction.UP;
		};
	}

	@Override
	public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
		return switch (pState.getValue(BlockStateProperties.ATTACH_FACE)) {
			default -> switch (pState.getValue(BlockStateProperties.HORIZONTAL_FACING)) {
				default -> IcariaWallSignBlock.CEILING_NORTH;
				case EAST -> IcariaWallSignBlock.CEILING_EAST;
				case SOUTH -> IcariaWallSignBlock.CEILING_SOUTH;
				case WEST -> IcariaWallSignBlock.CEILING_WEST;
			};

			case FLOOR -> switch (pState.getValue(BlockStateProperties.HORIZONTAL_FACING)) {
				default -> IcariaWallSignBlock.FLOOR_NORTH;
				case EAST -> IcariaWallSignBlock.FLOOR_EAST;
				case SOUTH -> IcariaWallSignBlock.FLOOR_SOUTH;
				case WEST -> IcariaWallSignBlock.FLOOR_WEST;
			};

			case WALL -> switch (pState.getValue(BlockStateProperties.HORIZONTAL_FACING)) {
				default -> IcariaWallSignBlock.WALL_NORTH;
				case EAST -> IcariaWallSignBlock.WALL_EAST;
				case SOUTH -> IcariaWallSignBlock.WALL_SOUTH;
				case WEST -> IcariaWallSignBlock.WALL_WEST;
			};
		};
	}
}
