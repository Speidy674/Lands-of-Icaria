package com.axanthic.icaria.data.loot;

import com.axanthic.icaria.common.registry.IcariaItems;
import com.axanthic.icaria.common.registry.IcariaResourceLocations;

import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.functions.SetItemDamageFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.function.BiConsumer;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault

public class IcariaLootVaseLoot implements LootTableSubProvider {
    @Override
    public void generate(BiConsumer<ResourceLocation, LootTable.Builder> pConsumer) {
        pConsumer.accept(IcariaResourceLocations.RED_LOOT_VASE_LOOT, LootTable.lootTable()
            .withPool(LootPool.lootPool().setRolls(UniformGenerator.between(1.0F, 5.0F))
                .add(LootItem.lootTableItem(IcariaItems.LOAM_LUMP.get()).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F))))
                .add(LootItem.lootTableItem(IcariaItems.CHERT.get()).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F))))
                .add(LootItem.lootTableItem(IcariaItems.ARACHNE_STRING.get()).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F))))
                .add(LootItem.lootTableItem(IcariaItems.VINE_REED.get()).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F))))
                .add(LootItem.lootTableItem(IcariaItems.ROTTEN_BONES.get()).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F))))
                .add(LootItem.lootTableItem(IcariaItems.LIGNITE.get()).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F))))
                .add(LootItem.lootTableItem(IcariaItems.RAW_CHALKOS.get()).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F))))
                .add(LootItem.lootTableItem(IcariaItems.RAW_KASSITEROS.get()).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F))))
                .add(LootItem.lootTableItem(IcariaItems.DOLOMITE.get()).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F))))
                .add(LootItem.lootTableItem(IcariaItems.CHALKOS_NUGGET.get()).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F))))
                .add(LootItem.lootTableItem(IcariaItems.KASSITEROS_NUGGET.get()).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F))))
                .add(LootItem.lootTableItem(IcariaItems.ORICHALCUM_NUGGET.get()).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F))))
                .add(LootItem.lootTableItem(IcariaItems.VANADIUM_NUGGET.get()).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F))))
                .add(LootItem.lootTableItem(IcariaItems.CHERT_TOOLS.sword.get()).apply(SetItemDamageFunction.setDamage(UniformGenerator.between(0.1F, 0.9F))))
                .add(LootItem.lootTableItem(IcariaItems.CHERT_TOOLS.dagger.get()).apply(SetItemDamageFunction.setDamage(UniformGenerator.between(0.1F, 0.9F))))
                .add(LootItem.lootTableItem(IcariaItems.CHERT_TOOLS.shovel.get()).apply(SetItemDamageFunction.setDamage(UniformGenerator.between(0.1F, 0.9F))))
                .add(LootItem.lootTableItem(IcariaItems.CHERT_TOOLS.pickaxe.get()).apply(SetItemDamageFunction.setDamage(UniformGenerator.between(0.1F, 0.9F))))
                .add(LootItem.lootTableItem(IcariaItems.CHERT_TOOLS.axe.get()).apply(SetItemDamageFunction.setDamage(UniformGenerator.between(0.1F, 0.9F))))
                .add(LootItem.lootTableItem(IcariaItems.CHERT_TOOLS.scythe.get()).apply(SetItemDamageFunction.setDamage(UniformGenerator.between(0.1F, 0.9F))))
                .add(LootItem.lootTableItem(IcariaItems.CHERT_TOOLS.bident.get()).apply(SetItemDamageFunction.setDamage(UniformGenerator.between(0.1F, 0.9F))))
                .add(LootItem.lootTableItem(IcariaItems.CHALKOS_TOOLS.sword.get()).apply(SetItemDamageFunction.setDamage(UniformGenerator.between(0.1F, 0.9F))))
                .add(LootItem.lootTableItem(IcariaItems.CHALKOS_TOOLS.dagger.get()).apply(SetItemDamageFunction.setDamage(UniformGenerator.between(0.1F, 0.9F))))
                .add(LootItem.lootTableItem(IcariaItems.CHALKOS_TOOLS.shovel.get()).apply(SetItemDamageFunction.setDamage(UniformGenerator.between(0.1F, 0.9F))))
                .add(LootItem.lootTableItem(IcariaItems.CHALKOS_TOOLS.pickaxe.get()).apply(SetItemDamageFunction.setDamage(UniformGenerator.between(0.1F, 0.9F))))
                .add(LootItem.lootTableItem(IcariaItems.CHALKOS_TOOLS.axe.get()).apply(SetItemDamageFunction.setDamage(UniformGenerator.between(0.1F, 0.9F))))
                .add(LootItem.lootTableItem(IcariaItems.CHALKOS_TOOLS.scythe.get()).apply(SetItemDamageFunction.setDamage(UniformGenerator.between(0.1F, 0.9F))))
                .add(LootItem.lootTableItem(IcariaItems.CHALKOS_TOOLS.bident.get()).apply(SetItemDamageFunction.setDamage(UniformGenerator.between(0.1F, 0.9F))))
                .add(LootItem.lootTableItem(IcariaItems.KASSITEROS_TOOLS.dagger.get()).apply(SetItemDamageFunction.setDamage(UniformGenerator.between(0.1F, 0.9F))))
                .add(LootItem.lootTableItem(IcariaItems.ANTI_GRAVITY_SPELL.get()).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F))))
                .add(LootItem.lootTableItem(IcariaItems.FORTIFYING_SPELL.get()).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F))))
                .add(LootItem.lootTableItem(IcariaItems.FREEZING_SPELL.get()).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F))))
                .add(LootItem.lootTableItem(IcariaItems.AETERNAE_HIDE.get()).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F))))
            )
        );

        pConsumer.accept(IcariaResourceLocations.CYAN_LOOT_VASE_LOOT, LootTable.lootTable()
            .withPool(LootPool.lootPool().setRolls(UniformGenerator.between(1.0F, 5.0F))
                .add(LootItem.lootTableItem(IcariaItems.BONE_REMAINS.get()).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F))))
                .add(LootItem.lootTableItem(IcariaItems.CALCITE_SHARD.get()).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F))))
                .add(LootItem.lootTableItem(IcariaItems.HALITE_SHARD.get()).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F))))
                .add(LootItem.lootTableItem(IcariaItems.JASPER_SHARD.get()).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F))))
                .add(LootItem.lootTableItem(IcariaItems.ZIRCON_SHARD.get()).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F))))
                .add(LootItem.lootTableItem(IcariaItems.DOLOMITE.get()).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F))))
                .add(LootItem.lootTableItem(IcariaItems.RAW_VANADIUM.get()).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F))))
                .add(LootItem.lootTableItem(IcariaItems.ANTHRACITE.get()).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F))))
                .add(LootItem.lootTableItem(IcariaItems.VANADIUMSTEEL_NUGGET.get()).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F))))
                .add(LootItem.lootTableItem(IcariaItems.SIDEROS_NUGGET.get()).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F))))
                .add(LootItem.lootTableItem(IcariaItems.CHALKOS_INGOT.get()).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F))))
                .add(LootItem.lootTableItem(IcariaItems.KASSITEROS_INGOT.get()).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F))))
                .add(LootItem.lootTableItem(IcariaItems.KASSITEROS_TOOLS.sword.get()).apply(SetItemDamageFunction.setDamage(UniformGenerator.between(0.1F, 0.9F))))
                .add(LootItem.lootTableItem(IcariaItems.KASSITEROS_TOOLS.dagger.get()).apply(SetItemDamageFunction.setDamage(UniformGenerator.between(0.1F, 0.9F))))
                .add(LootItem.lootTableItem(IcariaItems.KASSITEROS_TOOLS.shovel.get()).apply(SetItemDamageFunction.setDamage(UniformGenerator.between(0.1F, 0.9F))))
                .add(LootItem.lootTableItem(IcariaItems.KASSITEROS_TOOLS.pickaxe.get()).apply(SetItemDamageFunction.setDamage(UniformGenerator.between(0.1F, 0.9F))))
                .add(LootItem.lootTableItem(IcariaItems.KASSITEROS_TOOLS.axe.get()).apply(SetItemDamageFunction.setDamage(UniformGenerator.between(0.1F, 0.9F))))
                .add(LootItem.lootTableItem(IcariaItems.KASSITEROS_TOOLS.scythe.get()).apply(SetItemDamageFunction.setDamage(UniformGenerator.between(0.1F, 0.9F))))
                .add(LootItem.lootTableItem(IcariaItems.KASSITEROS_TOOLS.bident.get()).apply(SetItemDamageFunction.setDamage(UniformGenerator.between(0.1F, 0.9F))))
                .add(LootItem.lootTableItem(IcariaItems.ORICHALCUM_TOOLS.dagger.get()).apply(SetItemDamageFunction.setDamage(UniformGenerator.between(0.1F, 0.9F))))
                .add(LootItem.lootTableItem(IcariaItems.HEALING_SPELL.get()).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F))))
                .add(LootItem.lootTableItem(IcariaItems.BUBBLE_SPELL.get()).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F))))
                .add(LootItem.lootTableItem(IcariaItems.MAGIC_MISSILE_SPELL.get()).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F))))
                .add(LootItem.lootTableItem(IcariaItems.BLUE_GEARFRAGMENT.get()))
                .add(LootItem.lootTableItem(IcariaItems.GREEN_GEARFRAGMENT.get()))
                .add(LootItem.lootTableItem(IcariaItems.YELLOW_GEARFRAGMENT.get())))
            .withPool(LootPool.lootPool().when(LootItemRandomChanceCondition.randomChance(0.1F))
                .add(LootItem.lootTableItem(IcariaItems.ANTI_GRAVITY_SCROLL.get()))
                .add(LootItem.lootTableItem(IcariaItems.FORTIFYING_SCROLL.get()))
                .add(LootItem.lootTableItem(IcariaItems.HEALING_SCROLL.get()))
                .add(LootItem.lootTableItem(IcariaItems.BUBBLE_SCROLL.get()))
                .add(LootItem.lootTableItem(IcariaItems.FREEZING_SCROLL.get()))
                .add(LootItem.lootTableItem(IcariaItems.MAGIC_MISSILE_SCROLL.get()))
            )
        );
    }
}
