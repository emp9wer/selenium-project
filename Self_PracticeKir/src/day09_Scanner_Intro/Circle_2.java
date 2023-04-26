package day09_Scanner_Intro;

import java.util.Scanner;

public class Circle_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of the circle to calculate area and perimeter");
        double radius = scan.nextDouble();
        double area = Math.PI * Math.pow(radius , 2);
        double perimeter = 2 * Math.PI * radius;
        System.out.println("With given radius of " + radius);
        System.out.println("Perimeter is " + perimeter);
        System.out.println("And the area is " + area);
        scan.close();

    }
}
/*
2. Create a class named Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius
 */