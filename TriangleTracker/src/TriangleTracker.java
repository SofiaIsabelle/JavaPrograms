import java.util.*;

public class TriangleTracker{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int s1 = 0, s2 = 0, s3 = 0;
        System.out.println("Enter the sides of a triangle : ");
        s1 = sc.nextInt();
        s2 = sc.nextInt();
        s3 = sc.nextInt();
        if (s1 == s2 && s2 == s3) {
            System.out.println("Triangle is Equilateral");
        } else if (s1 != s2 && s2 != s3 && s1 != s3) {
            System.out.println("Triangle is Scalene");

        } else {
            System.out.println("Triangle is Isosceles");
        }
    }

}
