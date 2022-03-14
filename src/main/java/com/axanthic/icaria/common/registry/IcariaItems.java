package com.axanthic.icaria.common.registry;

import com.axanthic.icaria.util.IcariaInfo;
import com.axanthic.icaria.client.util.IcariaTabs;
import com.axanthic.icaria.common.items.FuelBlockItem;
import com.axanthic.icaria.common.items.FuelItem;
import com.axanthic.icaria.common.items.IcariaAxeItem;
import com.axanthic.icaria.common.items.IcariaBidentItem;
import com.axanthic.icaria.common.items.IcariaPickaxeItem;
import com.axanthic.icaria.common.items.IcariaScytheItem;
import com.axanthic.icaria.common.items.IcariaShovelItem;
import com.axanthic.icaria.common.items.VineSproutItem;
import com.axanthic.icaria.common.registry.IcariaBlocks.StoneDecoBlocks;
import com.axanthic.icaria.common.registry.IcariaBlocks.WoodDecoBlocks;
import com.axanthic.icaria.util.IcariaTier;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.FoodProperties.Builder;
import net.minecraft.world.item.*;
import net.minecraft.world.item.Item.Properties;

import net.minecraftforge.common.TierSortingRegistry;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;

import javax.annotation.ParametersAreNonnullByDefault;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class IcariaItems {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, IcariaInfo.MODID);

	public static final List<RegistryObject<? extends Item>> BASIC_ITEMS = new ArrayList<>();
	public static final List<StoneDecoItemBlocks> STONE_BLOCKS = new ArrayList<>();
	public static final List<WoodDecoItemBlocks> WOOD_BLOCKS = new ArrayList<>();
	public static final List<ToolCombination> TOOLS = new ArrayList<>();

	public static final RegistryObject<Item> MARL_GRASS = register("marl_grass", () -> new BlockItem(IcariaBlocks.MARL_GRASS.get(), propertiesBlocks()));
	public static final RegistryObject<Item> MARL = register("marl", () -> new BlockItem(IcariaBlocks.MARL.get(), propertiesBlocks()));
	public static final RegistryObject<Item> MARL_CHERT = register("marl_chert", () -> new BlockItem(IcariaBlocks.MARL_CHERT.get(), propertiesBlocks()));
	public static final RegistryObject<Item> MARL_ROTTEN_BONES = register("marl_rotten_bones", () -> new BlockItem(IcariaBlocks.MARL_ROTTEN_BONES.get(), propertiesBlocks()));
	public static final RegistryObject<Item> MARL_LIGNITE = register("marl_lignite", () -> new BlockItem(IcariaBlocks.MARL_LIGNITE.get(), propertiesBlocks()));
	public static final RegistryObject<Item> MARL_COARSE = register("marl_coarse", () -> new BlockItem(IcariaBlocks.MARL_COARSE.get(), propertiesBlocks()));

	public static final RegistryObject<Item> FARMLAND = register("farmland", () -> new BlockItem(IcariaBlocks.FARMLAND.get(), propertiesBlocks()));
	public static final RegistryObject<Item> FARMLAND_FERTILIZED = register("farmland_fertilized", () -> new BlockItem(IcariaBlocks.FARMLAND_FERTILIZED.get(), propertiesBlocks()));

	public static final RegistryObject<Item> MARL_ADOBE = register("marl_adobe", () -> new BlockItem(IcariaBlocks.MARL_ADOBE.get(), propertiesBlocks()));
	public static final StoneDecoItemBlocks MARL_ADOBE_DECO = new StoneDecoItemBlocks(IcariaBlocks.MARL_ADOBE_DECO, MARL_ADOBE);

	public static final RegistryObject<Item> LOAM = register("loam", () -> new BlockItem(IcariaBlocks.LOAM.get(), propertiesBlocks()));
	public static final RegistryObject<Item> LOAM_BRICKS = register("loam_bricks", () -> new BlockItem(IcariaBlocks.LOAM_BRICKS.get(), propertiesBlocks()));
	public static final StoneDecoItemBlocks LOAM_BRICKS_DECO = new StoneDecoItemBlocks(IcariaBlocks.LOAM_BRICKS_DECO, LOAM_BRICKS);

	public static final RegistryObject<Item> DOLOMITE_ADOBE = register("dolomite_adobe", () -> new BlockItem(IcariaBlocks.DOLOMITE_ADOBE.get(), propertiesBlocks()));
	public static final StoneDecoItemBlocks DOLOMITE_ADOBE_DECO = new StoneDecoItemBlocks(IcariaBlocks.DOLOMITE_ADOBE_DECO, DOLOMITE_ADOBE);
	public static final RegistryObject<Item> DOLOMITE_SMOOTH = register("dolomite_smooth", () -> new BlockItem(IcariaBlocks.DOLOMITE_SMOOTH.get(), propertiesBlocks()));
	public static final StoneDecoItemBlocks DOLOMITE_SMOOTH_DECO = new StoneDecoItemBlocks(IcariaBlocks.DOLOMITE_SMOOTH_DECO, DOLOMITE_SMOOTH);
	public static final RegistryObject<Item> DOLOMITE_BRICKS = register("dolomite_bricks", () -> new BlockItem(IcariaBlocks.DOLOMITE_BRICKS.get(), propertiesBlocks()));
	public static final RegistryObject<Item> DOLOMITE_PILLAR = register("dolomite_pillar", () -> new BlockItem(IcariaBlocks.DOLOMITE_PILLAR.get(), propertiesBlocks()));
	public static final RegistryObject<Item> DOLOMITE_PILLAR_HEAD = register("dolomite_pillar_head", () -> new BlockItem(IcariaBlocks.DOLOMITE_PILLAR_HEAD.get(), propertiesBlocks()));

	public static final RegistryObject<Item> GRAINEL = register("grainel", () -> new BlockItem(IcariaBlocks.GRAINEL.get(), propertiesBlocks()));
	public static final RegistryObject<Item> GRAINEL_CHERT = register("grainel_chert", () -> new BlockItem(IcariaBlocks.GRAINEL_CHERT.get(), propertiesBlocks()));
	public static final RegistryObject<Item> GRAINGLASS = register("grainglass", () -> new BlockItem(IcariaBlocks.GRAINGLASS.get(), propertiesBlocks()));
	public static final RegistryObject<Item> GRAINGLASS_PANE = register("grainglass_pane", () -> new BlockItem(IcariaBlocks.GRAINGLASS_PANE.get(), propertiesBlocks()));
	public static final RegistryObject<Item> GRAINGLASS_PANE_HORIZONTAL = register("grainglass_pane_horizontal", () -> new BlockItem(IcariaBlocks.GRAINGLASS_PANE_HORIZONTAL.get(), propertiesBlocks()));
	public static final RegistryObject<Item> GRAINITE_ADOBE = register("grainite_adobe", () -> new BlockItem(IcariaBlocks.GRAINITE_ADOBE.get(), propertiesBlocks()));
	public static final StoneDecoItemBlocks GRAINITE_ADOBE_DECO = new StoneDecoItemBlocks(IcariaBlocks.GRAINITE_ADOBE_DECO, GRAINITE_ADOBE);
	public static final RegistryObject<Item> GRAINITE = register("grainite", () -> new BlockItem(IcariaBlocks.GRAINITE.get(), propertiesBlocks()));
	public static final StoneDecoItemBlocks GRAINITE_DECO = new StoneDecoItemBlocks(IcariaBlocks.GRAINITE_DECO, GRAINITE);
	public static final RegistryObject<Item> GRAINITE_BRICKS = register("grainite_bricks", () -> new BlockItem(IcariaBlocks.GRAINITE_BRICKS.get(), propertiesBlocks()));
	public static final StoneDecoItemBlocks GRAINITE_BRICKS_DECO = new StoneDecoItemBlocks(IcariaBlocks.GRAINITE_BRICKS_DECO, GRAINITE_BRICKS);
	public static final RegistryObject<Item> GRAINITE_CHISELED = register("grainite_chiseled", () -> new BlockItem(IcariaBlocks.GRAINITE_CHISELED.get(), propertiesBlocks()));

	public static final RegistryObject<Item> YELLOWSTONE_ADOBE = register("yellowstone_adobe", () -> new BlockItem(IcariaBlocks.YELLOWSTONE_ADOBE.get(), propertiesBlocks()));
	public static final StoneDecoItemBlocks YELLOWSTONE_ADOBE_DECO = new StoneDecoItemBlocks(IcariaBlocks.YELLOWSTONE_ADOBE_DECO, YELLOWSTONE_ADOBE);
	public static final RegistryObject<Item> YELLOWSTONE_COBBLE = register("yellowstone_cobble", () -> new BlockItem(IcariaBlocks.YELLOWSTONE_COBBLE.get(), propertiesBlocks()));
	public static final StoneDecoItemBlocks YELLOWSTONE_COBBLE_DECO = new StoneDecoItemBlocks(IcariaBlocks.YELLOWSTONE_COBBLE_DECO, YELLOWSTONE_COBBLE);
	public static final RegistryObject<Item> YELLOWSTONE = register("yellowstone", () -> new BlockItem(IcariaBlocks.YELLOWSTONE.get(), propertiesBlocks()));
	public static final StoneDecoItemBlocks YELLOWSTONE_DECO = new StoneDecoItemBlocks(IcariaBlocks.YELLOWSTONE_DECO, YELLOWSTONE);
	public static final RegistryObject<Item> YELLOWSTONE_BRICKS = register("yellowstone_bricks", () -> new BlockItem(IcariaBlocks.YELLOWSTONE_BRICKS.get(), propertiesBlocks()));
	public static final StoneDecoItemBlocks YELLOWSTONE_BRICKS_DECO = new StoneDecoItemBlocks(IcariaBlocks.YELLOWSTONE_BRICKS_DECO, YELLOWSTONE_BRICKS);
	public static final RegistryObject<Item> YELLOWSTONE_CHISELED = register("yellowstone_chiseled", () -> new BlockItem(IcariaBlocks.YELLOWSTONE_CHISELED.get(), propertiesBlocks()));

	public static final RegistryObject<Item> SILKSAND = register("silksand", () -> new BlockItem(IcariaBlocks.SILKSAND.get(), propertiesBlocks()));
	public static final RegistryObject<Item> SILKGLASS = register("silkglass", () -> new BlockItem(IcariaBlocks.SILKGLASS.get(), propertiesBlocks()));
	public static final RegistryObject<Item> SILKGLASS_PANE = register("silkglass_pane", () -> new BlockItem(IcariaBlocks.SILKGLASS_PANE.get(), propertiesBlocks()));
	public static final RegistryObject<Item> SILKGLASS_PANE_HORIZONTAL = register("silkglass_pane_horizontal", () -> new BlockItem(IcariaBlocks.SILKGLASS_PANE_HORIZONTAL.get(), propertiesBlocks()));
	public static final RegistryObject<Item> SILKSTONE_ADOBE = register("silkstone_adobe", () -> new BlockItem(IcariaBlocks.SILKSTONE_ADOBE.get(), propertiesBlocks()));
	public static final StoneDecoItemBlocks SILKSTONE_ADOBE_DECO = new StoneDecoItemBlocks(IcariaBlocks.SILKSTONE_ADOBE_DECO, SILKSTONE_ADOBE);
	public static final RegistryObject<Item> SILKSTONE_COBBLE = register("silkstone_cobble", () -> new BlockItem(IcariaBlocks.SILKSTONE_COBBLE.get(), propertiesBlocks()));
	public static final StoneDecoItemBlocks SILKSTONE_COBBLE_DECO = new StoneDecoItemBlocks(IcariaBlocks.SILKSTONE_COBBLE_DECO, SILKSTONE_COBBLE);
	public static final RegistryObject<Item> SILKSTONE = register("silkstone", () -> new BlockItem(IcariaBlocks.SILKSTONE.get(), propertiesBlocks()));
	public static final StoneDecoItemBlocks SILKSTONE_DECO = new StoneDecoItemBlocks(IcariaBlocks.SILKSTONE_DECO, SILKSTONE);
	public static final RegistryObject<Item> SILKSTONE_BRICKS = register("silkstone_bricks", () -> new BlockItem(IcariaBlocks.SILKSTONE_BRICKS.get(), propertiesBlocks()));
	public static final StoneDecoItemBlocks SILKSTONE_BRICKS_DECO = new StoneDecoItemBlocks(IcariaBlocks.SILKSTONE_BRICKS_DECO, SILKSTONE_BRICKS);
	public static final RegistryObject<Item> SILKSTONE_CHISELED = register("silkstone_chiseled", () -> new BlockItem(IcariaBlocks.SILKSTONE_CHISELED.get(), propertiesBlocks()));

	public static final RegistryObject<Item> SUNSTONE_ADOBE = register("sunstone_adobe", () -> new BlockItem(IcariaBlocks.SUNSTONE_ADOBE.get(), propertiesBlocks()));
	public static final StoneDecoItemBlocks SUNSTONE_ADOBE_DECO = new StoneDecoItemBlocks(IcariaBlocks.SUNSTONE_ADOBE_DECO, SUNSTONE_ADOBE);
	public static final RegistryObject<Item> SUNSTONE_COBBLE = register("sunstone_cobble", () -> new BlockItem(IcariaBlocks.SUNSTONE_COBBLE.get(), propertiesBlocks()));
	public static final StoneDecoItemBlocks SUNSTONE_COBBLE_DECO = new StoneDecoItemBlocks(IcariaBlocks.SUNSTONE_COBBLE_DECO, SUNSTONE_COBBLE);
	public static final RegistryObject<Item> SUNSTONE = register("sunstone", () -> new BlockItem(IcariaBlocks.SUNSTONE.get(), propertiesBlocks()));
	public static final StoneDecoItemBlocks SUNSTONE_DECO = new StoneDecoItemBlocks(IcariaBlocks.SUNSTONE_DECO, SUNSTONE);
	public static final RegistryObject<Item> SUNSTONE_BRICKS = register("sunstone_bricks", () -> new BlockItem(IcariaBlocks.SUNSTONE_BRICKS.get(), propertiesBlocks()));
	public static final StoneDecoItemBlocks SUNSTONE_BRICKS_DECO = new StoneDecoItemBlocks(IcariaBlocks.SUNSTONE_BRICKS_DECO, SUNSTONE_BRICKS);
	public static final RegistryObject<Item> SUNSTONE_CHISELED = register("sunstone_chiseled", () -> new BlockItem(IcariaBlocks.SUNSTONE_CHISELED.get(), propertiesBlocks()));

	public static final RegistryObject<Item> VOIDSHALE_ADOBE = register("voidshale_adobe", () -> new BlockItem(IcariaBlocks.VOIDSHALE_ADOBE.get(), propertiesBlocks()));
	public static final StoneDecoItemBlocks VOIDSHALE_ADOBE_DECO = new StoneDecoItemBlocks(IcariaBlocks.VOIDSHALE_ADOBE_DECO, VOIDSHALE_ADOBE);
	public static final RegistryObject<Item> VOIDSHALE_COBBLE = register("voidshale_cobble", () -> new BlockItem(IcariaBlocks.VOIDSHALE_COBBLE.get(), propertiesBlocks()));
	public static final StoneDecoItemBlocks VOIDSHALE_COBBLE_DECO = new StoneDecoItemBlocks(IcariaBlocks.VOIDSHALE_COBBLE_DECO, VOIDSHALE_COBBLE);
	public static final RegistryObject<Item> VOIDSHALE = register("voidshale", () -> new BlockItem(IcariaBlocks.VOIDSHALE.get(), propertiesBlocks()));
	public static final StoneDecoItemBlocks VOIDSHALE_DECO = new StoneDecoItemBlocks(IcariaBlocks.VOIDSHALE_DECO, VOIDSHALE);
	public static final RegistryObject<Item> VOIDSHALE_BRICKS = register("voidshale_bricks", () -> new BlockItem(IcariaBlocks.VOIDSHALE_BRICKS.get(), propertiesBlocks()));
	public static final StoneDecoItemBlocks VOIDSHALE_BRICKS_DECO = new StoneDecoItemBlocks(IcariaBlocks.VOIDSHALE_BRICKS_DECO, VOIDSHALE_BRICKS);
	public static final RegistryObject<Item> VOIDSHALE_CHISELED = register("voidshale_chiseled", () -> new BlockItem(IcariaBlocks.VOIDSHALE_CHISELED.get(), propertiesBlocks()));

	public static final RegistryObject<Item> BAETYL_ADOBE = register("baetyl_adobe", () -> new BlockItem(IcariaBlocks.BAETYL_ADOBE.get(), propertiesBlocks()));
	public static final StoneDecoItemBlocks BAETYL_ADOBE_DECO = new StoneDecoItemBlocks(IcariaBlocks.BAETYL_ADOBE_DECO, BAETYL_ADOBE);
	public static final RegistryObject<Item> BAETYL_COBBLE = register("baetyl_cobble", () -> new BlockItem(IcariaBlocks.BAETYL_COBBLE.get(), propertiesBlocks()));
	public static final StoneDecoItemBlocks BAETYL_COBBLE_DECO = new StoneDecoItemBlocks(IcariaBlocks.BAETYL_COBBLE_DECO, BAETYL_COBBLE);
	public static final RegistryObject<Item> BAETYL = register("baetyl", () -> new BlockItem(IcariaBlocks.BAETYL.get(), propertiesBlocks()));
	public static final StoneDecoItemBlocks BAETYL_DECO = new StoneDecoItemBlocks(IcariaBlocks.BAETYL_DECO, BAETYL);
	public static final RegistryObject<Item> BAETYL_BRICKS = register("baetyl_bricks", () -> new BlockItem(IcariaBlocks.BAETYL_BRICKS.get(), propertiesBlocks()));
	public static final StoneDecoItemBlocks BAETYL_BRICKS_DECO = new StoneDecoItemBlocks(IcariaBlocks.BAETYL_BRICKS_DECO, BAETYL_BRICKS);
	public static final RegistryObject<Item> BAETYL_CHISELED = register("baetyl_chiseled", () -> new BlockItem(IcariaBlocks.BAETYL_CHISELED.get(), propertiesBlocks()));

	public static final RegistryObject<Item> RELICSTONE = register("relicstone", () -> new BlockItem(IcariaBlocks.RELICSTONE.get(), propertiesBlocks()));
	public static final StoneDecoItemBlocks RELICSTONE_DECO = new StoneDecoItemBlocks(IcariaBlocks.RELICSTONE_DECO, RELICSTONE);
	public static final RegistryObject<Item> RELICSTONE_SMOOTH = register("relicstone_smooth", () -> new BlockItem(IcariaBlocks.RELICSTONE_SMOOTH.get(), propertiesBlocks()));
	public static final StoneDecoItemBlocks RELICSTONE_SMOOTH_DECO = new StoneDecoItemBlocks(IcariaBlocks.RELICSTONE_SMOOTH_DECO, RELICSTONE_SMOOTH);
	public static final RegistryObject<Item> RELICSTONE_BRICKS = register("relicstone_bricks", () -> new BlockItem(IcariaBlocks.RELICSTONE_BRICKS.get(), propertiesBlocks()));
	public static final StoneDecoItemBlocks RELICSTONE_BRICKS_DECO = new StoneDecoItemBlocks(IcariaBlocks.RELICSTONE_BRICKS_DECO, RELICSTONE_BRICKS);
	public static final RegistryObject<Item> RELICSTONE_BRICKS_CRACKED = register("relicstone_bricks_cracked", () -> new BlockItem(IcariaBlocks.RELICSTONE_BRICKS_CRACKED.get(), propertiesBlocks()));
	public static final StoneDecoItemBlocks RELICSTONE_BRICKS_CRACKED_DECO = new StoneDecoItemBlocks(IcariaBlocks.RELICSTONE_BRICKS_CRACKED_DECO, RELICSTONE_BRICKS_CRACKED);
	public static final RegistryObject<Item> RELICSTONE_BRICKS_MOSSY = register("relicstone_bricks_mossy", () -> new BlockItem(IcariaBlocks.RELICSTONE_BRICKS_MOSSY.get(), propertiesBlocks()));
	public static final StoneDecoItemBlocks RELICSTONE_BRICKS_MOSSY_DECO = new StoneDecoItemBlocks(IcariaBlocks.RELICSTONE_BRICKS_MOSSY_DECO, RELICSTONE_BRICKS_MOSSY);
	public static final RegistryObject<Item> RELICSTONE_TILES = register("relicstone_tiles", () -> new BlockItem(IcariaBlocks.RELICSTONE_TILES.get(), propertiesBlocks()));
	public static final StoneDecoItemBlocks RELICSTONE_TILES_DECO = new StoneDecoItemBlocks(IcariaBlocks.RELICSTONE_TILES_DECO, RELICSTONE_TILES);
	public static final RegistryObject<Item> RELICSTONE_TILES_CRACKED = register("relicstone_tiles_cracked", () -> new BlockItem(IcariaBlocks.RELICSTONE_TILES_CRACKED.get(), propertiesBlocks()));
	public static final StoneDecoItemBlocks RELICSTONE_TILES_CRACKED_DECO = new StoneDecoItemBlocks(IcariaBlocks.RELICSTONE_TILES_CRACKED_DECO, RELICSTONE_TILES_CRACKED);
	public static final RegistryObject<Item> RELICSTONE_TILES_MOSSY = register("relicstone_tiles_mossy", () -> new BlockItem(IcariaBlocks.RELICSTONE_TILES_MOSSY.get(), propertiesBlocks()));
	public static final StoneDecoItemBlocks RELICSTONE_TILES_MOSSY_DECO = new StoneDecoItemBlocks(IcariaBlocks.RELICSTONE_TILES_MOSSY_DECO, RELICSTONE_TILES_MOSSY);
	public static final RegistryObject<Item> RELICSTONE_CHISELED = register("relicstone_chiseled", () -> new BlockItem(IcariaBlocks.RELICSTONE_CHISELED.get(), propertiesBlocks()));
	public static final RegistryObject<Item> RELICSTONE_PILLAR = register("relicstone_pillar", () -> new BlockItem(IcariaBlocks.RELICSTONE_PILLAR.get(), propertiesBlocks()));
	public static final RegistryObject<Item> RELICSTONE_PILLAR_HEAD = register("relicstone_pillar_head", () -> new BlockItem(IcariaBlocks.RELICSTONE_PILLAR_HEAD.get(), propertiesBlocks()));

	public static final RegistryObject<Item> LIGNITE_ORE = register("lignite_ore", () -> new BlockItem(IcariaBlocks.LIGNITE_ORE.get(), propertiesBlocks()));
	public static final RegistryObject<Item> CHALKOS_ORE = register("chalkos_ore", () -> new BlockItem(IcariaBlocks.CHALKOS_ORE.get(), propertiesBlocks()));
	public static final RegistryObject<Item> KASSITEROS_ORE = register("kassiteros_ore", () -> new BlockItem(IcariaBlocks.KASSITEROS_ORE.get(), propertiesBlocks()));
	public static final RegistryObject<Item> DOLOMITE_ORE = register("dolomite_ore", () -> new BlockItem(IcariaBlocks.DOLOMITE_ORE.get(), propertiesBlocks()));
	public static final RegistryObject<Item> VANADIUM_ORE = register("vanadium_ore", () -> new BlockItem(IcariaBlocks.VANADIUM_ORE.get(), propertiesBlocks()));
	public static final RegistryObject<Item> SLIVER_ORE = register("sliver_ore", () -> new BlockItem(IcariaBlocks.SLIVER_ORE.get(), propertiesBlocks()));
	public static final RegistryObject<Item> SIDEROS_ORE = register("sideros_ore", () -> new BlockItem(IcariaBlocks.SIDEROS_ORE.get(), propertiesBlocks()));
	public static final RegistryObject<Item> ANTHRACITE_ORE = register("anthracite_ore", () -> new BlockItem(IcariaBlocks.ANTHRACITE_ORE.get(), propertiesBlocks()));
	public static final RegistryObject<Item> MOLYBDENUM_ORE = register("molybdenum_ore", () -> new BlockItem(IcariaBlocks.MOLYBDENUM_ORE.get(), propertiesBlocks()));
	public static final RegistryObject<Item> HYLIASTRUM_ORE = register("hyliastrum_ore", () -> new BlockItem(IcariaBlocks.HYLIASTRUM_ORE.get(), propertiesBlocks()));

	public static final RegistryObject<Item> ARISTONE = register("aristone", () -> new BlockItem(IcariaBlocks.ARISTONE.get(), propertiesBlocks()));
	public static final RegistryObject<Item> ARISTONE_PACKED = register("aristone_packed", () -> new BlockItem(IcariaBlocks.ARISTONE_PACKED.get(), propertiesBlocks()));

	public static final RegistryObject<Item> QUARTZ_PILLAR_HEAD = register("quartz_pillar_head", () -> new BlockItem(IcariaBlocks.QUARTZ_PILLAR_HEAD.get(), propertiesBlocks()));

	public static final RegistryObject<Item> JELLYFISH_JELLY_BLOCK = register("jellyfish_jelly_block", () -> new BlockItem(IcariaBlocks.JELLYFISH_JELLY_BLOCK.get(), propertiesBlocks()));
	public static final RegistryObject<Item> ARACHNE_STRING_BLOCK = register("arachne_string_block", () -> new BlockItem(IcariaBlocks.ARACHNE_STRING_BLOCK.get(), propertiesBlocks()));
	public static final RegistryObject<Item> SPELT_BALE_BLOCK = register("spelt_bale_block", () -> new BlockItem(IcariaBlocks.SPELT_BALE_BLOCK.get(), propertiesBlocks()));
	public static final RegistryObject<Item> VINE_REED_BLOCK = register("vine_reed_block", () -> new BlockItem(IcariaBlocks.VINE_REED_BLOCK.get(), propertiesBlocks()));
	public static final RegistryObject<Item> VINE_SPROUT_BLOCK = register("vine_sprout_block", () -> new BlockItem(IcariaBlocks.VINE_SPROUT_BLOCK.get(), propertiesBlocks()));
	public static final RegistryObject<Item> ROTTEN_BONES_BLOCK = register("rotten_bones_block", () -> new BlockItem(IcariaBlocks.ROTTEN_BONES_BLOCK.get(), propertiesBlocks()));

	public static final RegistryObject<Item> CHALKOS_RAW_BLOCK = register("chalkos_raw_block", () -> new BlockItem(IcariaBlocks.CHALKOS_RAW_BLOCK.get(), propertiesBlocks()));
	public static final RegistryObject<Item> KASSITEROS_RAW_BLOCK = register("kassiteros_raw_block", () -> new BlockItem(IcariaBlocks.KASSITEROS_RAW_BLOCK.get(), propertiesBlocks()));
	public static final RegistryObject<Item> VANADIUM_RAW_BLOCK = register("vanadium_raw_block", () -> new BlockItem(IcariaBlocks.VANADIUM_RAW_BLOCK.get(), propertiesBlocks()));
	public static final RegistryObject<Item> SIDEROS_RAW_BLOCK = register("sideros_raw_block", () -> new BlockItem(IcariaBlocks.SIDEROS_RAW_BLOCK.get(), propertiesBlocks()));
	public static final RegistryObject<Item> MOLYBDENUM_RAW_BLOCK = register("molybdenum_raw_block", () -> new BlockItem(IcariaBlocks.MOLYBDENUM_RAW_BLOCK.get(), propertiesBlocks()));

	public static final RegistryObject<Item> CHERT_BLOCK = register("chert_block", () -> new BlockItem(IcariaBlocks.CHERT_BLOCK.get(), propertiesBlocks()));
	public static final RegistryObject<Item> LIGNITE_BLOCK = register("lignite_block", () -> new FuelBlockItem(IcariaBlocks.LIGNITE_BLOCK.get(), propertiesBlocks(), 7200));
	public static final RegistryObject<Item> CHALKOS_BLOCK = register("chalkos_block", () -> new BlockItem(IcariaBlocks.CHALKOS_BLOCK.get(), propertiesBlocks()));
	public static final RegistryObject<Item> KASSITEROS_BLOCK = register("kassiteros_block", () -> new BlockItem(IcariaBlocks.KASSITEROS_BLOCK.get(), propertiesBlocks()));
	public static final RegistryObject<Item> ORICHALCUM_BLOCK = register("orichalcum_block", () -> new BlockItem(IcariaBlocks.ORICHALCUM_BLOCK.get(), propertiesBlocks()));
	public static final RegistryObject<Item> VANADIUM_BLOCK = register("vanadium_block", () -> new BlockItem(IcariaBlocks.VANADIUM_BLOCK.get(), propertiesBlocks()));
	public static final RegistryObject<Item> VANADIUMSTEEL_BLOCK = register("vanadiumsteel_block", () -> new BlockItem(IcariaBlocks.VANADIUMSTEEL_BLOCK.get(), propertiesBlocks()));
	public static final RegistryObject<Item> SLIVER_BLOCK = register("sliver_block", () -> new BlockItem(IcariaBlocks.SLIVER_BLOCK.get(), propertiesBlocks()));
	public static final RegistryObject<Item> SIDEROS_BLOCK = register("sideros_block", () -> new BlockItem(IcariaBlocks.SIDEROS_BLOCK.get(), propertiesBlocks()));
	public static final RegistryObject<Item> ANTHRACITE_BLOCK = register("anthracite_block", () -> new FuelBlockItem(IcariaBlocks.ANTHRACITE_BLOCK.get(), propertiesBlocks(), 28800));
	public static final RegistryObject<Item> MOLYBDENUM_BLOCK = register("molybdenum_block", () -> new BlockItem(IcariaBlocks.MOLYBDENUM_BLOCK.get(), propertiesBlocks()));
	public static final RegistryObject<Item> MOLYBDENUMSTEEL_BLOCK = register("molybdenumsteel_block", () -> new BlockItem(IcariaBlocks.MOLYBDENUMSTEEL_BLOCK.get(), propertiesBlocks()));

	public static final RegistryObject<Item> CYPRESS_SAPLING = register("cypress_sapling", () -> new BlockItem(IcariaBlocks.CYPRESS_SAPLING.get(), propertiesFlora()));
	public static final RegistryObject<Item> CYPRESS_LEAVES = register("cypress_leaves", () -> new BlockItem(IcariaBlocks.CYPRESS_LEAVES.get(), propertiesFlora()));
	public static final RegistryObject<Item> FALLEN_CYPRESS_LEAVES = register("fallen_cypress_leaves", () -> new BlockItem(IcariaBlocks.FALLEN_CYPRESS_LEAVES.get(), propertiesFlora()));
	public static final RegistryObject<Item> CYPRESS_WOOD = register("cypress_wood", () -> new BlockItem(IcariaBlocks.CYPRESS_WOOD.get(), propertiesFlora()));
	public static final RegistryObject<Item> STRIPPED_CYPRESS_WOOD = register("stripped_cypress_wood", () -> new BlockItem(IcariaBlocks.STRIPPED_CYPRESS_WOOD.get(), propertiesFlora()));
	public static final RegistryObject<Item> CYPRESS_LOG = register("cypress_log", () -> new BlockItem(IcariaBlocks.CYPRESS_LOG.get(), propertiesFlora()));
	public static final RegistryObject<Item> STRIPPED_CYPRESS_LOG = register("stripped_cypress_log", () -> new BlockItem(IcariaBlocks.STRIPPED_CYPRESS_LOG.get(), propertiesFlora()));
	public static final RegistryObject<Item> DEAD_CYPRESS_LOG = register("dead_cypress_log", () -> new BlockItem(IcariaBlocks.DEAD_CYPRESS_LOG.get(), propertiesFlora()));
	public static final RegistryObject<Item> STRIPPED_DEAD_CYPRESS_LOG = register("stripped_dead_cypress_log", () -> new BlockItem(IcariaBlocks.STRIPPED_DEAD_CYPRESS_LOG.get(), propertiesFlora()));
	public static final RegistryObject<Item> CYPRESS_PLANKS = register("cypress_planks", () -> new BlockItem(IcariaBlocks.CYPRESS_PLANKS.get(), propertiesFlora()));
	public static final WoodDecoItemBlocks CYPRESS_DECO = new WoodDecoItemBlocks(IcariaBlocks.CYPRESS_DECO, CYPRESS_PLANKS);

	public static final RegistryObject<Item> DROUGHTROOT_SAPLING = register("droughtroot_sapling", () -> new BlockItem(IcariaBlocks.DROUGHTROOT_SAPLING.get(), propertiesFlora()));
	public static final RegistryObject<Item> DROUGHTROOT_LEAVES = register("droughtroot_leaves", () -> new BlockItem(IcariaBlocks.DROUGHTROOT_LEAVES.get(), propertiesFlora()));
	public static final RegistryObject<Item> FALLEN_DROUGHTROOT_LEAVES = register("fallen_droughtroot_leaves", () -> new BlockItem(IcariaBlocks.FALLEN_DROUGHTROOT_LEAVES.get(), propertiesFlora()));
	public static final RegistryObject<Item> DROUGHTROOT_WOOD = register("droughtroot_wood", () -> new BlockItem(IcariaBlocks.DROUGHTROOT_WOOD.get(), propertiesFlora()));
	public static final RegistryObject<Item> STRIPPED_DROUGHTROOT_WOOD = register("stripped_droughtroot_wood", () -> new BlockItem(IcariaBlocks.STRIPPED_DROUGHTROOT_WOOD.get(), propertiesFlora()));
	public static final RegistryObject<Item> DROUGHTROOT_LOG = register("droughtroot_log", () -> new BlockItem(IcariaBlocks.DROUGHTROOT_LOG.get(), propertiesFlora()));
	public static final RegistryObject<Item> STRIPPED_DROUGHTROOT_LOG = register("stripped_droughtroot_log", () -> new BlockItem(IcariaBlocks.STRIPPED_DROUGHTROOT_LOG.get(), propertiesFlora()));
	public static final RegistryObject<Item> DEAD_DROUGHTROOT_LOG = register("dead_droughtroot_log", () -> new BlockItem(IcariaBlocks.DEAD_DROUGHTROOT_LOG.get(), propertiesFlora()));
	public static final RegistryObject<Item> STRIPPED_DEAD_DROUGHTROOT_LOG = register("stripped_dead_droughtroot_log", () -> new BlockItem(IcariaBlocks.STRIPPED_DEAD_DROUGHTROOT_LOG.get(), propertiesFlora()));
	public static final RegistryObject<Item> DROUGHTROOT_PLANKS = register("droughtroot_planks", () -> new BlockItem(IcariaBlocks.DROUGHTROOT_PLANKS.get(), propertiesFlora()));
	public static final WoodDecoItemBlocks DROUGHTROOT_DECO = new WoodDecoItemBlocks(IcariaBlocks.DROUGHTROOT_DECO, DROUGHTROOT_PLANKS);

	public static final RegistryObject<Item> FIR_SAPLING = register("fir_sapling", () -> new BlockItem(IcariaBlocks.FIR_SAPLING.get(), propertiesFlora()));
	public static final RegistryObject<Item> FIR_LEAVES = register("fir_leaves", () -> new BlockItem(IcariaBlocks.FIR_LEAVES.get(), propertiesFlora()));
	public static final RegistryObject<Item> FALLEN_FIR_LEAVES = register("fallen_fir_leaves", () -> new BlockItem(IcariaBlocks.FALLEN_FIR_LEAVES.get(), propertiesFlora()));
	public static final RegistryObject<Item> FIR_WOOD = register("fir_wood", () -> new BlockItem(IcariaBlocks.FIR_WOOD.get(), propertiesFlora()));
	public static final RegistryObject<Item> STRIPPED_FIR_WOOD = register("stripped_fir_wood", () -> new BlockItem(IcariaBlocks.STRIPPED_FIR_WOOD.get(), propertiesFlora()));
	public static final RegistryObject<Item> FIR_LOG = register("fir_log", () -> new BlockItem(IcariaBlocks.FIR_LOG.get(), propertiesFlora()));
	public static final RegistryObject<Item> STRIPPED_FIR_LOG = register("stripped_fir_log", () -> new BlockItem(IcariaBlocks.STRIPPED_FIR_LOG.get(), propertiesFlora()));
	public static final RegistryObject<Item> DEAD_FIR_LOG = register("dead_fir_log", () -> new BlockItem(IcariaBlocks.DEAD_FIR_LOG.get(), propertiesFlora()));
	public static final RegistryObject<Item> STRIPPED_DEAD_FIR_LOG = register("stripped_dead_fir_log", () -> new BlockItem(IcariaBlocks.STRIPPED_DEAD_FIR_LOG.get(), propertiesFlora()));
	public static final RegistryObject<Item> FIR_PLANKS = register("fir_planks", () -> new BlockItem(IcariaBlocks.FIR_PLANKS.get(), propertiesFlora()));
	public static final WoodDecoItemBlocks FIR_DECO = new WoodDecoItemBlocks(IcariaBlocks.FIR_DECO, FIR_PLANKS);

	public static final RegistryObject<Item> LAUREL_SAPLING = register("laurel_sapling", () -> new BlockItem(IcariaBlocks.LAUREL_SAPLING.get(), propertiesFlora()));
	public static final RegistryObject<Item> LAUREL_LEAVES = register("laurel_leaves", () -> new BlockItem(IcariaBlocks.LAUREL_LEAVES.get(), propertiesFlora()));
	public static final RegistryObject<Item> FALLEN_LAUREL_LEAVES = register("fallen_laurel_leaves", () -> new BlockItem(IcariaBlocks.FALLEN_LAUREL_LEAVES.get(), propertiesFlora()));
	public static final RegistryObject<Item> LAUREL_WOOD = register("laurel_wood", () -> new BlockItem(IcariaBlocks.LAUREL_WOOD.get(), propertiesFlora()));
	public static final RegistryObject<Item> STRIPPED_LAUREL_WOOD = register("stripped_laurel_wood", () -> new BlockItem(IcariaBlocks.STRIPPED_LAUREL_WOOD.get(), propertiesFlora()));
	public static final RegistryObject<Item> LAUREL_LOG = register("laurel_log", () -> new BlockItem(IcariaBlocks.LAUREL_LOG.get(), propertiesFlora()));
	public static final RegistryObject<Item> STRIPPED_LAUREL_LOG = register("stripped_laurel_log", () -> new BlockItem(IcariaBlocks.STRIPPED_LAUREL_LOG.get(), propertiesFlora()));
	public static final RegistryObject<Item> DEAD_LAUREL_LOG = register("dead_laurel_log", () -> new BlockItem(IcariaBlocks.DEAD_LAUREL_LOG.get(), propertiesFlora()));
	public static final RegistryObject<Item> STRIPPED_DEAD_LAUREL_LOG = register("stripped_dead_laurel_log", () -> new BlockItem(IcariaBlocks.STRIPPED_DEAD_LAUREL_LOG.get(), propertiesFlora()));
	public static final RegistryObject<Item> LAUREL_PLANKS = register("laurel_planks", () -> new BlockItem(IcariaBlocks.LAUREL_PLANKS.get(), propertiesFlora()));
	public static final WoodDecoItemBlocks LAUREL_DECO = new WoodDecoItemBlocks(IcariaBlocks.LAUREL_DECO, LAUREL_PLANKS);

	public static final RegistryObject<Item> OLIVE_SAPLING = register("olive_sapling", () -> new BlockItem(IcariaBlocks.OLIVE_SAPLING.get(), propertiesFlora()));
	public static final RegistryObject<Item> OLIVE_LEAVES = register("olive_leaves", () -> new BlockItem(IcariaBlocks.OLIVE_LEAVES.get(), propertiesFlora()));
	public static final RegistryObject<Item> OLIVE_LEAVES_BLACK = register("olive_leaves_black", () -> new BlockItem(IcariaBlocks.OLIVE_LEAVES_BLACK.get(), propertiesFlora()));
	public static final RegistryObject<Item> OLIVE_LEAVES_GREEN = register("olive_leaves_green", () -> new BlockItem(IcariaBlocks.OLIVE_LEAVES_GREEN.get(), propertiesFlora()));
	public static final RegistryObject<Item> FALLEN_OLIVE_LEAVES = register("fallen_olive_leaves", () -> new BlockItem(IcariaBlocks.FALLEN_OLIVE_LEAVES.get(), propertiesFlora()));
	public static final RegistryObject<Item> OLIVE_WOOD = register("olive_wood", () -> new BlockItem(IcariaBlocks.OLIVE_WOOD.get(), propertiesFlora()));
	public static final RegistryObject<Item> STRIPPED_OLIVE_WOOD = register("stripped_olive_wood", () -> new BlockItem(IcariaBlocks.STRIPPED_OLIVE_WOOD.get(), propertiesFlora()));
	public static final RegistryObject<Item> OLIVE_LOG = register("olive_log", () -> new BlockItem(IcariaBlocks.OLIVE_LOG.get(), propertiesFlora()));
	public static final RegistryObject<Item> STRIPPED_OLIVE_LOG = register("stripped_olive_log", () -> new BlockItem(IcariaBlocks.STRIPPED_OLIVE_LOG.get(), propertiesFlora()));
	public static final RegistryObject<Item> DEAD_OLIVE_LOG = register("dead_olive_log", () -> new BlockItem(IcariaBlocks.DEAD_OLIVE_LOG.get(), propertiesFlora()));
	public static final RegistryObject<Item> STRIPPED_DEAD_OLIVE_LOG = register("stripped_dead_olive_log", () -> new BlockItem(IcariaBlocks.STRIPPED_DEAD_OLIVE_LOG.get(), propertiesFlora()));
	public static final RegistryObject<Item> OLIVE_PLANKS = register("olive_planks", () -> new BlockItem(IcariaBlocks.OLIVE_PLANKS.get(), propertiesFlora()));
	public static final WoodDecoItemBlocks OLIVE_DECO = new WoodDecoItemBlocks(IcariaBlocks.OLIVE_DECO, OLIVE_PLANKS);

	public static final RegistryObject<Item> PLANE_SAPLING = register("plane_sapling", () -> new BlockItem(IcariaBlocks.PLANE_SAPLING.get(), propertiesFlora()));
	public static final RegistryObject<Item> PLANE_LEAVES = register("plane_leaves", () -> new BlockItem(IcariaBlocks.PLANE_LEAVES.get(), propertiesFlora()));
	public static final RegistryObject<Item> FALLEN_PLANE_LEAVES = register("fallen_plane_leaves", () -> new BlockItem(IcariaBlocks.FALLEN_PLANE_LEAVES.get(), propertiesFlora()));
	public static final RegistryObject<Item> PLANE_WOOD = register("plane_wood", () -> new BlockItem(IcariaBlocks.PLANE_WOOD.get(), propertiesFlora()));
	public static final RegistryObject<Item> STRIPPED_PLANE_WOOD = register("stripped_plane_wood", () -> new BlockItem(IcariaBlocks.STRIPPED_PLANE_WOOD.get(), propertiesFlora()));
	public static final RegistryObject<Item> PLANE_LOG = register("plane_log", () -> new BlockItem(IcariaBlocks.PLANE_LOG.get(), propertiesFlora()));
	public static final RegistryObject<Item> STRIPPED_PLANE_LOG = register("stripped_plane_log", () -> new BlockItem(IcariaBlocks.STRIPPED_PLANE_LOG.get(), propertiesFlora()));
	public static final RegistryObject<Item> DEAD_PLANE_LOG = register("dead_plane_log", () -> new BlockItem(IcariaBlocks.DEAD_PLANE_LOG.get(), propertiesFlora()));
	public static final RegistryObject<Item> STRIPPED_DEAD_PLANE_LOG = register("stripped_dead_plane_log", () -> new BlockItem(IcariaBlocks.STRIPPED_DEAD_PLANE_LOG.get(), propertiesFlora()));
	public static final RegistryObject<Item> PLANE_PLANKS = register("plane_planks", () -> new BlockItem(IcariaBlocks.PLANE_PLANKS.get(), propertiesFlora()));
	public static final WoodDecoItemBlocks PLANE_DECO = new WoodDecoItemBlocks(IcariaBlocks.PLANE_DECO, PLANE_PLANKS);

	public static final RegistryObject<Item> POPULUS_SAPLING = register("populus_sapling", () -> new BlockItem(IcariaBlocks.POPULUS_SAPLING.get(), propertiesFlora()));
	public static final RegistryObject<Item> POPULUS_LEAVES = register("populus_leaves", () -> new BlockItem(IcariaBlocks.POPULUS_LEAVES.get(), propertiesFlora()));
	public static final RegistryObject<Item> FALLEN_POPULUS_LEAVES = register("fallen_populus_leaves", () -> new BlockItem(IcariaBlocks.FALLEN_POPULUS_LEAVES.get(), propertiesFlora()));
	public static final RegistryObject<Item> POPULUS_WOOD = register("populus_wood", () -> new BlockItem(IcariaBlocks.POPULUS_WOOD.get(), propertiesFlora()));
	public static final RegistryObject<Item> STRIPPED_POPULUS_WOOD = register("stripped_populus_wood", () -> new BlockItem(IcariaBlocks.STRIPPED_POPULUS_WOOD.get(), propertiesFlora()));
	public static final RegistryObject<Item> POPULUS_LOG = register("populus_log", () -> new BlockItem(IcariaBlocks.POPULUS_LOG.get(), propertiesFlora()));
	public static final RegistryObject<Item> STRIPPED_POPULUS_LOG = register("stripped_populus_log", () -> new BlockItem(IcariaBlocks.STRIPPED_POPULUS_LOG.get(), propertiesFlora()));
	public static final RegistryObject<Item> DEAD_POPULUS_LOG = register("dead_populus_log", () -> new BlockItem(IcariaBlocks.DEAD_POPULUS_LOG.get(), propertiesFlora()));
	public static final RegistryObject<Item> STRIPPED_DEAD_POPULUS_LOG = register("stripped_dead_populus_log", () -> new BlockItem(IcariaBlocks.STRIPPED_DEAD_POPULUS_LOG.get(), propertiesFlora()));
	public static final RegistryObject<Item> POPULUS_PLANKS = register("populus_planks", () -> new BlockItem(IcariaBlocks.POPULUS_PLANKS.get(), propertiesFlora()));
	public static final WoodDecoItemBlocks POPULUS_DECO = new WoodDecoItemBlocks(IcariaBlocks.POPULUS_DECO, POPULUS_PLANKS);

	public static final RegistryObject<Item> LIGNITE_TORCH = registerBasic("lignite_torch", () -> new StandingAndWallBlockItem(IcariaBlocks.LIGNITE_TORCH.get(), IcariaBlocks.LIGNITE_WALL_TORCH.get(), propertiesBlocks()));
	public static final RegistryObject<Item> ANTHRACITE_TORCH = registerBasic("anthracite_torch", () -> new StandingAndWallBlockItem(IcariaBlocks.ANTHRACITE_TORCH.get(), IcariaBlocks.ANTHRACITE_WALL_TORCH.get(), propertiesBlocks()));

	public static final RegistryObject<Item> MOSS_0 = register("moss_0", () -> new BlockItem(IcariaBlocks.MOSS_0.get(), propertiesFlora()));
	public static final RegistryObject<Item> MOSS_1 = register("moss_1", () -> new BlockItem(IcariaBlocks.MOSS_1.get(), propertiesFlora()));
	public static final RegistryObject<Item> MOSS_2 = register("moss_2", () -> new BlockItem(IcariaBlocks.MOSS_2.get(), propertiesFlora()));

	public static final RegistryObject<Item> FLASK_EMPTY = registerBasic("flask_empty", () -> new Item(propertiesItems()));
	public static final RegistryObject<Item> JELLYFISH_JELLY = registerBasic("jellyfish_jelly", () -> new Item(propertiesItems()));
	public static final RegistryObject<Item> ARACHNE_STRING = registerBasic("arachne_string", () -> new Item(propertiesItems()));
	public static final RegistryObject<Item> SPELT = registerBasic("spelt", () -> new Item(propertiesItems()));
	public static final RegistryObject<Item> SPELT_BREAD = registerBasic("spelt_bread", () -> new Item(propertiesItems().food(foodPropertiesSpeltBread())));
	public static final RegistryObject<Item> VINE_REED = registerBasic("vine_reed", () -> new Item(propertiesItems()));
	public static final RegistryObject<Item> VINE_SPROUT = registerBasic("vine_sprout", () -> new VineSproutItem(propertiesVineSprout().food(foodPropertiesVineSprout())));
	public static final RegistryObject<Item> ROTTEN_BONES = registerBasic("rotten_bones", () -> new Item(propertiesItems()));
	public static final RegistryObject<Item> REMAINS = registerBasic("remains", () -> new Item(propertiesItems()));
	public static final RegistryObject<Item> CALCITE_POWDER = registerBasic("calcite_powder", () -> new Item(propertiesItems()));
	public static final RegistryObject<Item> LOAM_LUMP = registerBasic("loam_lump", () -> new Item(propertiesItems()));
	public static final RegistryObject<Item> LOAM_BRICK = registerBasic("loam_brick", () -> new Item(propertiesItems()));
	public static final RegistryObject<Item> CHERT = registerBasic("chert", () -> new Item(propertiesItems()));
	public static final RegistryObject<Item> LIGNITE = registerBasic("lignite", () -> new FuelItem(propertiesItems(), 800));
	public static final RegistryObject<Item> CHALKOS_RAW = registerBasic("chalkos_raw", () -> new Item(propertiesItems()));
	public static final RegistryObject<Item> KASSITEROS_RAW = registerBasic("kassiteros_raw", () -> new Item(propertiesItems()));
	public static final RegistryObject<Item> DOLOMITE = registerBasic("dolomite", () -> new Item(propertiesItems()));
	public static final RegistryObject<Item> VANADIUM_RAW = registerBasic("vanadium_raw", () -> new Item(propertiesItems()));
	public static final RegistryObject<Item> SLIVER = registerBasic("sliver", () -> new Item(propertiesItems()));
	public static final RegistryObject<Item> SIDEROS_RAW = registerBasic("sideros_raw", () -> new Item(propertiesItems()));
	public static final RegistryObject<Item> ANTHRACITE = registerBasic("anthracite", () -> new FuelItem(propertiesItems(), 3200));
	public static final RegistryObject<Item> MOLYBDENUM_RAW = registerBasic("molybdenum_raw", () -> new Item(propertiesItems()));

	public static final RegistryObject<Item> CHALKOS_NUGGET = registerBasic("chalkos_nugget", () -> new Item(propertiesItems()));
	public static final RegistryObject<Item> KASSITEROS_NUGGET = registerBasic("kassiteros_nugget", () -> new Item(propertiesItems()));
	public static final RegistryObject<Item> ORICHALCUM_NUGGET = registerBasic("orichalcum_nugget", () -> new Item(propertiesItems()));
	public static final RegistryObject<Item> VANADIUM_NUGGET = registerBasic("vanadium_nugget", () -> new Item(propertiesItems()));
	public static final RegistryObject<Item> VANADIUMSTEEL_NUGGET = registerBasic("vanadiumsteel_nugget", () -> new Item(propertiesItems()));
	public static final RegistryObject<Item> SIDEROS_NUGGET = registerBasic("sideros_nugget", () -> new Item(propertiesItems()));
	public static final RegistryObject<Item> MOLYBDENUM_NUGGET = registerBasic("molybdenum_nugget", () -> new Item(propertiesItems()));
	public static final RegistryObject<Item> MOLYBDENUMSTEEL_NUGGET = registerBasic("molybdenumsteel_nugget", () -> new Item(propertiesItems()));

	public static final RegistryObject<Item> CHALKOS_INGOT = registerBasic("chalkos_ingot", () -> new Item(propertiesItems()));
	public static final RegistryObject<Item> KASSITEROS_INGOT = registerBasic("kassiteros_ingot", () -> new Item(propertiesItems()));
	public static final RegistryObject<Item> ORICHALCUM_INGOT = registerBasic("orichalcum_ingot", () -> new Item(propertiesItems()));
	public static final RegistryObject<Item> VANADIUM_INGOT = registerBasic("vanadium_ingot", () -> new Item(propertiesItems()));
	public static final RegistryObject<Item> VANADIUMSTEEL_INGOT = registerBasic("vanadiumsteel_ingot", () -> new Item(propertiesItems()));
	public static final RegistryObject<Item> SIDEROS_INGOT = registerBasic("sideros_ingot", () -> new Item(propertiesItems()));
	public static final RegistryObject<Item> MOLYBDENUM_INGOT = registerBasic("molybdenum_ingot", () -> new Item(propertiesItems()));
	public static final RegistryObject<Item> MOLYBDENUMSTEEL_INGOT = registerBasic("molybdenumsteel_ingot", () -> new Item(propertiesItems()));

	public static final ToolCombination CHERT_TOOLS = new ToolCombination(IcariaTiers.CHERT);
	public static final ToolCombination CHALKOS_TOOLS = new ToolCombination(IcariaTiers.CHALKOS);
	public static final ToolCombination KASSITEROS_TOOLS = new ToolCombination(IcariaTiers.KASSITEROS);
	public static final ToolCombination ORICHALCUM_TOOLS = new ToolCombination(IcariaTiers.ORICHALCUM);
	public static final ToolCombination VANADIUMSTEEL_TOOLS = new ToolCombination(IcariaTiers.VANADIUMSTEEL);
	public static final ToolCombination SIDEROS_TOOLS = new ToolCombination(IcariaTiers.SIDEROS);
	public static final ToolCombination MOLYBDENUMSTEEL_TOOLS = new ToolCombination(IcariaTiers.MOLYBDENUMSTEEL);

	public static final RegistryObject<Item> OLIVES_BLACK = registerBasic("olives_black", () -> new Item(propertiesItems().food(foodPropertiesOlives())));
	public static final RegistryObject<Item> OLIVES_GREEN = registerBasic("olives_green", () -> new Item(propertiesItems().food(foodPropertiesOlives())));

	public static final RegistryObject<BucketItem> HYLIASTRUM_FLUID_BUCKET = registerBasic("hyliastrum_fluid_bucket", () -> new BucketItem(IcariaFluids.HYLIASTRUM_FLUID_SOURCE, propertiesBuckets()));
	public static final RegistryObject<BucketItem> MEDITERRANEAN_WATER_BUCKET = registerBasic("mediterranean_water_bucket", () -> new BucketItem(IcariaFluids.MEDITERRANEAN_WATER_SOURCE, propertiesBuckets()));
	public static final RegistryObject<BucketItem> UPWARDS_FLUID_BUCKET = registerBasic("upwards_fluid_bucket", () -> new BucketItem(IcariaFluids.UPWARDS_FLUID_SOURCE, propertiesBuckets()));

	private static Properties propertiesBlocks() {
		return new Properties().tab(IcariaTabs.creativeBlocks);
	}

	private static Properties propertiesFlora() {
		return new Properties().tab(IcariaTabs.creativeFlora);
	}

	private static Properties propertiesItems() {
		return new Properties().tab(IcariaTabs.creativeItems);
	}

	private static Properties propertiesVineSprout() {
		return new Properties().tab(IcariaTabs.creativeItems).setNoRepair().stacksTo(1).durability(24);
	}

	private static Properties propertiesBuckets() {
		return new Properties().tab(IcariaTabs.creativeItems).craftRemainder(Items.BUCKET).stacksTo(1);
	}

	private static FoodProperties foodPropertiesVineSprout() {
		return new Builder().nutrition(0).saturationMod(1.0F).alwaysEat().build();
	}

	private static FoodProperties foodPropertiesSpeltBread() {
		return new Builder().nutrition(5).saturationMod(0.6F).build();
	}

	private static FoodProperties foodPropertiesOlives() {
		return new Builder().nutrition(2).saturationMod(0.3F).build();
	}

	private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item) {
		return ITEMS.register(name, item);
	}

	private static <T extends Item> RegistryObject<T> registerBasic(final String name, final Supplier<T> item) {
		RegistryObject<T> registeredItem = register(name, item);
		BASIC_ITEMS.add(registeredItem);
		return registeredItem;
	}

	public static class StoneDecoItemBlocks {
		public final StoneDecoBlocks block;
		public final RegistryObject<Item> originalItem;
		public final RegistryObject<Item> SLAB;
		public final RegistryObject<Item> STAIRS;
		public final RegistryObject<Item> WALL;

		public StoneDecoItemBlocks(StoneDecoBlocks block, RegistryObject<Item> originalItem) {
			this.block = block;
			this.originalItem = originalItem;
			if (block.SLAB != null)
				SLAB = register(block.name + "_slab", () -> new BlockItem(block.SLAB.get(), propertiesBlocks()));
			else
				SLAB = null;
			if (block.STAIRS != null)
				STAIRS = register(block.name + "_stairs", () -> new BlockItem(block.STAIRS.get(), propertiesBlocks()));
			else
				STAIRS = null;
			if (block.WALL != null)
				WALL = register(block.name + "_wall", () -> new BlockItem(block.WALL.get(), propertiesBlocks()));
			else
				WALL = null;
			STONE_BLOCKS.add(this);
		}
	}

	public static class WoodDecoItemBlocks {
		public final WoodDecoBlocks block;
		public final RegistryObject<Item> originalItem;
		public final RegistryObject<Item> SLAB;
		public final RegistryObject<Item> STAIRS;
		public final RegistryObject<Item> FENCE;
		public final RegistryObject<Item> GATE;

		public WoodDecoItemBlocks(WoodDecoBlocks block, RegistryObject<Item> originalItem) {
			this.block = block;
			this.originalItem = originalItem;
			if (block.SLAB != null)
				SLAB = register(block.name + "_slab", () -> new BlockItem(block.SLAB.get(), propertiesFlora()));
			else
				SLAB = null;
			if (block.STAIRS != null)
				STAIRS = register(block.name + "_stairs", () -> new BlockItem(block.STAIRS.get(), propertiesFlora()));
			else
				STAIRS = null;
			if (block.FENCE != null)
				FENCE = register(block.name + "_fence", () -> new BlockItem(block.FENCE.get(), propertiesFlora()));
			else
				FENCE = null;
			if (block.GATE != null)
				GATE = register(block.name + "_fence_gate", () -> new BlockItem(block.GATE.get(), propertiesFlora()));
			else
				GATE = null;
			WOOD_BLOCKS.add(this);
		}
	}

	public static class ToolCombination {
		public final IcariaTier tier;
		public final RegistryObject<Item> SWORD;
		public final RegistryObject<Item> SHOVEL;
		public final RegistryObject<Item> PICKAXE;
		public final RegistryObject<Item> AXE;
		public final RegistryObject<Item> SCYTHE;
		public final RegistryObject<Item> BIDENT;

		public ToolCombination(IcariaTier tier) {
			this.tier = tier;
			String name = Objects.requireNonNull(TierSortingRegistry.getName(tier)).getPath();
			SWORD = register(name + "_sword", () -> new SwordItem(tier, 3, -2.4F, propertiesItems()));
			SHOVEL = register(name + "_shovel", () -> new IcariaShovelItem(tier, 1.5F, -3.0F, propertiesItems()));
			PICKAXE = register(name + "_pickaxe", () -> new IcariaPickaxeItem(tier, 1, -2.8F, propertiesItems()));
			AXE = register(name + "_axe", () -> new IcariaAxeItem(tier, 6.0F, -3.0F, propertiesItems()));
			SCYTHE = register(name + "_scythe", () -> new IcariaScytheItem(tier, 4, -2.8F, propertiesItems()));
			BIDENT = register(name + "_bident", () -> new IcariaBidentItem(tier, propertiesItems()));
			TOOLS.add(this);
		}
	}
}
