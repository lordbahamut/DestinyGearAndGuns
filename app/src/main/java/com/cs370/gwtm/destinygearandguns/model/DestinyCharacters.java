package com.cs370.gwtm.destinygearandguns.model;

import java.util.ArrayList;

/**
 * Created by Kiladre on 4/14/15.
 * Model for storing character information
 */
public class DestinyCharacters {
    private String characterId;
    private int membershipType;
    private String membershipId;
    private String level;
    //private boolean deleted;
    private ArrayList<DestinyCharacters> destinyCharacters;

    public DestinyCharacters(String characterId) {
        this.characterId = characterId;
        //this.level = level;
        //deleted = false;
    }

    public int getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(int membershipType) {
        this.membershipType = membershipType;
    }

    public String getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(String membershipId) {
        this.membershipId = membershipId;
    }

    public void setCharacterId(String characterId) {
        this.characterId = characterId;
    }

    public String getCharacterId() {
        return characterId;
    }

//    public String getLevel() { return level; }

//    public void setLevel(String level) { this.level = level; }

    // public void setDeleted(boolean deleted) { this.deleted = deleted; }

    // public boolean getDeleted() { return deleted; }

    public ArrayList<DestinyCharacters> getDestinyCharacters() { return destinyCharacters; }

    public void setDestinyCharacters(ArrayList<DestinyCharacters> destinyCharacters) {
        this.destinyCharacters = destinyCharacters;
    }

    @Override
    public String toString() {
        return String.format("%s", characterId);
    }
}
