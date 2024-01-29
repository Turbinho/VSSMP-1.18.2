package com.turbina.vssmp.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab VSSMP = new CreativeModeTab("vssmp") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.GAS_MASK.get());
        }
    };
}
