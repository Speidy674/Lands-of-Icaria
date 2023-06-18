package com.axanthic.icaria.common.entity;

import com.axanthic.icaria.common.registry.IcariaBlockEntityTypes;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;

import net.minecraftforge.common.extensions.IForgeBlockEntity;

public class CrystalBlockEntity extends BlockEntity {
	public double x;
	public double y;
	public double z;

	public float red;
	public float green;
	public float blue;

	public CrystalBlockEntity(BlockPos pPos, BlockState pState) {
		super(IcariaBlockEntityTypes.CRYSTAL.get(), pPos, pState);
	}

	public CrystalBlockEntity(BlockPos pPos, BlockState pBlockState, double pX, double pY, double pZ, float pRed, float pGreen, float pBlue) {
		this(pPos, pBlockState);
		this.x = pX;
		this.y = pY;
		this.z = pZ;
		this.red = pRed;
		this.green = pGreen;
		this.blue = pBlue;
	}

	@Override
	public AABB getRenderBoundingBox() {
		return IForgeBlockEntity.INFINITE_EXTENT_AABB;
	}
}
