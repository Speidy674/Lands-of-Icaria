package com.axanthic.loi.items;

import com.axanthic.loi.LandsOfIcaria;
import com.axanthic.loi.ModInformation;
import com.axanthic.loi.Resources;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;

public class ItemFoods extends ItemFood implements IItemMeta {
	public ItemFoods() {
		super(0, false);
		this.setCreativeTab(LandsOfIcaria.modTabItems);
		this.setUnlocalizedName("food");
		this.setRegistryName(ModInformation.ID, "food");
		this.setHasSubtypes(true);
	}

	@Override
	public int getMetadata(int damage) {
		return damage;
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return super.getUnlocalizedName() + "." + FoodType.byMeta(stack.getMetadata()).name;
	}

	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
		if (tab.equals(this.getCreativeTab())) {
			for (FoodType type : FoodType.values) {
				items.add(new ItemStack(this, 1, type.toMeta()));
			}
		}
	}

	@Override
	public int getHealAmount(ItemStack stack) {
		return FoodType.byMeta(stack.getMetadata()).food;
	}

	@Override
	public float getSaturationModifier(ItemStack stack) {
		return FoodType.byMeta(stack.getMetadata()).saturation;
	}

	@Override
	public String[] getNames() {
		String[] names = new String[FoodType.length];
		for (FoodType type : FoodType.values) {
			names[type.toMeta()] = type.name;
		}

		return names;
	}

	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		FoodType type = FoodType.byMeta(stack.getMetadata());

		if (!worldIn.isRemote && type.effects != null && worldIn.rand.nextFloat() < type.effectProb) {
			for (PotionEffect effect : type.effects) {
				player.addPotionEffect(new PotionEffect(effect));
			}
		}
	}

	public enum FoodType {
		OLIVE_GREEN("olive_green", 2, 0.3F),
		OLIVE_BLACK("olive_black", 2, 0.3F),
		LAUREL_CHERRY("laurel_cherry", 4, 0.3F),
		STRAWBERRY("strawberry", 1, 0.3F),
		PHYSALIS("physalis", 2, 0.5F),
		AETERNAE_MEAT("aeternae_meat", 3, 0.3F, 1.0F,
				new PotionEffect(MobEffects.HUNGER, 100)),
		AETERNAE_MEAT_COOKED("aeternae_meat_cooked", 8, 0.8F),
		SOW_MEAT("sow_meat", 2, 0.3F, 1.0F,
				new PotionEffect(MobEffects.HUNGER, 400)),
		SOW_MEAT_COOKED("sow_meat_cooked", 5, 0.8F),
		CATOBLEPAS_MEAT("catoblepas_meat", 2, 0.3F),
		CATOBLEPAS_MEAT_COOKED("catoblepas_meat_cooked", 6, 0.8F),
		SLUG_MASS("slug_mass", 3, 0.1F, 0.5F,
				new PotionEffect(MobEffects.HUNGER, 100),
				new PotionEffect(MobEffects.NAUSEA, 200)),
		SPELT_BREAD("spelt_bread", 6, 0.8F),
		GARLIC("garlic", 6, 0.8F);

		public static final FoodType[] values = FoodType.values();
		public static final int length = values.length;

		public final String name;
		public final int food;
		public final float saturation;
		public final float effectProb;
		public final PotionEffect[] effects;

		FoodType(String name, int food, float saturation) {
			this.name = name;
			this.food = food;
			this.saturation = saturation;
			this.effectProb = 0.0F;
			this.effects = null;
		}

		FoodType(String name, int food, float saturation, float effectProb, PotionEffect... effects) {
			this.name = name;
			this.food = food;
			this.saturation = saturation;
			this.effectProb = effectProb;
			this.effects = effects;
		}

		public static FoodType byMeta(int meta) {
			return values[meta];
		}

		public int toMeta() {
			return ordinal();
		}
	}
}
