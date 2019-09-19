package com.company;

public class Window {

    String type;        // sash, bay, box
    String ecoFriendly; // Single pane, double pane

    public Window() {
    }

    public Window(String type) {
        this.type = type;
    }

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
