package com.jamesscape2.tcraft.init;

import com.jamesscape2.tcraft.item.ItemMapleLeaf;
import com.jamesscape2.tcraft.item.ItemTCraft;
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
public class ModItems
{
    public static final ItemTCraft mapleLeaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }


}
