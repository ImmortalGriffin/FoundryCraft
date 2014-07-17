package com.utoxin.foundrycraft.creativetab;

import com.utoxin.foundrycraft.init.ModItems;
import com.utoxin.foundrycraft.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabFC {
	public static final CreativeTabs FC_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
		@Override
		public Item getTabIconItem() {
			return ModItems.handBell;
		}
	};
}
