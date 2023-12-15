package com.axanthic.icaria.common.item;

import com.axanthic.icaria.common.registry.IcariaEntityTypes;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.world.entity.EntityType;

@MethodsReturnNonnullByDefault

public class HealingSpellItem extends SpellItem {
    public HealingSpellItem(Properties pProperties, float pInaccuracy, float pVelocity, int pColor, int pCooldown) {
        super(pProperties, pInaccuracy, pVelocity, pColor, pCooldown);
    }

    @Override
    public EntityType<?> getEntity() {
        return IcariaEntityTypes.HEALING_SPELL.get();
    }
}
