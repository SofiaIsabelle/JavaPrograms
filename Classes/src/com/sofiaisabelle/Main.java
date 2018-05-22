package com.sofiaisabelle;

public class Main {

    public static void main(String[] args) {
	// Here we can build an object based on the car class

        Car porsche = new Car(); // created an object of porshe based on the template car
        Car bmw = new Car();
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());

    }
}
