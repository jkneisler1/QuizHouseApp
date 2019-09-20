package com.company;

public class Pair {
    private String val1;
    private String val2;

    // Methods
    public boolean checkEither(String input) {          // Checks if either value is true
        boolean test = false;

        if (val1.equalsIgnoreCase(input)) {
            test = true;
        }
        else if (val2.equalsIgnoreCase(input)) {
            test = true;
        }

        return test;
    }

    public boolean checkForOne(String input) {          // Checks if the first value is true
        boolean test = false;

        if (val1.equalsIgnoreCase(input)) {
            test = true;
        }

        return test;
    }

    public boolean checkForTwo(String input) {          // Checks if the second value is true
        boolean test = false;

        if (val2.equalsIgnoreCase(input)) {
            test = true;
        }

        return test;
    }

    public boolean checkBoth(String input) {          // Checks if both values are true
        boolean test = false;

        if (val1.equalsIgnoreCase(input) && val2.equalsIgnoreCase(input)) {
            test = true;
        }

        return test;
    }

    // Constructors
    Pair() {
        this.val1 = "Y";					// true value;
        this.val2 = "N";					// false value
    }

    Pair(String val1, String val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    // Getters and Setters
    public String getVal1() {
        return val1;
    }
    public void setVal1(String val1) {
        this.val1 = val1;
    }

    public String getVal2() {
        return val2;
    }
    public void setVal2(String val2) {
        this.val2 = val2;
    }
}
