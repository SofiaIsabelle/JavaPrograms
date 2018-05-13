import models.Vehicle;

public class App {
    public static void main(String[] args) {
        Vehicle hatchback = new Vehicle();
        hatchback.year = 1994;
        hatchback.brand = "Subaru";
        hatchback.model = "Legacy";
        hatchback.miles = 170000;
        hatchback.price = 4000;

        Vehicle suv = new Vehicle();
        suv.year = 2002;
        suv.brand = "Ford";
        suv.model = "Explorer";
        suv.miles = 100000;
        suv.price = 7000;

        Vehicle sedan = new Vehicle();
        sedan.year = 2015;
        sedan.brand = "Toyota";
        sedan.model = "Camry";
        sedan.miles = 50000;
        sedan.price = 30000;

        Vehicle truck = new Vehicle();
        truck.year = 1999;
        truck.brand = "Ford";
        truck.model = "Ranger";
        truck.miles = 10000;
        truck.price = 4000;

        /* When you create a new object it is called instantiation because it is an instance of its class */

        Vehicle[] allVehicles = {hatchback, suv, sedan, truck}; /* Adding all the instances of Vehicle that we've created to an Array that we called allVehicles */
        System.out.println("All Vehicles : ");

        /* Looping through the allVehicles array that we just created in order to display details about each */

        for(Vehicle individualVehicle : allVehicles){
            System.out.println("----------------------------------");
            System.out.println(individualVehicle.year);
            System.out.println(individualVehicle.brand);
            System.out.println(individualVehicle.model);
            System.out.println(individualVehicle.miles);
            System.out.println(individualVehicle.price);
        }



    }
}
