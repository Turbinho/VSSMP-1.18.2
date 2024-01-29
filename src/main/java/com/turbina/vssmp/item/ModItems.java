package com.turbina.vssmp.item;

import com.turbina.vssmp.VSSMP;
import com.turbina.vssmp.item.custom.GasMaskItem;
import com.turbina.vssmp.item.custom.ModArmorMaterials;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, VSSMP.MOD_ID);

    public static final RegistryObject<ArmorItem> GAS_MASK = ITEMS.register("gas_mask",
            () -> new GasMaskItem(ModArmorMaterials.GAS_MASK, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.VSSMP)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
