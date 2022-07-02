package com.axanthic.icaria.common.registry;

import com.axanthic.icaria.common.entity.GreekFireGrenadeEntity;
import com.axanthic.icaria.common.util.IcariaInfo;
import com.axanthic.icaria.common.entity.BidentEntity;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityType.Builder;
import net.minecraft.world.entity.MobCategory;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class IcariaEntities {
	public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, IcariaInfo.MODID);

	public static final RegistryObject<EntityType<BidentEntity>> BIDENT = register("bident", Builder.<BidentEntity>of(BidentEntity::new, MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20));
	public static final RegistryObject<EntityType<GreekFireGrenadeEntity>> GREEK_FIRE_GRENADE = register("greek_fire_grenade", Builder.<GreekFireGrenadeEntity>of(GreekFireGrenadeEntity::new, MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20));

	public static <T extends Entity> RegistryObject<EntityType<T>> register(String name, Builder<T> builder) {
		return ENTITIES.register(name, () -> builder.build(IcariaInfo.MODID + ":" + name));
	}
}
