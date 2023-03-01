package net.nelzg.tutorialmod.thirst;

import net.minecraft.nbt.CompoundTag;

public class PlayerThirst {

    private int thirst;
    private final int MAX_THIRST = 10;
    private final int MIN_THIRST = 0;

    public int getThirst() {
        return thirst;
    }

    public void addThirst(int add) {
        this.thirst = Math.min(thirst + add, MAX_THIRST);
    }

    public void subThirst(int add) {
        this.thirst = Math.max(thirst - add, MIN_THIRST);
    }

    public void copyFrom(PlayerThirst source) {
        this.thirst = source.thirst;
    }

    public void saveNBTData(CompoundTag nbt) {
        nbt.putInt("thirst", thirst);
    }

    public void loadNBTData(CompoundTag nbt) {
        nbt.getInt("thirst");
    }

}
