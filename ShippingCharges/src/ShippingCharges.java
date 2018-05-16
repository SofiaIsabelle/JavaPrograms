import java.util.Scanner;


public class ShippingCharges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int packageWeight;
        double shippingCharge;
        System.out.println("Please enter the weight of the package.");
        packageWeight = scanner.nextInt();

        if(packageWeight <= 2){
            shippingCharge = 1.10;

        }else if(packageWeight <= 6 && packageWeight > 2){
            shippingCharge = 2.20;

        }else if(packageWeight > 6 && packageWeight <= 10){
            shippingCharge = 3.30;

        }else{
            shippingCharge = 3.80;
        }

        System.out.printf("For every 500 miles, your shipping charge will be $%.2f", shippingCharge);
    }
}
