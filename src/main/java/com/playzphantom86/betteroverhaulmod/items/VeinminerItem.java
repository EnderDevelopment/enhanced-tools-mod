package com.playzphantom86.betteroverhaulmod.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;

public class VeinminerItem extends SwordItem {
    
    public VeinminerItem() {
        super(Tiers.DIAMOND, 5, -2.4f,
            new Item.Properties()
                .tab(CreativeModeTab.TAB_TOOLS)
                .durability(2000)
        );
    }
    
    @Override
    public InteractionResult use(Level level, Player player, InteractionHand hand) {
        if (!level.isClientSide) {
            player.sendSystemMessage(Component.literal("Veinminer activated! Crouch to mine connected blocks."));
        }
        return InteractionResult.SUCCESS;
    }
}