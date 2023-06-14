package src.day16_LoopsContinueNested;

import java.util.Scanner;
import java.lang.Math;

public class AreaAndPerimeterCircle_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double radius=0, diameter=0, area=0, perimeter=0;

        String yesNo = "yes";

        while (yesNo.equalsIgnoreCase("yes")) {

            System.out.println("Enter the radius of the circle:");
            radius = scan.nextDouble();
            if (radius <= 0) {
                System.err.println("Invalid Entry for the radius of the circle");
                System.exit(1);
            }
            diameter = radius * 2;
            area = Math.PI * Math.pow(radius, 2);
            perimeter = 2 * Math.PI * radius;

            System.out.println("1. Diameter of circle: " + diameter);
            System.out.println("2. Area of circle: " + area);
            System.out.println("3. Perimeter of circle: " + perimeter);

            System.out.println("Would you like to calculate another circle?");
            yesNo = scan.next();
            while (!(yesNo.equalsIgnoreCase("yes")||yesNo.equalsIgnoreCase("no"))){
                System.err.println("re-enter yes/no");
                System.err.println("Would you like to calculate another circle?");
                yesNo = scan.next();
            }
        }
        System.out.println("Thank you for using Cydeo Circle Calculator APP");
        scan.close();
        }
    }

/*
3. Write a program that can calculate the area and perimeter of a circle:
 1. Ask the user "Enter the radius of the circle:"
                                if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the radius of the circle"

                       2. Display:
                                        1. Diameter of circle
                                        2. Area of circle
                                        3. Perimeter of circle

                        3. Ask the user "Would you like to calculate another circle?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

                                If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

                        Hint: you can use  System.exit(1) to terminate the entire program
 */