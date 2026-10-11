package com.playzphantom86.betteroverhaulmod.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.network.chat.Component;

public class CustomFoodItem extends Item {
    
    public CustomFoodItem() {
        super(new Item.Properties()
            .tab(CreativeModeTab.TAB_FOOD)
            .food(new FoodProperties.Builder()
                .nutrition(4)
                .saturationMod(0.3f)
                .build())
        );
    }
    
    @Override
    public InteractionResult use(Level level, Player player, InteractionHand hand) {
        if (!level.isClientSide) {
            player.sendSystemMessage(Component.literal("You ate a custom food item!"));
        }
        return InteractionResult.SUCCESS;
    }
}