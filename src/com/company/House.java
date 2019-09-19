package com.company;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * The user creates the number of floors
 * Then they create rooms on each floor
 */

public class House {
    // private Floor floor;
    private ArrayList<Floor> floors; // floors could have types, finishing
    // private Room room;
    // private ArrayList<Room> rooms;
    // private Window window;
    // private ArrayList<Window> windows = new ArrayList<>(); // windows could have different treatment types
    // private Door door;
    // private ArrayList<Door> doors; // doors could have different shapes, color, etc
    private int totalSqFt;
    private double salesPrice;
    private static final double pricePerSqFt = 200.0;

    public void addFloor(int level, String desc) {
        floors.add(new Floor(level, desc));
    }

    public Floor getFloor(int fl) {
        return floors.get(fl);
    }

    public void constructHouse() {

    }

    public House(){

    }

    public House(ArrayList<Floor> floors){
        this.floors = floors;
        this.salesPrice = 0.0;
        this.totalSqFt = 0;
    }

    public House(ArrayList<Floor> floors, int totalSqFt, double salesPrice) {
        this.floors = floors;
        this.totalSqFt = totalSqFt;
        this.salesPrice = salesPrice;
    }

    public void setFloors(ArrayList<Floor> floors) {
        this.floors = floors;
    }

    public ArrayList<Floor> getFloors(){
        return floors;
    }

        public int getTotalSqFt() {
        return totalSqFt;
    }
    public void setTotalSqFt(int totalSqFt) {
        this.totalSqFt = totalSqFt;
    }

    public String getSalesPrice() {
        DecimalFormat df2 = new DecimalFormat("#.00");
        return df2.format(salesPrice);
    }

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    @Override
    public String toString(){
        return getFloors() + " floors " +
                getTotalSqFt() + " sq ft and worth $" +
                getSalesPrice();
    }
}
