package com.jamesscape2.tubecraft.handler;

import com.jamesscape2.tubecraft.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Project Name: TubeCraft
 *
 * Package Name: com.jamesscape2.tubecraft.configuration
 *
 * @author Jamesscape2
 */
public class ConfigurationHandler
{
    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init(File configFile)
    {
        if (configuration == null) {
            configuration = new Configuration(configFile);
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID)) {
            loadConfiguration();
        }
    }

    public void loadConfiguration()
    {
        testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "This is an example configuration value");

        if (configuration.hasChanged()) {
            configuration.save();
        }
    }



       /* try {
            // Load the configuration file
            configuration.load();

            // Read in properties for configuration file
            boolean configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "This is an example config value").getBoolean(true);
        }
        catch (Exception e){
            // Log the exception
        }
        finally {
            // Save the configuration file
            if(configuration.hasChanged())
                configuration.save();
        }*/

}
