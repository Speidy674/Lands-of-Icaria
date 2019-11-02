package com.axanthic.loi.worldgen.biome;

import java.util.Random;

import com.axanthic.loi.ModInformation;
import com.axanthic.loi.Resources;
import com.axanthic.loi.entity.EntityAeternae;
import com.axanthic.loi.entity.EntityArachne;
import com.axanthic.loi.entity.EntityArachneDrone;
import com.axanthic.loi.entity.EntityArganHound;
import com.axanthic.loi.entity.EntityCatoblepas;
import com.axanthic.loi.entity.EntityCerver;
import com.axanthic.loi.entity.EntityJellyfish;
import com.axanthic.loi.entity.EntityMyrmeke;
import com.axanthic.loi.entity.EntityRevenant;
import com.axanthic.loi.entity.EntitySnull;
import com.axanthic.loi.entity.EntitySow;
import com.axanthic.loi.worldgen.feature.WorldGenCypressTree;
import com.axanthic.loi.worldgen.feature.WorldGenOliveTree;

import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BiomeSteppe extends BiomeLOI {

	public BiomeSteppe() {
		super(new BiomeProperties(ModInformation.ID + ":steppe").setRainDisabled().setTemperature(1.6F));
		this.setRegistryName(ModInformation.ID + ":steppe");

		spawnableCreatureList.clear();
		spawnableMonsterList.clear();
		spawnableWaterCreatureList.clear();
		spawnableCaveCreatureList.clear();
		spawnableCreatureList.add(new Biome.SpawnListEntry(EntityAeternae.class, 50, 2, 6));
		spawnableCreatureList.add(new Biome.SpawnListEntry(EntityCatoblepas.class, 50, 2, 6));
		spawnableCreatureList.add(new Biome.SpawnListEntry(EntitySnull.class, 50, 2, 6));
		spawnableCreatureList.add(new Biome.SpawnListEntry(EntitySow.class, 50, 2, 6));
		spawnableCreatureList.add(new Biome.SpawnListEntry(EntityJellyfish.class, 100, 1, 2));
		spawnableMonsterList.add(new Biome.SpawnListEntry(EntityRevenant.class, 200, 2, 5));
		spawnableMonsterList.add(new Biome.SpawnListEntry(EntityArachneDrone.class, 200, 2, 5));
		spawnableMonsterList.add(new Biome.SpawnListEntry(EntityArachne.class, 50, 1, 1));
		spawnableMonsterList.add(new Biome.SpawnListEntry(EntityMyrmeke.class, 200, 2, 5));
		spawnableMonsterList.add(new Biome.SpawnListEntry(EntityCerver.class, 200, 2, 5));
		spawnableMonsterList.add(new Biome.SpawnListEntry(EntityArganHound.class, 200, 2, 5));

		flowers.clear();
		addFlower(Resources.flower.getBlock().getStateFromMeta(2), 20);
		addFlower(Resources.flower.getBlock().getStateFromMeta(4), 20);
		addFlower(Resources.flower.getBlock().getStateFromMeta(7), 20);
		addFlower(Resources.flower.getBlock().getStateFromMeta(8), 20);
		addFlower(Resources.flower.getBlock().getStateFromMeta(11), 20);
		addFlower(Resources.herb.getBlock().getStateFromMeta(2), 10);
		addFlower(Resources.herb.getBlock().getStateFromMeta(3), 10);
	}

	@SideOnly(Side.CLIENT)
	public int getGrassColorAtPos(BlockPos pos) {
		return 0x97C15F;
	}

	@Override
	public void genTerrainBlocks(World worldIn, Random rand, ChunkPrimer chunkPrimerIn, int x, int z, double noiseVal) {

	}

	@Override
	public BiomeDecorator createBiomeDecorator() {
		LOIBiomeDecorator biomeDecorator = new LOIBiomeDecorator();

		biomeDecorator.treesPerChunk = 4;
		biomeDecorator.extraTreeChance = 0.2F;
		biomeDecorator.flowersPerChunk = 5;
		biomeDecorator.grassPerChunk = 6;
		biomeDecorator.lakeChance = 7;
		biomeDecorator.treeGenerators.add(new WorldGenCypressTree(false).init());
		biomeDecorator.treeGenerators.add(new WorldGenOliveTree(false).init());
		biomeDecorator.vines = new IBlockState[] {
				Resources.vineBranch.getBlock().getDefaultState(),
				Resources.vineThorny.getBlock().getDefaultState()
		};

		return biomeDecorator;
	}

	@Override
	public WorldGenAbstractTree getRandomTreeFeature(Random rand) {
		return (WorldGenAbstractTree)(rand.nextInt(10) == 0 ? BIG_TREE_FEATURE : TREE_FEATURE);
	}

	@Override
	public WorldGenerator getRandomWorldGenForGrass(Random rand) {
		return new WorldGenTallGrass(BlockTallGrass.EnumType.GRASS);
	}

	@Override
	public BlockFlower.EnumFlowerType pickRandomFlower(Random rand, BlockPos pos) {
		return rand.nextInt(3) > 0 ? BlockFlower.EnumFlowerType.DANDELION : BlockFlower.EnumFlowerType.POPPY;
	}
}
