import java.util.*;
/* Create a Triangle Class */
public class TriangleTracker{

    public static void main(String[] args) {
/* Write a command line interface that allows users to input lengths for the 3 sides. */
        Scanner sc = new Scanner(System.in);
        int s1 = 0, s2 = 0, s3 = 0;
        System.out.println("Enter the sides of a triangle : ");
        s1 = sc.nextInt();
        s2 = sc.nextInt();
        s3 = sc.nextInt();
/* Equilateral: All sides are equal */
        if (s1 == s2 && s2 == s3) {
            System.out.println("Triangle is Equilateral");
/* Scalene: No sides are equal. */
        } else if (s1 != s2 && s2 != s3 && s1 != s3) {
            System.out.println("Triangle is Scalene");

/*Isosceles: Exactly 2 sides are equal: (only other option)*/
        } else {

            System.out.println("Triangle is Isosceles");
        }
    }

}
