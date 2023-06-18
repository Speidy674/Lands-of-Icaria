package com.axanthic.icaria.common.item;

import com.axanthic.icaria.common.registry.IcariaEntityTypes;
import com.axanthic.icaria.common.registry.IcariaItems;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;

import javax.annotation.ParametersAreNonnullByDefault;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class HyliastrumVialItem extends Item {
    public HyliastrumVialItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        var blockPos = pContext.getClickedPos();
        var itemStack = pContext.getItemInHand();
        var level = pContext.getLevel();
        var player = pContext.getPlayer();
        var entity = IcariaEntityTypes.HYLIASTER.get().create(level);
        if (!(level instanceof ServerLevel)) {
            level.playSound(player, blockPos, SoundEvents.BOTTLE_EMPTY, SoundSource.NEUTRAL, 1.0F, 1.0F);
            return InteractionResult.SUCCESS;
        } else {
            if (entity != null) {
                entity.moveTo(blockPos.relative(pContext.getClickedFace()), 0.0F, 0.0F);
                entity.setSize(1);
                level.addFreshEntity(entity);
            }

            if (player != null) {
                if (itemStack.isEmpty()) {
                    player.setItemInHand(player.getUsedItemHand(), new ItemStack(IcariaItems.EMPTY_VIAL.get()));
                } else if (!player.getInventory().add(new ItemStack(IcariaItems.EMPTY_VIAL.get()))) {
                    player.drop(new ItemStack(IcariaItems.EMPTY_VIAL.get()), false);
                }
            }

            itemStack.shrink(1);
            return InteractionResult.CONSUME;
        }
    }
}
