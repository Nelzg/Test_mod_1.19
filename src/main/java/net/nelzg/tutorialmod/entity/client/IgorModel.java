package net.nelzg.tutorialmod.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.nelzg.tutorialmod.TutorialMod;
import net.nelzg.tutorialmod.entity.custom.IgorEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class IgorModel extends AnimatedGeoModel<IgorEntity> {
    @Override
    public ResourceLocation getModelResource(IgorEntity object) {
        return new ResourceLocation(TutorialMod.MOD_ID, "geo/igor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(IgorEntity object) {
        return new ResourceLocation(TutorialMod.MOD_ID, "textures/entity/igor_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(IgorEntity animatable) {
        return new ResourceLocation(TutorialMod.MOD_ID, "animations/igor.animation.json");
    }
}