package com.axanthic.icaria.datagen;

import java.util.function.Supplier;

import com.axanthic.icaria.util.IcariaInfo;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.fluids.ForgeFlowingFluid;

public class IcariaLang extends LanguageProvider {

	public IcariaLang(DataGenerator gen) {
		super(gen, IcariaInfo.MODID, "en_us");
	}

	@Override
	protected void addTranslations() {

	}

	public void addFluid(Supplier<? extends ForgeFlowingFluid> key, String name) {
		ResourceLocation id = key.get().getRegistryName();
		add("fluid." + id.getNamespace() + "." + id.getPath(), name);
	}
}
