package com.company;

public class Pair {
    private String val1;
    private String val2;

    Pair() {
        this.val1 = "Y";					// true value;
        this.val2 = "N";					// false value
    }

    Pair(String val1, String val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public boolean check(String input) {
        boolean test = false;

        if (val1.equalsIgnoreCase(input)) {
            test = true;
        }
        else if (val2.equalsIgnoreCase(input)) {
            test = true;
        }

        return test;
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
