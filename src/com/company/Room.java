package com.company;

import java.util.ArrayList;

public class Room {
    private String type;                    // bed, bath, living room, ...
    private String floor;                    // can only have one floor per room
    private ArrayList<Window> windows;
    private ArrayList<Door> doors;
    private int sqFt;

    public Room() {
    }

    public Room(String type, String floor, ArrayList<Window> windows, ArrayList<Door> doors, int sqFt) {
        this.type = type;
        this.floor = floor;
        this.windows = windows;
        this.doors = doors;
        this.sqFt = sqFt;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public ArrayList<Window> getWindows() {
        return windows;
    }

    public void setWindows(ArrayList<Window> windows) {
        this.windows = windows;
    }

    public ArrayList<Door> getDoors() {
        return doors;
    }

    public void setDoors(ArrayList<Door> doors) {
        this.doors = doors;
    }

    public int getSqFt() {
        return sqFt;
    }

    public void setSqFt(int sqFt) {
        this.sqFt = sqFt;
    }
}
