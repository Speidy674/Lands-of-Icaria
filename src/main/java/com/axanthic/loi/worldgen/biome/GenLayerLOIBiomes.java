package com.axanthic.loi.worldgen.biome;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerLOIBiomes extends GenLayer {
	public GenLayerLOIBiomes(final long l, final GenLayer genlayer) {
		super(l);
		this.parent = genlayer;
	}

	public GenLayerLOIBiomes(final long seed) {
		super(seed);
	}

	@Override
	public int[] getInts(final int x, final int z, final int width, final int depth) {
		final int src[] = this.parent.getInts(x, z, width, depth);
		final int dest[] = IntCache.getIntCache(width * depth);
		for (int dz = 0; dz < depth; dz++) {
			for (int dx = 0; dx < width; dx++) {
				// get offsets
				this.initChunkSeed(((dx + x) | 3), ((dz + z) | 3));

				final int ox = this.nextInt(3) + 1;
				final int oz = this.nextInt(3) + 1;

				final int sourceBiomeId = src[dx + dz * width];
				if (sourceBiomeId != Biome.getIdForBiome(LOIBiomes.voidBiome) && ((dx + x) & 3) == ox && ((dz + z) & 3) == oz) {
					// determine which of the 4
					if (((dx + x) & 4) == 0) {
						if (((dz + z) & 4) == 0) {
							dest[dx + dz * width] = this.getBiomeAt(dx + x, dz + z, 0);
						} else {
							dest[dx + dz * width] = this.getBiomeAt(dx + x, dz + z, 1);
						}
					} else {
						if (((dz + z) & 4) == 0) {
							dest[dx + dz * width] = this.getBiomeAt(dx + x, dz + z, 2);
						} else {
							dest[dx + dz * width] = this.getBiomeAt(dx + x, dz + z, 3);
						}
					}

				} else {
					dest[dx + dz * width] = src[dx + dz * width];
				}
			}
		}

		return dest;
	}

	/**
	 * Determine which map "region" the specified points are in. Assign the 0-3 of the index to the key biomes based on that region.
	 */
	private int getBiomeAt(final int mapX, final int mapZ, final int index) {
		final int regionX = (mapX + 4) >> 3;
		final int regionZ = (mapZ + 4) >> 3;

		this.initChunkSeed(regionX, regionZ);
		final int offset = this.nextInt(4);

		return Biome.getIdForBiome(LOIBiomes.biomes[(index + offset) % LOIBiomes.biomes.length]);
	}
}