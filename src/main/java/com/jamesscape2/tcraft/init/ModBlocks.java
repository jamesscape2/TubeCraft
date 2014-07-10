package com.jamesscape2.tcraft.init;

import com.jamesscape2.tcraft.block.BlockFlag;
import com.jamesscape2.tcraft.block.BlockTCraft;
import com.jamesscape2.tcraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Project Name: TubeCraft
 *
 * Package Name: com.jamesscape2.tubecraft.init
 *
 * @author Jamesscape2
 */

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockTCraft flag = new BlockFlag();

    public static void init()
    {
        GameRegistry.registerBlock(flag, "Flag");
    }

}
