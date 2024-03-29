package com.shaker;

public class Lamp {
    private String style;
    private boolean battery;
    private int globRating;

    public Lamp(String style, boolean battery, int gloveRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = gloveRating;
    }
    public void turnOn(){
        System.out.println("Lamp --> Turning on");
    }

    public String getStyle() {
        return style;
    }
    public boolean isBattery(){
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }
}
