package net.nelzg.tutorialmod.networking.packet;

import net.minecraft.ChatFormatting;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.network.NetworkEvent;
import net.nelzg.tutorialmod.entity.custom.IliyaMountEntity;
import net.nelzg.tutorialmod.networking.ModMessages;
import net.nelzg.tutorialmod.thirst.PlayerThirstProvider;

import java.util.function.Supplier;

public class VerticalMovementC2SPacket {
    float type=0.0f;

    private static final String MESSAGE_VERTICAL_MOVEMENT = "message.tutorialmod.drink_water";
    private static final String MESSAGE_NO_WATER = "message.tutorialmod.no_water";

    public VerticalMovementC2SPacket(float type) {
        this.type = type;
    }

    public VerticalMovementC2SPacket(FriendlyByteBuf buf) {
        this.type = buf.readFloat();
    }

    public void toBytes(FriendlyByteBuf buf) {
        buf.writeFloat(type);
    }

    public boolean handle(Supplier<NetworkEvent.Context> supplier) {
        NetworkEvent.Context context = supplier.get();
        context.enqueueWork(() -> {

            ServerPlayer player = context.getSender();

            if ((player.getVehicle()) instanceof IliyaMountEntity) {
                if (type == -1) {
                    (player.getVehicle()).getPersistentData().putFloat("VerticalMovement", -1.0F);
                }
                if (type == 0) {
                    (player.getVehicle()).getPersistentData().putFloat("VerticalMovement", 0.0F);
                }
                if (type == 1) {
                    (player.getVehicle()).getPersistentData().putFloat("VerticalMovement", 1.0F);
                }
            }
        });
        return true;
    }
}
