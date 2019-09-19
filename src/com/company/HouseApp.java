package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HouseApp {

    public static void main(String[] args) {
        Scanner keybd = new Scanner(System.in);
        Pair pair = new Pair("Y", "N");
        String input;
        int numFloors = 0;
        HashMap<String, Integer> sqFootage = new HashMap();
        sqFootage.put("bathroom", 20);
        sqFootage.put("master bathroom", 100);
        sqFootage.put("master bedroom", 200);
        sqFootage.put("bedroom", 150);
        sqFootage.put("living room", 300);
        sqFootage.put("rec room", 350);
        sqFootage.put("kitchen", 450);
        sqFootage.put("dining room", 250);
        sqFootage.put("storage room", 250);


        // Start building the house
        System.out.println("You are given one floor, the main level.");
        House futureHome = new House();
        futureHome.addFloor(1, "Main Level");
        numFloors++;

        // Include a basement?
        System.out.println("Do you want a finished basement? (Y|N)");
        input = keybd.nextLine();
        if (pair.check(input)) {
            System.out.println("A basement level has been added");
            futureHome.addFloor(0, "Basement Level");
            numFloors++;
        }

        // Include a second floor?
        System.out.println("Do you want a second floor? (Y|N)");
        input = keybd.nextLine();
        if (pair.check(input)) {
            System.out.println("A second floor has been added");
            futureHome.addFloor(2, "Second Floor");
            numFloors++;
        }

        // Add rooms
        boolean newRoom = true;
        if (numFloors == 2) {               // There are three levels
            System.out.println("Starting on the second level");
            Floor tmpFloor = futureHome.getFloor(2);
            while(newRoom) {
                System.out.println("What room to you want to add");                                     // Add room
                input = keybd.nextLine();
                Room tmpRoom = tmpFloor.createRoom();
                tmpRoom.setType(input);

                System.out.println("What type or flooring do you want? (carpet, wood, tile)");          // Set flooring
                input = keybd.nextLine();
                tmpRoom.setFloor(input);

                System.out.println("How many windows do you want in your " + tmpRoom.getType() + "?");  // Set windows
                input = keybd.nextLine();
                int tmpWinInt = Integer.parseInt(input);
                ArrayList<Window> tmpWin = new ArrayList<>(tmpWinInt);
                for (Window win : tmpWin) {
                    win.setType("sash");
                    win.setEcoFriendly("single pane");

                }
                if (tmpWinInt != 0) {
                    tmpRoom.setWindows(tmpWin);
                }

                futureHome.setTotalSqFt(futureHome.getTotalSqFt() + sqFootage.get(tmpRoom.getType()));  // Set sq Ft

                System.out.println("Do you want a to add another room? (Y|N)");                         // continue loop
                input = keybd.nextLine();
                if (input.equalsIgnoreCase("n")) {
                    newRoom = false;
                }
            }
        }
        else if ( numFloors == 1 ) {        // There are only two levels

        }
        else {                              // There is only the original level

        }







    }
}
