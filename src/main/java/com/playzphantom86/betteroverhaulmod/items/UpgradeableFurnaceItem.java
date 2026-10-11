package com.playzphantom86.betteroverhaulmod.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.network.chat.Component;

public class UpgradeableFurnaceItem extends Item {
    
    public UpgradeableFurnaceItem() {
        super(new Item.Properties()
            .tab(CreativeModeTab.TAB_TOOLS)
            .durability(1000)
        );
    }
    
    @Override
    public InteractionResult use(Level level, Player player, InteractionHand hand) {
        if (!level.isClientSide) {
            player.sendSystemMessage(Component.literal("Upgradeable Furnace activated! Right-click to open."));
        }
        return InteractionResult.SUCCESS;
    }
}