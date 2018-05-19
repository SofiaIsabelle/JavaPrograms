import java.util.Scanner;




public class ProductOfNums {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        //method reads the number provided using keyboard
        int num1 = scan.nextInt();

        System.out.println("Now enter your second number: ");
        int num2 = scan.nextInt();

        scan.close();

        //Calculating the two ints
        int product = num1 *  num2;

        //Display the Product

        System.out.println(" Your product is "+product);
    }
}
