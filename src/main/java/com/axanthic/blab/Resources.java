package com.axanthic.blab;

import java.util.ArrayList;
import java.util.List;

import com.axanthic.blab.blocks.BlockBasic;
import com.axanthic.blab.blocks.BlockGem;
import com.axanthic.blab.blocks.BlockOre;
import com.axanthic.blab.blocks.BlockPillar;
import com.axanthic.blab.blocks.BlockPillarHead;
import com.axanthic.blab.blocks.BlockRock;
import com.axanthic.blab.items.ItemBasic;
import com.axanthic.blab.items.ItemBlockMeta;
import com.axanthic.blab.items.ItemBlockMetaMaterial;
import com.axanthic.blab.items.ItemDimensionTeleporter;
import com.axanthic.blab.items.ItemMeta;
import com.axanthic.blab.items.ItemMetaMaterial;
import com.axanthic.blab.items.ItemResource;
import com.axanthic.blab.items.ToolAxe;
import com.axanthic.blab.items.ToolBident;
import com.axanthic.blab.items.ToolDagger;
import com.axanthic.blab.items.ToolPickaxe;
import com.axanthic.blab.items.ToolScythe;
import com.axanthic.blab.items.ToolShovel;
import com.axanthic.blab.items.ToolSword;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class Resources {

	public static final SoundType SILENCE = new SoundType(-10.0F, 1.0F, SoundEvents.ITEM_HOE_TILL, SoundEvents.ITEM_HOE_TILL, SoundEvents.ITEM_HOE_TILL, SoundEvents.ITEM_HOE_TILL, SoundEvents.ITEM_HOE_TILL);
	public static final String[] metals = new String[]{"chalkos", "kassiteros", "molibos", "orichalcum", "sliver", "vanadium", "vanadiumsteel", "sideros", "molybdenum", "molybdenumsteel", "bluridium", "yilaster"};

	public static List<Item> items = new ArrayList<Item>();
	public static List<ItemBlock> blocks = new ArrayList<ItemBlock>();

	public static Item dimensionTp = new ItemDimensionTeleporter().setUnlocalizedName("dimension_teleporter").setRegistryName("dimension_teleporter");
	public static Item stickWimba = new ItemBasic("wimba_stick");
	public static ItemMeta resource = new ItemResource();
	public static ItemMeta ingot = new ItemMetaMaterial("ingot", Resources.metals);
	public static ItemMeta nugget = new ItemMetaMaterial("nugget", Resources.metals);

	public static toolSet chalkos = new toolSet(new CompleteToolMaterial("chalkos", -3.0F, 1, 512, 12.0F, 2.0F, 22, new ItemStack(Resources.ingot, 1, 0)));
	public static toolSet kassiteros = new toolSet(new CompleteToolMaterial("kassiteros", -3.0F, 2, 512, 12.0F, 2.0F, 22, new ItemStack(Resources.ingot, 1, 1)));
	public static toolSet orichalcum = new toolSet(new CompleteToolMaterial("orichalcum", -3.0F, 3, 512, 12.0F, 2.0F, 22, new ItemStack(Resources.ingot, 1, 3)));
	public static toolSet vanadiumsteel = new toolSet(new CompleteToolMaterial("vanadiumsteel", -3.0F, 3, 512, 12.0F, 2.0F, 22, new ItemStack(Resources.ingot, 1, 6)));
	public static toolSet sideros = new toolSet(new CompleteToolMaterial("sideros", -3.0F, 4, 512, 12.0F, 2.0F, 22, new ItemStack(Resources.ingot, 1, 7)));
	public static toolSet molybdenumsteel = new toolSet(new CompleteToolMaterial("molybdenumsteel", -3.0F, 4, 512, 12.0F, 2.0F, 22, new ItemStack(Resources.ingot, 1, 9)));

	public static ItemBlockMeta rock = new ItemBlockMetaMaterial(new BlockRock("rock"));
	public static ItemBlockMeta brick = new ItemBlockMetaMaterial(new BlockRock("bricks"));
	public static ItemBlockMeta ore = new ItemBlockMetaMaterial(new BlockOre());
	public static ItemBlock calcite = new ItemBlock(new BlockGem("calcite"));
	public static ItemBlock jasper = new ItemBlock(new BlockGem("jasper"));
	public static ItemBlock zircon = new ItemBlock(new BlockGem("zircon"));
	public static ItemBlock pillar = new ItemBlock(new BlockPillar());
	public static ItemBlock pillarHead = new ItemBlock(new BlockPillarHead());
	public static ItemBlock black = new ItemBlock(new BlockBasic(Material.ROCK, 10, "black", MapColor.BLACK).setSoundType(Resources.SILENCE));

	public static void registerItems() {
		Resources.items.add(Resources.dimensionTp);
		Resources.items.add(Resources.stickWimba);
		Resources.items.add(Resources.resource);
		Resources.items.add(Resources.ingot);
		Resources.items.add(Resources.nugget);

		Resources.chalkos.register();
		Resources.kassiteros.register();
		Resources.orichalcum.register();
		Resources.vanadiumsteel.register();
		Resources.sideros.register();
		Resources.molybdenumsteel.register();
	}

	public static void registerBlocks() {
		Resources.registerBlock(Resources.rock);
		Resources.registerBlock(Resources.brick);
		Resources.registerBlock(Resources.ore);
		Resources.registerBlock(Resources.calcite);
		Resources.registerBlock(Resources.jasper);
		Resources.registerBlock(Resources.zircon);
		Resources.registerBlock(Resources.pillar);
		Resources.registerBlock(Resources.pillarHead);
		Resources.registerBlock(Resources.black);
	}

	public static void registerBlock(final ItemBlock block) {
		Resources.blocks.add((ItemBlock) block.setRegistryName(block.getBlock().getRegistryName()));
	}

	public static class CompleteToolMaterial {

		public ToolMaterial material;
		public float attackSpeed;

		public CompleteToolMaterial(final String name, final float attackSpeed, final int harvestLevel, final int maxUses, final float efficiency, final float damage, final int enchantability, final ItemStack repair) {
			this.material = EnumHelper.addToolMaterial(ModInformation.ID + ":" + name, harvestLevel, maxUses, efficiency, damage, enchantability).setRepairItem(repair);
			this.attackSpeed = attackSpeed;
		}
	}

	public static class toolSet {

		public ToolAxe axe;
		public ToolPickaxe pickaxe;
		public ToolShovel shovel;
		public ToolSword sword;
		public ToolDagger dagger;
		public ToolBident bident;
		public ToolScythe scythe;

		public toolSet(final CompleteToolMaterial material) {
			this.axe = new ToolAxe(material);
			this.pickaxe = new ToolPickaxe(material);
			this.shovel = new ToolShovel(material);
			this.sword = new ToolSword(material);
			this.dagger = new ToolDagger(material);
			this.bident = new ToolBident(material);
			this.scythe = new ToolScythe(material);
		}

		public void register() {
			Resources.items.add(this.axe);
			Resources.items.add(this.pickaxe);
			Resources.items.add(this.shovel);
			Resources.items.add(this.sword);
			Resources.items.add(this.dagger);
			Resources.items.add(this.bident);
			Resources.items.add(this.scythe);
		}
	}
}
