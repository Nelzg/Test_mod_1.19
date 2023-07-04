package net.nelzg.tutorialmod.util;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.client.settings.KeyConflictContext;
import net.nelzg.tutorialmod.networking.ModMessages;
import net.nelzg.tutorialmod.networking.packet.VerticalMovementC2SPacket;
import org.lwjgl.glfw.GLFW;

public class KeyBinding {

    public static final String KEY_CATEGORY_TUTORIAL = "key.category.tutorialmod.tutorial";
    public static final String KEY_DRINK_WATER = "key.tutorialmod.drink_water";

    public static final KeyMapping DRINKING_KEY = new KeyMapping(KEY_DRINK_WATER, KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_O, KEY_CATEGORY_TUTORIAL);

    public static final String KEY_VERTICAL_MOVEMENT_UP = "key.tutorialmod.vertical_movement_up";
    public static final String KEY_VERTICAL_MOVEMENT_DOWN = "key.tutorialmod.vertical_movement_down";

    public static final KeyMapping VERTICAL_MOVEMENT_UP = new KeyMapping(KEY_VERTICAL_MOVEMENT_UP, KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_SPACE, KEY_CATEGORY_TUTORIAL);

    public static final KeyMapping VERTICAL_MOVEMENT_DOWN = new KeyMapping(KEY_VERTICAL_MOVEMENT_DOWN, KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_LEFT_CONTROL, KEY_CATEGORY_TUTORIAL);

}
