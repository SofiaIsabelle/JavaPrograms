package com.sofiaisabelle;

public class Outlander extends Car{
    private int roadService; // number of amount of months that are available for this type of vehicle


    // Command + n to generate constructor for the roadService , and you'l see that it initializes all the other fields that belong to the car class as well
    public Outlander( int wheels, int doors, int gears, boolean isManual, int roadService) {
        super("Outlander", "4WD", 5, 5, 6, false);
        this.roadService = roadService;
    }
}
