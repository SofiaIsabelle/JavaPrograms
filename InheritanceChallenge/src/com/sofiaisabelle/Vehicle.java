package com.sofiaisabelle;

public class Vehicle {

    // your vehicle fields
    private String name;
    private String size;

    //fields to deal with the current velocity and current direction of the vehicle
    private int currentVelocity;
    private int currentDirection;

    //your constructor so that you can initialize your object
    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentVelocity = 0;
        this.currentDirection = 0;


    }

    //your steering method which will apply to all vehicles
    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Velocity.steer(): Steering at " + currentDirection + " degrees.");
    }



    //move method for velocity and direction
    public void move(int velocity, int direction){
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection +".");
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;

    }


    public void stop(){
        this.currentVelocity = 0;
    }
}
