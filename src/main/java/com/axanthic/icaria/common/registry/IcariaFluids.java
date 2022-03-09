package com.axanthic.icaria.common.registry;

import com.axanthic.icaria.common.fluids.HyliastrumFluid;
import com.axanthic.icaria.common.fluids.MediterraneanWaterFluid;
import com.axanthic.icaria.common.fluids.UpwardsFluid;
import com.axanthic.icaria.util.IcariaInfo;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.FluidAttributes.Builder;
import net.minecraftforge.fluids.ForgeFlowingFluid.Properties;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class IcariaFluids {
	public static final ResourceLocation HYLIASTRUM_FLUID_STILL = new ResourceLocation(IcariaInfo.MODID + ":block/hyliastrum_fluid_still");
	public static final ResourceLocation HYLIASTRUM_FLUID_FLOW = new ResourceLocation(IcariaInfo.MODID + ":block/hyliastrum_fluid_flow");
	public static final ResourceLocation HYLIASTRUM_FLUID_OVERLAY = new ResourceLocation("block/water_overlay");

	public static final ResourceLocation MEDITERRANEAN_WATER_STILL = new ResourceLocation(IcariaInfo.MODID + ":block/mediterranean_water_still");
	public static final ResourceLocation MEDITERRANEAN_WATER_FLOW = new ResourceLocation(IcariaInfo.MODID + ":block/mediterranean_water_flow");
	public static final ResourceLocation MEDITERRANEAN_WATER_OVERLAY = new ResourceLocation("block/water_overlay");

	public static final ResourceLocation UPWARDS_FLUID_STILL = new ResourceLocation(IcariaInfo.MODID + ":block/upwards_fluid_still");
	public static final ResourceLocation UPWARDS_FLUID_FLOW = new ResourceLocation(IcariaInfo.MODID + ":block/upwards_fluid_flow");
	public static final ResourceLocation UPWARDS_FLUID_OVERLAY = new ResourceLocation("block/water_overlay");

	public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, IcariaInfo.MODID);

	public static final RegistryObject<FlowingFluid> HYLIASTRUM_FLUID_SOURCE = register("hyliastrum_fluid_source", () -> new HyliastrumFluid.Source(propertiesHyliastrumFluid()));
	public static final RegistryObject<FlowingFluid> HYLIASTRUM_FLUID_FLOWING = register("hyliastrum_fluid_flowing", () -> new HyliastrumFluid.Flowing(propertiesHyliastrumFluid()));

	public static final RegistryObject<FlowingFluid> MEDITERRANEAN_WATER_SOURCE = register("mediterranean_water_source", () -> new MediterraneanWaterFluid.Source(propertiesMediterraneanWater()));
	public static final RegistryObject<FlowingFluid> MEDITERRANEAN_WATER_FLOWING = register("mediterranean_water_flowing", () -> new MediterraneanWaterFluid.Flowing(propertiesMediterraneanWater()));

	// TODO more like downwards fluid atm
	public static final RegistryObject<FlowingFluid> UPWARDS_FLUID_SOURCE = register("upwards_fluid_source", () -> new UpwardsFluid.Source(propertiesUpwardsFluid()));
	public static final RegistryObject<FlowingFluid> UPWARDS_FLUID_FLOWING = register("upwards_fluid_flowing", () -> new UpwardsFluid.Flowing(propertiesUpwardsFluid()));

	private static Properties propertiesHyliastrumFluid() {
		return new Properties(IcariaFluids.HYLIASTRUM_FLUID_SOURCE, IcariaFluids.HYLIASTRUM_FLUID_FLOWING, attributesHyliastrumFluid())
				.bucket(IcariaItems.HYLIASTRUM_FLUID_BUCKET)
				.block(IcariaBlocks.HYLIASTRUM_FLUID)
				.tickRate(15);
	}

	private static Builder attributesHyliastrumFluid() {
		return FluidAttributes.builder(HYLIASTRUM_FLUID_STILL, HYLIASTRUM_FLUID_FLOW)
				.translationKey("fluid.landsoficaria.hyliastrum_fluid")
				.color(0xFF000000)
				.overlay(HYLIASTRUM_FLUID_OVERLAY)
				.density(300)
				.temperature(300)
				.viscosity(3000)
				.sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY);
	}

	private static Properties propertiesMediterraneanWater() {
		return new Properties(IcariaFluids.MEDITERRANEAN_WATER_SOURCE, IcariaFluids.MEDITERRANEAN_WATER_FLOWING, attributesMediterraneanWater())
			.bucket(IcariaItems.MEDITERRANEAN_WATER_BUCKET)
			.block(IcariaBlocks.MEDITERRANEAN_WATER)
			.canMultiply();
	}

	private static Builder attributesMediterraneanWater() {
		return FluidAttributes.builder(MEDITERRANEAN_WATER_STILL, MEDITERRANEAN_WATER_FLOW)
			.translationKey("fluid.landsoficaria.mediterranean_water")
			.color(0xFF51A18B)
			.overlay(MEDITERRANEAN_WATER_OVERLAY)
			.density(1000)
			.temperature(300)
			.viscosity(1000)
			.sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY);
	}

	private static Properties propertiesUpwardsFluid() {
		return new Properties(IcariaFluids.UPWARDS_FLUID_SOURCE, IcariaFluids.UPWARDS_FLUID_FLOWING, attributesUpwardsFluid())
			.bucket(IcariaItems.UPWARDS_FLUID_BUCKET)
			.block(IcariaBlocks.UPWARDS_FLUID);
	}

	private static Builder attributesUpwardsFluid() {
		return FluidAttributes.builder(UPWARDS_FLUID_STILL, UPWARDS_FLUID_FLOW)
			.translationKey("fluid.landsoficaria.upwards_fluid")
			.color(0xFFF3BF61)
			.overlay(UPWARDS_FLUID_OVERLAY)
			.luminosity(15)
			.density(-1000)
			.temperature(1300)
			.viscosity(1000)
			.sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY);
	}

	private static <T extends Fluid> RegistryObject<T> register(final String name, final Supplier<? extends T> block) {
		return FLUIDS.register(name, block);
	}
}
