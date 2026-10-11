package com.playzphantom86.betteroverhaulmod;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod("betteroverhaulmod")
public class BetterOverhaulMod {
    public static final String MOD_ID = "betteroverhaulmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public BetterOverhaulMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register deferred registers
        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);
        ModCreativeTabs.register(modEventBus);

        // Register event handlers
        MinecraftForge.EVENT_BUS.register(this);

        LOGGER.info("BetterOverhaulMod has been initialized!");
    }
}