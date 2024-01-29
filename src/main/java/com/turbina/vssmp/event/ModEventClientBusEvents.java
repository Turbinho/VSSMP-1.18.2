package com.turbina.vssmp.event;


import com.turbina.vssmp.VSSMP;
import com.turbina.vssmp.entity.client.armor.GasMaskRenderer;
import com.turbina.vssmp.item.custom.GasMaskItem;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

@Mod.EventBusSubscriber(modid = VSSMP.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventClientBusEvents {
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event){
    }
    @SubscribeEvent
    public static void registerArmorRenderers(final EntityRenderersEvent.AddLayers event){
        GeoArmorRenderer.registerArmorRenderer(GasMaskItem.class, new GasMaskRenderer());
    }
}
