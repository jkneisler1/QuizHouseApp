package com.company;

public class HouseApp {

    public static void main(String[] args) {
        House presentHome = new House(2, 10, 3, 2000, 30000);
        presentHome.setSalesPrice(35000);
        System.out.println("My present home has " + presentHome.toString());

        House futureHome = new House();
        futureHome.setDoors(50);
        futureHome.setFloors(27);
        futureHome.setSalesPrice(2000000000);
        futureHome.setSqFt(400000);
        futureHome.setWindows(100);
        System.out.println("My future home has " + futureHome.toString());

    }
}
