package com.axanthic.icaria.common.registry;

import com.axanthic.icaria.mixin.FireBlockAccess;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FireBlock;

public class IcariaFlammables {
	public static void flammableBlock(Block block, int flameOdds, int burnOdds) {
		FireBlock fireBlock = (FireBlock) Blocks.FIRE;
		((FireBlockAccess) fireBlock).accessableFlammable(block, flameOdds, burnOdds);
	}

	public static void setup() {
		flammableBlock(IcariaBlocks.ARACHNE_STRING_BLOCK.get(), 30, 60);
		flammableBlock(IcariaBlocks.SPELT_BALE_BLOCK.get(), 60, 20);
		flammableBlock(IcariaBlocks.VINE_REED_BLOCK.get(), 5, 20);
		flammableBlock(IcariaBlocks.VINE_SPROUT_BLOCK.get(), 5, 20);
		flammableBlock(IcariaBlocks.CYPRESS_WOOD.get(), 5 ,5);
		flammableBlock(IcariaBlocks.STRIPPED_CYPRESS_WOOD.get(), 5 ,5);
		flammableBlock(IcariaBlocks.CYPRESS_LOG.get(), 5 ,5);
		flammableBlock(IcariaBlocks.STRIPPED_CYPRESS_LOG.get(), 5 ,5);
		flammableBlock(IcariaBlocks.DEAD_CYPRESS_LOG.get(), 5 ,5);
		flammableBlock(IcariaBlocks.STRIPPED_DEAD_CYPRESS_LOG.get(), 5 ,5);
		flammableBlock(IcariaBlocks.CYPRESS_PLANKS.get(), 5 ,20);
		flammableBlock(IcariaBlocks.CYPRESS_DECO.SLAB.get(), 5, 20);
		flammableBlock(IcariaBlocks.CYPRESS_DECO.STAIRS.get(), 5, 20);
		flammableBlock(IcariaBlocks.CYPRESS_DECO.FENCE.get(), 5, 20);
		flammableBlock(IcariaBlocks.CYPRESS_DECO.GATE.get(), 5, 20);
		flammableBlock(IcariaBlocks.DROUGHTROOT_WOOD.get(), 5 ,5);
		flammableBlock(IcariaBlocks.STRIPPED_DROUGHTROOT_WOOD.get(), 5 ,5);
		flammableBlock(IcariaBlocks.DROUGHTROOT_LOG.get(), 5 ,5);
		flammableBlock(IcariaBlocks.STRIPPED_DROUGHTROOT_LOG.get(), 5 ,5);
		flammableBlock(IcariaBlocks.DEAD_DROUGHTROOT_LOG.get(), 5 ,5);
		flammableBlock(IcariaBlocks.STRIPPED_DEAD_DROUGHTROOT_LOG.get(), 5 ,5);
		flammableBlock(IcariaBlocks.DROUGHTROOT_PLANKS.get(), 5 ,20);
		flammableBlock(IcariaBlocks.DROUGHTROOT_DECO.SLAB.get(), 5, 20);
		flammableBlock(IcariaBlocks.DROUGHTROOT_DECO.STAIRS.get(), 5, 20);
		flammableBlock(IcariaBlocks.DROUGHTROOT_DECO.FENCE.get(), 5, 20);
		flammableBlock(IcariaBlocks.DROUGHTROOT_DECO.GATE.get(), 5, 20);
		flammableBlock(IcariaBlocks.FIR_WOOD.get(), 5 ,5);
		flammableBlock(IcariaBlocks.STRIPPED_FIR_WOOD.get(), 5 ,5);
		flammableBlock(IcariaBlocks.FIR_LOG.get(), 5 ,5);
		flammableBlock(IcariaBlocks.STRIPPED_FIR_LOG.get(), 5 ,5);
		flammableBlock(IcariaBlocks.DEAD_FIR_LOG.get(), 5 ,5);
		flammableBlock(IcariaBlocks.STRIPPED_DEAD_FIR_LOG.get(), 5 ,5);
		flammableBlock(IcariaBlocks.FIR_PLANKS.get(), 5 ,20);
		flammableBlock(IcariaBlocks.FIR_DECO.SLAB.get(), 5, 20);
		flammableBlock(IcariaBlocks.FIR_DECO.STAIRS.get(), 5, 20);
		flammableBlock(IcariaBlocks.FIR_DECO.FENCE.get(), 5, 20);
		flammableBlock(IcariaBlocks.FIR_DECO.GATE.get(), 5, 20);
		flammableBlock(IcariaBlocks.LAUREL_WOOD.get(), 5 ,5);
		flammableBlock(IcariaBlocks.STRIPPED_LAUREL_WOOD.get(), 5 ,5);
		flammableBlock(IcariaBlocks.LAUREL_LOG.get(), 5 ,5);
		flammableBlock(IcariaBlocks.STRIPPED_LAUREL_LOG.get(), 5 ,5);
		flammableBlock(IcariaBlocks.DEAD_LAUREL_LOG.get(), 5 ,5);
		flammableBlock(IcariaBlocks.STRIPPED_DEAD_LAUREL_LOG.get(), 5 ,5);
		flammableBlock(IcariaBlocks.LAUREL_PLANKS.get(), 5 ,20);
		flammableBlock(IcariaBlocks.LAUREL_DECO.SLAB.get(), 5, 20);
		flammableBlock(IcariaBlocks.LAUREL_DECO.STAIRS.get(), 5, 20);
		flammableBlock(IcariaBlocks.LAUREL_DECO.FENCE.get(), 5, 20);
		flammableBlock(IcariaBlocks.LAUREL_DECO.GATE.get(), 5, 20);
		flammableBlock(IcariaBlocks.OLIVE_WOOD.get(), 5 ,5);
		flammableBlock(IcariaBlocks.STRIPPED_OLIVE_WOOD.get(), 5 ,5);
		flammableBlock(IcariaBlocks.OLIVE_LOG.get(), 5 ,5);
		flammableBlock(IcariaBlocks.STRIPPED_OLIVE_LOG.get(), 5 ,5);
		flammableBlock(IcariaBlocks.DEAD_OLIVE_LOG.get(), 5 ,5);
		flammableBlock(IcariaBlocks.STRIPPED_DEAD_OLIVE_LOG.get(), 5 ,5);
		flammableBlock(IcariaBlocks.OLIVE_PLANKS.get(), 5 ,20);
		flammableBlock(IcariaBlocks.OLIVE_DECO.SLAB.get(), 5, 20);
		flammableBlock(IcariaBlocks.OLIVE_DECO.STAIRS.get(), 5, 20);
		flammableBlock(IcariaBlocks.OLIVE_DECO.FENCE.get(), 5, 20);
		flammableBlock(IcariaBlocks.OLIVE_DECO.GATE.get(), 5, 20);
		flammableBlock(IcariaBlocks.PLANE_WOOD.get(), 5 ,5);
		flammableBlock(IcariaBlocks.STRIPPED_PLANE_WOOD.get(), 5 ,5);
		flammableBlock(IcariaBlocks.PLANE_LOG.get(), 5 ,5);
		flammableBlock(IcariaBlocks.STRIPPED_PLANE_LOG.get(), 5 ,5);
		flammableBlock(IcariaBlocks.DEAD_PLANE_LOG.get(), 5 ,5);
		flammableBlock(IcariaBlocks.STRIPPED_DEAD_PLANE_LOG.get(), 5 ,5);
		flammableBlock(IcariaBlocks.PLANE_PLANKS.get(), 5 ,20);
		flammableBlock(IcariaBlocks.PLANE_DECO.SLAB.get(), 5, 20);
		flammableBlock(IcariaBlocks.PLANE_DECO.STAIRS.get(), 5, 20);
		flammableBlock(IcariaBlocks.PLANE_DECO.FENCE.get(), 5, 20);
		flammableBlock(IcariaBlocks.PLANE_DECO.GATE.get(), 5, 20);
		flammableBlock(IcariaBlocks.POPULUS_WOOD.get(), 5 ,5);
		flammableBlock(IcariaBlocks.STRIPPED_POPULUS_WOOD.get(), 5 ,5);
		flammableBlock(IcariaBlocks.POPULUS_LOG.get(), 5 ,5);
		flammableBlock(IcariaBlocks.STRIPPED_POPULUS_LOG.get(), 5 ,5);
		flammableBlock(IcariaBlocks.DEAD_POPULUS_LOG.get(), 5 ,5);
		flammableBlock(IcariaBlocks.STRIPPED_DEAD_POPULUS_LOG.get(), 5 ,5);
		flammableBlock(IcariaBlocks.POPULUS_PLANKS.get(), 5 ,20);
		flammableBlock(IcariaBlocks.POPULUS_DECO.SLAB.get(), 5, 20);
		flammableBlock(IcariaBlocks.POPULUS_DECO.STAIRS.get(), 5, 20);
		flammableBlock(IcariaBlocks.POPULUS_DECO.FENCE.get(), 5, 20);
		flammableBlock(IcariaBlocks.POPULUS_DECO.GATE.get(), 5, 20);
	}
}
