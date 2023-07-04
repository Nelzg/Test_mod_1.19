package net.nelzg.tutorialmod.entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nelzg.tutorialmod.TutorialMod;
import net.nelzg.tutorialmod.entity.custom.*;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, TutorialMod.MOD_ID);

    public static final RegistryObject<EntityType<ChomperEntity>> CHOMPER =
            ENTITY_TYPES.register("chomper",
                    () -> EntityType.Builder.of(ChomperEntity::new, MobCategory.MONSTER)
                            .sized(0.4f, 1.5f)
                            .build(new ResourceLocation(TutorialMod.MOD_ID, "chomper").toString()));

    public static final RegistryObject<EntityType<RedBeastEntity>> RED_BEAST =
            ENTITY_TYPES.register("red_beast",
                    () -> EntityType.Builder.of(RedBeastEntity::new, MobCategory.MONSTER)
                            .sized(0.4f, 1.5f)
                            .build(new ResourceLocation(TutorialMod.MOD_ID, "red_beast").toString()));

    public static final RegistryObject<EntityType<IgorEntity>> IGOR =
            ENTITY_TYPES.register("igor",
                    () -> EntityType.Builder.of(IgorEntity::new, MobCategory.MONSTER)
                            .sized(0.4f, 1.5f)
                            .build(new ResourceLocation(TutorialMod.MOD_ID, "igor").toString()));

    public static final RegistryObject<EntityType<SlavaEntity>> SLAVA =
            ENTITY_TYPES.register("slava",
                    () -> EntityType.Builder.of(SlavaEntity::new, MobCategory.MONSTER)
                            .sized(0.4f, 1.5f)
                            .build(new ResourceLocation(TutorialMod.MOD_ID, "slava").toString()));

    public static final RegistryObject<EntityType<IliyaEntity>> ILIYA =
            ENTITY_TYPES.register("iliya",
                    () -> EntityType.Builder.of(IliyaEntity::new, MobCategory.MONSTER)
                            .sized(0.4f, 1.5f)
                            .build(new ResourceLocation(TutorialMod.MOD_ID, "iliya").toString()));

    public static final RegistryObject<EntityType<IliyaMountEntity>> ILIYA_MOUNT =
            ENTITY_TYPES.register("iliya_mount",
                    () -> EntityType.Builder.of(IliyaMountEntity::new, MobCategory.AMBIENT)
                            .sized(0.4f, 1.5f)
                            .build(new ResourceLocation(TutorialMod.MOD_ID, "iliya_mount").toString()));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
