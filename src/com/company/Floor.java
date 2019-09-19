package com.company;

import java.util.ArrayList;

public class Floor {
    private int level;
    private String descr;
    private ArrayList<Room> rooms;

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
