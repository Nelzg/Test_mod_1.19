package net.nelzg.tutorialmod.sound;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nelzg.tutorialmod.TutorialMod;

import javax.swing.plaf.PanelUI;

public class ModSoundsClass {

    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, TutorialMod.MOD_ID);

    public static final RegistryObject<SoundEvent> IGOR_SAW =
            registerSoundEvent("igor_saw");
    public static final RegistryObject<SoundEvent> IGOR_WALK =
            registerSoundEvent("igor_walk");

    public static final RegistryObject<SoundEvent> IGOR_AMBIENT =
            registerSoundEvent("igor_ambient");

    public static final RegistryObject<SoundEvent> IGOR_HURT =
            registerSoundEvent("igor_hurt");

    public static final RegistryObject<SoundEvent> IGOR_DEATH =
            registerSoundEvent("igor_death");

    public static final RegistryObject<SoundEvent> SLAVA_AMBIENT =
            registerSoundEvent("slava_ambient");

    public static final RegistryObject<SoundEvent> SLAVA_HURT =
            registerSoundEvent("slava_hurt");

    public static final RegistryObject<SoundEvent> SLAVA_DEATH =
            registerSoundEvent("slava_death");

    public static final RegistryObject<SoundEvent> ILIYA_WALK =
            registerSoundEvent("iliya_walk");
    public static final RegistryObject<SoundEvent> ILIYA_AMBIENT =
            registerSoundEvent("iliya_ambient");

    public static final RegistryObject<SoundEvent> ILIYA_HURT =
            registerSoundEvent("iliya_hurt");

    public static final RegistryObject<SoundEvent> ILIYA_DEATH =
            registerSoundEvent("iliya_death");
    public static final RegistryObject<SoundEvent> ILIYA_AGRESSION =
            registerSoundEvent("iliya_agression");

    public static final RegistryObject<SoundEvent> ILIYA_MOUNT_IDLE =
            registerSoundEvent("iliya_mount_idle");

    public static final RegistryObject<SoundEvent> ILIYA_MOUNT_RIDE =
            registerSoundEvent("iliya_mount_ride");

    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(TutorialMod.MOD_ID, name)));
    }
    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
