package net.nelzg.tutorialmod.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.nelzg.tutorialmod.TutorialMod;
import net.nelzg.tutorialmod.entity.custom.SlavaEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SlavaModel extends AnimatedGeoModel<SlavaEntity> {
    @Override
    public ResourceLocation getModelResource(SlavaEntity object) {
        return new ResourceLocation(TutorialMod.MOD_ID, "geo/slava.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SlavaEntity object) {
        return new ResourceLocation(TutorialMod.MOD_ID, "textures/entity/slava_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(SlavaEntity animatable) {
        return new ResourceLocation(TutorialMod.MOD_ID, "animations/slava.animation.json");
    }
}