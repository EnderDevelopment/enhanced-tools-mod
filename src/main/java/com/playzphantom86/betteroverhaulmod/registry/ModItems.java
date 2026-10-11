package com.playzphantom86.betteroverhaulmod.registry;

import com.playzphantom86.betteroverhaulmod.BetterOverhaulMod;
import com.playzphantom86.betteroverhaulmod.items.VeinminerItem;
import com.playzphantom86.betteroverhaulmod.items.GoldenHungerItem;
import com.playzphantom86.betteroverhaulmod.items.UpgradeableBackpackItem;
import com.playzphantom86.betteroverhaulmod.items.UpgradeableFurnaceItem;
import com.playzphantom86.betteroverhaulmod.items.CustomFoodItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = 
        DeferredRegister.create(ForgeRegistries.ITEMS, BetterOverhaulMod.MOD_ID);
    
    public static final RegistryObject<Item> VEINMINER = ITEMS.register(
        "veinminer", 
        VeinminerItem::new
    );
    
    public static final RegistryObject<Item> GOLDEN_HUNGER = ITEMS.register(
        "golden_hunger", 
        GoldenHungerItem::new
    );
    
    public static final RegistryObject<Item> UPGRADEABLE_BACKPACK = ITEMS.register(
        "upgradeable_backpack", 
        UpgradeableBackpackItem::new
    );
    
    public static final RegistryObject<Item> UPGRADEABLE_FURNACE = ITEMS.register(
        "upgradeable_furnace", 
        UpgradeableFurnaceItem::new
    );
    
    public static final RegistryObject<Item> CUSTOM_FOOD = ITEMS.register(
        "custom_food", 
        CustomFoodItem::new
    );
}