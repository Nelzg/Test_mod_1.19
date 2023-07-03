package net.nelzg.tutorialmod.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.nelzg.tutorialmod.TutorialMod;
import net.nelzg.tutorialmod.entity.custom.RedBeastEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class RedBeastModel extends AnimatedGeoModel<RedBeastEntity> {
    @Override
    public ResourceLocation getModelResource(RedBeastEntity object) {
        return new ResourceLocation(TutorialMod.MOD_ID, "geo/red_beast.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(RedBeastEntity object) {
        return new ResourceLocation(TutorialMod.MOD_ID, "textures/entity/red_beast_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(RedBeastEntity animatable) {
        return new ResourceLocation(TutorialMod.MOD_ID, "animations/red_beast.animation.json");
    }
}