package com.axanthic.icaria.data;

import com.axanthic.icaria.common.recipe.builder.*;
import com.axanthic.icaria.common.registry.*;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.crafting.Ingredient;

import net.minecraftforge.common.Tags;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Consumer;

import javax.annotation.ParametersAreNonnullByDefault;

@SuppressWarnings("unused")
@ParametersAreNonnullByDefault

public class IcariaRecipes extends RecipeProvider {
	public IcariaRecipes(PackOutput pOutput) {
		super(pOutput);
	}

	@Override
	public void buildRecipes(Consumer<FinishedRecipe> pConsumer) {
		this.concoctingEntityRecipe(pConsumer, IcariaItems.ROWAN.get(), IcariaItems.NAMDRAKE.get(), IcariaItems.WILTED_ELM.get(), IcariaEntityTypes.AETERNAE.get(), 200, 4204555);
		this.concoctingEntityRecipe(pConsumer, IcariaItems.ARACHNE_VENOM_VIAL.get(), IcariaItems.HYLIASTRUM_VIAL.get(), IcariaItems.PSILOCYBOS.get(), IcariaEntityTypes.ARACHNE.get(), 200, 3550760);
		this.concoctingEntityRecipe(pConsumer, IcariaItems.NAMDRAKE.get(), IcariaItems.BOLBOS.get(), IcariaItems.BOLBOS.get(), IcariaEntityTypes.ARACHNE_DRONE.get(), 200, 3682088);
		this.concoctingEntityRecipe(pConsumer, IcariaItems.NAMDRAKE.get(), IcariaItems.ROWAN.get(), IcariaItems.ROWAN.get(), IcariaEntityTypes.LAUREL_FOREST_HAG.get(), 200, 4006938);
		this.concoctingEntityRecipe(pConsumer, IcariaItems.HYLIASTRUM_VIAL.get(), IcariaItems.BONE_REMAINS.get(), IcariaItems.HYLIASTRUM_VIAL.get(), IcariaEntityTypes.HYLIASTER.get(), 200, 263942);
		this.concoctingEntityRecipe(pConsumer, IcariaItems.BOLBOS.get(), IcariaItems.DATHULLA.get(), IcariaEntityTypes.ENDER_JELLYFISH.get(), 200, 0);
		this.concoctingEntityRecipe(pConsumer, IcariaItems.PSILOCYBOS.get(), IcariaItems.MONDANOS.get(), IcariaEntityTypes.VOID_JELLYFISH.get(), 200, 6573457);
		this.concoctingEntityRecipe(pConsumer, IcariaItems.MONDANOS.get(), IcariaItems.WILTED_ELM.get(), IcariaItems.ROWAN.get(), IcariaEntityTypes.MYRMEKE_SOLDIER.get(), 200, 5249044);
		this.concoctingEntityRecipe(pConsumer, IcariaItems.BONE_REMAINS.get(), IcariaItems.BONE_REMAINS.get(), IcariaItems.BONE_REMAINS.get(), IcariaEntityTypes.CAPTAIN_REVENANT.get(), 200, 13609241);
		this.concoctingEntityRecipe(pConsumer, IcariaItems.BOLBOS.get(), IcariaItems.DATHULLA.get(), IcariaItems.MONDANOS.get(), IcariaEntityTypes.CRAWLER_REVENANT.get(), 200, 2960665);
		this.concoctingEntityRecipe(pConsumer, IcariaItems.BOLBOS.get(), IcariaItems.MONDANOS.get(), IcariaItems.WILTED_ELM.get(), IcariaEntityTypes.NETHER_PYROMANCER_REVENANT.get(), 200, 5906455);
		this.concoctingEntityRecipe(pConsumer, IcariaItems.NAMDRAKE.get(), IcariaItems.NAMDRAKE.get(), IcariaItems.HYLIASTRUM_VIAL.get(), IcariaEntityTypes.SOLDIER_REVENANT.get(), 200, 7100247);
		this.concoctingEntityRecipe(pConsumer, IcariaItems.MOTH_AGARIC.get(), IcariaItems.MONDANOS.get(), IcariaItems.WILTED_ELM.get(), IcariaEntityTypes.SCORPION.get(), 200, 5323556);
		this.concoctingEntityRecipe(pConsumer, IcariaItems.MONDANOS.get(), IcariaItems.BOLBOS.get(), IcariaItems.ROWAN.get(), IcariaEntityTypes.CRYSTAL_SLUG.get(), 200, 2364442);
		this.concoctingEntityRecipe(pConsumer, IcariaItems.NAMDRAKE.get(), IcariaItems.BONE_REMAINS.get(), IcariaEntityTypes.FOREST_SNULL.get(), 200, 2691846);
		this.concoctingEntityRecipe(pConsumer, IcariaItems.MONDANOS.get(), IcariaItems.MONDANOS.get(), IcariaItems.PSILOCYBOS.get(), IcariaEntityTypes.VINEGAROON.get(), 200, 3680281);

		this.concoctingExplosionsRecipe(pConsumer, IcariaItems.PSILOCYBOS.get(), IcariaItems.ROWAN.get(), IcariaItems.NAMDRAKE.get(), 6.0F, 200, 5083986);
		this.concoctingExplosionsRecipe(pConsumer, IcariaItems.BONE_REMAINS.get(), IcariaItems.MOTH_AGARIC.get(), 3.0F, 200, 5083986);

		this.concoctingItemRecipe(pConsumer, IcariaItems.ROWAN.get(), IcariaItems.HYLIASTRUM_VIAL.get(), IcariaItems.NAMDRAKE.get(), Items.ECHO_SHARD, 200, 668733, 1);
		this.concoctingItemRecipe(pConsumer, IcariaItems.ARACHNE_VENOM_VIAL.get(), IcariaItems.DATHULLA.get(), IcariaItems.HYLIASTRUM_VIAL.get(), Items.END_CRYSTAL, 200, 10711486, 1);
		this.concoctingItemRecipe(pConsumer, IcariaItems.PSILOCYBOS.get(), IcariaItems.DATHULLA.get(), IcariaItems.MONDANOS.get(), Items.HEART_OF_THE_SEA, 200, 1467779, 1);
		this.concoctingItemRecipe(pConsumer, IcariaItems.HYLIASTRUM_VIAL.get(), IcariaItems.BOLBOS.get(), IcariaItems.DATHULLA.get(), Items.NETHERITE_INGOT, 200, 4143419, 1);
		this.concoctingItemRecipe(pConsumer, IcariaItems.PSILOCYBOS.get(), IcariaItems.MONDANOS.get(), IcariaItems.BOLBOS.get(), Items.SNIFFER_EGG, 200, 3169872, 1);
		this.concoctingItemRecipe(pConsumer, IcariaItems.NAMDRAKE.get(), IcariaItems.DATHULLA.get(), IcariaItems.BONE_REMAINS.get(), 200, 12366506, 1);
		this.concoctingItemRecipe(pConsumer, IcariaItems.ARACHNE_VENOM_VIAL.get(), IcariaItems.BOLBOS.get(), IcariaItems.JASPER_SHARD.get(), 200, 6627110, 1);
		this.concoctingItemRecipe(pConsumer, IcariaItems.NAMDRAKE.get(), IcariaItems.BOLBOS.get(), IcariaItems.HYLIASTRUM_VIAL.get(), IcariaItems.ANTI_GRAVITY_SPELL.get(), 200, 6919359, 1);
		this.concoctingItemRecipe(pConsumer, IcariaItems.MOTH_AGARIC.get(), IcariaItems.WILTED_ELM.get(), IcariaItems.MONDANOS.get(), IcariaItems.FORTIFYING_SPELL.get(), 200, 6316160, 1);
		this.concoctingItemRecipe(pConsumer, IcariaItems.BOLBOS.get(), IcariaItems.DATHULLA.get(), IcariaItems.WILTED_ELM.get(), IcariaItems.HEALING_SPELL.get(), 200, 16711680, 1);
		this.concoctingItemRecipe(pConsumer, IcariaItems.MONDANOS.get(), IcariaItems.BOLBOS.get(), IcariaItems.PSILOCYBOS.get(), IcariaItems.BUBBLE_SPELL.get(), 200, 33023, 1);
		this.concoctingItemRecipe(pConsumer, IcariaItems.ROWAN.get(), IcariaItems.ROWAN.get(), IcariaItems.BONE_REMAINS.get(), IcariaItems.FREEZING_SPELL.get(), 200, 14277081, 1);
		this.concoctingItemRecipe(pConsumer, IcariaItems.NAMDRAKE.get(), IcariaItems.BONE_REMAINS.get(), IcariaItems.MOTH_AGARIC.get(), IcariaItems.MAGIC_MISSILE_SPELL.get(), 200, 6307968, 1);

		this.concoctingPotionRecipe(pConsumer, IcariaItems.MONDANOS.get(), IcariaItems.MONDANOS.get(), IcariaItems.MONDANOS.get(), Potions.NIGHT_VISION, 5.0F, 200, 12779366, 200);
		this.concoctingPotionRecipe(pConsumer, IcariaItems.ROWAN.get(), IcariaItems.ARACHNE_VENOM_VIAL.get(), Potions.POISON, 5.0F, 200, 8889187, 200);
		this.concoctingPotionRecipe(pConsumer, IcariaItems.BOLBOS.get(), IcariaItems.DATHULLA.get(), IcariaItems.PSILOCYBOS.get(), Potions.REGENERATION, 5.0F, 200, 13458603, 200);
		this.concoctingPotionRecipe(pConsumer, IcariaItems.NAMDRAKE.get(), IcariaItems.NAMDRAKE.get(), IcariaItems.NAMDRAKE.get(), Potions.SLOWNESS, 5.0F, 200, 9154528, 200);
		this.concoctingPotionRecipe(pConsumer, IcariaItems.BOLBOS.get(), IcariaItems.BOLBOS.get(), IcariaItems.BOLBOS.get(), Potions.STRONG_HARMING, 5.0F, 200, 11101546, 200);
		this.concoctingPotionRecipe(pConsumer, IcariaItems.ROWAN.get(), IcariaItems.ROWAN.get(), IcariaItems.ROWAN.get(), IcariaPotions.BLINDNESS.get(), 5.0F, 200, 2039587, 200);
		this.concoctingPotionRecipe(pConsumer, IcariaItems.PSILOCYBOS.get(), IcariaItems.MOTH_AGARIC.get(), IcariaItems.PSILOCYBOS.get(), IcariaPotions.NAUSEA.get(), 5.0F, 200, 5578058, 200);
		this.concoctingPotionRecipe(pConsumer, IcariaItems.BONE_REMAINS.get(), IcariaItems.MOTH_AGARIC.get(), IcariaItems.ROWAN.get(), IcariaPotions.WITHER.get(), 5.0F, 200, 7561558, 200);

		this.forgingRecipe(pConsumer, IcariaItems.RAW_CHALKOS.get(), IcariaItems.RAW_CHALKOS.get(), IcariaItems.RAW_KASSITEROS.get(), IcariaItems.ORICHALCUM_INGOT.get(), "_from_raw_forging", 0.3F, 200, 1);
		this.forgingRecipe(pConsumer, IcariaItems.LIGNITE.get(), IcariaItems.RAW_KASSITEROS.get(), IcariaItems.RAW_VANADIUM.get(), IcariaItems.VANADIUMSTEEL_INGOT.get(), "_from_raw_forging", 0.2F, 150, 1);
		this.forgingRecipe(pConsumer, IcariaItems.ANTHRACITE.get(), IcariaItems.RAW_MOLYBDENUM.get(), IcariaItems.RAW_SIDEROS.get(), IcariaItems.MOLYBDENUMSTEEL_INGOT.get(), "_from_raw_forging", 0.2F, 150, 1);
		this.forgingRecipe(pConsumer, IcariaItems.CHALKOS_INGOT.get(), IcariaItems.CHALKOS_INGOT.get(), IcariaItems.KASSITEROS_INGOT.get(), IcariaItems.ORICHALCUM_INGOT.get(), "_from_forging", 0.3F, 200, 2);
		this.forgingRecipe(pConsumer, IcariaItems.LIGNITE.get(), IcariaItems.KASSITEROS_INGOT.get(), IcariaItems.VANADIUM_INGOT.get(), IcariaItems.VANADIUMSTEEL_INGOT.get(), "_from_forging", 0.2F, 150, 2);
		this.forgingRecipe(pConsumer, IcariaItems.ANTHRACITE.get(), IcariaItems.MOLYBDENUM_INGOT.get(), IcariaItems.SIDEROS_INGOT.get(), IcariaItems.MOLYBDENUMSTEEL_INGOT.get(), "_from_forging", 0.2F, 150, 2);
		this.forgingRecipe(pConsumer, IcariaItems.LIGNITE_ORE.get(), IcariaItems.LIGNITE.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.CHALKOS_ORE.get(), IcariaItems.CHALKOS_INGOT.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.KASSITEROS_ORE.get(), IcariaItems.KASSITEROS_INGOT.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.DOLOMITE_ORE.get(), IcariaItems.DOLOMITE.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.VANADIUM_ORE.get(), IcariaItems.VANADIUM_INGOT.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.SLIVER_ORE.get(), IcariaItems.SLIVER.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.SIDEROS_ORE.get(), IcariaItems.SIDEROS_INGOT.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.ANTHRACITE_ORE.get(), IcariaItems.ANTHRACITE.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.MOLYBDENUM_ORE.get(), IcariaItems.MOLYBDENUM_INGOT.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.RAW_CHALKOS.get(), IcariaItems.CHALKOS_INGOT.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.RAW_KASSITEROS.get(), IcariaItems.KASSITEROS_INGOT.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.RAW_VANADIUM.get(), IcariaItems.VANADIUM_INGOT.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.RAW_SIDEROS.get(), IcariaItems.SIDEROS_INGOT.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.RAW_MOLYBDENUM.get(), IcariaItems.MOLYBDENUM_INGOT.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.CHALKOS_TOOLS.sword.get(), IcariaItems.CHALKOS_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.CHALKOS_TOOLS.dagger.get(), IcariaItems.CHALKOS_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.CHALKOS_TOOLS.shovel.get(), IcariaItems.CHALKOS_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.CHALKOS_TOOLS.pickaxe.get(), IcariaItems.CHALKOS_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.CHALKOS_TOOLS.axe.get(), IcariaItems.CHALKOS_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.CHALKOS_TOOLS.scythe.get(), IcariaItems.CHALKOS_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.CHALKOS_TOOLS.bident.get(), IcariaItems.CHALKOS_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.KASSITEROS_TOOLS.sword.get(), IcariaItems.KASSITEROS_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.KASSITEROS_TOOLS.dagger.get(), IcariaItems.KASSITEROS_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.KASSITEROS_TOOLS.shovel.get(), IcariaItems.KASSITEROS_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.KASSITEROS_TOOLS.pickaxe.get(), IcariaItems.KASSITEROS_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.KASSITEROS_TOOLS.axe.get(), IcariaItems.KASSITEROS_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.KASSITEROS_TOOLS.scythe.get(), IcariaItems.KASSITEROS_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.KASSITEROS_TOOLS.bident.get(), IcariaItems.KASSITEROS_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.ORICHALCUM_TOOLS.sword.get(), IcariaItems.ORICHALCUM_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.ORICHALCUM_TOOLS.dagger.get(), IcariaItems.ORICHALCUM_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.ORICHALCUM_TOOLS.shovel.get(), IcariaItems.ORICHALCUM_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.ORICHALCUM_TOOLS.pickaxe.get(), IcariaItems.ORICHALCUM_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.ORICHALCUM_TOOLS.axe.get(), IcariaItems.ORICHALCUM_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.ORICHALCUM_TOOLS.scythe.get(), IcariaItems.ORICHALCUM_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.ORICHALCUM_TOOLS.bident.get(), IcariaItems.ORICHALCUM_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.VANADIUMSTEEL_TOOLS.sword.get(), IcariaItems.VANADIUMSTEEL_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.VANADIUMSTEEL_TOOLS.dagger.get(), IcariaItems.VANADIUMSTEEL_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.VANADIUMSTEEL_TOOLS.shovel.get(), IcariaItems.VANADIUMSTEEL_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.VANADIUMSTEEL_TOOLS.pickaxe.get(), IcariaItems.VANADIUMSTEEL_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.VANADIUMSTEEL_TOOLS.axe.get(), IcariaItems.VANADIUMSTEEL_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.VANADIUMSTEEL_TOOLS.scythe.get(), IcariaItems.VANADIUMSTEEL_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.VANADIUMSTEEL_TOOLS.bident.get(), IcariaItems.VANADIUMSTEEL_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.SIDEROS_TOOLS.sword.get(), IcariaItems.SIDEROS_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.SIDEROS_TOOLS.dagger.get(), IcariaItems.SIDEROS_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.SIDEROS_TOOLS.shovel.get(), IcariaItems.SIDEROS_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.SIDEROS_TOOLS.pickaxe.get(), IcariaItems.SIDEROS_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.SIDEROS_TOOLS.axe.get(), IcariaItems.SIDEROS_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.SIDEROS_TOOLS.scythe.get(), IcariaItems.SIDEROS_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.SIDEROS_TOOLS.bident.get(), IcariaItems.SIDEROS_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.MOLYBDENUMSTEEL_TOOLS.sword.get(), IcariaItems.MOLYBDENUMSTEEL_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.MOLYBDENUMSTEEL_TOOLS.dagger.get(), IcariaItems.MOLYBDENUMSTEEL_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.MOLYBDENUMSTEEL_TOOLS.shovel.get(), IcariaItems.MOLYBDENUMSTEEL_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.MOLYBDENUMSTEEL_TOOLS.pickaxe.get(), IcariaItems.MOLYBDENUMSTEEL_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.MOLYBDENUMSTEEL_TOOLS.axe.get(), IcariaItems.MOLYBDENUMSTEEL_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.MOLYBDENUMSTEEL_TOOLS.scythe.get(), IcariaItems.MOLYBDENUMSTEEL_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.MOLYBDENUMSTEEL_TOOLS.bident.get(), IcariaItems.MOLYBDENUMSTEEL_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.CHALKOS_ARMOR.helmet.get(), IcariaItems.CHALKOS_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.CHALKOS_ARMOR.chestplate.get(), IcariaItems.CHALKOS_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.CHALKOS_ARMOR.leggings.get(), IcariaItems.CHALKOS_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.CHALKOS_ARMOR.boots.get(), IcariaItems.CHALKOS_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.KASSITEROS_ARMOR.helmet.get(), IcariaItems.KASSITEROS_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.KASSITEROS_ARMOR.chestplate.get(), IcariaItems.KASSITEROS_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.KASSITEROS_ARMOR.leggings.get(), IcariaItems.KASSITEROS_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.KASSITEROS_ARMOR.boots.get(), IcariaItems.KASSITEROS_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.ORICHALCUM_HELMET.get(), IcariaItems.ORICHALCUM_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.ORICHALCUM_CHESTPLATE.get(), IcariaItems.ORICHALCUM_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.ORICHALCUM_LEGGINGS.get(), IcariaItems.ORICHALCUM_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.ORICHALCUM_BOOTS.get(), IcariaItems.ORICHALCUM_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.VANADIUMSTEEL_ARMOR.helmet.get(), IcariaItems.VANADIUMSTEEL_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.VANADIUMSTEEL_ARMOR.chestplate.get(), IcariaItems.VANADIUMSTEEL_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.VANADIUMSTEEL_ARMOR.leggings.get(), IcariaItems.VANADIUMSTEEL_NUGGET.get(), 0.1F, 100, 1);
		this.forgingRecipe(pConsumer, IcariaItems.VANADIUMSTEEL_ARMOR.boots.get(), IcariaItems.VANADIUMSTEEL_NUGGET.get(), 0.1F, 100, 1);

		this.firingRecipe(pConsumer, IcariaItems.GRAINEL.get(), IcariaItems.GRAINGLASS.get(), 0.2F, 200);
		this.firingRecipe(pConsumer, IcariaItems.SILKSAND.get(), IcariaItems.SILKGLASS.get(), 0.2F, 200);
		this.firingRecipe(pConsumer, IcariaItems.LOAM_LUMP.get(), IcariaItems.LOAM_BRICK.get(), 0.1F, 100);
		this.firingRecipe(pConsumer, IcariaItems.UNFIRED_STORAGE_VASE.get(), IcariaItems.STORAGE_VASE.get(), 0.2F, 200);
		this.firingRecipe(pConsumer, IcariaItems.WHITE_UNFIRED_STORAGE_VASE.get(), IcariaItems.WHITE_STORAGE_VASE.get(), 0.2F, 200);
		this.firingRecipe(pConsumer, IcariaItems.LIGHT_GRAY_UNFIRED_STORAGE_VASE.get(), IcariaItems.LIGHT_GRAY_STORAGE_VASE.get(), 0.2F, 200);
		this.firingRecipe(pConsumer, IcariaItems.GRAY_UNFIRED_STORAGE_VASE.get(), IcariaItems.GRAY_STORAGE_VASE.get(), 0.2F, 200);
		this.firingRecipe(pConsumer, IcariaItems.BLACK_UNFIRED_STORAGE_VASE.get(), IcariaItems.BLACK_STORAGE_VASE.get(), 0.2F, 200);
		this.firingRecipe(pConsumer, IcariaItems.BROWN_UNFIRED_STORAGE_VASE.get(), IcariaItems.BROWN_STORAGE_VASE.get(), 0.2F, 200);
		this.firingRecipe(pConsumer, IcariaItems.RED_UNFIRED_STORAGE_VASE.get(), IcariaItems.RED_STORAGE_VASE.get(), 0.2F, 200);
		this.firingRecipe(pConsumer, IcariaItems.ORANGE_UNFIRED_STORAGE_VASE.get(), IcariaItems.ORANGE_STORAGE_VASE.get(), 0.2F, 200);
		this.firingRecipe(pConsumer, IcariaItems.YELLOW_UNFIRED_STORAGE_VASE.get(), IcariaItems.YELLOW_STORAGE_VASE.get(), 0.2F, 200);
		this.firingRecipe(pConsumer, IcariaItems.LIME_UNFIRED_STORAGE_VASE.get(), IcariaItems.LIME_STORAGE_VASE.get(), 0.2F, 200);
		this.firingRecipe(pConsumer, IcariaItems.GREEN_UNFIRED_STORAGE_VASE.get(), IcariaItems.GREEN_STORAGE_VASE.get(), 0.2F, 200);
		this.firingRecipe(pConsumer, IcariaItems.CYAN_UNFIRED_STORAGE_VASE.get(), IcariaItems.CYAN_STORAGE_VASE.get(), 0.2F, 200);
		this.firingRecipe(pConsumer, IcariaItems.LIGHT_BLUE_UNFIRED_STORAGE_VASE.get(), IcariaItems.LIGHT_BLUE_STORAGE_VASE.get(), 0.2F, 200);
		this.firingRecipe(pConsumer, IcariaItems.BLUE_UNFIRED_STORAGE_VASE.get(), IcariaItems.BLUE_STORAGE_VASE.get(), 0.2F, 200);
		this.firingRecipe(pConsumer, IcariaItems.PURPLE_UNFIRED_STORAGE_VASE.get(), IcariaItems.PURPLE_STORAGE_VASE.get(), 0.2F, 200);
		this.firingRecipe(pConsumer, IcariaItems.MAGENTA_UNFIRED_STORAGE_VASE.get(), IcariaItems.MAGENTA_STORAGE_VASE.get(), 0.2F, 200);
		this.firingRecipe(pConsumer, IcariaItems.PINK_UNFIRED_STORAGE_VASE.get(), IcariaItems.PINK_STORAGE_VASE.get(), 0.2F, 200);
		this.firingRecipe(pConsumer, IcariaItems.UNFIRED_LOAM_GEAR.get(), IcariaItems.LOAM_GEAR.get(), 0.1F, 100);
		this.firingRecipe(pConsumer, IcariaItems.UNFIRED_LOAM_BOWL.get(), IcariaItems.LOAM_BOWL.get(), 0.1F, 100);

		this.grindingRecipe(pConsumer, IcariaItems.YELLOWSTONE_GEAR.get(), Items.COBBLESTONE, Items.GRAVEL, 0.1F, 200, 1);
		this.grindingRecipe(pConsumer, IcariaItems.YELLOWSTONE_GEAR.get(), Items.CRACKED_STONE_BRICKS, Items.COBBLESTONE, 0.1F, 200, 1);
		this.grindingRecipe(pConsumer, IcariaItems.YELLOWSTONE_GEAR.get(), Items.CRACKED_DEEPSLATE_BRICKS, Items.COBBLED_DEEPSLATE, 0.1F, 200, 1);
		this.grindingRecipe(pConsumer, IcariaItems.YELLOWSTONE_GEAR.get(), Items.CRACKED_DEEPSLATE_TILES, Items.COBBLED_DEEPSLATE, 0.1F, 200, 1);
		this.grindingRecipe(pConsumer, IcariaItems.YELLOWSTONE_GEAR.get(), Items.SANDSTONE, Items.SAND, 0.1F, 200, 1);
		this.grindingRecipe(pConsumer, IcariaItems.YELLOWSTONE_GEAR.get(), Items.RED_SANDSTONE, Items.RED_SAND, 0.1F, 200, 1);
		this.grindingRecipe(pConsumer, IcariaItems.YELLOWSTONE_GEAR.get(), Items.GLASS, Items.SAND, 0.1F, 100, 1);
		this.grindingRecipe(pConsumer, IcariaItems.YELLOWSTONE_GEAR.get(), Items.TINTED_GLASS, Items.SAND, 0.1F, 100, 1);
		this.grindingRecipe(pConsumer, IcariaItems.YELLOWSTONE_GEAR.get(), Items.WHITE_STAINED_GLASS, Items.SAND, 0.1F, 100, 1);
		this.grindingRecipe(pConsumer, IcariaItems.YELLOWSTONE_GEAR.get(), Items.LIGHT_GRAY_STAINED_GLASS, Items.SAND, 0.1F, 100, 1);
		this.grindingRecipe(pConsumer, IcariaItems.YELLOWSTONE_GEAR.get(), Items.GRAY_STAINED_GLASS, Items.SAND, 0.1F, 100, 1);
		this.grindingRecipe(pConsumer, IcariaItems.YELLOWSTONE_GEAR.get(), Items.BLACK_STAINED_GLASS, Items.SAND, 0.1F, 100, 1);
		this.grindingRecipe(pConsumer, IcariaItems.YELLOWSTONE_GEAR.get(), Items.BROWN_STAINED_GLASS, Items.SAND, 0.1F, 100, 1);
		this.grindingRecipe(pConsumer, IcariaItems.YELLOWSTONE_GEAR.get(), Items.RED_STAINED_GLASS, Items.SAND, 0.1F, 100, 1);
		this.grindingRecipe(pConsumer, IcariaItems.YELLOWSTONE_GEAR.get(), Items.ORANGE_STAINED_GLASS, Items.SAND, 0.1F, 100, 1);
		this.grindingRecipe(pConsumer, IcariaItems.YELLOWSTONE_GEAR.get(), Items.YELLOW_STAINED_GLASS, Items.SAND, 0.1F, 100, 1);
		this.grindingRecipe(pConsumer, IcariaItems.YELLOWSTONE_GEAR.get(), Items.LIME_STAINED_GLASS, Items.SAND, 0.1F, 100, 1);
		this.grindingRecipe(pConsumer, IcariaItems.YELLOWSTONE_GEAR.get(), Items.GREEN_STAINED_GLASS, Items.SAND, 0.1F, 100, 1);
		this.grindingRecipe(pConsumer, IcariaItems.YELLOWSTONE_GEAR.get(), Items.CYAN_STAINED_GLASS, Items.SAND, 0.1F, 100, 1);
		this.grindingRecipe(pConsumer, IcariaItems.YELLOWSTONE_GEAR.get(), Items.LIGHT_BLUE_STAINED_GLASS, Items.SAND, 0.1F, 100, 1);
		this.grindingRecipe(pConsumer, IcariaItems.YELLOWSTONE_GEAR.get(), Items.BLUE_STAINED_GLASS, Items.SAND, 0.1F, 100, 1);
		this.grindingRecipe(pConsumer, IcariaItems.YELLOWSTONE_GEAR.get(), Items.PURPLE_STAINED_GLASS, Items.SAND, 0.1F, 100, 1);
		this.grindingRecipe(pConsumer, IcariaItems.YELLOWSTONE_GEAR.get(), Items.MAGENTA_STAINED_GLASS, Items.SAND, 0.1F, 100, 1);
		this.grindingRecipe(pConsumer, IcariaItems.YELLOWSTONE_GEAR.get(), Items.PINK_STAINED_GLASS, Items.SAND, 0.1F, 100, 1);
		this.grindingRecipe(pConsumer, IcariaItems.YELLOWSTONE_GEAR.get(), Items.ICE, Items.SNOWBALL, 0.1F, 100, 1);
		this.grindingRecipe(pConsumer, IcariaItems.YELLOWSTONE_GEAR.get(), Items.GLOWSTONE, Items.GLOWSTONE_DUST, 0.1F, 100, 4);
		this.grindingRecipe(pConsumer, IcariaItems.YELLOWSTONE_GEAR.get(), IcariaItems.GRAINGLASS.get(), IcariaItems.GRAINEL.get(), 0.1F, 100, 1);
		this.grindingRecipe(pConsumer, IcariaItems.YELLOWSTONE_GEAR.get(), IcariaItems.GRAINITE.get(), IcariaItems.GRAINEL.get(), 0.1F, 200, 1);
		this.grindingRecipe(pConsumer, IcariaItems.YELLOWSTONE_GEAR.get(), IcariaItems.SILKGLASS.get(), IcariaItems.SILKSAND.get(), 0.1F, 100, 1);
		this.grindingRecipe(pConsumer, IcariaItems.YELLOWSTONE_GEAR.get(), IcariaItems.COBBLED_SILKSTONE.get(), IcariaItems.SILKSAND.get(), 0.1F, 200, 1);
		this.grindingRecipe(pConsumer, IcariaItems.YELLOWSTONE_GEAR.get(), IcariaItems.CRACKED_RELICSTONE_BRICKS.get(), IcariaItems.RELICSTONE.get(), 0.1F, 200, 1);
		this.grindingRecipe(pConsumer, IcariaItems.YELLOWSTONE_GEAR.get(), IcariaItems.CRACKED_RELICSTONE_TILES.get(), IcariaItems.RELICSTONE.get(), 0.1F, 200, 1);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), Items.WHITE_WOOL, Items.STRING, 0.1F, 200, 4);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), Items.LIGHT_GRAY_WOOL, Items.STRING, 0.1F, 200, 4);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), Items.GRAY_WOOL, Items.STRING, 0.1F, 200, 4);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), Items.BLACK_WOOL, Items.STRING, 0.1F, 200, 4);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), Items.BROWN_WOOL, Items.STRING, 0.1F, 200, 4);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), Items.RED_WOOL, Items.STRING, 0.1F, 200, 4);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), Items.ORANGE_WOOL, Items.STRING, 0.1F, 200, 4);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), Items.YELLOW_WOOL, Items.STRING, 0.1F, 200, 4);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), Items.LIME_WOOL, Items.STRING, 0.1F, 200, 4);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), Items.GREEN_WOOL, Items.STRING, 0.1F, 200, 4);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), Items.CYAN_WOOL, Items.STRING, 0.1F, 200, 4);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), Items.LIGHT_BLUE_WOOL, Items.STRING, 0.1F, 200, 4);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), Items.BLUE_WOOL, Items.STRING, 0.1F, 200, 4);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), Items.PURPLE_WOOL, Items.STRING, 0.1F, 200, 4);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), Items.MAGENTA_WOOL, Items.STRING, 0.1F, 200, 4);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), Items.PINK_WOOL, Items.STRING, 0.1F, 200, 4);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), Items.CLAY, Items.CLAY_BALL, 0.1F, 200, 4);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), Items.GRAVEL, Items.FLINT, 0.1F, 200, 4);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), Items.SNOW_BLOCK, Items.SNOWBALL, 0.1F, 200, 4);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), Items.MAGMA_BLOCK, Items.MAGMA_CREAM, 0.1F, 200, 4);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), Items.DANDELION, Items.YELLOW_DYE, 0.1F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), Items.POPPY, Items.RED_DYE, 0.1F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), Items.BLUE_ORCHID, Items.LIGHT_BLUE_DYE, 0.1F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), Items.ALLIUM, Items.MAGENTA_DYE, 0.1F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), Items.AZURE_BLUET, Items.LIGHT_GRAY_DYE, 0.1F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), Items.RED_TULIP, Items.RED_DYE, 0.1F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), Items.ORANGE_TULIP, Items.ORANGE_DYE, 0.1F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), Items.WHITE_TULIP, Items.LIGHT_GRAY_DYE, 0.1F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), Items.PINK_TULIP, Items.PINK_DYE, 0.1F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), Items.OXEYE_DAISY, Items.LIGHT_GRAY_DYE, 0.1F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), Items.CORNFLOWER, Items.BLUE_DYE, 0.1F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), Items.LILY_OF_THE_VALLEY, Items.WHITE_DYE, 0.1F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), Items.TORCHFLOWER, Items.ORANGE_DYE, 0.1F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), Items.WITHER_ROSE, Items.BLACK_DYE, 0.1F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), Items.PINK_PETALS, Items.PINK_DYE, 0.1F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), Items.SUGAR_CANE, Items.SUGAR, 0.1F, 200, 3);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), Items.CACTUS, Items.GREEN_DYE, 0.1F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), Items.SUNFLOWER, Items.YELLOW_DYE, 0.1F, 200, 4);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), Items.LILAC, Items.MAGENTA_DYE, 0.1F, 200, 4);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), Items.ROSE_BUSH, Items.RED_DYE, 0.1F, 200, 4);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), Items.PEONY, Items.PINK_DYE, 0.1F, 200, 4);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), Items.PITCHER_PLANT, Items.CYAN_DYE, 0.1F, 200, 4);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), Items.COCOA_BEANS, Items.BROWN_DYE, 0.1F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), Items.MELON, Items.MELON_SEEDS, 0.1F, 200, 12);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), Items.PUMPKIN, Items.PUMPKIN_SEEDS, 0.1F, 200, 12);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), Items.HAY_BLOCK, Items.WHEAT_SEEDS, 0.1F, 200, 12);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), Items.HONEYCOMB_BLOCK, Items.HONEYCOMB, 0.1F, 200, 4);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), Items.BONE_MEAL, Items.WHITE_DYE, 0.1F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), Items.BEETROOT, Items.RED_DYE, 0.1F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), Items.INK_SAC, Items.BLACK_DYE, 0.1F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), IcariaItems.MARL_CHERT.get(), IcariaItems.CHERT.get(), 0.2F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), IcariaItems.MARL_BONES.get(), Items.BONE_MEAL, 0.2F, 200, 6);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), IcariaItems.MARL_LIGNITE.get(), IcariaItems.LIGNITE.get(), 0.2F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), IcariaItems.LOAM.get(), IcariaItems.LOAM_LUMP.get(), 0.1F, 200, 4);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), IcariaItems.GRAINEL_CHERT.get(), IcariaItems.CHERT.get(), 0.2F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), IcariaItems.SPELT_BALE_BLOCK.get(), IcariaItems.SPELT_SEEDS.get(), 0.1F, 200, 12);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), IcariaItems.BLINDWEED.get(), Items.PINK_DYE, 0.1F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), IcariaItems.CHAMEOMILE.get(), Items.WHITE_DYE, 0.1F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), IcariaItems.CHARMONDER.get(), Items.LIGHT_BLUE_DYE, 0.1F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), IcariaItems.CLOVER.get(), Items.WHITE_DYE, 0.1F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), IcariaItems.FIREHILT.get(), Items.RED_DYE, 0.1F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), IcariaItems.BLUE_HYDRACINTH.get(), Items.BLUE_DYE, 0.1F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), IcariaItems.PURPLE_HYDRACINTH.get(), Items.PURPLE_DYE, 0.1F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), IcariaItems.LIONFANGS.get(), Items.PURPLE_DYE, 0.1F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), IcariaItems.SPEARDROPS.get(), Items.LIME_DYE, 0.1F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), IcariaItems.PURPLE_STAGHORN.get(), Items.PURPLE_DYE, 0.1F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), IcariaItems.YELLOW_STAGHORN.get(), Items.YELLOW_DYE, 0.1F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), IcariaItems.BLUE_STORMCOTTON.get(), Items.BLUE_DYE, 0.1F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), IcariaItems.PINK_STORMCOTTON.get(), Items.PINK_DYE, 0.1F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), IcariaItems.PURPLE_STORMCOTTON.get(), Items.PURPLE_DYE, 0.1F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), IcariaItems.SUNKETTLE.get(), Items.YELLOW_DYE, 0.1F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), IcariaItems.SUNSPONGE.get(), Items.ORANGE_DYE, 0.1F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), IcariaItems.VOIDLILY.get(), Items.BLACK_DYE, 0.1F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), IcariaItems.BLUE_GROUND_FLOWERS.get(), Items.BLUE_DYE, 0.1F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), IcariaItems.CYAN_GROUND_FLOWERS.get(), Items.CYAN_DYE, 0.1F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), IcariaItems.PINK_GROUND_FLOWERS.get(), Items.PINK_DYE, 0.1F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), IcariaItems.PURPLE_GROUND_FLOWERS.get(), Items.PURPLE_DYE, 0.1F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), IcariaItems.RED_GROUND_FLOWERS.get(), Items.RED_DYE, 0.1F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), IcariaItems.WHITE_GROUND_FLOWERS.get(), Items.WHITE_DYE, 0.1F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), IcariaItems.WHITE_BROMELIA.get(), Items.WHITE_DYE, 0.1F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), IcariaItems.ORANGE_BROMELIA.get(), Items.ORANGE_DYE, 0.1F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), IcariaItems.PINK_BROMELIA.get(), Items.PINK_DYE, 0.1F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), IcariaItems.PURPLE_BROMELIA.get(), Items.PURPLE_DYE, 0.1F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), IcariaItems.CARDON_CACTUS.get(), Items.GREEN_DYE, 0.1F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), IcariaItems.SPELT.get(), IcariaItems.SPELT_FLOUR.get(), 0.1F, 200, 1);
		this.grindingRecipe(pConsumer, IcariaItems.LOAM_GEAR.get(), IcariaItems.VINE_REED.get(), Items.SUGAR, 0.1F, 200, 3);
		this.grindingRecipe(pConsumer, IcariaItems.VOIDSHALE_GEAR.get(), Items.PURPUR_BLOCK, Items.POPPED_CHORUS_FRUIT, 0.1F, 200, 4);
		this.grindingRecipe(pConsumer, IcariaItems.VOIDSHALE_GEAR.get(), Items.WHITE_CONCRETE, Items.WHITE_CONCRETE_POWDER, 0.1F, 200, 1);
		this.grindingRecipe(pConsumer, IcariaItems.VOIDSHALE_GEAR.get(), Items.LIGHT_GRAY_CONCRETE, Items.LIGHT_GRAY_CONCRETE_POWDER, 0.1F, 200, 1);
		this.grindingRecipe(pConsumer, IcariaItems.VOIDSHALE_GEAR.get(), Items.GRAY_CONCRETE, Items.GRAY_CONCRETE_POWDER, 0.1F, 200, 1);
		this.grindingRecipe(pConsumer, IcariaItems.VOIDSHALE_GEAR.get(), Items.BLACK_CONCRETE, Items.BLACK_CONCRETE_POWDER, 0.1F, 200, 1);
		this.grindingRecipe(pConsumer, IcariaItems.VOIDSHALE_GEAR.get(), Items.BROWN_CONCRETE, Items.BROWN_CONCRETE_POWDER, 0.1F, 200, 1);
		this.grindingRecipe(pConsumer, IcariaItems.VOIDSHALE_GEAR.get(), Items.RED_CONCRETE, Items.RED_CONCRETE_POWDER, 0.1F, 200, 1);
		this.grindingRecipe(pConsumer, IcariaItems.VOIDSHALE_GEAR.get(), Items.ORANGE_CONCRETE, Items.ORANGE_CONCRETE_POWDER, 0.1F, 200, 1);
		this.grindingRecipe(pConsumer, IcariaItems.VOIDSHALE_GEAR.get(), Items.YELLOW_CONCRETE, Items.YELLOW_CONCRETE_POWDER, 0.1F, 200, 1);
		this.grindingRecipe(pConsumer, IcariaItems.VOIDSHALE_GEAR.get(), Items.LIME_CONCRETE, Items.LIME_CONCRETE_POWDER, 0.1F, 200, 1);
		this.grindingRecipe(pConsumer, IcariaItems.VOIDSHALE_GEAR.get(), Items.GREEN_CONCRETE, Items.GREEN_CONCRETE_POWDER, 0.1F, 200, 1);
		this.grindingRecipe(pConsumer, IcariaItems.VOIDSHALE_GEAR.get(), Items.CYAN_CONCRETE, Items.CYAN_CONCRETE_POWDER, 0.1F, 200, 1);
		this.grindingRecipe(pConsumer, IcariaItems.VOIDSHALE_GEAR.get(), Items.LIGHT_BLUE_CONCRETE, Items.LIGHT_BLUE_CONCRETE_POWDER, 0.1F, 200, 1);
		this.grindingRecipe(pConsumer, IcariaItems.VOIDSHALE_GEAR.get(), Items.BLUE_CONCRETE, Items.BLUE_CONCRETE_POWDER, 0.1F, 200, 1);
		this.grindingRecipe(pConsumer, IcariaItems.VOIDSHALE_GEAR.get(), Items.PURPLE_CONCRETE, Items.PURPLE_CONCRETE_POWDER, 0.1F, 200, 1);
		this.grindingRecipe(pConsumer, IcariaItems.VOIDSHALE_GEAR.get(), Items.MAGENTA_CONCRETE, Items.MAGENTA_CONCRETE_POWDER, 0.1F, 200, 1);
		this.grindingRecipe(pConsumer, IcariaItems.VOIDSHALE_GEAR.get(), Items.PINK_CONCRETE, Items.PINK_CONCRETE_POWDER, 0.1F, 200, 1);
		this.grindingRecipe(pConsumer, IcariaItems.VOIDSHALE_GEAR.get(), Items.LAPIS_LAZULI, Items.BLUE_DYE, 0.1F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.VOIDSHALE_GEAR.get(), Items.BONE, Items.BONE_MEAL, 0.1F, 200, 4);
		this.grindingRecipe(pConsumer, IcariaItems.VOIDSHALE_GEAR.get(), Items.BLAZE_ROD, Items.BLAZE_POWDER, 0.2F, 200, 4);
		this.grindingRecipe(pConsumer, IcariaItems.VOIDSHALE_GEAR.get(), IcariaItems.SURFACE_CHERT.get(), IcariaItems.CHERT.get(), 0.2F, 200, 4);
		this.grindingRecipe(pConsumer, IcariaItems.VOIDSHALE_GEAR.get(), IcariaItems.SURFACE_BONES.get(), Items.BONE_MEAL, 0.2F, 200, 12);
		this.grindingRecipe(pConsumer, IcariaItems.VOIDSHALE_GEAR.get(), IcariaItems.SURFACE_LIGNITE.get(), IcariaItems.LIGNITE.get(), 0.2F, 200, 4);
		this.grindingRecipe(pConsumer, IcariaItems.VOIDSHALE_GEAR.get(), IcariaItems.BONE_REMAINS.get(), Items.BONE_MEAL, 0.1F, 200, 12);
		this.grindingRecipe(pConsumer, IcariaItems.VOIDSHALE_GEAR.get(), IcariaItems.ROTTEN_BONES.get(), Items.BONE_MEAL, 0.1F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.VANADIUM_GEAR.get(), Items.STONE, Items.COBBLESTONE, 0.1F, 200, 1);
		this.grindingRecipe(pConsumer, IcariaItems.VANADIUM_GEAR.get(), Items.STONE_BRICKS, Items.CRACKED_STONE_BRICKS, 0.1F, 200, 1);
		this.grindingRecipe(pConsumer, IcariaItems.VANADIUM_GEAR.get(), Items.DEEPSLATE, Items.COBBLED_DEEPSLATE, 0.1F, 200, 1);
		this.grindingRecipe(pConsumer, IcariaItems.VANADIUM_GEAR.get(), Items.DEEPSLATE_BRICKS, Items.CRACKED_DEEPSLATE_BRICKS, 0.1F, 200, 1);
		this.grindingRecipe(pConsumer, IcariaItems.VANADIUM_GEAR.get(), Items.DEEPSLATE_TILES, Items.CRACKED_DEEPSLATE_TILES, 0.1F, 200, 1);
		this.grindingRecipe(pConsumer, IcariaItems.VANADIUM_GEAR.get(), Items.PRISMARINE, Items.PRISMARINE_SHARD, 0.1F, 200, 4);
		this.grindingRecipe(pConsumer, IcariaItems.VANADIUM_GEAR.get(), Items.NETHER_BRICKS, Items.CRACKED_NETHER_BRICKS, 0.1F, 200, 1);
		this.grindingRecipe(pConsumer, IcariaItems.VANADIUM_GEAR.get(), Items.GILDED_BLACKSTONE, Items.GOLD_NUGGET, 0.2F, 200, 6);
		this.grindingRecipe(pConsumer, IcariaItems.VANADIUM_GEAR.get(), Items.POLISHED_BLACKSTONE_BRICKS, Items.CRACKED_POLISHED_BLACKSTONE_BRICKS, 0.1F, 200, 1);
		this.grindingRecipe(pConsumer, IcariaItems.VANADIUM_GEAR.get(), Items.AMETHYST_BLOCK, Items.AMETHYST_SHARD, 0.1F, 200, 4);
		this.grindingRecipe(pConsumer, IcariaItems.VANADIUM_GEAR.get(), Items.COAL_ORE, Items.COAL, 0.2F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.VANADIUM_GEAR.get(), Items.DEEPSLATE_COAL_ORE, Items.COAL, 0.2F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.VANADIUM_GEAR.get(), Items.IRON_ORE, Items.RAW_IRON, 0.2F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.VANADIUM_GEAR.get(), Items.DEEPSLATE_IRON_ORE, Items.RAW_IRON, 0.2F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.VANADIUM_GEAR.get(), Items.COPPER_ORE, Items.RAW_COPPER, 0.2F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.VANADIUM_GEAR.get(), Items.DEEPSLATE_COPPER_ORE, Items.RAW_COPPER, 0.2F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.VANADIUM_GEAR.get(), Items.GOLD_ORE, Items.RAW_GOLD, 0.2F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.VANADIUM_GEAR.get(), Items.DEEPSLATE_GOLD_ORE, Items.RAW_GOLD, 0.2F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.VANADIUM_GEAR.get(), Items.REDSTONE_ORE, Items.REDSTONE, 0.2F, 200, 4);
		this.grindingRecipe(pConsumer, IcariaItems.VANADIUM_GEAR.get(), Items.DEEPSLATE_REDSTONE_ORE, Items.REDSTONE, 0.2F, 200, 4);
		this.grindingRecipe(pConsumer, IcariaItems.VANADIUM_GEAR.get(), Items.EMERALD_ORE, Items.EMERALD, 0.2F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.VANADIUM_GEAR.get(), Items.DEEPSLATE_EMERALD_ORE, Items.EMERALD, 0.2F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.VANADIUM_GEAR.get(), Items.LAPIS_ORE, Items.LAPIS_LAZULI, 0.2F, 200, 4);
		this.grindingRecipe(pConsumer, IcariaItems.VANADIUM_GEAR.get(), Items.DEEPSLATE_LAPIS_ORE, Items.LAPIS_LAZULI, 0.2F, 200, 4);
		this.grindingRecipe(pConsumer, IcariaItems.VANADIUM_GEAR.get(), Items.DIAMOND_ORE, Items.DIAMOND, 0.2F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.VANADIUM_GEAR.get(), Items.DEEPSLATE_DIAMOND_ORE, Items.DIAMOND, 0.2F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.VANADIUM_GEAR.get(), Items.NETHER_GOLD_ORE, Items.GOLD_NUGGET, 0.2F, 200, 6);
		this.grindingRecipe(pConsumer, IcariaItems.VANADIUM_GEAR.get(), Items.NETHER_QUARTZ_ORE, Items.QUARTZ, 0.2F, 200, 4);
		this.grindingRecipe(pConsumer, IcariaItems.VANADIUM_GEAR.get(), IcariaItems.YELLOWSTONE.get(), IcariaItems.COBBLED_YELLOWSTONE.get(), 0.1F, 200, 1);
		this.grindingRecipe(pConsumer, IcariaItems.VANADIUM_GEAR.get(), IcariaItems.SILKSTONE.get(), IcariaItems.COBBLED_SILKSTONE.get(), 0.1F, 200, 1);
		this.grindingRecipe(pConsumer, IcariaItems.VANADIUM_GEAR.get(), IcariaItems.SUNSTONE.get(), IcariaItems.COBBLED_SUNSTONE.get(), 0.1F, 200, 1);
		this.grindingRecipe(pConsumer, IcariaItems.VANADIUM_GEAR.get(), IcariaItems.VOIDSHALE.get(), IcariaItems.COBBLED_VOIDSHALE.get(), 0.1F, 200, 1);
		this.grindingRecipe(pConsumer, IcariaItems.VANADIUM_GEAR.get(), IcariaItems.BAETYL.get(), IcariaItems.COBBLED_BAETYL.get(), 0.1F, 200, 1);
		this.grindingRecipe(pConsumer, IcariaItems.VANADIUM_GEAR.get(), IcariaItems.SMOOTH_RELICSTONE.get(), IcariaItems.RELICSTONE.get(), 0.1F, 200, 1);
		this.grindingRecipe(pConsumer, IcariaItems.VANADIUM_GEAR.get(), IcariaItems.RELICSTONE_BRICKS.get(), IcariaItems.CRACKED_RELICSTONE_BRICKS.get(), 0.1F, 200, 1);
		this.grindingRecipe(pConsumer, IcariaItems.VANADIUM_GEAR.get(), IcariaItems.RELICSTONE_TILES.get(), IcariaItems.CRACKED_RELICSTONE_TILES.get(), 0.1F, 200, 1);
		this.grindingRecipe(pConsumer, IcariaItems.VANADIUM_GEAR.get(), IcariaItems.LIGNITE_ORE.get(), IcariaItems.LIGNITE.get(), 0.2F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.VANADIUM_GEAR.get(), IcariaItems.CHALKOS_ORE.get(), IcariaItems.RAW_CHALKOS.get(), 0.2F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.VANADIUM_GEAR.get(), IcariaItems.KASSITEROS_ORE.get(), IcariaItems.RAW_KASSITEROS.get(), 0.2F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.VANADIUM_GEAR.get(), IcariaItems.DOLOMITE_ORE.get(), IcariaItems.DOLOMITE.get(), 0.2F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.VANADIUM_GEAR.get(), IcariaItems.VANADIUM_ORE.get(), IcariaItems.RAW_VANADIUM.get(), 0.2F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.VANADIUM_GEAR.get(), IcariaItems.SLIVER_ORE.get(), IcariaItems.SLIVER.get(), 0.2F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.VANADIUM_GEAR.get(), IcariaItems.SIDEROS_ORE.get(), IcariaItems.RAW_SIDEROS.get(), 0.2F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.VANADIUM_GEAR.get(), IcariaItems.ANTHRACITE_ORE.get(), IcariaItems.ANTHRACITE.get(), 0.2F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.VANADIUM_GEAR.get(), IcariaItems.MOLYBDENUM_ORE.get(), IcariaItems.RAW_MOLYBDENUM.get(), 0.2F, 200, 2);
		this.grindingRecipe(pConsumer, IcariaItems.VANADIUM_GEAR.get(), IcariaItems.CALCITE.get(), IcariaItems.CALCITE_SHARD.get(), 0.1F, 200, 4);
		this.grindingRecipe(pConsumer, IcariaItems.VANADIUM_GEAR.get(), IcariaItems.HALITE.get(), IcariaItems.HALITE_SHARD.get(), 0.1F, 200, 4);
		this.grindingRecipe(pConsumer, IcariaItems.VANADIUM_GEAR.get(), IcariaItems.JASPER.get(), IcariaItems.JASPER_SHARD.get(), 0.1F, 200, 4);
		this.grindingRecipe(pConsumer, IcariaItems.VANADIUM_GEAR.get(), IcariaItems.ZIRCON.get(), IcariaItems.ZIRCON_SHARD.get(), 0.1F, 200, 4);
		this.grindingRecipe(pConsumer, IcariaItems.VANADIUM_GEAR.get(), IcariaItems.CALCITE_SHARD.get(), IcariaItems.CALCITE_DUST.get(), 0.2F, 200, 1);
		this.grindingRecipe(pConsumer, IcariaItems.VANADIUM_GEAR.get(), IcariaItems.HALITE_SHARD.get(), IcariaItems.HALITE_DUST.get(), 0.2F, 200, 1);
		this.grindingRecipe(pConsumer, IcariaItems.DAEDALIAN_GEAR.get(), IcariaItems.BLURRED_PLATOSHALE.get(), IcariaItems.BLURIDIUM_NUGGET.get(), 0.4F, 400, 6);
		this.grindingRecipe(pConsumer, IcariaItems.DAEDALIAN_GEAR.get(), IcariaItems.BLURRED_PLATOSHALE_BRICKS.get(), IcariaItems.BLURIDIUM_NUGGET.get(), 0.4F, 400, 6);

		this.smeltingRecipe(pConsumer, IcariaItems.CARDON_CACTUS.get(), Items.GREEN_DYE, 1.0F, 200);
		this.smeltingRecipe(pConsumer, IcariaItems.SPELT_FLOUR.get(), IcariaItems.SPELT_BREAD.get(), 0.3F, 200);

		this.adobeRecipe(pConsumer, IcariaItems.MARL.get(), IcariaItems.MARL_ADOBE.get());
		this.adobeRecipe(pConsumer, IcariaItems.DOLOMITE.get(), IcariaItems.DOLOMITE_ADOBE.get());
		this.adobeRecipe(pConsumer, IcariaItems.GRAINITE.get(), IcariaItems.GRAINITE_ADOBE.get());
		this.adobeRecipe(pConsumer, IcariaItems.COBBLED_YELLOWSTONE.get(), IcariaItems.YELLOWSTONE_ADOBE.get());
		this.adobeRecipe(pConsumer, IcariaItems.COBBLED_SILKSTONE.get(), IcariaItems.SILKSTONE_ADOBE.get());
		this.adobeRecipe(pConsumer, IcariaItems.COBBLED_SUNSTONE.get(), IcariaItems.SUNSTONE_ADOBE.get());
		this.adobeRecipe(pConsumer, IcariaItems.COBBLED_VOIDSHALE.get(), IcariaItems.VOIDSHALE_ADOBE.get());
		this.adobeRecipe(pConsumer, IcariaItems.COBBLED_BAETYL.get(), IcariaItems.BAETYL_ADOBE.get());

		this.smallCompressDecompressRecipes(pConsumer, IcariaItems.LOAM_LUMP.get(), IcariaItems.LOAM.get());

		this.smallCompressRecipe(pConsumer, IcariaItems.LOAM_BRICK.get(), IcariaItems.LOAM_BRICKS.get());
		this.smallCompressRecipe(pConsumer, IcariaItems.SILKSAND.get(), IcariaItems.SILKSTONE.get());
		this.smallCompressRecipe(pConsumer, IcariaItems.CALCITE_SHARD.get(), IcariaItems.CALCITE.get());
		this.smallCompressRecipe(pConsumer, IcariaItems.HALITE_SHARD.get(), IcariaItems.HALITE.get());
		this.smallCompressRecipe(pConsumer, IcariaItems.JASPER_SHARD.get(), IcariaItems.JASPER.get());
		this.smallCompressRecipe(pConsumer, IcariaItems.ZIRCON_SHARD.get(), IcariaItems.ZIRCON.get());
		this.smallCompressRecipe(pConsumer, IcariaItems.CYPRESS_PLANKS.get(), IcariaItems.CYPRESS_CRAFTING_TABLE.get());
		this.smallCompressRecipe(pConsumer, IcariaItems.DROUGHTROOT_PLANKS.get(), IcariaItems.DROUGHTROOT_CRAFTING_TABLE.get());
		this.smallCompressRecipe(pConsumer, IcariaItems.FIR_PLANKS.get(), IcariaItems.FIR_CRAFTING_TABLE.get());
		this.smallCompressRecipe(pConsumer, IcariaItems.LAUREL_PLANKS.get(), IcariaItems.LAUREL_CRAFTING_TABLE.get());
		this.smallCompressRecipe(pConsumer, IcariaItems.OLIVE_PLANKS.get(), IcariaItems.OLIVE_CRAFTING_TABLE.get());
		this.smallCompressRecipe(pConsumer, IcariaItems.PLANE_PLANKS.get(), IcariaItems.PLANE_CRAFTING_TABLE.get());
		this.smallCompressRecipe(pConsumer, IcariaItems.POPULUS_PLANKS.get(), IcariaItems.POPULUS_CRAFTING_TABLE.get());

		this.glassRecipes(pConsumer, IcariaItems.GRAINGLASS.get(), IcariaItems.GRAINGLASS_PANE.get(), IcariaItems.HORIZONTAL_GRAINGLASS_PANE.get());
		this.glassRecipes(pConsumer, IcariaItems.SILKGLASS.get(), IcariaItems.SILKGLASS_PANE.get(), IcariaItems.HORIZONTAL_SILKGLASS_PANE.get());

		this.stoneRecipes(pConsumer, IcariaItems.COBBLED_YELLOWSTONE.get(), IcariaItems.YELLOWSTONE.get(), IcariaItems.YELLOWSTONE_BRICKS.get(), IcariaItems.CHISELED_YELLOWSTONE.get(), IcariaItems.YELLOWSTONE_BRICK_DECO);
		this.stoneRecipes(pConsumer, IcariaItems.COBBLED_SILKSTONE.get(), IcariaItems.SILKSTONE.get(), IcariaItems.SILKSTONE_BRICKS.get(), IcariaItems.CHISELED_SILKSTONE.get(), IcariaItems.SILKSTONE_BRICK_DECO);
		this.stoneRecipes(pConsumer, IcariaItems.COBBLED_SUNSTONE.get(), IcariaItems.SUNSTONE.get(), IcariaItems.SUNSTONE_BRICKS.get(), IcariaItems.CHISELED_SUNSTONE.get(), IcariaItems.SUNSTONE_BRICK_DECO);
		this.stoneRecipes(pConsumer, IcariaItems.COBBLED_VOIDSHALE.get(), IcariaItems.VOIDSHALE.get(), IcariaItems.VOIDSHALE_BRICKS.get(), IcariaItems.CHISELED_VOIDSHALE.get(), IcariaItems.VOIDSHALE_BRICK_DECO);
		this.stoneRecipes(pConsumer, IcariaItems.COBBLED_BAETYL.get(), IcariaItems.BAETYL.get(), IcariaItems.BAETYL_BRICKS.get(), IcariaItems.CHISELED_BAETYL.get(), IcariaItems.BAETYL_BRICK_DECO);

		this.largeCompressDecompressRecipes(pConsumer, IcariaItems.ENDER_JELLYFISH_JELLY.get(), IcariaItems.ENDER_JELLYFISH_JELLY_BLOCK.get());
		this.largeCompressDecompressRecipes(pConsumer, IcariaItems.FIRE_JELLYFISH_JELLY.get(), IcariaItems.FIRE_JELLYFISH_JELLY_BLOCK.get());
		this.largeCompressDecompressRecipes(pConsumer, IcariaItems.NATURE_JELLYFISH_JELLY.get(), IcariaItems.NATURE_JELLYFISH_JELLY_BLOCK.get());
		this.largeCompressDecompressRecipes(pConsumer, IcariaItems.VOID_JELLYFISH_JELLY.get(), IcariaItems.VOID_JELLYFISH_JELLY_BLOCK.get());
		this.largeCompressDecompressRecipes(pConsumer, IcariaItems.WATER_JELLYFISH_JELLY.get(), IcariaItems.WATER_JELLYFISH_JELLY_BLOCK.get());
		this.largeCompressDecompressRecipes(pConsumer, IcariaItems.ARACHNE_STRING.get(), IcariaItems.ARACHNE_STRING_BLOCK.get());
		this.largeCompressDecompressRecipes(pConsumer, IcariaItems.SPELT.get(), IcariaItems.SPELT_BALE_BLOCK.get());
		this.largeCompressDecompressRecipes(pConsumer, IcariaItems.VINE_REED.get(), IcariaItems.VINE_REED_BLOCK.get());
		this.largeCompressDecompressRecipes(pConsumer, IcariaItems.ROTTEN_BONES.get(), IcariaItems.ROTTEN_BONES_BLOCK.get());
		this.largeCompressDecompressRecipes(pConsumer, IcariaItems.CALCITE_SHARD.get(), IcariaItems.CALCITE_BLOCK.get());
		this.largeCompressDecompressRecipes(pConsumer, IcariaItems.HALITE_SHARD.get(), IcariaItems.HALITE_BLOCK.get());
		this.largeCompressDecompressRecipes(pConsumer, IcariaItems.JASPER_SHARD.get(), IcariaItems.JASPER_BLOCK.get());
		this.largeCompressDecompressRecipes(pConsumer, IcariaItems.ZIRCON_SHARD.get(), IcariaItems.ZIRCON_BLOCK.get());
		this.largeCompressDecompressRecipes(pConsumer, IcariaItems.RAW_CHALKOS.get(), IcariaItems.RAW_CHALKOS_BLOCK.get());
		this.largeCompressDecompressRecipes(pConsumer, IcariaItems.RAW_KASSITEROS.get(), IcariaItems.RAW_KASSITEROS_BLOCK.get());
		this.largeCompressDecompressRecipes(pConsumer, IcariaItems.RAW_VANADIUM.get(), IcariaItems.RAW_VANADIUM_BLOCK.get());
		this.largeCompressDecompressRecipes(pConsumer, IcariaItems.RAW_SIDEROS.get(), IcariaItems.RAW_SIDEROS_BLOCK.get());
		this.largeCompressDecompressRecipes(pConsumer, IcariaItems.RAW_MOLYBDENUM.get(), IcariaItems.RAW_MOLYBDENUM_BLOCK.get());
		this.largeCompressDecompressRecipes(pConsumer, IcariaItems.CHERT.get(), IcariaItems.CHERT_BLOCK.get());
		this.largeCompressDecompressRecipes(pConsumer, IcariaItems.LIGNITE.get(), IcariaItems.LIGNITE_BLOCK.get());
		this.largeCompressDecompressRecipes(pConsumer, IcariaItems.SLIVER.get(), IcariaItems.SLIVER_BLOCK.get());
		this.largeCompressDecompressRecipes(pConsumer, IcariaItems.ANTHRACITE.get(), IcariaItems.ANTHRACITE_BLOCK.get());

		this.blockIngotNuggetRecipes(pConsumer, IcariaItems.CHALKOS_BLOCK.get(), IcariaItems.CHALKOS_INGOT.get(), IcariaItems.CHALKOS_NUGGET.get());
		this.blockIngotNuggetRecipes(pConsumer, IcariaItems.KASSITEROS_BLOCK.get(), IcariaItems.KASSITEROS_INGOT.get(), IcariaItems.KASSITEROS_NUGGET.get());
		this.blockIngotNuggetRecipes(pConsumer, IcariaItems.ORICHALCUM_BLOCK.get(), IcariaItems.ORICHALCUM_INGOT.get(), IcariaItems.ORICHALCUM_NUGGET.get());
		this.blockIngotNuggetRecipes(pConsumer, IcariaItems.VANADIUM_BLOCK.get(), IcariaItems.VANADIUM_INGOT.get(), IcariaItems.VANADIUM_NUGGET.get());
		this.blockIngotNuggetRecipes(pConsumer, IcariaItems.VANADIUMSTEEL_BLOCK.get(), IcariaItems.VANADIUMSTEEL_INGOT.get(), IcariaItems.VANADIUMSTEEL_NUGGET.get());
		this.blockIngotNuggetRecipes(pConsumer, IcariaItems.SIDEROS_BLOCK.get(), IcariaItems.SIDEROS_INGOT.get(), IcariaItems.SIDEROS_NUGGET.get());
		this.blockIngotNuggetRecipes(pConsumer, IcariaItems.MOLYBDENUM_BLOCK.get(), IcariaItems.MOLYBDENUM_INGOT.get(), IcariaItems.MOLYBDENUM_NUGGET.get());
		this.blockIngotNuggetRecipes(pConsumer, IcariaItems.MOLYBDENUMSTEEL_BLOCK.get(), IcariaItems.MOLYBDENUMSTEEL_INGOT.get(), IcariaItems.MOLYBDENUMSTEEL_NUGGET.get());
		this.blockIngotNuggetRecipes(pConsumer, IcariaItems.BLURIDIUM_BLOCK.get(), IcariaItems.BLURIDIUM_INGOT.get(), IcariaItems.BLURIDIUM_NUGGET.get());

		this.torchRecipe(pConsumer, IcariaItems.LIGNITE.get(), IcariaItems.LIGNITE_TORCH.get());
		this.torchRecipe(pConsumer, IcariaItems.ANTHRACITE.get(), IcariaItems.ANTHRACITE_TORCH.get());

		this.cakeRecipe(pConsumer, IcariaItems.LAUREL_CHERRY.get(), IcariaItems.ENDER_JELLYFISH_JELLY.get(), IcariaItems.LAUREL_CHERRY_CAKE.get());
		this.cakeRecipe(pConsumer, IcariaItems.STRAWBERRIES.get(), IcariaItems.FIRE_JELLYFISH_JELLY.get(), IcariaItems.STRAWBERRY_CAKE.get());
		this.cakeRecipe(pConsumer, IcariaItems.PHYSALIS.get(), IcariaItems.NATURE_JELLYFISH_JELLY.get(), IcariaItems.PHYSALIS_CAKE.get());
		this.cakeRecipe(pConsumer, IcariaItems.VINEBERRIES.get(), IcariaItems.VOID_JELLYFISH_JELLY.get(), IcariaItems.VINE_BERRY_CAKE.get());
		this.cakeRecipe(pConsumer, IcariaItems.VINE_SPROUT.get(), IcariaItems.WATER_JELLYFISH_JELLY.get(), IcariaItems.VINE_SPROUT_CAKE.get());

		this.woodRecipes(pConsumer, IcariaItems.CYPRESS_WOOD.get(), IcariaItems.STRIPPED_CYPRESS_WOOD.get(), IcariaItems.CYPRESS_LOG.get(), IcariaItems.STRIPPED_CYPRESS_LOG.get(), IcariaItems.DEAD_CYPRESS_LOG.get(), IcariaItems.STRIPPED_DEAD_CYPRESS_LOG.get());
		this.woodRecipes(pConsumer, IcariaItems.DROUGHTROOT_WOOD.get(), IcariaItems.STRIPPED_DROUGHTROOT_WOOD.get(), IcariaItems.DROUGHTROOT_LOG.get(), IcariaItems.STRIPPED_DROUGHTROOT_LOG.get(), IcariaItems.DEAD_DROUGHTROOT_LOG.get(), IcariaItems.STRIPPED_DEAD_DROUGHTROOT_LOG.get());
		this.woodRecipes(pConsumer, IcariaItems.FIR_WOOD.get(), IcariaItems.STRIPPED_FIR_WOOD.get(), IcariaItems.FIR_LOG.get(), IcariaItems.STRIPPED_FIR_LOG.get(), IcariaItems.DEAD_FIR_LOG.get(), IcariaItems.STRIPPED_DEAD_FIR_LOG.get());
		this.woodRecipes(pConsumer, IcariaItems.LAUREL_WOOD.get(), IcariaItems.STRIPPED_LAUREL_WOOD.get(), IcariaItems.LAUREL_LOG.get(), IcariaItems.STRIPPED_LAUREL_LOG.get(), IcariaItems.DEAD_LAUREL_LOG.get(), IcariaItems.STRIPPED_DEAD_LAUREL_LOG.get());
		this.woodRecipes(pConsumer, IcariaItems.OLIVE_WOOD.get(), IcariaItems.STRIPPED_OLIVE_WOOD.get(), IcariaItems.OLIVE_LOG.get(), IcariaItems.STRIPPED_OLIVE_LOG.get(), IcariaItems.DEAD_OLIVE_LOG.get(), IcariaItems.STRIPPED_DEAD_OLIVE_LOG.get());
		this.woodRecipes(pConsumer, IcariaItems.PLANE_WOOD.get(), IcariaItems.STRIPPED_PLANE_WOOD.get(), IcariaItems.PLANE_LOG.get(), IcariaItems.STRIPPED_PLANE_LOG.get(), IcariaItems.DEAD_PLANE_LOG.get(), IcariaItems.STRIPPED_DEAD_PLANE_LOG.get());
		this.woodRecipes(pConsumer, IcariaItems.POPULUS_WOOD.get(), IcariaItems.STRIPPED_POPULUS_WOOD.get(), IcariaItems.POPULUS_LOG.get(), IcariaItems.STRIPPED_POPULUS_LOG.get(), IcariaItems.DEAD_POPULUS_LOG.get(), IcariaItems.STRIPPED_DEAD_POPULUS_LOG.get());

		this.planksRecipe(pConsumer, IcariaItems.CYPRESS_WOOD.get(), IcariaItems.STRIPPED_CYPRESS_WOOD.get(), IcariaItems.CYPRESS_LOG.get(), IcariaItems.STRIPPED_CYPRESS_LOG.get(), IcariaItems.DEAD_CYPRESS_LOG.get(), IcariaItems.STRIPPED_DEAD_CYPRESS_LOG.get(), IcariaItems.CYPRESS_PLANKS.get());
		this.planksRecipe(pConsumer, IcariaItems.DROUGHTROOT_WOOD.get(), IcariaItems.STRIPPED_DROUGHTROOT_WOOD.get(), IcariaItems.DROUGHTROOT_LOG.get(), IcariaItems.STRIPPED_DROUGHTROOT_LOG.get(), IcariaItems.DEAD_DROUGHTROOT_LOG.get(), IcariaItems.STRIPPED_DEAD_DROUGHTROOT_LOG.get(), IcariaItems.DROUGHTROOT_PLANKS.get());
		this.planksRecipe(pConsumer, IcariaItems.FIR_WOOD.get(), IcariaItems.STRIPPED_FIR_WOOD.get(), IcariaItems.FIR_LOG.get(), IcariaItems.STRIPPED_FIR_LOG.get(), IcariaItems.DEAD_FIR_LOG.get(), IcariaItems.STRIPPED_DEAD_FIR_LOG.get(), IcariaItems.FIR_PLANKS.get());
		this.planksRecipe(pConsumer, IcariaItems.LAUREL_WOOD.get(), IcariaItems.STRIPPED_LAUREL_WOOD.get(), IcariaItems.LAUREL_LOG.get(), IcariaItems.STRIPPED_LAUREL_LOG.get(), IcariaItems.DEAD_LAUREL_LOG.get(), IcariaItems.STRIPPED_DEAD_LAUREL_LOG.get(), IcariaItems.LAUREL_PLANKS.get());
		this.planksRecipe(pConsumer, IcariaItems.OLIVE_WOOD.get(), IcariaItems.STRIPPED_OLIVE_WOOD.get(), IcariaItems.OLIVE_LOG.get(), IcariaItems.STRIPPED_OLIVE_LOG.get(), IcariaItems.DEAD_OLIVE_LOG.get(), IcariaItems.STRIPPED_DEAD_OLIVE_LOG.get(), IcariaItems.OLIVE_PLANKS.get());
		this.planksRecipe(pConsumer, IcariaItems.PLANE_WOOD.get(), IcariaItems.STRIPPED_PLANE_WOOD.get(), IcariaItems.PLANE_LOG.get(), IcariaItems.STRIPPED_PLANE_LOG.get(), IcariaItems.DEAD_PLANE_LOG.get(), IcariaItems.STRIPPED_DEAD_PLANE_LOG.get(), IcariaItems.PLANE_PLANKS.get());
		this.planksRecipe(pConsumer, IcariaItems.POPULUS_WOOD.get(), IcariaItems.STRIPPED_POPULUS_WOOD.get(), IcariaItems.POPULUS_LOG.get(), IcariaItems.STRIPPED_POPULUS_LOG.get(), IcariaItems.DEAD_POPULUS_LOG.get(), IcariaItems.STRIPPED_DEAD_POPULUS_LOG.get(), IcariaItems.POPULUS_PLANKS.get());

		this.troughRecipe(pConsumer, IcariaItems.CYPRESS_PLANKS.get(), IcariaItems.CYPRESS_LOG.get(), IcariaItems.CYPRESS_TROUGH.get());
		this.troughRecipe(pConsumer, IcariaItems.DROUGHTROOT_PLANKS.get(), IcariaItems.DROUGHTROOT_LOG.get(), IcariaItems.DROUGHTROOT_TROUGH.get());
		this.troughRecipe(pConsumer, IcariaItems.FIR_PLANKS.get(), IcariaItems.FIR_LOG.get(), IcariaItems.FIR_TROUGH.get());
		this.troughRecipe(pConsumer, IcariaItems.LAUREL_PLANKS.get(), IcariaItems.LAUREL_LOG.get(), IcariaItems.LAUREL_TROUGH.get());
		this.troughRecipe(pConsumer, IcariaItems.OLIVE_PLANKS.get(), IcariaItems.OLIVE_LOG.get(), IcariaItems.OLIVE_TROUGH.get());
		this.troughRecipe(pConsumer, IcariaItems.PLANE_PLANKS.get(), IcariaItems.PLANE_LOG.get(), IcariaItems.PLANE_TROUGH.get());
		this.troughRecipe(pConsumer, IcariaItems.POPULUS_PLANKS.get(), IcariaItems.POPULUS_LOG.get(), IcariaItems.POPULUS_TROUGH.get());

		this.doorRecipe(pConsumer, IcariaItems.CYPRESS_PLANKS.get(), IcariaItems.CYPRESS_DOOR.get());
		this.doorRecipe(pConsumer, IcariaItems.DROUGHTROOT_PLANKS.get(), IcariaItems.DROUGHTROOT_DOOR.get());
		this.doorRecipe(pConsumer, IcariaItems.FIR_PLANKS.get(), IcariaItems.FIR_DOOR.get());
		this.doorRecipe(pConsumer, IcariaItems.LAUREL_PLANKS.get(), IcariaItems.LAUREL_DOOR.get());
		this.doorRecipe(pConsumer, IcariaItems.OLIVE_PLANKS.get(), IcariaItems.OLIVE_DOOR.get());
		this.doorRecipe(pConsumer, IcariaItems.PLANE_PLANKS.get(), IcariaItems.PLANE_DOOR.get());
		this.doorRecipe(pConsumer, IcariaItems.POPULUS_PLANKS.get(), IcariaItems.POPULUS_DOOR.get());

		this.trapdoorRecipe(pConsumer, IcariaItems.CYPRESS_PLANKS.get(), IcariaItems.CYPRESS_TRAPDOOR.get());
		this.trapdoorRecipe(pConsumer, IcariaItems.DROUGHTROOT_PLANKS.get(), IcariaItems.DROUGHTROOT_TRAPDOOR.get());
		this.trapdoorRecipe(pConsumer, IcariaItems.FIR_PLANKS.get(), IcariaItems.FIR_TRAPDOOR.get());
		this.trapdoorRecipe(pConsumer, IcariaItems.LAUREL_PLANKS.get(), IcariaItems.LAUREL_TRAPDOOR.get());
		this.trapdoorRecipe(pConsumer, IcariaItems.OLIVE_PLANKS.get(), IcariaItems.OLIVE_TRAPDOOR.get());
		this.trapdoorRecipe(pConsumer, IcariaItems.PLANE_PLANKS.get(), IcariaItems.PLANE_TRAPDOOR.get());
		this.trapdoorRecipe(pConsumer, IcariaItems.POPULUS_PLANKS.get(), IcariaItems.POPULUS_TRAPDOOR.get());

		this.ladderRecipe(pConsumer, IcariaItems.CYPRESS_PLANKS.get(), IcariaItems.CYPRESS_LADDER.get());
		this.ladderRecipe(pConsumer, IcariaItems.DROUGHTROOT_PLANKS.get(), IcariaItems.DROUGHTROOT_LADDER.get());
		this.ladderRecipe(pConsumer, IcariaItems.FIR_PLANKS.get(), IcariaItems.FIR_LADDER.get());
		this.ladderRecipe(pConsumer, IcariaItems.LAUREL_PLANKS.get(), IcariaItems.LAUREL_LADDER.get());
		this.ladderRecipe(pConsumer, IcariaItems.OLIVE_PLANKS.get(), IcariaItems.OLIVE_LADDER.get());
		this.ladderRecipe(pConsumer, IcariaItems.PLANE_PLANKS.get(), IcariaItems.PLANE_LADDER.get());
		this.ladderRecipe(pConsumer, IcariaItems.POPULUS_PLANKS.get(), IcariaItems.POPULUS_LADDER.get());

		this.signRecipe(pConsumer, IcariaItems.CYPRESS_PLANKS.get(), IcariaItems.CYPRESS_SIGN.get());
		this.signRecipe(pConsumer, IcariaItems.DROUGHTROOT_PLANKS.get(), IcariaItems.DROUGHTROOT_SIGN.get());
		this.signRecipe(pConsumer, IcariaItems.FIR_PLANKS.get(), IcariaItems.FIR_SIGN.get());
		this.signRecipe(pConsumer, IcariaItems.LAUREL_PLANKS.get(), IcariaItems.LAUREL_SIGN.get());
		this.signRecipe(pConsumer, IcariaItems.OLIVE_PLANKS.get(), IcariaItems.OLIVE_SIGN.get());
		this.signRecipe(pConsumer, IcariaItems.PLANE_PLANKS.get(), IcariaItems.PLANE_SIGN.get());
		this.signRecipe(pConsumer, IcariaItems.POPULUS_PLANKS.get(), IcariaItems.POPULUS_SIGN.get());

		this.hangingSignRecipe(pConsumer, IcariaItems.STRIPPED_CYPRESS_LOG.get(), IcariaItems.CYPRESS_HANGING_SIGN.get());
		this.hangingSignRecipe(pConsumer, IcariaItems.STRIPPED_DROUGHTROOT_LOG.get(), IcariaItems.DROUGHTROOT_HANGING_SIGN.get());
		this.hangingSignRecipe(pConsumer, IcariaItems.STRIPPED_FIR_LOG.get(), IcariaItems.FIR_HANGING_SIGN.get());
		this.hangingSignRecipe(pConsumer, IcariaItems.STRIPPED_LAUREL_LOG.get(), IcariaItems.LAUREL_HANGING_SIGN.get());
		this.hangingSignRecipe(pConsumer, IcariaItems.STRIPPED_OLIVE_LOG.get(), IcariaItems.OLIVE_HANGING_SIGN.get());
		this.hangingSignRecipe(pConsumer, IcariaItems.STRIPPED_PLANE_LOG.get(), IcariaItems.PLANE_HANGING_SIGN.get());
		this.hangingSignRecipe(pConsumer, IcariaItems.STRIPPED_POPULUS_LOG.get(), IcariaItems.POPULUS_HANGING_SIGN.get());

		this.dyesFromFlowerRecipe(pConsumer, IcariaItems.BLINDWEED.get(), Items.PINK_DYE);
		this.dyesFromFlowerRecipe(pConsumer, IcariaItems.CHAMEOMILE.get(), Items.WHITE_DYE);
		this.dyesFromFlowerRecipe(pConsumer, IcariaItems.CHARMONDER.get(), Items.LIGHT_BLUE_DYE);
		this.dyesFromFlowerRecipe(pConsumer, IcariaItems.CLOVER.get(), Items.WHITE_DYE);
		this.dyesFromFlowerRecipe(pConsumer, IcariaItems.FIREHILT.get(), Items.RED_DYE);
		this.dyesFromFlowerRecipe(pConsumer, IcariaItems.BLUE_HYDRACINTH.get(), Items.BLUE_DYE);
		this.dyesFromFlowerRecipe(pConsumer, IcariaItems.PURPLE_HYDRACINTH.get(), Items.PURPLE_DYE);
		this.dyesFromFlowerRecipe(pConsumer, IcariaItems.LIONFANGS.get(), Items.PURPLE_DYE);
		this.dyesFromFlowerRecipe(pConsumer, IcariaItems.SPEARDROPS.get(), Items.LIME_DYE);
		this.dyesFromFlowerRecipe(pConsumer, IcariaItems.PURPLE_STAGHORN.get(), Items.PURPLE_DYE);
		this.dyesFromFlowerRecipe(pConsumer, IcariaItems.YELLOW_STAGHORN.get(), Items.YELLOW_DYE);
		this.dyesFromFlowerRecipe(pConsumer, IcariaItems.BLUE_STORMCOTTON.get(), Items.BLUE_DYE);
		this.dyesFromFlowerRecipe(pConsumer, IcariaItems.PINK_STORMCOTTON.get(), Items.PINK_DYE);
		this.dyesFromFlowerRecipe(pConsumer, IcariaItems.PURPLE_STORMCOTTON.get(), Items.PURPLE_DYE);
		this.dyesFromFlowerRecipe(pConsumer, IcariaItems.SUNKETTLE.get(), Items.YELLOW_DYE);
		this.dyesFromFlowerRecipe(pConsumer, IcariaItems.SUNSPONGE.get(), Items.ORANGE_DYE);
		this.dyesFromFlowerRecipe(pConsumer, IcariaItems.VOIDLILY.get(), Items.BLACK_DYE);
		this.dyesFromFlowerRecipe(pConsumer, IcariaItems.BLUE_GROUND_FLOWERS.get(), Items.BLUE_DYE);
		this.dyesFromFlowerRecipe(pConsumer, IcariaItems.CYAN_GROUND_FLOWERS.get(), Items.CYAN_DYE);
		this.dyesFromFlowerRecipe(pConsumer, IcariaItems.PINK_GROUND_FLOWERS.get(), Items.PINK_DYE);
		this.dyesFromFlowerRecipe(pConsumer, IcariaItems.PURPLE_GROUND_FLOWERS.get(), Items.PURPLE_DYE);
		this.dyesFromFlowerRecipe(pConsumer, IcariaItems.RED_GROUND_FLOWERS.get(), Items.RED_DYE);
		this.dyesFromFlowerRecipe(pConsumer, IcariaItems.WHITE_GROUND_FLOWERS.get(), Items.WHITE_DYE);
		this.dyesFromFlowerRecipe(pConsumer, IcariaItems.WHITE_BROMELIA.get(), Items.WHITE_DYE);
		this.dyesFromFlowerRecipe(pConsumer, IcariaItems.ORANGE_BROMELIA.get(), Items.ORANGE_DYE);
		this.dyesFromFlowerRecipe(pConsumer, IcariaItems.PINK_BROMELIA.get(), Items.PINK_DYE);
		this.dyesFromFlowerRecipe(pConsumer, IcariaItems.PURPLE_BROMELIA.get(), Items.PURPLE_DYE);

		this.toolRecipes(pConsumer, IcariaItems.CHERT.get(), IcariaItems.CHERT_TOOLS.sword.get(), IcariaItems.CHERT_TOOLS.dagger.get(), IcariaItems.CHERT_TOOLS.shovel.get(), IcariaItems.CHERT_TOOLS.pickaxe.get(), IcariaItems.CHERT_TOOLS.axe.get(), IcariaItems.CHERT_TOOLS.scythe.get(), IcariaItems.CHERT_TOOLS.bident.get());
		this.toolRecipes(pConsumer, IcariaItems.CHALKOS_INGOT.get(), IcariaItems.CHALKOS_TOOLS.sword.get(), IcariaItems.CHALKOS_TOOLS.dagger.get(), IcariaItems.CHALKOS_TOOLS.shovel.get(), IcariaItems.CHALKOS_TOOLS.pickaxe.get(), IcariaItems.CHALKOS_TOOLS.axe.get(), IcariaItems.CHALKOS_TOOLS.scythe.get(), IcariaItems.CHALKOS_TOOLS.bident.get());
		this.toolRecipes(pConsumer, IcariaItems.KASSITEROS_INGOT.get(), IcariaItems.KASSITEROS_TOOLS.sword.get(), IcariaItems.KASSITEROS_TOOLS.dagger.get(), IcariaItems.KASSITEROS_TOOLS.shovel.get(), IcariaItems.KASSITEROS_TOOLS.pickaxe.get(), IcariaItems.KASSITEROS_TOOLS.axe.get(), IcariaItems.KASSITEROS_TOOLS.scythe.get(), IcariaItems.KASSITEROS_TOOLS.bident.get());
		this.toolRecipes(pConsumer, IcariaItems.ORICHALCUM_INGOT.get(), IcariaItems.ORICHALCUM_TOOLS.sword.get(), IcariaItems.ORICHALCUM_TOOLS.dagger.get(), IcariaItems.ORICHALCUM_TOOLS.shovel.get(), IcariaItems.ORICHALCUM_TOOLS.pickaxe.get(), IcariaItems.ORICHALCUM_TOOLS.axe.get(), IcariaItems.ORICHALCUM_TOOLS.scythe.get(), IcariaItems.ORICHALCUM_TOOLS.bident.get());
		this.toolRecipes(pConsumer, IcariaItems.VANADIUMSTEEL_INGOT.get(), IcariaItems.VANADIUMSTEEL_TOOLS.sword.get(), IcariaItems.VANADIUMSTEEL_TOOLS.dagger.get(), IcariaItems.VANADIUMSTEEL_TOOLS.shovel.get(), IcariaItems.VANADIUMSTEEL_TOOLS.pickaxe.get(), IcariaItems.VANADIUMSTEEL_TOOLS.axe.get(), IcariaItems.VANADIUMSTEEL_TOOLS.scythe.get(), IcariaItems.VANADIUMSTEEL_TOOLS.bident.get());
		this.toolRecipes(pConsumer, IcariaItems.SIDEROS_INGOT.get(), IcariaItems.SIDEROS_TOOLS.sword.get(), IcariaItems.SIDEROS_TOOLS.dagger.get(), IcariaItems.SIDEROS_TOOLS.shovel.get(), IcariaItems.SIDEROS_TOOLS.pickaxe.get(), IcariaItems.SIDEROS_TOOLS.axe.get(), IcariaItems.SIDEROS_TOOLS.scythe.get(), IcariaItems.SIDEROS_TOOLS.bident.get());
		this.toolRecipes(pConsumer, IcariaItems.MOLYBDENUMSTEEL_INGOT.get(), IcariaItems.MOLYBDENUMSTEEL_TOOLS.sword.get(), IcariaItems.MOLYBDENUMSTEEL_TOOLS.dagger.get(), IcariaItems.MOLYBDENUMSTEEL_TOOLS.shovel.get(), IcariaItems.MOLYBDENUMSTEEL_TOOLS.pickaxe.get(), IcariaItems.MOLYBDENUMSTEEL_TOOLS.axe.get(), IcariaItems.MOLYBDENUMSTEEL_TOOLS.scythe.get(), IcariaItems.MOLYBDENUMSTEEL_TOOLS.bident.get());

		this.armorRecipes(pConsumer, IcariaItems.AETERNAE_HIDE.get(), IcariaItems.AETERNAE_HIDE_ARMOR.helmet.get(), IcariaItems.AETERNAE_HIDE_ARMOR.chestplate.get(), IcariaItems.AETERNAE_HIDE_ARMOR.leggings.get(), IcariaItems.AETERNAE_HIDE_ARMOR.boots.get());
		this.armorRecipes(pConsumer, IcariaItems.CHALKOS_INGOT.get(), IcariaItems.CHALKOS_ARMOR.helmet.get(), IcariaItems.CHALKOS_ARMOR.chestplate.get(), IcariaItems.CHALKOS_ARMOR.leggings.get(), IcariaItems.CHALKOS_ARMOR.boots.get());
		this.armorRecipes(pConsumer, IcariaItems.KASSITEROS_INGOT.get(), IcariaItems.KASSITEROS_ARMOR.helmet.get(), IcariaItems.KASSITEROS_ARMOR.chestplate.get(), IcariaItems.KASSITEROS_ARMOR.leggings.get(), IcariaItems.KASSITEROS_ARMOR.boots.get());
		this.armorRecipes(pConsumer, IcariaItems.ORICHALCUM_INGOT.get(), IcariaItems.ORICHALCUM_HELMET.get(), IcariaItems.ORICHALCUM_CHESTPLATE.get(), IcariaItems.ORICHALCUM_LEGGINGS.get(), IcariaItems.ORICHALCUM_BOOTS.get());
		this.armorRecipes(pConsumer, IcariaItems.VANADIUMSTEEL_INGOT.get(), IcariaItems.VANADIUMSTEEL_ARMOR.helmet.get(), IcariaItems.VANADIUMSTEEL_ARMOR.chestplate.get(), IcariaItems.VANADIUMSTEEL_ARMOR.leggings.get(), IcariaItems.VANADIUMSTEEL_ARMOR.boots.get());

		this.vaseRecipe(pConsumer, Items.WHITE_DYE, IcariaItems.WHITE_UNFIRED_STORAGE_VASE.get());
		this.vaseRecipe(pConsumer, Items.LIGHT_GRAY_DYE, IcariaItems.LIGHT_GRAY_UNFIRED_STORAGE_VASE.get());
		this.vaseRecipe(pConsumer, Items.GRAY_DYE, IcariaItems.GRAY_UNFIRED_STORAGE_VASE.get());
		this.vaseRecipe(pConsumer, Items.BLACK_DYE, IcariaItems.BLACK_UNFIRED_STORAGE_VASE.get());
		this.vaseRecipe(pConsumer, Items.BROWN_DYE, IcariaItems.BROWN_UNFIRED_STORAGE_VASE.get());
		this.vaseRecipe(pConsumer, Items.RED_DYE, IcariaItems.RED_UNFIRED_STORAGE_VASE.get());
		this.vaseRecipe(pConsumer, Items.ORANGE_DYE, IcariaItems.ORANGE_UNFIRED_STORAGE_VASE.get());
		this.vaseRecipe(pConsumer, Items.YELLOW_DYE, IcariaItems.YELLOW_UNFIRED_STORAGE_VASE.get());
		this.vaseRecipe(pConsumer, Items.LIME_DYE, IcariaItems.LIME_UNFIRED_STORAGE_VASE.get());
		this.vaseRecipe(pConsumer, Items.GREEN_DYE, IcariaItems.GREEN_UNFIRED_STORAGE_VASE.get());
		this.vaseRecipe(pConsumer, Items.CYAN_DYE, IcariaItems.CYAN_UNFIRED_STORAGE_VASE.get());
		this.vaseRecipe(pConsumer, Items.LIGHT_BLUE_DYE, IcariaItems.LIGHT_BLUE_UNFIRED_STORAGE_VASE.get());
		this.vaseRecipe(pConsumer, Items.BLUE_DYE, IcariaItems.BLUE_UNFIRED_STORAGE_VASE.get());
		this.vaseRecipe(pConsumer, Items.PURPLE_DYE, IcariaItems.PURPLE_UNFIRED_STORAGE_VASE.get());
		this.vaseRecipe(pConsumer, Items.MAGENTA_DYE, IcariaItems.MAGENTA_UNFIRED_STORAGE_VASE.get());
		this.vaseRecipe(pConsumer, Items.PINK_DYE, IcariaItems.PINK_UNFIRED_STORAGE_VASE.get());

		this.bowlFlaskVialRecipe(pConsumer, IcariaItems.SILKGLASS.get(), IcariaItems.EMPTY_FLASK.get(), 3);
		this.bowlFlaskVialRecipe(pConsumer, IcariaItems.GRAINGLASS.get(), IcariaItems.EMPTY_VIAL.get(), 3);
		this.bowlFlaskVialRecipe(pConsumer, IcariaItems.LOAM_LUMP.get(), IcariaItems.UNFIRED_LOAM_BOWL.get(), 4);

		this.spellToFlaskRecipe(pConsumer, IcariaItems.ANTI_GRAVITY_SPELL.get(), IcariaItems.ANTI_GRAVITY_FLASK.get());
		this.spellToFlaskRecipe(pConsumer, IcariaItems.FORTIFYING_SPELL.get(), IcariaItems.FORTIFYING_FLASK.get());
		this.spellToFlaskRecipe(pConsumer, IcariaItems.HEALING_SPELL.get(), IcariaItems.HEALING_FLASK.get());

		this.gearRecipe(pConsumer, IcariaItems.YELLOWSTONE.get(), IcariaItems.YELLOWSTONE_GEAR.get());
		this.gearRecipe(pConsumer, IcariaItems.LOAM_LUMP.get(), IcariaItems.UNFIRED_LOAM_GEAR.get());
		this.gearRecipe(pConsumer, IcariaItems.VOIDSHALE.get(), IcariaItems.VOIDSHALE_GEAR.get());
		this.gearRecipe(pConsumer, IcariaItems.VANADIUM_INGOT.get(), IcariaItems.VANADIUM_GEAR.get());

		this.foodCookingRecipes(pConsumer, IcariaItems.RAW_AETERNAE_MEAT.get(), IcariaItems.COOKED_AETERNAE_MEAT.get());
		this.foodCookingRecipes(pConsumer, IcariaItems.RAW_CATOBLEPAS_MEAT.get(), IcariaItems.COOKED_CATOBLEPAS_MEAT.get());
		this.foodCookingRecipes(pConsumer, IcariaItems.RAW_CERVER_MEAT.get(), IcariaItems.COOKED_CERVER_MEAT.get());
		this.foodCookingRecipes(pConsumer, IcariaItems.RAW_SOW_MEAT.get(), IcariaItems.COOKED_SOW_MEAT.get());

		this.stewRecipe(pConsumer, IcariaItems.RAW_AETERNAE_MEAT.get(), Items.BEETROOT, IcariaItems.AETERNAE_STEW.get());
		this.stewRecipe(pConsumer, IcariaItems.RAW_CATOBLEPAS_MEAT.get(), IcariaItems.ONION.get(), IcariaItems.CATOBLEPAS_STEW.get());
		this.stewRecipe(pConsumer, IcariaItems.RAW_CERVER_MEAT.get(), Items.CARROT, IcariaItems.CERVER_STEW.get());

		this.seedRecipe(pConsumer, IcariaItems.STRAWBERRIES.get(), IcariaItems.STRAWBERRY_SEEDS.get());
		this.seedRecipe(pConsumer, IcariaItems.PHYSALIS.get(), IcariaItems.PHYSALIS_SEEDS.get());

		for (var items : IcariaStoneDecoItems.STONE_DECO_ITEMS) {
			ShapedRecipeBuilder.shaped(RecipeCategory.MISC, items.stairs.get(), 4)
				.pattern("X  ")
				.pattern("XX ")
				.pattern("XXX")
				.define('X', items.item.get())
				.unlockedBy("has_" + items.item.get(), RecipeProvider.has(items.item.get()))
				.save(pConsumer, items.stairs.getId());

			ShapedRecipeBuilder.shaped(RecipeCategory.MISC, items.slab.get(), 6)
				.pattern("XXX")
				.define('X', items.item.get())
				.unlockedBy("has_" + items.item.get(), RecipeProvider.has(items.item.get()))
				.save(pConsumer, items.slab.getId());

			ShapedRecipeBuilder.shaped(RecipeCategory.MISC, items.wall.get(), 6)
				.pattern("XXX")
				.pattern("XXX")
				.define('X', items.item.get())
				.unlockedBy("has_" + items.item.get(), RecipeProvider.has(items.item.get()))
				.save(pConsumer, items.wall.getId());

			SingleItemRecipeBuilder.stonecutting(Ingredient.of(items.item.get()), RecipeCategory.MISC, items.stairs.get())
				.unlockedBy("has_" + items.item.get(), RecipeProvider.has(items.item.get()))
				.save(pConsumer, items.stairs.getId() + "_from_stonecutting");

			SingleItemRecipeBuilder.stonecutting(Ingredient.of(items.item.get()), RecipeCategory.MISC, items.slab.get(), 2)
				.unlockedBy("has_" + items.item.get(), RecipeProvider.has(items.item.get()))
				.save(pConsumer, items.slab.getId() + "_from_stonecutting");

			SingleItemRecipeBuilder.stonecutting(Ingredient.of(items.item.get()), RecipeCategory.MISC, items.wall.get())
				.unlockedBy("has_" + items.item.get(), RecipeProvider.has(items.item.get()))
				.save(pConsumer, items.wall.getId() + "_from_stonecutting");
		}

		for (var items : IcariaWoodDecoItems.WOOD_DECO_ITEMS) {
			ShapedRecipeBuilder.shaped(RecipeCategory.MISC, items.stairs.get(), 4)
				.pattern("X  ")
				.pattern("XX ")
				.pattern("XXX")
				.define('X', items.item.get())
				.unlockedBy("has_" + items.item.get(), RecipeProvider.has(items.item.get()))
				.save(pConsumer, items.stairs.getId());

			ShapedRecipeBuilder.shaped(RecipeCategory.MISC, items.slab.get(), 6)
				.pattern("XXX")
				.define('X', items.item.get())
				.unlockedBy("has_" + items.item.get(), RecipeProvider.has(items.item.get()))
				.save(pConsumer, items.slab.getId());

			ShapedRecipeBuilder.shaped(RecipeCategory.MISC, items.fence.get(), 3)
				.pattern("XYX")
				.pattern("XYX")
				.define('X', items.item.get())
				.define('Y', Items.STICK)
				.unlockedBy("has_" + items.item.get(), RecipeProvider.has(items.item.get()))
				.unlockedBy("has_" + Items.STICK, RecipeProvider.has(Items.STICK))
				.save(pConsumer, items.fence.getId());

			ShapedRecipeBuilder.shaped(RecipeCategory.MISC, items.gate.get(), 1)
				.pattern("YXY")
				.pattern("YXY")
				.define('X', items.item.get())
				.define('Y', Items.STICK)
				.unlockedBy("has_" + items.item.get(), RecipeProvider.has(items.item.get()))
				.unlockedBy("has_" + Items.STICK, RecipeProvider.has(Items.STICK))
				.save(pConsumer, items.gate.getId());
		}

		// DOLOMITE
		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, IcariaItems.SMOOTH_DOLOMITE.get(), 1)
			.pattern("XX")
			.pattern("XX")
			.define('X', IcariaItems.DOLOMITE.get())
			.unlockedBy("has_" + IcariaItems.DOLOMITE.get(), RecipeProvider.has(IcariaItems.DOLOMITE.get()))
			.save(pConsumer, IcariaItems.SMOOTH_DOLOMITE.getId());

		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, IcariaItems.DOLOMITE_BRICKS.get(), 4)
			.pattern("XX")
			.pattern("XX")
			.define('X', IcariaItems.SMOOTH_DOLOMITE.get())
			.unlockedBy("has_" + IcariaItems.SMOOTH_DOLOMITE.get(), RecipeProvider.has(IcariaItems.SMOOTH_DOLOMITE.get()))
			.save(pConsumer, IcariaItems.DOLOMITE_BRICKS.getId());

		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, IcariaItems.DOLOMITE_PILLAR.get(), 2)
			.pattern("X")
			.pattern("X")
			.define('X', IcariaItems.DOLOMITE_BRICKS.get())
			.unlockedBy("has_" + IcariaItems.DOLOMITE_BRICKS.get(), RecipeProvider.has(IcariaItems.DOLOMITE_BRICKS.get()))
			.save(pConsumer, IcariaItems.DOLOMITE_PILLAR.getId());

		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, IcariaItems.DOLOMITE_PILLAR_HEAD.get(), 2)
			.pattern("X")
			.pattern("Y")
			.define('X', IcariaItems.DOLOMITE_BRICKS.get())
			.define('Y', IcariaItems.DOLOMITE_PILLAR.get())
			.unlockedBy("has_" + IcariaItems.DOLOMITE_BRICKS.get(), RecipeProvider.has(IcariaItems.DOLOMITE_BRICKS.get()))
			.unlockedBy("has_" + IcariaItems.DOLOMITE_PILLAR.get(), RecipeProvider.has(IcariaItems.DOLOMITE_PILLAR.get()))
			.save(pConsumer, IcariaItems.DOLOMITE_PILLAR_HEAD.getId());

		SingleItemRecipeBuilder.stonecutting(Ingredient.of(IcariaItems.SMOOTH_DOLOMITE.get()), RecipeCategory.MISC, IcariaItems.DOLOMITE_BRICKS.get())
			.unlockedBy("has_" + IcariaItems.SMOOTH_DOLOMITE.get(), RecipeProvider.has(IcariaItems.SMOOTH_DOLOMITE.get()))
			.save(pConsumer, IcariaItems.DOLOMITE_BRICKS.getId() + "_from_stonecutting");

		SingleItemRecipeBuilder.stonecutting(Ingredient.of(IcariaItems.SMOOTH_DOLOMITE.get(), IcariaItems.DOLOMITE_BRICKS.get()), RecipeCategory.MISC, IcariaItems.DOLOMITE_PILLAR.get())
			.unlockedBy("has_" + IcariaItems.SMOOTH_DOLOMITE.get(), RecipeProvider.has(IcariaItems.SMOOTH_DOLOMITE.get()))
			.unlockedBy("has_" + IcariaItems.DOLOMITE_BRICKS.get(), RecipeProvider.has(IcariaItems.DOLOMITE_BRICKS.get()))
			.save(pConsumer, IcariaItems.DOLOMITE_PILLAR.getId() + "_from_stonecutting");

		SingleItemRecipeBuilder.stonecutting(Ingredient.of(IcariaItems.SMOOTH_DOLOMITE.get(), IcariaItems.DOLOMITE_BRICKS.get(), IcariaItems.DOLOMITE_PILLAR.get()), RecipeCategory.MISC, IcariaItems.DOLOMITE_PILLAR_HEAD.get())
			.unlockedBy("has_" + IcariaItems.SMOOTH_DOLOMITE.get(), RecipeProvider.has(IcariaItems.SMOOTH_DOLOMITE.get()))
			.unlockedBy("has_" + IcariaItems.DOLOMITE_BRICKS.get(), RecipeProvider.has(IcariaItems.DOLOMITE_BRICKS.get()))
			.unlockedBy("has_" + IcariaItems.DOLOMITE_PILLAR.get(), RecipeProvider.has(IcariaItems.DOLOMITE_PILLAR.get()))
			.save(pConsumer, IcariaItems.DOLOMITE_PILLAR_HEAD.getId() + "_from_stonecutting");

		// GRAINITE
		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, IcariaItems.GRAINITE.get(), 1)
			.pattern("XX")
			.pattern("XX")
			.define('X', IcariaItems.GRAINEL.get())
			.unlockedBy("has_" + IcariaItems.GRAINEL.get(), RecipeProvider.has(IcariaItems.GRAINEL.get()))
			.save(pConsumer, IcariaItems.GRAINITE.getId());

		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, IcariaItems.GRAINITE_BRICKS.get(), 4)
			.pattern("XX")
			.pattern("XX")
			.define('X', IcariaItems.GRAINITE.get())
			.unlockedBy("has_" + IcariaItems.GRAINITE.get(), RecipeProvider.has(IcariaItems.GRAINITE.get()))
			.save(pConsumer, IcariaItems.GRAINITE_BRICKS.getId());

		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, IcariaItems.CHISELED_GRAINITE.get(), 1)
			.pattern("X")
			.pattern("X")
			.define('X', IcariaItems.GRAINITE_BRICK_DECO.slab.get())
			.unlockedBy("has_" + IcariaItems.GRAINITE_BRICK_DECO.slab.get(), RecipeProvider.has(IcariaItems.GRAINITE_BRICK_DECO.slab.get()))
			.save(pConsumer, IcariaItems.CHISELED_GRAINITE.getId());

		SingleItemRecipeBuilder.stonecutting(Ingredient.of(IcariaItems.GRAINITE.get()), RecipeCategory.MISC, IcariaItems.GRAINITE_BRICKS.get())
			.unlockedBy("has_" + IcariaItems.GRAINITE.get(), RecipeProvider.has(IcariaItems.GRAINITE.get()))
			.save(pConsumer, IcariaItems.GRAINITE_BRICKS.getId() + "_from_stonecutting");

		SingleItemRecipeBuilder.stonecutting(Ingredient.of(IcariaItems.GRAINITE.get(), IcariaItems.GRAINITE_BRICKS.get()), RecipeCategory.MISC, IcariaItems.CHISELED_GRAINITE.get())
			.unlockedBy("has_" + IcariaItems.GRAINITE.get(), RecipeProvider.has(IcariaItems.GRAINITE.get()))
			.unlockedBy("has_" + IcariaItems.GRAINITE_BRICKS.get(), RecipeProvider.has(IcariaItems.GRAINITE_BRICKS.get()))
			.save(pConsumer, IcariaItems.CHISELED_GRAINITE.getId() + "_from_stonecutting");

		// RELICSTONE
		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, IcariaItems.RELICSTONE_BRICKS.get(), 4)
			.pattern("XX")
			.pattern("XX")
			.define('X', IcariaItems.RELICSTONE.get())
			.unlockedBy("has_" + IcariaItems.RELICSTONE.get(), RecipeProvider.has(IcariaItems.RELICSTONE.get()))
			.save(pConsumer, IcariaItems.RELICSTONE_BRICKS.getId());

		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, IcariaItems.RELICSTONE_TILES.get(), 4)
			.pattern("XX")
			.pattern("XX")
			.define('X', IcariaItems.RELICSTONE_BRICKS.get())
			.unlockedBy("has_" + IcariaItems.RELICSTONE_BRICKS.get(), RecipeProvider.has(IcariaItems.RELICSTONE_BRICKS.get()))
			.save(pConsumer, IcariaItems.RELICSTONE_TILES.getId());

		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, IcariaItems.CHISELED_RELICSTONE.get(), 1)
			.pattern("X")
			.pattern("X")
			.define('X', IcariaItems.RELICSTONE_BRICK_DECO.slab.get())
			.unlockedBy("has_" + IcariaItems.RELICSTONE_BRICK_DECO.slab.get(), RecipeProvider.has(IcariaItems.RELICSTONE_BRICK_DECO.slab.get()))
			.save(pConsumer, IcariaItems.CHISELED_RELICSTONE.getId());

		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, IcariaItems.RELICSTONE_PILLAR.get(), 2)
			.pattern("X")
			.pattern("X")
			.define('X', IcariaItems.RELICSTONE_BRICKS.get())
			.unlockedBy("has_" + IcariaItems.RELICSTONE_BRICKS.get(), RecipeProvider.has(IcariaItems.RELICSTONE_BRICKS.get()))
			.save(pConsumer, IcariaItems.RELICSTONE_PILLAR.getId());

		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, IcariaItems.RELICSTONE_PILLAR_HEAD.get(), 2)
			.pattern("X")
			.pattern("Y")
			.define('X', IcariaItems.RELICSTONE_BRICKS.get())
			.define('Y', IcariaItems.RELICSTONE_PILLAR.get())
			.unlockedBy("has_" + IcariaItems.RELICSTONE_BRICKS.get(), RecipeProvider.has(IcariaItems.RELICSTONE_BRICKS.get()))
			.unlockedBy("has_" + IcariaItems.RELICSTONE_PILLAR.get(), RecipeProvider.has(IcariaItems.RELICSTONE_PILLAR.get()))
			.save(pConsumer, IcariaItems.RELICSTONE_PILLAR_HEAD.getId());

		ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, IcariaItems.MOSSY_RELICSTONE_BRICKS.get(), 1)
			.requires(IcariaItems.RELICSTONE_BRICKS.get())
			.requires(Items.MOSS_BLOCK)
			.unlockedBy("has_" + IcariaItems.RELICSTONE_BRICKS.get(), RecipeProvider.has(IcariaItems.RELICSTONE_BRICKS.get()))
			.unlockedBy("has_" + Items.MOSS_BLOCK, RecipeProvider.has(Items.MOSS_BLOCK))
			.save(pConsumer, IcariaItems.MOSSY_RELICSTONE_BRICKS.getId() + "_from_moss_block");

		ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, IcariaItems.MOSSY_RELICSTONE_BRICKS.get(), 1)
			.requires(IcariaItems.RELICSTONE_BRICKS.get())
			.requires(Ingredient.of(Items.VINE, IcariaItems.BLOOMY_VINE.get(), IcariaItems.BRANCHY_VINE.get(), IcariaItems.BRUSHY_VINE.get(), IcariaItems.DRY_VINE.get(), IcariaItems.REEDY_VINE.get(), IcariaItems.SWIRLY_VINE.get(), IcariaItems.THORNY_VINE.get()))
			.unlockedBy("has_" + IcariaItems.RELICSTONE_BRICKS.get(), RecipeProvider.has(IcariaItems.RELICSTONE_BRICKS.get()))
			.unlockedBy("has_" + Items.VINE, RecipeProvider.has(Items.VINE))
			.unlockedBy("has_" + IcariaItems.BLOOMY_VINE.get(), RecipeProvider.has((IcariaItems.BLOOMY_VINE.get())))
			.unlockedBy("has_" + IcariaItems.BRANCHY_VINE.get(), RecipeProvider.has((IcariaItems.BRANCHY_VINE.get())))
			.unlockedBy("has_" + IcariaItems.BRUSHY_VINE.get(), RecipeProvider.has((IcariaItems.BRUSHY_VINE.get())))
			.unlockedBy("has_" + IcariaItems.DRY_VINE.get(), RecipeProvider.has((IcariaItems.DRY_VINE.get())))
			.unlockedBy("has_" + IcariaItems.REEDY_VINE.get(), RecipeProvider.has((IcariaItems.REEDY_VINE.get())))
			.unlockedBy("has_" + IcariaItems.SWIRLY_VINE.get(), RecipeProvider.has((IcariaItems.SWIRLY_VINE.get())))
			.unlockedBy("has_" + IcariaItems.THORNY_VINE.get(), RecipeProvider.has((IcariaItems.THORNY_VINE.get())))
			.save(pConsumer, IcariaItems.MOSSY_RELICSTONE_BRICKS.getId() + "_from_vine");

		ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, IcariaItems.MOSSY_RELICSTONE_TILES.get(), 1)
			.requires(IcariaItems.RELICSTONE_TILES.get())
			.requires(Items.MOSS_BLOCK)
			.unlockedBy("has_" + IcariaItems.RELICSTONE_TILES.get(), RecipeProvider.has(IcariaItems.RELICSTONE_TILES.get()))
			.unlockedBy("has_" + Items.MOSS_BLOCK, RecipeProvider.has(Items.MOSS_BLOCK))
			.save(pConsumer, IcariaItems.MOSSY_RELICSTONE_TILES.getId() + "_from_moss_block");

		ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, IcariaItems.MOSSY_RELICSTONE_TILES.get(), 1)
			.requires(IcariaItems.RELICSTONE_TILES.get())
			.requires(Ingredient.of(Items.VINE, IcariaItems.BLOOMY_VINE.get(), IcariaItems.BRANCHY_VINE.get(), IcariaItems.BRUSHY_VINE.get(), IcariaItems.DRY_VINE.get(), IcariaItems.REEDY_VINE.get(), IcariaItems.SWIRLY_VINE.get(), IcariaItems.THORNY_VINE.get()))
			.unlockedBy("has_" + IcariaItems.RELICSTONE_TILES.get(), RecipeProvider.has(IcariaItems.RELICSTONE_TILES.get()))
			.unlockedBy("has_" + Items.VINE, RecipeProvider.has(Items.VINE))
			.unlockedBy("has_" + IcariaItems.BLOOMY_VINE.get(), RecipeProvider.has((IcariaItems.BLOOMY_VINE.get())))
			.unlockedBy("has_" + IcariaItems.BRANCHY_VINE.get(), RecipeProvider.has((IcariaItems.BRANCHY_VINE.get())))
			.unlockedBy("has_" + IcariaItems.BRUSHY_VINE.get(), RecipeProvider.has((IcariaItems.BRUSHY_VINE.get())))
			.unlockedBy("has_" + IcariaItems.DRY_VINE.get(), RecipeProvider.has((IcariaItems.DRY_VINE.get())))
			.unlockedBy("has_" + IcariaItems.REEDY_VINE.get(), RecipeProvider.has((IcariaItems.REEDY_VINE.get())))
			.unlockedBy("has_" + IcariaItems.SWIRLY_VINE.get(), RecipeProvider.has((IcariaItems.SWIRLY_VINE.get())))
			.unlockedBy("has_" + IcariaItems.THORNY_VINE.get(), RecipeProvider.has((IcariaItems.THORNY_VINE.get())))
			.save(pConsumer, IcariaItems.MOSSY_RELICSTONE_TILES.getId() + "_from_vine");

		SimpleCookingRecipeBuilder.smelting(Ingredient.of(IcariaItems.RELICSTONE.get()), RecipeCategory.MISC, IcariaItems.SMOOTH_RELICSTONE.get(), 0.1F, 200)
			.unlockedBy("has_" + IcariaItems.RELICSTONE.get(), RecipeProvider.has(IcariaItems.RELICSTONE.get()))
			.save(pConsumer, IcariaItems.SMOOTH_RELICSTONE.getId() + "_from_smelting");

		SimpleCookingRecipeBuilder.smelting(Ingredient.of(IcariaItems.RELICSTONE_BRICKS.get()), RecipeCategory.MISC, IcariaItems.CRACKED_RELICSTONE_BRICKS.get(), 0.1F, 200)
			.unlockedBy("has_" + IcariaItems.RELICSTONE_BRICKS.get(), RecipeProvider.has(IcariaItems.RELICSTONE_BRICKS.get()))
			.save(pConsumer, IcariaItems.CRACKED_RELICSTONE_BRICKS.getId() + "_from_smelting");

		SimpleCookingRecipeBuilder.smelting(Ingredient.of(IcariaItems.RELICSTONE_TILES.get()), RecipeCategory.MISC, IcariaItems.CRACKED_RELICSTONE_TILES.get(), 0.1F, 200)
			.unlockedBy("has_" + IcariaItems.RELICSTONE_TILES.get(), RecipeProvider.has(IcariaItems.RELICSTONE_TILES.get()))
			.save(pConsumer, IcariaItems.CRACKED_RELICSTONE_TILES.getId() + "_from_smelting");

		SingleItemRecipeBuilder.stonecutting(Ingredient.of(IcariaItems.RELICSTONE.get()), RecipeCategory.MISC, IcariaItems.RELICSTONE_BRICKS.get())
			.unlockedBy("has_" + IcariaItems.RELICSTONE.get(), RecipeProvider.has(IcariaItems.RELICSTONE.get()))
			.save(pConsumer, IcariaItems.RELICSTONE_BRICKS.getId() + "_from_stonecutting");

		SingleItemRecipeBuilder.stonecutting(Ingredient.of(IcariaItems.RELICSTONE.get(), IcariaItems.RELICSTONE_BRICKS.get()), RecipeCategory.MISC, IcariaItems.RELICSTONE_TILES.get())
			.unlockedBy("has_" + IcariaItems.RELICSTONE.get(), RecipeProvider.has(IcariaItems.RELICSTONE.get()))
			.unlockedBy("has_" + IcariaItems.RELICSTONE_BRICKS.get(), RecipeProvider.has(IcariaItems.RELICSTONE_BRICKS.get()))
			.save(pConsumer, IcariaItems.RELICSTONE_TILES.getId() + "_from_stonecutting");

		SingleItemRecipeBuilder.stonecutting(Ingredient.of(IcariaItems.RELICSTONE.get(), IcariaItems.RELICSTONE_BRICKS.get()), RecipeCategory.MISC, IcariaItems.CHISELED_RELICSTONE.get())
			.unlockedBy("has_" + IcariaItems.RELICSTONE.get(), RecipeProvider.has(IcariaItems.RELICSTONE.get()))
			.unlockedBy("has_" + IcariaItems.RELICSTONE_BRICKS.get(), RecipeProvider.has(IcariaItems.RELICSTONE_BRICKS.get()))
			.save(pConsumer, IcariaItems.CHISELED_RELICSTONE.getId() + "_from_stonecutting");

		SingleItemRecipeBuilder.stonecutting(Ingredient.of(IcariaItems.RELICSTONE.get(), IcariaItems.RELICSTONE_BRICKS.get()), RecipeCategory.MISC, IcariaItems.RELICSTONE_PILLAR.get())
			.unlockedBy("has_" + IcariaItems.RELICSTONE.get(), RecipeProvider.has(IcariaItems.RELICSTONE.get()))
			.unlockedBy("has_" + IcariaItems.RELICSTONE_BRICKS.get(), RecipeProvider.has(IcariaItems.RELICSTONE_BRICKS.get()))
			.save(pConsumer, IcariaItems.RELICSTONE_PILLAR.getId() + "_from_stonecutting");

		SingleItemRecipeBuilder.stonecutting(Ingredient.of(IcariaItems.RELICSTONE.get(), IcariaItems.RELICSTONE_BRICKS.get(), IcariaItems.RELICSTONE_PILLAR.get()), RecipeCategory.MISC, IcariaItems.RELICSTONE_PILLAR_HEAD.get())
			.unlockedBy("has_" + IcariaItems.RELICSTONE.get(), RecipeProvider.has(IcariaItems.RELICSTONE.get()))
			.unlockedBy("has_" + IcariaItems.RELICSTONE_BRICKS.get(), RecipeProvider.has(IcariaItems.RELICSTONE_BRICKS.get()))
			.unlockedBy("has_" + IcariaItems.RELICSTONE_PILLAR.get(), RecipeProvider.has(IcariaItems.RELICSTONE_PILLAR.get()))
			.save(pConsumer, IcariaItems.RELICSTONE_PILLAR_HEAD.getId() + "_from_stonecutting");

		// PLATOSHALE
		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, IcariaItems.PLATOSHALE_BRICKS.get(), 4)
			.pattern("XX")
			.pattern("XX")
			.define('X', IcariaItems.PLATOSHALE.get())
			.unlockedBy("has_" + IcariaItems.PLATOSHALE.get(), RecipeProvider.has(IcariaItems.PLATOSHALE.get()))
			.save(pConsumer, IcariaItems.PLATOSHALE_BRICKS.getId());

		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, IcariaItems.CHISELED_PLATOSHALE.get(), 1)
			.pattern("X")
			.pattern("X")
			.define('X', IcariaItems.PLATOSHALE_BRICK_DECO.slab.get())
			.unlockedBy("has_" + IcariaItems.PLATOSHALE_BRICK_DECO.slab.get(), RecipeProvider.has(IcariaItems.PLATOSHALE_BRICK_DECO.slab.get()))
			.save(pConsumer, IcariaItems.CHISELED_PLATOSHALE.getId());

		SingleItemRecipeBuilder.stonecutting(Ingredient.of(IcariaItems.PLATOSHALE.get()), RecipeCategory.MISC, IcariaItems.PLATOSHALE_BRICKS.get())
			.unlockedBy("has_" + IcariaItems.PLATOSHALE.get(), RecipeProvider.has(IcariaItems.PLATOSHALE.get()))
			.save(pConsumer, IcariaItems.PLATOSHALE_BRICKS.getId() + "_from_stonecutting");

		SingleItemRecipeBuilder.stonecutting(Ingredient.of(IcariaItems.PLATOSHALE.get(), IcariaItems.PLATOSHALE_BRICKS.get()), RecipeCategory.MISC, IcariaItems.CHISELED_PLATOSHALE.get())
			.unlockedBy("has_" + IcariaItems.PLATOSHALE.get(), RecipeProvider.has(IcariaItems.PLATOSHALE.get()))
			.unlockedBy("has_" + IcariaItems.PLATOSHALE_BRICKS.get(), RecipeProvider.has(IcariaItems.PLATOSHALE_BRICKS.get()))
			.save(pConsumer, IcariaItems.CHISELED_PLATOSHALE.getId() + "_from_stonecutting");

		// QUARTZ
		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, IcariaItems.QUARTZ_PILLAR_HEAD.get(), 2)
			.pattern("X")
			.pattern("Y")
			.define('X', Items.QUARTZ_BRICKS)
			.define('Y', Items.QUARTZ_PILLAR)
			.unlockedBy("has_" + Items.QUARTZ_BRICKS, RecipeProvider.has(Items.QUARTZ_BRICKS))
			.unlockedBy("has_" + Items.QUARTZ_PILLAR, RecipeProvider.has(Items.QUARTZ_PILLAR))
			.save(pConsumer, IcariaItems.QUARTZ_PILLAR_HEAD.getId());

		SingleItemRecipeBuilder.stonecutting(Ingredient.of(Items.QUARTZ_BLOCK, Items.QUARTZ_BRICKS, Items.QUARTZ_PILLAR), RecipeCategory.MISC, IcariaItems.QUARTZ_PILLAR_HEAD.get(), 1)
			.unlockedBy("has_" + Items.QUARTZ_BLOCK, RecipeProvider.has(Items.QUARTZ_BLOCK))
			.unlockedBy("has_" + Items.QUARTZ_BRICKS, RecipeProvider.has(Items.QUARTZ_BRICKS))
			.unlockedBy("has_" + Items.QUARTZ_PILLAR, RecipeProvider.has(Items.QUARTZ_PILLAR))
			.save(pConsumer, IcariaItems.QUARTZ_PILLAR_HEAD.getId() + "_from_stonecutting");

		// MISC
		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, IcariaItems.COARSE_MARL.get(), 4)
			.pattern("XY")
			.pattern("YX")
			.define('Y', IcariaItems.MARL.get())
			.define('X', IcariaItems.GRAINEL.get())
			.unlockedBy("has_" + IcariaItems.MARL.get(), RecipeProvider.has(IcariaItems.MARL.get()))
			.unlockedBy("has_" + IcariaItems.GRAINEL.get(), RecipeProvider.has(IcariaItems.GRAINEL.get()))
			.save(pConsumer, IcariaItems.COARSE_MARL.getId());

		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, IcariaItems.PACKED_ARISTONE.get(), 1)
			.pattern("XXX")
			.pattern("XXX")
			.pattern("XXX")
			.define('X', IcariaItems.ARISTONE.get())
			.unlockedBy("has_" + IcariaItems.ARISTONE.get(), RecipeProvider.has(IcariaItems.ARISTONE.get()))
			.save(pConsumer, IcariaItems.PACKED_ARISTONE.getId());

		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, IcariaItems.VANADIUMSTEEL_BARS.get(), 16)
			.pattern("XXX")
			.pattern("XXX")
			.define('X', IcariaItems.VANADIUMSTEEL_INGOT.get())
			.unlockedBy("has_" + IcariaItems.VANADIUMSTEEL_INGOT.get(), RecipeProvider.has(IcariaItems.VANADIUMSTEEL_INGOT.get()))
			.save(pConsumer, IcariaItems.VANADIUMSTEEL_BARS.getId());

		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, IcariaItems.HORIZONTAL_VANADIUMSTEEL_BARS.get(), 2)
			.pattern("XX")
			.define('X', IcariaItems.VANADIUMSTEEL_BARS.get())
			.unlockedBy("has_" + IcariaItems.VANADIUMSTEEL_BARS.get(), RecipeProvider.has(IcariaItems.VANADIUMSTEEL_BARS.get()))
			.save(pConsumer, IcariaItems.HORIZONTAL_VANADIUMSTEEL_BARS.getId());

		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, IcariaItems.VANADIUMSTEEL_CHAIN.get(), 1)
			.pattern("X")
			.pattern("Y")
			.pattern("X")
			.define('X', IcariaItems.VANADIUMSTEEL_NUGGET.get())
			.define('Y', IcariaItems.VANADIUMSTEEL_INGOT.get())
			.unlockedBy("has_" + IcariaItems.VANADIUMSTEEL_NUGGET.get(), RecipeProvider.has(IcariaItems.VANADIUMSTEEL_NUGGET.get()))
			.unlockedBy("has_" + IcariaItems.VANADIUMSTEEL_INGOT.get(), RecipeProvider.has(IcariaItems.VANADIUMSTEEL_INGOT.get()))
			.save(pConsumer, IcariaItems.VANADIUMSTEEL_CHAIN.getId());

		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, IcariaItems.KETTLE.get(), 1)
			.pattern("X X")
			.pattern("Y Y")
			.pattern("XYX")
			.define('X', IcariaItems.ORICHALCUM_INGOT.get())
			.define('Y', IcariaItems.VANADIUMSTEEL_BLOCK.get())
			.unlockedBy("has_" + IcariaItems.ORICHALCUM_INGOT.get(), RecipeProvider.has(IcariaItems.ORICHALCUM_INGOT.get()))
			.unlockedBy("has_" + IcariaItems.VANADIUMSTEEL_BLOCK.get(), RecipeProvider.has(IcariaItems.VANADIUMSTEEL_BLOCK.get()))
			.save(pConsumer, IcariaItems.KETTLE.getId());

		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, IcariaItems.GRINDER.get(), 1)
			.pattern("XXX")
			.pattern("XYX")
			.pattern("XXX")
			.define('X', IcariaItems.SUNSTONE_BRICKS.get())
			.define('Y', IcariaItems.ORICHALCUM_INGOT.get())
			.unlockedBy("has_" + IcariaItems.SUNSTONE_BRICKS.get(), RecipeProvider.has(IcariaItems.SUNSTONE_BRICKS.get()))
			.unlockedBy("has_" + IcariaItems.ORICHALCUM_INGOT.get(), RecipeProvider.has(IcariaItems.ORICHALCUM_INGOT.get()))
			.save(pConsumer, IcariaItems.GRINDER.getId());

		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, IcariaItems.KILN.get(), 1)
			.pattern("XXX")
			.pattern("X X")
			.pattern("XXX")
			.define('X', IcariaItems.YELLOWSTONE_BRICKS.get())
			.unlockedBy("has_" + IcariaItems.YELLOWSTONE_BRICKS.get(), RecipeProvider.has(IcariaItems.YELLOWSTONE_BRICKS.get()))
			.save(pConsumer, IcariaItems.KILN.getId());

		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, IcariaItems.FORGE.get(), 1)
			.pattern("XYX")
			.pattern("X X")
			.pattern("XYX")
			.define('X', IcariaItems.GRAINITE_BRICKS.get())
			.define('Y', IcariaItems.LOAM_BRICKS.get())
			.unlockedBy("has_" + IcariaItems.GRAINITE_BRICKS.get(), RecipeProvider.has(IcariaItems.GRAINITE_BRICKS.get()))
			.unlockedBy("has_" + IcariaItems.LOAM_BRICKS.get(), RecipeProvider.has(IcariaItems.LOAM_BRICKS.get()))
			.save(pConsumer, IcariaItems.FORGE.getId());

		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, IcariaItems.CHEST.get(), 1)
			.pattern("XXX")
			.pattern("X X")
			.pattern("XXX")
			.define('X', IcariaItems.LAUREL_PLANKS.get())
			.unlockedBy("has_" + IcariaItems.LAUREL_PLANKS.get(), RecipeProvider.has(IcariaItems.LAUREL_PLANKS.get()))
			.save(pConsumer, IcariaItems.CHEST.getId());

		ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, IcariaItems.TRAPPED_CHEST.get(), 1)
			.requires(IcariaItems.CHEST.get())
			.requires(Items.TRIPWIRE_HOOK)
			.unlockedBy("has_" + IcariaItems.CHEST.get(), RecipeProvider.has(IcariaItems.CHEST.get()))
			.unlockedBy("has_" + Items.TRIPWIRE_HOOK, RecipeProvider.has(Items.TRIPWIRE_HOOK))
			.save(pConsumer, IcariaItems.TRAPPED_CHEST.getId());

		ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, IcariaItems.GREENPOWDER.get(), 1)
			.requires(IcariaItems.CALCITE_DUST.get())
			.requires(IcariaItems.HALITE_DUST.get())
			.requires(IcariaItems.LIGNITE.get())
			.unlockedBy("has_" + IcariaItems.CALCITE_DUST.get(), RecipeProvider.has(IcariaItems.CALCITE_DUST.get()))
			.unlockedBy("has_" + IcariaItems.HALITE_DUST.get(), RecipeProvider.has(IcariaItems.HALITE_DUST.get()))
			.unlockedBy("has_" + IcariaItems.LIGNITE.get(), RecipeProvider.has(IcariaItems.LIGNITE.get()))
			.save(pConsumer, IcariaItems.GREENPOWDER.getId());

		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, IcariaItems.GREEK_FIRE_GRENADE.get(), 1)
			.pattern(" X ")
			.pattern("YYY")
			.pattern("ZZZ")
			.define('X', IcariaItems.ARACHNE_STRING.get())
			.define('Y', IcariaItems.KASSITEROS_NUGGET.get())
			.define('Z', IcariaItems.GREENPOWDER.get())
			.unlockedBy("has_" + IcariaItems.ARACHNE_STRING.get(), RecipeProvider.has(IcariaItems.ARACHNE_STRING.get()))
			.unlockedBy("has_" + IcariaItems.KASSITEROS_NUGGET.get(), RecipeProvider.has(IcariaItems.KASSITEROS_NUGGET.get()))
			.unlockedBy("has_" + IcariaItems.GREENPOWDER.get(), RecipeProvider.has(IcariaItems.GREENPOWDER.get()))
			.save(pConsumer, IcariaItems.GREEK_FIRE_GRENADE.getId());

		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, IcariaItems.UNFIRED_STORAGE_VASE.get(), 1)
			.pattern("XXX")
			.pattern("X X")
			.pattern("XXX")
			.define('X', IcariaItems.LOAM_LUMP.get())
			.unlockedBy("has_" + IcariaItems.LOAM_LUMP.get(), RecipeProvider.has(IcariaItems.LOAM_LUMP.get()))
			.save(pConsumer, IcariaItems.UNFIRED_STORAGE_VASE.getId());

		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, IcariaItems.CHEST_LABEL.get(), 1)
			.pattern("XXX")
			.define('X', Items.PAPER)
			.unlockedBy("has_" + Items.PAPER, RecipeProvider.has(Items.PAPER))
			.save(pConsumer, IcariaItems.CHEST_LABEL.getId());

		ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, IcariaItems.DAEDALIAN_GEAR.get(), 1)
			.requires(IcariaItems.BLUE_GEARFRAGMENT.get())
			.requires(IcariaItems.GREEN_GEARFRAGMENT.get())
			.requires(IcariaItems.YELLOW_GEARFRAGMENT.get())
			.unlockedBy("has_" + IcariaItems.BLUE_GEARFRAGMENT.get(), RecipeProvider.has(IcariaItems.BLUE_GEARFRAGMENT.get()))
			.unlockedBy("has_" + IcariaItems.GREEN_GEARFRAGMENT.get(), RecipeProvider.has(IcariaItems.GREEN_GEARFRAGMENT.get()))
			.unlockedBy("has_" + IcariaItems.YELLOW_GEARFRAGMENT.get(), RecipeProvider.has(IcariaItems.YELLOW_GEARFRAGMENT.get()))
			.save(pConsumer, IcariaItems.DAEDALIAN_GEAR.getId());

		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, IcariaItems.SPELT_BREAD.get(), 1)
			.pattern("XXX")
			.define('X', IcariaItems.SPELT.get())
			.unlockedBy("has_" + IcariaItems.SPELT.get(), RecipeProvider.has(IcariaItems.SPELT.get()))
			.save(pConsumer, IcariaItems.SPELT_BREAD.getId());

		ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, IcariaItems.FRUIT_SALAD.get(), 1)
			.requires(Items.SUGAR)
			.requires(IcariaItems.VINEBERRIES.get())
			.requires(IcariaItems.STRAWBERRIES.get())
			.requires(IcariaItems.PHYSALIS.get())
			.requires(IcariaItems.LAUREL_CHERRY.get())
			.requires(IcariaItems.LOAM_BOWL.get())
			.unlockedBy("has_" + Items.SUGAR, RecipeProvider.has(Items.SUGAR))
			.unlockedBy("has_" + IcariaItems.VINEBERRIES.get(), RecipeProvider.has(IcariaItems.VINEBERRIES.get()))
			.unlockedBy("has_" + IcariaItems.STRAWBERRIES.get(), RecipeProvider.has(IcariaItems.STRAWBERRIES.get()))
			.unlockedBy("has_" + IcariaItems.PHYSALIS.get(), RecipeProvider.has(IcariaItems.PHYSALIS.get()))
			.unlockedBy("has_" + IcariaItems.LAUREL_CHERRY.get(), RecipeProvider.has(IcariaItems.LAUREL_CHERRY.get()))
			.unlockedBy("has_" + IcariaItems.LOAM_BOWL.get(), RecipeProvider.has(IcariaItems.LOAM_BOWL.get()))
			.save(pConsumer, IcariaItems.FRUIT_SALAD.getId());

		ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, IcariaItems.ONION_SOUP.get(), 1)
			.requires(IcariaItems.ONION.get(), 3)
			.requires(IcariaItems.HALITE_DUST.get())
			.requires(IcariaItems.LOAM_BOWL.get())
			.unlockedBy("has_" + IcariaItems.ONION.get(), RecipeProvider.has(IcariaItems.ONION.get()))
			.unlockedBy("has_" + IcariaItems.HALITE_DUST.get(), RecipeProvider.has(IcariaItems.HALITE_DUST.get()))
			.unlockedBy("has_" + IcariaItems.LOAM_BOWL.get(), RecipeProvider.has(IcariaItems.LOAM_BOWL.get()))
			.save(pConsumer, IcariaItems.ONION_SOUP.getId());

		ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, IcariaItems.SOW_STEW.get(), 1)
			.requires(IcariaItems.RAW_SOW_MEAT.get())
			.requires(Ingredient.of(Items.BROWN_MUSHROOM, Items.RED_MUSHROOM, IcariaItems.BROWN_GROUND_SHROOMS.get(), IcariaItems.GREEN_GROUND_SHROOMS.get(), IcariaItems.LARGE_BROWN_GROUND_SHROOMS.get(), IcariaItems.TINDER_FUNGUS_TREE_SHROOMS.get(), IcariaItems.TURKEY_TAIL_TREE_SHROOMS.get(), IcariaItems.UNNAMED_TREE_SHROOMS.get()))
			.requires(IcariaItems.HALITE_DUST.get())
			.requires(IcariaItems.LOAM_BOWL.get())
			.unlockedBy("has_" + IcariaItems.RAW_SOW_MEAT.get(), RecipeProvider.has(IcariaItems.RAW_SOW_MEAT.get()))
			.unlockedBy("has_" + Items.BROWN_MUSHROOM, RecipeProvider.has(Items.BROWN_MUSHROOM))
			.unlockedBy("has_" + Items.RED_MUSHROOM, RecipeProvider.has(Items.RED_MUSHROOM))
			.unlockedBy("has_" + IcariaItems.BROWN_GROUND_SHROOMS.get(), RecipeProvider.has(IcariaItems.BROWN_GROUND_SHROOMS.get()))
			.unlockedBy("has_" + IcariaItems.GREEN_GROUND_SHROOMS.get(), RecipeProvider.has(IcariaItems.GREEN_GROUND_SHROOMS.get()))
			.unlockedBy("has_" + IcariaItems.LARGE_BROWN_GROUND_SHROOMS.get(), RecipeProvider.has(IcariaItems.LARGE_BROWN_GROUND_SHROOMS.get()))
			.unlockedBy("has_" + IcariaItems.TINDER_FUNGUS_TREE_SHROOMS.get(), RecipeProvider.has(IcariaItems.TINDER_FUNGUS_TREE_SHROOMS.get()))
			.unlockedBy("has_" + IcariaItems.TURKEY_TAIL_TREE_SHROOMS.get(), RecipeProvider.has(IcariaItems.TURKEY_TAIL_TREE_SHROOMS.get()))
			.unlockedBy("has_" + IcariaItems.UNNAMED_TREE_SHROOMS.get(), RecipeProvider.has(IcariaItems.UNNAMED_TREE_SHROOMS.get()))
			.unlockedBy("has_" + IcariaItems.HALITE_DUST.get(), RecipeProvider.has(IcariaItems.HALITE_DUST.get()))
			.unlockedBy("has_" + IcariaItems.LOAM_BOWL.get(), RecipeProvider.has(IcariaItems.LOAM_BOWL.get()))
			.save(pConsumer, IcariaItems.SOW_STEW.getId());

		// VANILLA
		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.ARROW, 1)
			.pattern("X")
			.pattern("Y")
			.pattern("Z")
			.define('X', IcariaItems.CHERT.get())
			.define('Y', Items.STICK)
			.define('Z', Items.FEATHER)
			.unlockedBy("has_" + IcariaItems.CHERT.get(), RecipeProvider.has(IcariaItems.CHERT.get()))
			.unlockedBy("has_" + Items.STICK, RecipeProvider.has(Items.STICK))
			.unlockedBy("has_" + Items.FEATHER, RecipeProvider.has(Items.FEATHER))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(Items.ARROW) + "_from_chert");

		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.BOOK, 1)
			.pattern("XX")
			.pattern("XY")
			.define('X', Items.PAPER)
			.define('Y', IcariaItems.AETERNAE_HIDE.get())
			.unlockedBy("has_" + Items.PAPER, RecipeProvider.has(Items.PAPER))
			.unlockedBy("has_" + IcariaItems.AETERNAE_HIDE.get(), RecipeProvider.has(IcariaItems.AETERNAE_HIDE.get()))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(Items.BOOK) + "_from_aeternae_hide");

		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.COMPARATOR, 1)
			.pattern(" X ")
			.pattern("XYX")
			.pattern("ZZZ")
			.define('X', Items.REDSTONE_TORCH)
			.define('Y', Items.QUARTZ)
			.define('Z', IcariaItems.SMOOTH_RELICSTONE.get())
			.unlockedBy("has_" + Items.REDSTONE_TORCH, RecipeProvider.has(Items.REDSTONE_TORCH))
			.unlockedBy("has_" + Items.QUARTZ, RecipeProvider.has(Items.QUARTZ))
			.unlockedBy("has_" + IcariaItems.SMOOTH_RELICSTONE.get(), RecipeProvider.has(IcariaItems.SMOOTH_RELICSTONE.get()))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(Items.COMPARATOR) + "_from_relicstone");

		ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.COPPER_INGOT, 1)
			.requires(IcariaItems.CHALKOS_INGOT.get())
			.requires(IcariaItems.CALCITE_DUST.get())
			.unlockedBy("has_" + IcariaItems.CHALKOS_INGOT.get(), RecipeProvider.has(IcariaItems.CHALKOS_INGOT.get()))
			.unlockedBy("has_" + IcariaItems.CALCITE_DUST.get(), RecipeProvider.has(IcariaItems.CALCITE_DUST.get()))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(Items.COPPER_INGOT));

		ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.FIRE_CHARGE, 3)
			.requires(IcariaItems.GREENPOWDER.get())
			.requires(Items.BLAZE_POWDER)
			.requires(Ingredient.of(Items.COAL, Items.CHARCOAL))
			.unlockedBy("has_" + IcariaItems.GREENPOWDER.get(), RecipeProvider.has(IcariaItems.GREENPOWDER.get()))
			.unlockedBy("has_" + Items.BLAZE_POWDER, RecipeProvider.has(Items.BLAZE_POWDER))
			.unlockedBy("has_" + Items.COAL, RecipeProvider.has(Items.COAL))
			.unlockedBy("has_" + Items.CHARCOAL, RecipeProvider.has(Items.CHARCOAL))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(Items.FIRE_CHARGE) + "_from_greenpowder");

		ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.FIREWORK_ROCKET, 3)
			.requires(IcariaItems.GREENPOWDER.get())
			.requires(Items.PAPER)
			.unlockedBy("has_" + IcariaItems.GREENPOWDER.get(), RecipeProvider.has(IcariaItems.GREENPOWDER.get()))
			.unlockedBy("has_" + Items.PAPER, RecipeProvider.has(Items.PAPER))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(Items.FIREWORK_ROCKET) + "_from_greenpowder");

		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.FLETCHING_TABLE, 1)
			.pattern("XX")
			.pattern("YY")
			.pattern("YY")
			.define('X', IcariaItems.CHERT.get())
			.define('Y', Ingredient.of(Items.OAK_PLANKS, Items.SPRUCE_PLANKS, Items.BIRCH_PLANKS, Items.JUNGLE_PLANKS, Items.ACACIA_PLANKS, Items.DARK_OAK_PLANKS, Items.MANGROVE_PLANKS, Items.CRIMSON_PLANKS, Items.WARPED_PLANKS, IcariaItems.CYPRESS_PLANKS.get(), IcariaItems.DROUGHTROOT_PLANKS.get(), IcariaItems.FIR_PLANKS.get(), IcariaItems.LAUREL_PLANKS.get(), IcariaItems.OLIVE_PLANKS.get(), IcariaItems.PLANE_PLANKS.get(), IcariaItems.POPULUS_PLANKS.get()))
			.unlockedBy("has_" + IcariaItems.CHERT.get(), RecipeProvider.has(IcariaItems.CHERT.get()))
			.unlockedBy("has_" + Items.OAK_PLANKS, RecipeProvider.has(Items.OAK_PLANKS))
			.unlockedBy("has_" + Items.SPRUCE_PLANKS, RecipeProvider.has(Items.SPRUCE_PLANKS))
			.unlockedBy("has_" + Items.BIRCH_PLANKS, RecipeProvider.has(Items.BIRCH_PLANKS))
			.unlockedBy("has_" + Items.JUNGLE_PLANKS, RecipeProvider.has(Items.JUNGLE_PLANKS))
			.unlockedBy("has_" + Items.ACACIA_PLANKS, RecipeProvider.has(Items.ACACIA_PLANKS))
			.unlockedBy("has_" + Items.DARK_OAK_PLANKS, RecipeProvider.has(Items.DARK_OAK_PLANKS))
			.unlockedBy("has_" + Items.MANGROVE_PLANKS, RecipeProvider.has(Items.MANGROVE_PLANKS))
			.unlockedBy("has_" + Items.CRIMSON_PLANKS, RecipeProvider.has(Items.CRIMSON_PLANKS))
			.unlockedBy("has_" + Items.WARPED_PLANKS, RecipeProvider.has(Items.WARPED_PLANKS))
			.unlockedBy("has_" + IcariaItems.CYPRESS_PLANKS.get(), RecipeProvider.has(IcariaItems.CYPRESS_PLANKS.get()))
			.unlockedBy("has_" + IcariaItems.DROUGHTROOT_PLANKS.get(), RecipeProvider.has(IcariaItems.DROUGHTROOT_PLANKS.get()))
			.unlockedBy("has_" + IcariaItems.FIR_PLANKS.get(), RecipeProvider.has(IcariaItems.FIR_PLANKS.get()))
			.unlockedBy("has_" + IcariaItems.LAUREL_PLANKS.get(), RecipeProvider.has(IcariaItems.LAUREL_PLANKS.get()))
			.unlockedBy("has_" + IcariaItems.OLIVE_PLANKS.get(), RecipeProvider.has(IcariaItems.OLIVE_PLANKS.get()))
			.unlockedBy("has_" + IcariaItems.PLANE_PLANKS.get(), RecipeProvider.has(IcariaItems.PLANE_PLANKS.get()))
			.unlockedBy("has_" + IcariaItems.POPULUS_PLANKS.get(), RecipeProvider.has(IcariaItems.POPULUS_PLANKS.get()))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(Items.FLETCHING_TABLE) + "_from_chert");

		ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.FLINT_AND_STEEL, 1)
			.requires(Items.IRON_INGOT)
			.requires(IcariaItems.CHERT.get())
			.unlockedBy("has_" + Items.IRON_INGOT, RecipeProvider.has(Items.IRON_INGOT))
			.unlockedBy("has_" + IcariaItems.CHERT.get(), RecipeProvider.has(IcariaItems.CHERT.get()))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(Items.FLINT_AND_STEEL) + "_from_chert");

		ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.IRON_INGOT, 1)
			.requires(IcariaItems.SIDEROS_INGOT.get())
			.requires(IcariaItems.CALCITE_DUST.get())
			.unlockedBy("has_" + IcariaItems.SIDEROS_INGOT.get(), RecipeProvider.has(IcariaItems.SIDEROS_INGOT.get()))
			.unlockedBy("has_" + IcariaItems.CALCITE_DUST.get(), RecipeProvider.has(IcariaItems.CALCITE_DUST.get()))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(Items.IRON_INGOT));

		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.ITEM_FRAME, 1)
			.pattern("XXX")
			.pattern("XYX")
			.pattern("XXX")
			.define('X', Items.STICK)
			.define('Y', IcariaItems.AETERNAE_HIDE.get())
			.unlockedBy("has_" + Items.STICK, RecipeProvider.has(Items.STICK))
			.unlockedBy("has_" + IcariaItems.AETERNAE_HIDE.get(), RecipeProvider.has(IcariaItems.AETERNAE_HIDE.get()))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(Items.ITEM_FRAME) + "_from_aeternae_hide");

		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.LEAD, 2)
			.pattern("XX ")
			.pattern("XY ")
			.pattern("  X")
			.define('X', Tags.Items.STRING)
			.define('Y', Ingredient.of(IcariaItems.ENDER_JELLYFISH_JELLY.get(), IcariaItems.FIRE_JELLYFISH_JELLY.get(), IcariaItems.NATURE_JELLYFISH_JELLY.get(), IcariaItems.VOID_JELLYFISH_JELLY.get(), IcariaItems.WATER_JELLYFISH_JELLY.get()))
			.unlockedBy("has_" + Tags.Items.STRING, RecipeProvider.has(Tags.Items.STRING))
			.unlockedBy("has_" + IcariaItems.ENDER_JELLYFISH_JELLY.get(), RecipeProvider.has(IcariaItems.ENDER_JELLYFISH_JELLY.get()))
			.unlockedBy("has_" + IcariaItems.FIRE_JELLYFISH_JELLY.get(), RecipeProvider.has(IcariaItems.FIRE_JELLYFISH_JELLY.get()))
			.unlockedBy("has_" + IcariaItems.NATURE_JELLYFISH_JELLY.get(), RecipeProvider.has(IcariaItems.NATURE_JELLYFISH_JELLY.get()))
			.unlockedBy("has_" + IcariaItems.VOID_JELLYFISH_JELLY.get(), RecipeProvider.has(IcariaItems.VOID_JELLYFISH_JELLY.get()))
			.unlockedBy("has_" + IcariaItems.WATER_JELLYFISH_JELLY.get(), RecipeProvider.has(IcariaItems.WATER_JELLYFISH_JELLY.get()))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(Items.LEAD) + "_from_jellyfish_jelly");

		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.LEATHER_HORSE_ARMOR, 1)
			.pattern("X X")
			.pattern("XXX")
			.pattern("X X")
			.define('X', IcariaItems.AETERNAE_HIDE.get())
			.unlockedBy("has_" + IcariaItems.AETERNAE_HIDE.get(), RecipeProvider.has(IcariaItems.AETERNAE_HIDE.get()))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(Items.LEATHER_HORSE_ARMOR) + "_from_aeternae_hide");

		ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.MAGMA_CREAM, 1)
			.requires(Items.BLAZE_POWDER)
			.requires(Ingredient.of(IcariaItems.ENDER_JELLYFISH_JELLY.get(), IcariaItems.FIRE_JELLYFISH_JELLY.get(), IcariaItems.NATURE_JELLYFISH_JELLY.get(), IcariaItems.VOID_JELLYFISH_JELLY.get(), IcariaItems.WATER_JELLYFISH_JELLY.get()))
			.unlockedBy("has_" + Items.BLAZE_POWDER, RecipeProvider.has(Items.BLAZE_POWDER))
			.unlockedBy("has_" + IcariaItems.ENDER_JELLYFISH_JELLY.get(), RecipeProvider.has(IcariaItems.ENDER_JELLYFISH_JELLY.get()))
			.unlockedBy("has_" + IcariaItems.FIRE_JELLYFISH_JELLY.get(), RecipeProvider.has(IcariaItems.FIRE_JELLYFISH_JELLY.get()))
			.unlockedBy("has_" + IcariaItems.NATURE_JELLYFISH_JELLY.get(), RecipeProvider.has(IcariaItems.NATURE_JELLYFISH_JELLY.get()))
			.unlockedBy("has_" + IcariaItems.VOID_JELLYFISH_JELLY.get(), RecipeProvider.has(IcariaItems.VOID_JELLYFISH_JELLY.get()))
			.unlockedBy("has_" + IcariaItems.WATER_JELLYFISH_JELLY.get(), RecipeProvider.has(IcariaItems.WATER_JELLYFISH_JELLY.get()))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(Items.MAGMA_CREAM) + "_from_jellyfish_jelly");

		ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.MOSSY_COBBLESTONE, 1)
			.requires(Items.COBBLESTONE)
			.requires(Ingredient.of(IcariaItems.BLOOMY_VINE.get(), IcariaItems.BRANCHY_VINE.get(), IcariaItems.BRUSHY_VINE.get(), IcariaItems.DRY_VINE.get(), IcariaItems.REEDY_VINE.get(), IcariaItems.SWIRLY_VINE.get(), IcariaItems.THORNY_VINE.get()))
			.unlockedBy("has_" + Items.COBBLESTONE, RecipeProvider.has(Items.COBBLESTONE))
			.unlockedBy("has_" + IcariaItems.BLOOMY_VINE.get(), RecipeProvider.has((IcariaItems.BLOOMY_VINE.get())))
			.unlockedBy("has_" + IcariaItems.BRANCHY_VINE.get(), RecipeProvider.has((IcariaItems.BRANCHY_VINE.get())))
			.unlockedBy("has_" + IcariaItems.BRUSHY_VINE.get(), RecipeProvider.has((IcariaItems.BRUSHY_VINE.get())))
			.unlockedBy("has_" + IcariaItems.DRY_VINE.get(), RecipeProvider.has((IcariaItems.DRY_VINE.get())))
			.unlockedBy("has_" + IcariaItems.REEDY_VINE.get(), RecipeProvider.has((IcariaItems.REEDY_VINE.get())))
			.unlockedBy("has_" + IcariaItems.SWIRLY_VINE.get(), RecipeProvider.has((IcariaItems.SWIRLY_VINE.get())))
			.unlockedBy("has_" + IcariaItems.THORNY_VINE.get(), RecipeProvider.has((IcariaItems.THORNY_VINE.get())))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(Items.MOSSY_COBBLESTONE));

		ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.MOSSY_STONE_BRICKS, 1)
			.requires(Items.STONE_BRICKS)
			.requires(Ingredient.of(IcariaItems.BLOOMY_VINE.get(), IcariaItems.BRANCHY_VINE.get(), IcariaItems.BRUSHY_VINE.get(), IcariaItems.DRY_VINE.get(), IcariaItems.REEDY_VINE.get(), IcariaItems.SWIRLY_VINE.get(), IcariaItems.THORNY_VINE.get()))
			.unlockedBy("has_" + Items.STONE_BRICKS, RecipeProvider.has(Items.STONE_BRICKS))
			.unlockedBy("has_" + IcariaItems.BLOOMY_VINE.get(), RecipeProvider.has((IcariaItems.BLOOMY_VINE.get())))
			.unlockedBy("has_" + IcariaItems.BRANCHY_VINE.get(), RecipeProvider.has((IcariaItems.BRANCHY_VINE.get())))
			.unlockedBy("has_" + IcariaItems.BRUSHY_VINE.get(), RecipeProvider.has((IcariaItems.BRUSHY_VINE.get())))
			.unlockedBy("has_" + IcariaItems.DRY_VINE.get(), RecipeProvider.has((IcariaItems.DRY_VINE.get())))
			.unlockedBy("has_" + IcariaItems.REEDY_VINE.get(), RecipeProvider.has((IcariaItems.REEDY_VINE.get())))
			.unlockedBy("has_" + IcariaItems.SWIRLY_VINE.get(), RecipeProvider.has((IcariaItems.SWIRLY_VINE.get())))
			.unlockedBy("has_" + IcariaItems.THORNY_VINE.get(), RecipeProvider.has((IcariaItems.THORNY_VINE.get())))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(Items.MOSSY_STONE_BRICKS));

		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.PAPER, 3)
			.pattern("XXX")
			.define('X', IcariaItems.VINE_REED.get())
			.unlockedBy("has_" + IcariaItems.VINE_REED.get(), RecipeProvider.has(IcariaItems.VINE_REED.get()))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(Items.PAPER) + "_from_vine_reed");

		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.REPEATER, 1)
			.pattern("XYX")
			.pattern("ZZZ")
			.define('X', Items.REDSTONE_TORCH)
			.define('Y', Items.REDSTONE)
			.define('Z', IcariaItems.SMOOTH_RELICSTONE.get())
			.unlockedBy("has_" + Items.REDSTONE_TORCH, RecipeProvider.has(Items.REDSTONE_TORCH))
			.unlockedBy("has_" + Items.REDSTONE, RecipeProvider.has(Items.REDSTONE))
			.unlockedBy("has_" + IcariaItems.SMOOTH_RELICSTONE.get(), RecipeProvider.has(IcariaItems.SMOOTH_RELICSTONE.get()))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(Items.REPEATER) + "_from_relicstone");

		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.STICKY_PISTON, 1)
			.pattern("X")
			.pattern("Y")
			.define('X', Ingredient.of(IcariaItems.ENDER_JELLYFISH_JELLY.get(), IcariaItems.FIRE_JELLYFISH_JELLY.get(), IcariaItems.NATURE_JELLYFISH_JELLY.get(), IcariaItems.VOID_JELLYFISH_JELLY.get(), IcariaItems.WATER_JELLYFISH_JELLY.get()))
			.define('Y', Items.PISTON)
			.unlockedBy("has_" + IcariaItems.ENDER_JELLYFISH_JELLY.get(), RecipeProvider.has(IcariaItems.ENDER_JELLYFISH_JELLY.get()))
			.unlockedBy("has_" + IcariaItems.FIRE_JELLYFISH_JELLY.get(), RecipeProvider.has(IcariaItems.FIRE_JELLYFISH_JELLY.get()))
			.unlockedBy("has_" + IcariaItems.NATURE_JELLYFISH_JELLY.get(), RecipeProvider.has(IcariaItems.NATURE_JELLYFISH_JELLY.get()))
			.unlockedBy("has_" + IcariaItems.VOID_JELLYFISH_JELLY.get(), RecipeProvider.has(IcariaItems.VOID_JELLYFISH_JELLY.get()))
			.unlockedBy("has_" + IcariaItems.WATER_JELLYFISH_JELLY.get(), RecipeProvider.has(IcariaItems.WATER_JELLYFISH_JELLY.get()))
			.unlockedBy("has_" + Items.PISTON, RecipeProvider.has(Items.PISTON))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(Items.STICKY_PISTON) + "_from_jellyfish_jelly");

		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.STONECUTTER, 1)
			.pattern(" X ")
			.pattern("YYY")
			.define('X', Items.IRON_INGOT)
			.define('Y', IcariaItems.SMOOTH_RELICSTONE.get())
			.unlockedBy("has_" + Items.IRON_INGOT, RecipeProvider.has(Items.IRON_INGOT))
			.unlockedBy("has_" + IcariaItems.SMOOTH_RELICSTONE.get(), RecipeProvider.has(IcariaItems.SMOOTH_RELICSTONE.get()))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(Items.STONECUTTER) + "_from_relicstone");

		ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.SUGAR, 1)
			.requires(IcariaItems.VINE_REED.get())
			.unlockedBy("has_" + IcariaItems.VINE_REED.get(), RecipeProvider.has(IcariaItems.VINE_REED.get()))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(Items.SUGAR) + "_from_vine_reed");

		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.TNT, 1)
			.pattern("XYX")
			.pattern("YXY")
			.pattern("XYX")
			.define('X', IcariaItems.GREENPOWDER.get())
			.define('Y', Ingredient.of(Items.SAND, Items.RED_SAND))
			.unlockedBy("has_" + IcariaItems.GREENPOWDER.get(), RecipeProvider.has(IcariaItems.GREENPOWDER.get()))
			.unlockedBy("has_" + Items.SAND, RecipeProvider.has(Items.SAND))
			.unlockedBy("has_" + Items.RED_SAND, RecipeProvider.has(Items.RED_SAND))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(Items.TNT) + "_from_greenpowder");

		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.WHITE_WOOL, 1)
			.pattern("XX")
			.pattern("XX")
			.define('X', IcariaItems.ARACHNE_STRING.get())
			.unlockedBy("has_" + IcariaItems.ARACHNE_STRING.get(), RecipeProvider.has(IcariaItems.ARACHNE_STRING.get()))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(Items.WHITE_WOOL) + "_from_arachne_string");
	}

	public void concoctingEntityRecipe(Consumer<FinishedRecipe> pConsumer, Item pResourceA, Item pResourceB, Item pResourceC, EntityType<?> pEntity, int pBurnTime, int pColor) {
		ConcoctingEntityRecipeBuilder.concoctingEntity(ForgeRegistries.ENTITY_TYPES.getKey(pEntity).toString(), Ingredient.of(pResourceA), Ingredient.of(pResourceB), Ingredient.of(pResourceC), pBurnTime, pColor)
			.unlockedBy("has_" + pResourceA, RecipeProvider.has(pResourceA))
			.save(pConsumer, ForgeRegistries.ENTITY_TYPES.getKey(pEntity) + "_from_concocting");
	}

	public void concoctingEntityRecipe(Consumer<FinishedRecipe> pConsumer, Item pResourceA, Item pResourceB, EntityType<?> pEntity, int pBurnTime, int pColor) {
		ConcoctingEntityRecipeBuilder.concoctingEntity(ForgeRegistries.ENTITY_TYPES.getKey(pEntity).toString(), Ingredient.of(pResourceA), Ingredient.of(pResourceB), Ingredient.of(), pBurnTime, pColor)
			.unlockedBy("has_" + pResourceA, RecipeProvider.has(pResourceA))
			.save(pConsumer, ForgeRegistries.ENTITY_TYPES.getKey(pEntity) + "_from_concocting");
	}

	public void concoctingEntityRecipe(Consumer<FinishedRecipe> pConsumer, Item pResource, EntityType<?> pEntity, int pBurnTime, int pColor) {
		ConcoctingEntityRecipeBuilder.concoctingEntity(ForgeRegistries.ENTITY_TYPES.getKey(pEntity).toString(), Ingredient.of(pResource), Ingredient.of(), Ingredient.of(), pBurnTime, pColor)
			.unlockedBy("has_" + pResource, RecipeProvider.has(pResource))
			.save(pConsumer, ForgeRegistries.ENTITY_TYPES.getKey(pEntity) + "_from_concocting");
	}

	public void concoctingExplosionsRecipe(Consumer<FinishedRecipe> pConsumer, Item pResourceA, Item pResourceB, Item pResourceC, float pRadius, int pBurnTime, int pColor) {
		ConcoctingExplosionsRecipeBuilder.concoctingExplosions(Ingredient.of(pResourceA), Ingredient.of(pResourceB), Ingredient.of(pResourceC), pRadius, pBurnTime, pColor)
			.unlockedBy("has_" + pResourceA, RecipeProvider.has(pResourceA))
			.save(pConsumer, "large_explosion_from_concocting");
	}

	public void concoctingExplosionsRecipe(Consumer<FinishedRecipe> pConsumer, Item pResourceA, Item pResourceB, float pRadius, int pBurnTime, int pColor) {
		ConcoctingExplosionsRecipeBuilder.concoctingExplosions(Ingredient.of(pResourceA), Ingredient.of(pResourceB), Ingredient.of(), pRadius, pBurnTime, pColor)
			.unlockedBy("has_" + pResourceA, RecipeProvider.has(pResourceA))
			.save(pConsumer, "small_explosion_from_concocting");
	}

	public void concoctingExplosionsRecipe(Consumer<FinishedRecipe> pConsumer, Item pResource, float pRadius, int pBurnTime, int pColor) {
		ConcoctingExplosionsRecipeBuilder.concoctingExplosions(Ingredient.of(pResource), Ingredient.of(), Ingredient.of(), pRadius, pBurnTime, pColor)
			.unlockedBy("has_" + pResource, RecipeProvider.has(pResource))
			.save(pConsumer, "micro_explosion_from_concocting");
	}

	public void concoctingItemRecipe(Consumer<FinishedRecipe> pConsumer, Item pResourceA, Item pResourceB, Item pResourceC, Item pResult, int pBurnTime, int pColor, int pCount) {
		ConcoctingItemRecipeBuilder.concoctingItem(pResult, Ingredient.of(pResourceA), Ingredient.of(pResourceB), Ingredient.of(pResourceC), pBurnTime, pColor, pCount)
			.unlockedBy("has_" + pResourceA, RecipeProvider.has(pResourceA))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pResult) + "_from_concocting");
	}

	public void concoctingItemRecipe(Consumer<FinishedRecipe> pConsumer, Item pResourceA, Item pResourceB, Item pResult, int pBurnTime, int pColor, int pCount) {
		ConcoctingItemRecipeBuilder.concoctingItem(pResult, Ingredient.of(pResourceA), Ingredient.of(pResourceB), Ingredient.of(), pBurnTime, pColor, pCount)
			.unlockedBy("has_" + pResourceA, RecipeProvider.has(pResourceA))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pResult) + "_from_concocting");
	}

	public void concoctingItemRecipe(Consumer<FinishedRecipe> pConsumer, Item pResource, Item pResult, int pBurnTime, int pColor, int pCount) {
		ConcoctingItemRecipeBuilder.concoctingItem(pResult, Ingredient.of(pResource), Ingredient.of(), Ingredient.of(), pBurnTime, pColor, pCount)
			.unlockedBy("has_" + pResource, RecipeProvider.has(pResource))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pResult) + "_concocting");
	}

	public void concoctingPotionRecipe(Consumer<FinishedRecipe> pConsumer, Item pResourceA, Item pResourceB, Item pResourceC, Potion pPotion, float pPotionRadius, int pBurnTime, int pColor, int pPotionDuration) {
		ConcoctingPotionRecipeBuilder.concoctingPotion(ForgeRegistries.POTIONS.getKey(pPotion).toString(), Ingredient.of(pResourceA), Ingredient.of(pResourceB), Ingredient.of(pResourceC), pPotionRadius, pBurnTime, pColor, pPotionDuration)
			.unlockedBy("has_" + pResourceA, RecipeProvider.has(pResourceA))
			.save(pConsumer, ForgeRegistries.POTIONS.getKey(pPotion) + "_from_concocting");
	}

	public void concoctingPotionRecipe(Consumer<FinishedRecipe> pConsumer, Item pResourceA, Item pResourceB, Potion pPotion, float pPotionRadius, int pBurnTime, int pColor, int pPotionDuration) {
		ConcoctingPotionRecipeBuilder.concoctingPotion(ForgeRegistries.POTIONS.getKey(pPotion).toString(), Ingredient.of(pResourceA), Ingredient.of(pResourceB), Ingredient.of(), pPotionRadius, pBurnTime, pColor, pPotionDuration)
			.unlockedBy("has_" + pResourceA, RecipeProvider.has(pResourceA))
			.save(pConsumer, ForgeRegistries.POTIONS.getKey(pPotion) + "_from_concocting");
	}

	public void concoctingPotionRecipe(Consumer<FinishedRecipe> pConsumer, Item pResource, Potion pPotion, float pPotionRadius, int pBurnTime, int pColor, int pPotionDuration) {
		ConcoctingPotionRecipeBuilder.concoctingPotion(ForgeRegistries.POTIONS.getKey(pPotion).toString(), Ingredient.of(pResource), Ingredient.of(), Ingredient.of(), pPotionRadius, pBurnTime, pColor, pPotionDuration)
			.unlockedBy("has_" + pResource, RecipeProvider.has(pResource))
			.save(pConsumer, ForgeRegistries.POTIONS.getKey(pPotion) + "_from_concocting");
	}

	public void forgingRecipe(Consumer<FinishedRecipe> pConsumer, Item pResourceA, Item pResourceB, Item pResourceC, Item pResult, String pName, float pExperience, int pTime, int pCount) {
		ForgingRecipeBuilder.forging(pResult, Ingredient.of(pResourceA), Ingredient.of(pResourceB), Ingredient.of(pResourceC), pExperience, pTime, pCount)
			.unlockedBy("has_" + pResourceA, RecipeProvider.has(pResourceA))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pResult) + pName);
	}

	public void forgingRecipe(Consumer<FinishedRecipe> pConsumer, Item pResourceA, Item pResourceB, Item pResult, float pExperience, int pTime, int pCount) {
		ForgingRecipeBuilder.forging(pResult, Ingredient.of(pResourceA), Ingredient.of(pResourceB), Ingredient.of(), pExperience, pTime, pCount)
			.unlockedBy("has_" + pResourceA, RecipeProvider.has(pResourceA))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pResult) + "_from_forging");
	}

	public void forgingRecipe(Consumer<FinishedRecipe> pConsumer, Item pResource, Item pResult, float pExperience, int pTime, int pCount) {
		ForgingRecipeBuilder.forging(pResult, Ingredient.of(pResource), Ingredient.of(), Ingredient.of(), pExperience, pTime, pCount)
			.unlockedBy("has_" + pResource, RecipeProvider.has(pResource))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pResource) + "_forging");
	}

	public void firingRecipe(Consumer<FinishedRecipe> pConsumer, Item pResource, Item pResult, float pExperience, int pTime) {
		FiringRecipeBuilder.firing(pResult, Ingredient.of(pResource), pExperience, pTime)
			.unlockedBy("has_" + pResource, RecipeProvider.has(pResource))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pResource) + "_firing");
	}

	public void grindingRecipe(Consumer<FinishedRecipe> pConsumer, Item pGear, Item pResource, Item pResult, float pExperience, int pTime, int pCount) {
		GrindingRecipeBuilder.grinding(pGear, Ingredient.of(pResource), pResult, pExperience, pTime, pCount)
			.unlockedBy("has_" + pGear, RecipeProvider.has(pGear))
			.unlockedBy("has_" + pResource, RecipeProvider.has(pResource))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pResource) + "_grinding");
	}

	public void smeltingRecipe(Consumer<FinishedRecipe> pConsumer, Item pResource, Item pResult, float pExperience, int pTime) {
		SimpleCookingRecipeBuilder.smelting(Ingredient.of(pResource), RecipeCategory.MISC, pResult, pExperience, pTime)
			.unlockedBy("has_" + pResource, RecipeProvider.has(pResource))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pResult) + "_from_smelting");
	}

	public void adobeRecipe(Consumer<FinishedRecipe> pConsumer, Item pResource, Item pResult) {
		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pResult, 4)
			.pattern("XYX")
			.pattern("YZY")
			.pattern("XYX")
			.define('X', IcariaItems.SPELT.get())
			.define('Y', IcariaItems.LOAM_LUMP.get())
			.define('Z', pResource)
			.unlockedBy("has_" + IcariaItems.SPELT.get(), RecipeProvider.has(IcariaItems.SPELT.get()))
			.unlockedBy("has_" + IcariaItems.LOAM_LUMP.get(), RecipeProvider.has(IcariaItems.LOAM_LUMP.get()))
			.unlockedBy("has_" + pResource, RecipeProvider.has(pResource))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pResult));
	}

	public void smallCompressDecompressRecipes(Consumer<FinishedRecipe> pConsumer, Item pUncompressed, Item pCompressed) {
		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pCompressed, 1)
			.pattern("XX")
			.pattern("XX")
			.define('X', pUncompressed)
			.unlockedBy("has_" + pUncompressed, RecipeProvider.has(pUncompressed))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pUncompressed) + "_small_compress");

		ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, pUncompressed, 4)
			.requires(pCompressed)
			.unlockedBy("has_" + pCompressed, RecipeProvider.has(pCompressed))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pCompressed) + "_small_decompress");
	}

	public void smallCompressRecipe(Consumer<FinishedRecipe> pConsumer, Item pUncompressed, Item pCompressed) {
		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pCompressed, 1)
			.pattern("XX")
			.pattern("XX")
			.define('X', pUncompressed)
			.unlockedBy("has_" + pUncompressed, RecipeProvider.has(pUncompressed))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pUncompressed) + "_small_compress");
	}

	public void glassRecipes(Consumer<FinishedRecipe> pConsumer, Item pGlass, Item pPane, Item pPaneHorizontal) {
		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pPane, 16)
			.pattern("XXX")
			.pattern("XXX")
			.define('X', pGlass)
			.unlockedBy("has_" + pGlass, RecipeProvider.has(pGlass))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pPane));

		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pPaneHorizontal, 2)
			.pattern("XX")
			.define('X', pPane)
			.unlockedBy("has_" + pPane, RecipeProvider.has(pPane))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pPaneHorizontal));
	}

	public void stoneRecipes(Consumer<FinishedRecipe> pConsumer, Item pCobbled, Item pStone, Item pBricks, Item pChiseled, IcariaStoneDecoItems pDeco) {
		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pBricks, 4)
			.pattern("XX")
			.pattern("XX")
			.define('X', pStone)
			.unlockedBy("has_" + pStone, RecipeProvider.has(pStone))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pBricks));

		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pChiseled, 1)
			.pattern("X")
			.pattern("X")
			.define('X', pDeco.slab.get())
			.unlockedBy("has_" + pDeco.slab.get(), RecipeProvider.has(pDeco.slab.get()))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pChiseled));

		SimpleCookingRecipeBuilder.smelting(Ingredient.of(pCobbled), RecipeCategory.MISC, pStone, 0.1F, 200)
			.unlockedBy("has_" + pCobbled, RecipeProvider.has(pCobbled))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pStone) + "_from_smelting");

		SingleItemRecipeBuilder.stonecutting(Ingredient.of(pStone), RecipeCategory.MISC, pBricks)
			.unlockedBy("has_" + pStone, RecipeProvider.has(pStone))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pBricks) + "_from_stonecutting");

		SingleItemRecipeBuilder.stonecutting(Ingredient.of(pStone, pBricks), RecipeCategory.MISC, pChiseled)
			.unlockedBy("has_" + pStone, RecipeProvider.has(pStone))
			.unlockedBy("has_" + pBricks, RecipeProvider.has(pBricks))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pChiseled) + "_from_stonecutting");
	}

	public void largeCompressDecompressRecipes(Consumer<FinishedRecipe> pConsumer, Item pUncompressed, Item pCompressed) {
		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pCompressed, 1)
			.pattern("XXX")
			.pattern("XXX")
			.pattern("XXX")
			.define('X', pUncompressed)
			.unlockedBy("has_" + pUncompressed, RecipeProvider.has(pUncompressed))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pUncompressed) + "_large_compress");

		ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, pUncompressed, 9)
			.requires(pCompressed)
			.unlockedBy("has_" + pCompressed, RecipeProvider.has(pCompressed))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pCompressed) + "_large_decompress");
	}

	public void blockIngotNuggetRecipes(Consumer<FinishedRecipe> pConsumer, Item pBlock, Item pIngot, Item pNugget) {
		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pBlock, 1)
			.pattern("XXX")
			.pattern("XXX")
			.pattern("XXX")
			.define('X', pIngot)
			.unlockedBy("has_" + pIngot, RecipeProvider.has(pIngot))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pIngot) + "_to_block");

		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pIngot, 1)
			.pattern("XXX")
			.pattern("XXX")
			.pattern("XXX")
			.define('X', pNugget)
			.unlockedBy("has_" + pNugget, RecipeProvider.has(pNugget))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pNugget) + "_to_ingot");

		ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, pIngot, 9)
			.requires(pBlock)
			.unlockedBy("has_" + pBlock, RecipeProvider.has(pBlock))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pBlock) + "_to_ingot");

		ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, pNugget, 9)
			.requires(pIngot)
			.unlockedBy("has_" + pIngot, RecipeProvider.has(pIngot))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pIngot) + "_to_nugget");
	}

	public void torchRecipe(Consumer<FinishedRecipe> pConsumer, Item pResource, Item pResult) {
		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pResult, 4)
			.pattern("X")
			.pattern("Y")
			.define('X', pResource)
			.define('Y', Items.BONE)
			.unlockedBy("has_" + pResource, RecipeProvider.has(pResource))
			.unlockedBy("has_" + Items.BONE, RecipeProvider.has(Items.BONE))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pResult));
	}

	public void cakeRecipe(Consumer<FinishedRecipe> pConsumer, Item pFruit, Item pJelly, Item pResult) {
		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pResult, 1)
			.pattern("ABA")
			.pattern("CDC")
			.pattern("EEE")
			.define('A', pJelly)
			.define('B', pFruit)
			.define('C', Items.SUGAR)
			.define('D', Items.MILK_BUCKET)
			.define('E', IcariaItems.SPELT_FLOUR.get())
			.unlockedBy("has_" + pJelly, RecipeProvider.has(pJelly))
			.unlockedBy("has_" + pFruit, RecipeProvider.has(pFruit))
			.unlockedBy("has_" + Items.SUGAR, RecipeProvider.has(Items.SUGAR))
			.unlockedBy("has_" + Items.MILK_BUCKET, RecipeProvider.has(Items.MILK_BUCKET))
			.unlockedBy("has_" + IcariaItems.SPELT_FLOUR.get(), RecipeProvider.has(IcariaItems.SPELT_FLOUR.get()))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pResult));
	}

	public void woodRecipes(Consumer<FinishedRecipe> pConsumer, Item pWood, Item pWoodStripped, Item pLog, Item pLogStripped, Item pDeadLog, Item pDeadLogStripped) {
		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pWood, 3)
			.pattern("XX")
			.pattern("XX")
			.define('X', pLog)
			.unlockedBy("has_" + pLog, RecipeProvider.has(pLog))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pWood));

		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pWoodStripped, 3)
			.pattern("XX")
			.pattern("XX")
			.define('X', pLogStripped)
			.unlockedBy("has_" + pLogStripped, RecipeProvider.has(pLogStripped))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pWoodStripped));

		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pWood, 1)
			.pattern("XX")
			.pattern("XX")
			.define('X', pDeadLog)
			.unlockedBy("has_" + pDeadLog, RecipeProvider.has(pDeadLog))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pWood) + "_from_dead");

		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pWoodStripped, 1)
			.pattern("XX")
			.pattern("XX")
			.define('X', pDeadLogStripped)
			.unlockedBy("has_" + pDeadLogStripped, RecipeProvider.has(pDeadLogStripped))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pWoodStripped) + "_from_dead");
	}

	public void planksRecipe(Consumer<FinishedRecipe> pConsumer, Item pWood, Item pWoodStripped, Item pLog, Item pLogStripped, Item pDeadLog, Item pDeadLogStripped, Item pResult) {
		ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, pResult, 4)
			.requires(Ingredient.of(pWood, pWoodStripped, pLog, pLogStripped))
			.unlockedBy("has_" + pWood, RecipeProvider.has(pWood))
			.unlockedBy("has_" + pWoodStripped, RecipeProvider.has(pWoodStripped))
			.unlockedBy("has_" + pLog, RecipeProvider.has(pLog))
			.unlockedBy("has_" + pLogStripped, RecipeProvider.has(pLogStripped))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pResult));

		ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, pResult, 2)
			.requires(Ingredient.of(pDeadLog, pDeadLogStripped))
			.unlockedBy("has_" + pDeadLog, RecipeProvider.has(pDeadLog))
			.unlockedBy("has_" + pDeadLogStripped, RecipeProvider.has(pDeadLogStripped))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pResult) + "_from_dead");
	}

	public void troughRecipe(Consumer<FinishedRecipe> pConsumer, Item pPlanks, Item pLog, Item pResult) {
		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pResult, 1)
			.pattern("X X")
			.pattern("YYY")
			.define('X', pPlanks)
			.define('Y', pLog)
			.unlockedBy("has_" + pPlanks, RecipeProvider.has(pPlanks))
			.unlockedBy("has_" + pLog, RecipeProvider.has(pLog))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pResult));
	}

	public void doorRecipe(Consumer<FinishedRecipe> pConsumer, Item pResource, Item pResult) {
		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pResult, 3)
			.pattern("XX")
			.pattern("XX")
			.pattern("XX")
			.define('X', pResource)
			.unlockedBy("has_" + pResource, RecipeProvider.has(pResource))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pResult));
	}

	public void trapdoorRecipe(Consumer<FinishedRecipe> pConsumer, Item pResource, Item pResult) {
		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pResult, 2)
			.pattern("XXX")
			.pattern("XXX")
			.define('X', pResource)
			.unlockedBy("has_" + pResource, RecipeProvider.has(pResource))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pResult));
	}

	public void ladderRecipe(Consumer<FinishedRecipe> pConsumer, Item pResource, Item pResult) {
		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pResult, 6)
			.pattern("X X")
			.pattern("XXX")
			.pattern("X X")
			.define('X', pResource)
			.unlockedBy("has_" + pResource, RecipeProvider.has(pResource))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pResult));
	}

	public void signRecipe(Consumer<FinishedRecipe> pConsumer, Item pResource, Item pResult) {
		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pResult, 3)
			.pattern("XXX")
			.pattern("XXX")
			.pattern(" Y ")
			.define('X', pResource)
			.define('Y', Items.STICK)
			.unlockedBy("has_" + pResource, RecipeProvider.has(pResource))
			.unlockedBy("has_" + Items.STICK, RecipeProvider.has(Items.STICK))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pResult));
	}

	public void hangingSignRecipe(Consumer<FinishedRecipe> pConsumer, Item pResource, Item pResult) {
		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pResult, 6)
			.pattern("X X")
			.pattern("YYY")
			.pattern("YYY")
			.define('X', IcariaItems.VANADIUMSTEEL_CHAIN.get())
			.define('Y', pResource)
			.unlockedBy("has_" + IcariaItems.VANADIUMSTEEL_CHAIN.get(), RecipeProvider.has(IcariaItems.VANADIUMSTEEL_CHAIN.get()))
			.unlockedBy("has_" + pResource, RecipeProvider.has(pResource))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pResult));
	}

	public void dyesFromFlowerRecipe(Consumer<FinishedRecipe> pConsumer, Item pResource, Item pResult) {
		ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, pResult, 1)
			.requires(pResource)
			.unlockedBy("has_" + pResource, RecipeProvider.has(pResource))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pResult) + "_from_" + ForgeRegistries.ITEMS.getKey(pResource).getPath());
	}

	public void toolRecipes(Consumer<FinishedRecipe> pConsumer, Item pResource, Item pSword, Item pDagger, Item pShovel, Item pPickaxe, Item pAxe, Item pScythe, Item pBident) {
		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pSword, 1)
			.pattern("X")
			.pattern("X")
			.pattern("Y")
			.define('X', pResource)
			.define('Y', Items.BONE)
			.unlockedBy("has_" + pResource, RecipeProvider.has(pResource))
			.unlockedBy("has_" + Items.BONE, RecipeProvider.has(Items.BONE))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pSword));

		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pDagger, 1)
			.pattern("X")
			.pattern("Y")
			.define('X', pResource)
			.define('Y', Items.BONE)
			.unlockedBy("has_" + pResource, RecipeProvider.has(pResource))
			.unlockedBy("has_" + Items.BONE, RecipeProvider.has(Items.BONE))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pDagger));

		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pShovel, 1)
			.pattern("X")
			.pattern("Y")
			.pattern("Y")
			.define('X', pResource)
			.define('Y', Items.BONE)
			.unlockedBy("has_" + pResource, RecipeProvider.has(pResource))
			.unlockedBy("has_" + Items.BONE, RecipeProvider.has(Items.BONE))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pShovel));

		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pPickaxe, 1)
			.pattern("XXX")
			.pattern(" Y ")
			.pattern(" Y ")
			.define('X', pResource)
			.define('Y', Items.BONE)
			.unlockedBy("has_" + pResource, RecipeProvider.has(pResource))
			.unlockedBy("has_" + Items.BONE, RecipeProvider.has(Items.BONE))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pPickaxe));

		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pAxe, 1)
			.pattern("XX ")
			.pattern("XY ")
			.pattern(" Y ")
			.define('X', pResource)
			.define('Y', Items.BONE)
			.unlockedBy("has_" + pResource, RecipeProvider.has(pResource))
			.unlockedBy("has_" + Items.BONE, RecipeProvider.has(Items.BONE))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pAxe));

		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pScythe, 1)
			.pattern(" XX")
			.pattern("X Y")
			.pattern("  Y")
			.define('X', pResource)
			.define('Y', Items.BONE)
			.unlockedBy("has_" + pResource, RecipeProvider.has(pResource))
			.unlockedBy("has_" + Items.BONE, RecipeProvider.has(Items.BONE))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pScythe));

		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pBident, 1)
			.pattern("X X")
			.pattern(" Y ")
			.pattern(" Y ")
			.define('X', pResource)
			.define('Y', Items.BONE)
			.unlockedBy("has_" + pResource, RecipeProvider.has(pResource))
			.unlockedBy("has_" + Items.BONE, RecipeProvider.has(Items.BONE))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pBident));
	}

	public void armorRecipes(Consumer<FinishedRecipe> pConsumer, Item pResource, Item pHelmet, Item pChestplate, Item pLeggings, Item pBoots) {
		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pHelmet, 1)
			.pattern("XXX")
			.pattern("X X")
			.define('X', pResource)
			.unlockedBy("has_" + pResource, RecipeProvider.has(pResource))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pHelmet));

		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pChestplate, 1)
			.pattern("X X")
			.pattern("XXX")
			.pattern("XXX")
			.define('X', pResource)
			.unlockedBy("has_" + pResource, RecipeProvider.has(pResource))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pChestplate));

		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pLeggings, 1)
			.pattern("XXX")
			.pattern("X X")
			.pattern("X X")
			.define('X', pResource)
			.unlockedBy("has_" + pResource, RecipeProvider.has(pResource))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pLeggings));

		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pBoots, 1)
			.pattern("X X")
			.pattern("X X")
			.define('X', pResource)
			.unlockedBy("has_" + pResource, RecipeProvider.has(pResource))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pBoots));
	}

	public void vaseRecipe(Consumer<FinishedRecipe> pConsumer, Item pResource, Item pResult) {
		ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, pResult, 1)
			.requires(pResource)
			.requires(IcariaItems.UNFIRED_STORAGE_VASE.get())
			.unlockedBy("has_" + pResource, RecipeProvider.has(pResource))
			.unlockedBy("has_" + IcariaItems.UNFIRED_STORAGE_VASE.get(), RecipeProvider.has(IcariaItems.UNFIRED_STORAGE_VASE.get()))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pResult));
	}

	public void bowlFlaskVialRecipe(Consumer<FinishedRecipe> pConsumer, Item pResource, Item pResult, int pCount) {
		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pResult, pCount)
			.pattern("X X")
			.pattern(" X ")
			.define('X', pResource)
			.unlockedBy("has_" + pResource, RecipeProvider.has(pResource))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pResult));
	}

	public void spellToFlaskRecipe(Consumer<FinishedRecipe> pConsumer, Item pResource, Item pResult) {
		ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, pResult, 1)
			.requires(pResource)
			.requires(IcariaItems.EMPTY_FLASK.get())
			.unlockedBy("has_" + pResource, RecipeProvider.has(pResource))
			.unlockedBy("has_" + IcariaItems.EMPTY_FLASK.get(), RecipeProvider.has(IcariaItems.EMPTY_FLASK.get()))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pResult));
	}

	public void gearRecipe(Consumer<FinishedRecipe> pConsumer, Item pResource, Item pResult) {
		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pResult, 1)
			.pattern(" X ")
			.pattern("X X")
			.pattern(" X ")
			.define('X', pResource)
			.unlockedBy("has_" + pResource, RecipeProvider.has(pResource))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pResult));
	}

	public void foodCookingRecipes(Consumer<FinishedRecipe> pConsumer, Item pResource, Item pResult) {
		SimpleCookingRecipeBuilder.campfireCooking((Ingredient.of(pResource)), RecipeCategory.MISC, pResult, 0.35F, 600)
			.unlockedBy("has_" + pResource, RecipeProvider.has(pResource))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pResult) + "_from_campfire_cooking");

		SimpleCookingRecipeBuilder.smelting((Ingredient.of(pResource)), RecipeCategory.MISC, pResult, 0.35F, 200)
			.unlockedBy("has_" + pResource, RecipeProvider.has(pResource))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pResult) + "_from_smelting");

		SimpleCookingRecipeBuilder.smoking((Ingredient.of(pResource)), RecipeCategory.MISC, pResult, 0.35F, 100)
			.unlockedBy("has_" + pResource, RecipeProvider.has(pResource))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pResult) + "_from_smoking");
	}

	public void stewRecipe(Consumer<FinishedRecipe> pConsumer, Item pMeat, Item pVegetable, Item pResult) {
		ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, pResult, 1)
			.requires(pMeat)
			.requires(pVegetable)
			.requires(IcariaItems.HALITE_DUST.get())
			.requires(IcariaItems.LOAM_BOWL.get())
			.unlockedBy("has_" + pMeat, RecipeProvider.has(pMeat))
			.unlockedBy("has_" + pVegetable, RecipeProvider.has(pVegetable))
			.unlockedBy("has_" + IcariaItems.HALITE_DUST.get(), RecipeProvider.has(IcariaItems.HALITE_DUST.get()))
			.unlockedBy("has_" + IcariaItems.LOAM_BOWL.get(), RecipeProvider.has(IcariaItems.LOAM_BOWL.get()))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pResult));
	}

	public void seedRecipe(Consumer<FinishedRecipe> pConsumer, Item pResource, Item pResult) {
		ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, pResult, 1)
			.requires(pResource)
			.unlockedBy("has_" + pResource, RecipeProvider.has(pResource))
			.save(pConsumer, ForgeRegistries.ITEMS.getKey(pResult));
	}
}
