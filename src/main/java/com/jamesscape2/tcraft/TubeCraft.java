package com.jamesscape2.tcraft;

import com.jamesscape2.tcraft.handler.ConfigurationHandler;
import com.jamesscape2.tcraft.init.ModBlocks;
import com.jamesscape2.tcraft.init.ModItems;
import com.jamesscape2.tcraft.proxy.IProxy;
import com.jamesscape2.tcraft.reference.Reference;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Project Name: TubeCraft
 *
 * Package Name: com.jamesscape2.TubeCraft
 *
 * @author Jamesscape2
 */

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class TubeCraft
{
    @Mod.Instance(Reference.MOD_ID)
    public static TubeCraft instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        ModItems.init();
        ModBlocks.init();

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
