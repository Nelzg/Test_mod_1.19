package net.nelzg.tutorialmod.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.nelzg.tutorialmod.TutorialMod;
import net.nelzg.tutorialmod.entity.custom.IliyaMountEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class IliyaMountModel extends AnimatedGeoModel<IliyaMountEntity> {
    @Override
    public ResourceLocation getModelResource(IliyaMountEntity object) {
        return new ResourceLocation(TutorialMod.MOD_ID, "geo/iliya_mount.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(IliyaMountEntity object) {
        return new ResourceLocation(TutorialMod.MOD_ID, "textures/entity/iliya_mount_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(IliyaMountEntity animatable) {
        return new ResourceLocation(TutorialMod.MOD_ID, "animations/iliya_mount.animation.json");
    }
}