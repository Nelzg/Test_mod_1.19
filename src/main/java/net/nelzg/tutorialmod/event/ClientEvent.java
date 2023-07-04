package net.nelzg.tutorialmod.event;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.event.RegisterGuiOverlaysEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.nelzg.tutorialmod.TutorialMod;
import net.nelzg.tutorialmod.client.ThirstHudOverlay;
import net.nelzg.tutorialmod.networking.ModMessages;
import net.nelzg.tutorialmod.networking.packet.DrinkWaterC2SPacket;
import net.nelzg.tutorialmod.networking.packet.VerticalMovementC2SPacket;
import net.nelzg.tutorialmod.util.KeyBinding;

public class ClientEvent {
    @Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID, value = Dist.CLIENT)
    public static class ClientForgeEvents {
        public static boolean check_if_up_was_pressed = false;
        public static boolean check_if_down_was_pressed = false;

        @SubscribeEvent
        public static void onKeyInput(InputEvent event) {

            if(KeyBinding.DRINKING_KEY.consumeClick()) {
                //  Minecraft.getInstance().player.sendSystemMessage(Component.literal("Pressed a Key!"));
                ModMessages.sendToServer(new DrinkWaterC2SPacket());
            }

            if(KeyBinding.VERTICAL_MOVEMENT_UP.consumeClick() && !check_if_up_was_pressed) {
                ModMessages.sendToServer(new VerticalMovementC2SPacket(1));
                check_if_up_was_pressed = true;
            } else if (check_if_up_was_pressed && !KeyBinding.VERTICAL_MOVEMENT_UP.isDown()) {
                ModMessages.sendToServer(new VerticalMovementC2SPacket(0));
                check_if_up_was_pressed = false;
            }

            if(KeyBinding.VERTICAL_MOVEMENT_DOWN.consumeClick() && !check_if_down_was_pressed) {
                ModMessages.sendToServer(new VerticalMovementC2SPacket(-1));
                check_if_down_was_pressed = true;
            } else if (check_if_down_was_pressed && !KeyBinding.VERTICAL_MOVEMENT_DOWN.isDown()) {
                ModMessages.sendToServer(new VerticalMovementC2SPacket(0));
                check_if_down_was_pressed = false;
            }
        }
    }
    @Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModBusEvents {
        @SubscribeEvent
        public static void onKeyRegister(RegisterKeyMappingsEvent event) {
            event.register(KeyBinding.DRINKING_KEY);
            event.register(KeyBinding.VERTICAL_MOVEMENT_UP);
            event.register(KeyBinding.VERTICAL_MOVEMENT_DOWN);
        }

        @SubscribeEvent
        public static void registerGuiOverlays(RegisterGuiOverlaysEvent event) {
            event.registerAboveAll("thirst", ThirstHudOverlay.HUD_THIRST);
        }
    }
}
