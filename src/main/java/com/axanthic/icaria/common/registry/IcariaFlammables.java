package com.axanthic.icaria.common.registry;

import com.axanthic.icaria.mixin.FireBlockMixin;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FireBlock;

public class IcariaFlammables {
	public static void flammableBlock(Block pBlock, int pEncouragement, int pFlammability) {
		FireBlock fireBlock = (FireBlock) Blocks.FIRE;
		((FireBlockMixin) fireBlock).setIcariaFlammables(pBlock, pEncouragement, pFlammability);
	}

	public static void setup() {
		IcariaFlammables.flammableBlock(IcariaBlocks.ARACHNE_STRING_BLOCK.get(), 30, 60);
		IcariaFlammables.flammableBlock(IcariaBlocks.SPELT_BALE_BLOCK.get(), 60, 20);
		IcariaFlammables.flammableBlock(IcariaBlocks.VINE_REED_BLOCK.get(), 5, 20);
		IcariaFlammables.flammableBlock(IcariaBlocks.VINE_SPROUT_BLOCK.get(), 5, 20);
		IcariaFlammables.flammableBlock(IcariaBlocks.CYPRESS_LEAVES.get(), 30, 60);
		IcariaFlammables.flammableBlock(IcariaBlocks.FALLEN_CYPRESS_LEAVES.get(), 30, 60);
		IcariaFlammables.flammableBlock(IcariaBlocks.CYPRESS_TWIGS.get(), 30, 60);
		IcariaFlammables.flammableBlock(IcariaBlocks.CYPRESS_WOOD.get(), 5 ,5);
		IcariaFlammables.flammableBlock(IcariaBlocks.STRIPPED_CYPRESS_WOOD.get(), 5 ,5);
		IcariaFlammables.flammableBlock(IcariaBlocks.CYPRESS_LOG.get(), 5 ,5);
		IcariaFlammables.flammableBlock(IcariaBlocks.STRIPPED_CYPRESS_LOG.get(), 5 ,5);
		IcariaFlammables.flammableBlock(IcariaBlocks.DEAD_CYPRESS_LOG.get(), 5 ,5);
		IcariaFlammables.flammableBlock(IcariaBlocks.STRIPPED_DEAD_CYPRESS_LOG.get(), 5 ,5);
		IcariaFlammables.flammableBlock(IcariaBlocks.CYPRESS_PLANKS.get(), 5 ,20);
		IcariaFlammables.flammableBlock(IcariaBlocks.CYPRESS_DECO.slab.get(), 5, 20);
		IcariaFlammables.flammableBlock(IcariaBlocks.CYPRESS_DECO.stairs.get(), 5, 20);
		IcariaFlammables.flammableBlock(IcariaBlocks.CYPRESS_DECO.fence.get(), 5, 20);
		IcariaFlammables.flammableBlock(IcariaBlocks.CYPRESS_DECO.gate.get(), 5, 20);
		IcariaFlammables.flammableBlock(IcariaBlocks.DROUGHTROOT_LEAVES.get(), 30, 60);
		IcariaFlammables.flammableBlock(IcariaBlocks.FALLEN_DROUGHTROOT_LEAVES.get(), 30, 60);
		IcariaFlammables.flammableBlock(IcariaBlocks.DROUGHTROOT_TWIGS.get(), 30, 60);
		IcariaFlammables.flammableBlock(IcariaBlocks.DROUGHTROOT_WOOD.get(), 5 ,5);
		IcariaFlammables.flammableBlock(IcariaBlocks.STRIPPED_DROUGHTROOT_WOOD.get(), 5 ,5);
		IcariaFlammables.flammableBlock(IcariaBlocks.DROUGHTROOT_LOG.get(), 5 ,5);
		IcariaFlammables.flammableBlock(IcariaBlocks.STRIPPED_DROUGHTROOT_LOG.get(), 5 ,5);
		IcariaFlammables.flammableBlock(IcariaBlocks.DEAD_DROUGHTROOT_LOG.get(), 5 ,5);
		IcariaFlammables.flammableBlock(IcariaBlocks.STRIPPED_DEAD_DROUGHTROOT_LOG.get(), 5 ,5);
		IcariaFlammables.flammableBlock(IcariaBlocks.DROUGHTROOT_PLANKS.get(), 5 ,20);
		IcariaFlammables.flammableBlock(IcariaBlocks.DROUGHTROOT_DECO.slab.get(), 5, 20);
		IcariaFlammables.flammableBlock(IcariaBlocks.DROUGHTROOT_DECO.stairs.get(), 5, 20);
		IcariaFlammables.flammableBlock(IcariaBlocks.DROUGHTROOT_DECO.fence.get(), 5, 20);
		IcariaFlammables.flammableBlock(IcariaBlocks.DROUGHTROOT_DECO.gate.get(), 5, 20);
		IcariaFlammables.flammableBlock(IcariaBlocks.FIR_LEAVES.get(), 30, 60);
		IcariaFlammables.flammableBlock(IcariaBlocks.FALLEN_FIR_LEAVES.get(), 30, 60);
		IcariaFlammables.flammableBlock(IcariaBlocks.FIR_TWIGS.get(), 30, 60);
		IcariaFlammables.flammableBlock(IcariaBlocks.FIR_WOOD.get(), 5 ,5);
		IcariaFlammables.flammableBlock(IcariaBlocks.STRIPPED_FIR_WOOD.get(), 5 ,5);
		IcariaFlammables.flammableBlock(IcariaBlocks.FIR_LOG.get(), 5 ,5);
		IcariaFlammables.flammableBlock(IcariaBlocks.STRIPPED_FIR_LOG.get(), 5 ,5);
		IcariaFlammables.flammableBlock(IcariaBlocks.DEAD_FIR_LOG.get(), 5 ,5);
		IcariaFlammables.flammableBlock(IcariaBlocks.STRIPPED_DEAD_FIR_LOG.get(), 5 ,5);
		IcariaFlammables.flammableBlock(IcariaBlocks.FIR_PLANKS.get(), 5 ,20);
		IcariaFlammables.flammableBlock(IcariaBlocks.FIR_DECO.slab.get(), 5, 20);
		IcariaFlammables.flammableBlock(IcariaBlocks.FIR_DECO.stairs.get(), 5, 20);
		IcariaFlammables.flammableBlock(IcariaBlocks.FIR_DECO.fence.get(), 5, 20);
		IcariaFlammables.flammableBlock(IcariaBlocks.FIR_DECO.gate.get(), 5, 20);
		IcariaFlammables.flammableBlock(IcariaBlocks.LAUREL_LEAVES.get(), 30, 60);
		IcariaFlammables.flammableBlock(IcariaBlocks.FALLEN_LAUREL_LEAVES.get(), 30, 60);
		IcariaFlammables.flammableBlock(IcariaBlocks.LAUREL_TWIGS.get(), 30, 60);
		IcariaFlammables.flammableBlock(IcariaBlocks.LAUREL_WOOD.get(), 5 ,5);
		IcariaFlammables.flammableBlock(IcariaBlocks.STRIPPED_LAUREL_WOOD.get(), 5 ,5);
		IcariaFlammables.flammableBlock(IcariaBlocks.LAUREL_LOG.get(), 5 ,5);
		IcariaFlammables.flammableBlock(IcariaBlocks.STRIPPED_LAUREL_LOG.get(), 5 ,5);
		IcariaFlammables.flammableBlock(IcariaBlocks.DEAD_LAUREL_LOG.get(), 5 ,5);
		IcariaFlammables.flammableBlock(IcariaBlocks.STRIPPED_DEAD_LAUREL_LOG.get(), 5 ,5);
		IcariaFlammables.flammableBlock(IcariaBlocks.LAUREL_PLANKS.get(), 5 ,20);
		IcariaFlammables.flammableBlock(IcariaBlocks.LAUREL_DECO.slab.get(), 5, 20);
		IcariaFlammables.flammableBlock(IcariaBlocks.LAUREL_DECO.stairs.get(), 5, 20);
		IcariaFlammables.flammableBlock(IcariaBlocks.LAUREL_DECO.fence.get(), 5, 20);
		IcariaFlammables.flammableBlock(IcariaBlocks.LAUREL_DECO.gate.get(), 5, 20);
		IcariaFlammables.flammableBlock(IcariaBlocks.OLIVE_LEAVES.get(), 30, 60);
		IcariaFlammables.flammableBlock(IcariaBlocks.FALLEN_OLIVE_LEAVES.get(), 30, 60);
		IcariaFlammables.flammableBlock(IcariaBlocks.OLIVE_TWIGS.get(), 30, 60);
		IcariaFlammables.flammableBlock(IcariaBlocks.OLIVE_WOOD.get(), 5 ,5);
		IcariaFlammables.flammableBlock(IcariaBlocks.STRIPPED_OLIVE_WOOD.get(), 5 ,5);
		IcariaFlammables.flammableBlock(IcariaBlocks.OLIVE_LOG.get(), 5 ,5);
		IcariaFlammables.flammableBlock(IcariaBlocks.STRIPPED_OLIVE_LOG.get(), 5 ,5);
		IcariaFlammables.flammableBlock(IcariaBlocks.DEAD_OLIVE_LOG.get(), 5 ,5);
		IcariaFlammables.flammableBlock(IcariaBlocks.STRIPPED_DEAD_OLIVE_LOG.get(), 5 ,5);
		IcariaFlammables.flammableBlock(IcariaBlocks.OLIVE_PLANKS.get(), 5 ,20);
		IcariaFlammables.flammableBlock(IcariaBlocks.OLIVE_DECO.slab.get(), 5, 20);
		IcariaFlammables.flammableBlock(IcariaBlocks.OLIVE_DECO.stairs.get(), 5, 20);
		IcariaFlammables.flammableBlock(IcariaBlocks.OLIVE_DECO.fence.get(), 5, 20);
		IcariaFlammables.flammableBlock(IcariaBlocks.OLIVE_DECO.gate.get(), 5, 20);
		IcariaFlammables.flammableBlock(IcariaBlocks.PLANE_LEAVES.get(), 30, 60);
		IcariaFlammables.flammableBlock(IcariaBlocks.FALLEN_PLANE_LEAVES.get(), 30, 60);
		IcariaFlammables.flammableBlock(IcariaBlocks.PLANE_TWIGS.get(), 30, 60);
		IcariaFlammables.flammableBlock(IcariaBlocks.PLANE_WOOD.get(), 5 ,5);
		IcariaFlammables.flammableBlock(IcariaBlocks.STRIPPED_PLANE_WOOD.get(), 5 ,5);
		IcariaFlammables.flammableBlock(IcariaBlocks.PLANE_LOG.get(), 5 ,5);
		IcariaFlammables.flammableBlock(IcariaBlocks.STRIPPED_PLANE_LOG.get(), 5 ,5);
		IcariaFlammables.flammableBlock(IcariaBlocks.DEAD_PLANE_LOG.get(), 5 ,5);
		IcariaFlammables.flammableBlock(IcariaBlocks.STRIPPED_DEAD_PLANE_LOG.get(), 5 ,5);
		IcariaFlammables.flammableBlock(IcariaBlocks.PLANE_PLANKS.get(), 5 ,20);
		IcariaFlammables.flammableBlock(IcariaBlocks.PLANE_DECO.slab.get(), 5, 20);
		IcariaFlammables.flammableBlock(IcariaBlocks.PLANE_DECO.stairs.get(), 5, 20);
		IcariaFlammables.flammableBlock(IcariaBlocks.PLANE_DECO.fence.get(), 5, 20);
		IcariaFlammables.flammableBlock(IcariaBlocks.PLANE_DECO.gate.get(), 5, 20);
		IcariaFlammables.flammableBlock(IcariaBlocks.POPULUS_LEAVES.get(), 30, 60);
		IcariaFlammables.flammableBlock(IcariaBlocks.FALLEN_POPULUS_LEAVES.get(), 30, 60);
		IcariaFlammables.flammableBlock(IcariaBlocks.POPULUS_TWIGS.get(), 30, 60);
		IcariaFlammables.flammableBlock(IcariaBlocks.POPULUS_WOOD.get(), 5 ,5);
		IcariaFlammables.flammableBlock(IcariaBlocks.STRIPPED_POPULUS_WOOD.get(), 5 ,5);
		IcariaFlammables.flammableBlock(IcariaBlocks.POPULUS_LOG.get(), 5 ,5);
		IcariaFlammables.flammableBlock(IcariaBlocks.STRIPPED_POPULUS_LOG.get(), 5 ,5);
		IcariaFlammables.flammableBlock(IcariaBlocks.DEAD_POPULUS_LOG.get(), 5 ,5);
		IcariaFlammables.flammableBlock(IcariaBlocks.STRIPPED_DEAD_POPULUS_LOG.get(), 5 ,5);
		IcariaFlammables.flammableBlock(IcariaBlocks.POPULUS_PLANKS.get(), 5 ,20);
		IcariaFlammables.flammableBlock(IcariaBlocks.POPULUS_DECO.slab.get(), 5, 20);
		IcariaFlammables.flammableBlock(IcariaBlocks.POPULUS_DECO.stairs.get(), 5, 20);
		IcariaFlammables.flammableBlock(IcariaBlocks.POPULUS_DECO.fence.get(), 5, 20);
		IcariaFlammables.flammableBlock(IcariaBlocks.POPULUS_DECO.gate.get(), 5, 20);
		IcariaFlammables.flammableBlock(IcariaBlocks.DEAD_BLOOMY_VINE.get(), 15, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.GROWING_BLOOMY_VINE.get(), 15, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.BLOOMY_VINE.get(), 15, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.BLOOMING_BLOOMY_VINE.get(), 15, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.RIPE_BLOOMY_VINE.get(), 15, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.DEAD_BRANCHY_VINE.get(), 15, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.GROWING_BRANCHY_VINE.get(), 15, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.BRANCHY_VINE.get(), 15, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.DEAD_BRUSHY_VINE.get(), 15, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.GROWING_BRUSHY_VINE.get(), 15, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.RIPE_BRUSHY_VINE.get(), 15, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.BRUSHY_VINE.get(), 15, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.DEAD_DRY_VINE.get(), 15, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.GROWING_DRY_VINE.get(), 15, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.DRY_VINE.get(), 15, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.DEAD_REEDY_VINE.get(), 15, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.GROWING_REEDY_VINE.get(), 15, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.REEDY_VINE.get(), 15, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.DEAD_SWIRLY_VINE.get(), 15, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.GROWING_SWIRLY_VINE.get(), 15, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.SWIRLY_VINE.get(), 15, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.DEAD_THORNY_VINE.get(), 15, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.GROWING_THORNY_VINE.get(), 15, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.THORNY_VINE.get(), 15, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.FERN.get(), 60, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.SMALL_GRASS.get(), 60, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.MEDIUM_GRASS.get(), 60, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.LARGE_GRASS.get(), 60, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.GRAIN_0.get(), 60, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.GRAIN_1.get(), 60, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.GRAIN_2.get(), 60, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.GRAIN_3.get(), 60, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.GRAIN_4.get(), 60, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.GRAIN_5.get(), 60, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.BLINDWEED.get(), 60, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.CHAMEOMILE.get(), 60, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.CHARMONDER.get(), 60, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.CLOVER.get(), 60, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.FIREHILT.get(), 60, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.BLUE_HYDRACINTH.get(), 60, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.PURPLE_HYDRACINTH.get(), 60, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.LIONFANGS.get(), 60, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.SPEARDROPS.get(), 60, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.PURPLE_STAGHORN.get(), 60, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.YELLOW_STAGHORN.get(), 60, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.BLUE_STORMCOTTON.get(), 60, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.PINK_STORMCOTTON.get(), 60, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.PURPLE_STORMCOTTON.get(), 60, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.SUNKETTLE.get(), 60, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.SUNSPONGE.get(), 60, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.VOIDLILY.get(), 60, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.BOLBOS.get(), 60, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.DATHULLA.get(), 60, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.MONDANOS.get(), 60, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.MOTH_AGARIC.get(), 60, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.NAMDRAKE.get(), 60, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.PSILOCYBOS.get(), 60, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.ROWAN.get(), 60, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.WILTED_ELM.get(), 60, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.BLUE_GROUND_FLOWERS.get(), 60, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.CYAN_GROUND_FLOWERS.get(), 60, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.PINK_GROUND_FLOWERS.get(), 60, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.PURPLE_GROUND_FLOWERS.get(), 60, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.RED_GROUND_FLOWERS.get(), 60, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.WHITE_GROUND_FLOWERS.get(), 60, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.PALM_FERN.get(), 60, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.WHITE_BROMELIA.get(), 60, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.ORANGE_BROMELIA.get(), 60, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.PINK_BROMELIA.get(), 60, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.PURPLE_BROMELIA.get(), 60, 100);
		IcariaFlammables.flammableBlock(IcariaBlocks.STRAWBERRY_BUSH.get(), 60, 100);
	}
}
