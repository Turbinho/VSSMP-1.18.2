package com.turbina.vssmp.entity.client.armor;

import com.turbina.vssmp.VSSMP;
import com.turbina.vssmp.item.custom.GasMaskItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GasMaskModel extends AnimatedGeoModel<GasMaskItem> {
    @Override
    public ResourceLocation getModelLocation(GasMaskItem object) {
        return new ResourceLocation(VSSMP.MOD_ID, "geo/gas_mask.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(GasMaskItem object) {
        return new ResourceLocation(VSSMP.MOD_ID, "textures/models/armor/gas_mask_texture.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(GasMaskItem animatable) {
        return new ResourceLocation(VSSMP.MOD_ID, "animations/armor_animation.json");
    }
}
