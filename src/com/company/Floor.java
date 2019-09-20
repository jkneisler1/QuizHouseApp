package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Floor {
    private int level;
    private String descr;
    private ArrayList<Room> rooms;

    private HashMap<String, Double> optionCost = new HashMap<>();
    private HashMap<String, Integer> selection = new HashMap<>();

    public Integer chooseFloor(String fl) {
        selection.put("carpet", 0);
        selection.put("tile", 1);
        selection.put("wood", 2);

        return selection.get(fl);
    }

    public Double getOptionCost(String str) {
        optionCost.put("carpet", 0.0);
        optionCost.put("tile", 50.0);
        optionCost.put("wood", 75.0);

        return optionCost.get(str);
    }

    // Constructors
    public Floor() {
        int level = -1;
        String descr = "";
        rooms = new ArrayList<Room>();
    }

    public Floor(int level, String descr, ArrayList<Room> rooms) {
        this.level = level;
        this.descr = descr;
        this.rooms = rooms;
    }

    public Floor(int level, String descr) {
        this.level = level;
        this.descr = descr;
    }

    public Room createRoom() {
            Room room = new Room();
            return room;
    }

    public Room createRoom(String type, String floor, ArrayList<Window> win, ArrayList<Door> door, int sqFt ) {
        Room room = new Room(type, floor, win, door, sqFt);
        return room;
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }
}
