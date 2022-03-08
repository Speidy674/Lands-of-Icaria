package com.axanthic.icaria.datagen;

import com.axanthic.icaria.util.IcariaInfo;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.FluidTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class IcariaFluidTags extends FluidTagsProvider {

	public IcariaFluidTags(DataGenerator gen, ExistingFileHelper existingFileHelper) {
		super(gen, IcariaInfo.MODID, existingFileHelper);
	}

	@Override
	public void addTags() {

	}
}
