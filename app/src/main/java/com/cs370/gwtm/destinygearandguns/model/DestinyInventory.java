package com.cs370.gwtm.destinygearandguns.model;

/**
 * Created by Daniel on 4/15/2015.
 * Model for storing Player's inventory,
 */
public class DestinyInventory {
    private String iconPath;
    private int itemHash;
    private int bindStatus;
    private boolean equippable;
    private int itemInstanceID;
    private int itemLevel;
    private int stackSize;
    private int qualityLevel;

    public DestinyInventory() {
        iconPath = "";
        itemHash = 0;
        bindStatus = 0;
        equippable = false;
        itemInstanceID = 0;
        itemLevel = 0;
        stackSize = 1;
        qualityLevel = 0;
    }

    public String getIconPath() {
        return iconPath;
    }

    public void getIconPath(String iconPath) {
        this.iconPath = iconPath;
    }

    public int getItemHash() {
        return itemHash;
    }

    public void getItemHash(int itemHash) {
        this.itemHash = itemHash;
    }

    public int getBindStatus() {
        return bindStatus;
    }

    public void getBindStatus(int bindStatus) {
        this.bindStatus = bindStatus;
    }

    public boolean getEquippable() {
        return equippable;
    }

    public void getEquippable(boolean equippable) {
        this.equippable = equippable;
    }

    public int getItemInstanceID() {
        return itemInstanceID;
    }

    public void getItemInstanceID(int itemInstanceID) {
        this.itemInstanceID = itemInstanceID;
    }

    public int getItemLevel() {
        return itemLevel;
    }

    public void getItemLevel(int itemLevel) {
        this.itemLevel = itemLevel;
    }

    public int getStackSize() {
        return itemHash;
    }

    public void getStackSize(int stackSize) {
        this.stackSize = stackSize;
    }

    public int getQualityLevel() {
        return qualityLevel;
    }

    public void getQualityLevel(int qualityLevel) {
        this.qualityLevel = qualityLevel;
    }

    @Override
    public String toString(){
        return String.format(" iconPath=%s \n itemHash=%d \n bindStatus=$d \n equippable=%b \n itemInstanceID=%d \n itemLevel=%d \n stackSize=%d \n qualityLevel=%d",
                iconPath, itemHash, bindStatus, equippable, itemInstanceID, itemLevel,stackSize, qualityLevel);
    }

}

