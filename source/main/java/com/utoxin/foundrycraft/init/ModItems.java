package com.utoxin.foundrycraft.init;

import com.utoxin.foundrycraft.item.ItemFC;
import com.utoxin.foundrycraft.item.ItemHandBell;
import com.utoxin.foundrycraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
	public static final ItemFC handBell = new ItemHandBell();

	public static void init() {
		GameRegistry.registerItem(handBell, "handBell");
	}
}
