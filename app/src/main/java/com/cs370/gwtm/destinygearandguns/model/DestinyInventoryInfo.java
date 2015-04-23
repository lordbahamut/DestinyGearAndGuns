package com.cs370.gwtm.destinygearandguns.model;

/**
 * Created by Daniel on 4/17/2015.
 */
public class DestinyInventoryInfo {
    String iconPath = "";
    int itemHash = 0;
    int bindStatus = 0;
    boolean equippable = false;
    int itemInstanceID = 0;
    int itemLevel = 0;
    int stackSize = 1;
    int qualityLevel = 0;

    public DestinyInventoryInfo() {
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
}

