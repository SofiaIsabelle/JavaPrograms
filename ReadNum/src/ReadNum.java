import java.util.Scanner;

public class ReadNum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number: ");
        // method below reads the number provided using the keyboard.
        int num = scan.nextInt();
        //closing scanner after the use
        scan.close();
        //Displaying the number
        System.out.println("The number entered by the user :" +num);
    }


}
