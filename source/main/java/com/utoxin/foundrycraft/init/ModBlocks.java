package com.utoxin.foundrycraft.init;

import com.utoxin.foundrycraft.block.BlockCopperOre;
import com.utoxin.foundrycraft.block.BlockFC;
import com.utoxin.foundrycraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
	public static final BlockFC copperOre = new BlockCopperOre();

	public static void init() {
		GameRegistry.registerBlock(copperOre, "copperOre");
	}
}
