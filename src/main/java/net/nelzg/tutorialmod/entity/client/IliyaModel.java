package net.nelzg.tutorialmod.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.nelzg.tutorialmod.TutorialMod;
import net.nelzg.tutorialmod.entity.custom.IliyaEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class IliyaModel extends AnimatedGeoModel<IliyaEntity> {
    @Override
    public ResourceLocation getModelResource(IliyaEntity object) {
        return new ResourceLocation(TutorialMod.MOD_ID, "geo/iliya.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(IliyaEntity object) {
        return new ResourceLocation(TutorialMod.MOD_ID, "textures/entity/iliya_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(IliyaEntity animatable) {
        return new ResourceLocation(TutorialMod.MOD_ID, "animations/iliya.animation.json");
    }
}