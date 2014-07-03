package com.jamesscape2.tubecraft.client.gui;

import com.jamesscape2.tubecraft.handler.ConfigurationHandler;
import com.jamesscape2.tubecraft.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

/**
 * Project Name: TubeCraft
 *
 * Package Name: com.jamesscape2.tubecraft.client.gui
 *
 * @author Jamesscape2
 */
public class ModGuiConfig extends GuiConfig
{
    public ModGuiConfig(GuiScreen parentScreen)
    {
        super(parentScreen, new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(), Reference.MOD_ID, false, false, GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
    }
}
