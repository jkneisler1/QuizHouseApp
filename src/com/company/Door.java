package com.company;

public class Door {
    private boolean isInterior;     // interior or exterior
    private boolean isLockable;     // exterior dooors, bathroom doors, and bedroom doors only
    private String location;        // where is the door located, front, back, side, or part of a room
    private boolean doorType;       // fancy, sturdy, solid, has windows

    public Door() {
    }

    public Door(boolean isInterior, boolean isLockable, String location, boolean doorType) {
        this.isInterior = isInterior;
        this.isLockable = isLockable;
        this.location = location;
        this.doorType = doorType;
    }

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
