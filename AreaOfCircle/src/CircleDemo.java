import java.util.Scanner;


public class CircleDemo {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the radius ");
        double radius = scanner.nextDouble();
        double area = Math.PI * (radius * radius);
        System.out.println("The area of a circle is: " + area);
        //Circumference = 2 * PI * radius
        double circumference = Math.PI * 2 * radius;
        System.out.println("The circumference of the circle is : " + circumference);
    }
}
