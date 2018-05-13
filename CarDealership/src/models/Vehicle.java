package models;
/* Adding a Method : a method is a function that is part of an objects blue print
Everything in Java except primitives is an object. Each of these objects are instances of a class. */



public class Vehicle {

    public int year;
    public String brand;
    public String model;
    public int miles;
    public int price;

    public Vehicle(int year, String brand, String model, int miles, int price) {
        this.year = year;
        this.brand = brand;
        this.model = model;
        this.miles = miles;
        this.price = price;
    }

    public boolean worthBuying(int maxPrice){
        return (this.price < maxPrice);
    }

}