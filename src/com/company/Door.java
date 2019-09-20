package com.company;

import java.util.HashMap;

public class Door {
    private boolean isInterior;     // interior or exterior
    private boolean isLockable;     // exterior dooors, bathroom doors, and bedroom doors only
    private String location;        // where is the door located, front, back, side, or part of a room
    private boolean doorType;       // plain, fancy, sturdy, solid, has windows
    private HashMap<String, Double> optionCost = new HashMap<>();
    private HashMap<String, Integer> selection = new HashMap<>();

    public Integer chooseFloor(String dr) {
        selection.put("plain", 0);
        selection.put("solid", 1);
        selection.put("sturdy", 2);
        selection.put("has windows", 3);
        selection.put("fancy", 4);

        return selection.get(dr);
    }

    public Double getOptionCost(String str) {
        optionCost.put("plain", 0.0);
        optionCost.put("solid", 50.0);
        optionCost.put("sturdy", 75.0);
        optionCost.put("has windows", 100.0);
        optionCost.put("fancy", 150.0);

        return optionCost.get(str);
    }

    // Constructors
    public Door() {
    }

    public Door(boolean isInterior, boolean isLockable, String location, boolean doorType) {
        this.isInterior = isInterior;
        this.isLockable = isLockable;
        this.location = location;
        this.doorType = doorType;
    }

    // Getters and Setters
    public boolean isInterior() {
        return isInterior;
    }
    public void setInterior(boolean interior) {
        isInterior = interior;
    }

    public boolean isLockable() {
        return isLockable;
    }
    public void setLockable(boolean lockable) {
        isLockable = lockable;
    }

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isDoorType() {
        return doorType;
    }
    public void setDoorType(boolean doorType) {
        this.doorType = doorType;
    }
}
