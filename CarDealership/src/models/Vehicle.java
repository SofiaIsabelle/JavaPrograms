package models;

public class Vehicle {
    public int year;
    public String brand;
    public String model;
    public int miles;
    public int price;

    /* Adding a Method : a method is a function that is part of an objects blue print */
    public boolean worthBuying(int maxPrice){
        return(price < maxPrice); /* define a method called worthBuying() within our Vehicle class. */
    }


}


/* Everything in Java except primitives is an object. Each of these objects are instances of a class. */