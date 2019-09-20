package com.company;

import java.util.HashMap;

public class Window {

    private String type;                                                // sash, bay, box
    private String ecoFriendly;                                         // Single pane, double pane
    private HashMap<String, Double> optionCost = new HashMap<>();
    private HashMap<String, Integer> selection = new HashMap<>();

    public Integer chooseType(String wn) {
        selection.put("sash", 0);
        selection.put("bay", 1);
        selection.put("box", 2);
        selection.put("single pane", 3);
        selection.put("double pane", 4);

        return selection.get(wn);
    }

    public Double getOptionCost(String str) {
        optionCost.put("Sash", 0.0);
        optionCost.put("bay", 50.0);
        optionCost.put("box", 100.0);
        optionCost.put("single pane", 0.0);
        optionCost.put("double pane", 60.0);

        return optionCost.get(str);
    }

    // Constructors
    public Window() {
    }

    public Window(String type) {
        this.type = type;
    }

    // getters and Setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEcoFriendly() {
        return ecoFriendly;
    }

    public void setEcoFriendly(String ecoFriendly) {
        this.ecoFriendly = ecoFriendly;
    }
}
