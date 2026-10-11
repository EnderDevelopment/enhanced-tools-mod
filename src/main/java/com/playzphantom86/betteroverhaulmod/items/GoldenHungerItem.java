package com.playzphantom86.betteroverhaulmod.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.network.chat.Component;

public class GoldenHungerItem extends Item {
    
    public GoldenHungerItem() {
        super(new Item.Properties()
            .tab(CreativeModeTab.TAB_FOOD)
            .stacksTo(64)
        );
    }
    
    @Override
    public InteractionResult use(Level level, Player player, InteractionHand hand) {
        if (!level.isClientSide) {
            player.sendSystemMessage(Component.literal("Golden Hunger activated! Custom resource restored."));
        }
        return InteractionResult.SUCCESS;
    }
}