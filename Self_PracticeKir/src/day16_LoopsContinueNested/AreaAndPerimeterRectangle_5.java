package day16_LoopsContinueNested;

import java.util.Scanner;

public class AreaAndPerimeterRectangle_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
String yN = "yes";

while (yN.equalsIgnoreCase("yes")) {
    System.out.println("Enter the length of the Rectangle:");
    double length = scan.nextDouble();
    if (length <= 0) {
        System.err.println("Invalid Entry for the length of the rectangle");
        System.exit(1);
    }
    System.out.println("Enter the width of the Rectangle:");
    double width = scan.nextDouble();
    if (width <= 0) {
        System.err.println("Invalid Entry for the width of the rectangle");
        System.exit(1);
    }
    System.out.println("1. Area of rectangle = " + width * length);
    System.out.println("2. Perimeter of rectangle = " + (width+length)*2);
    System.out.println();
    System.out.println("Would you like to calculate another Rectangle? yes / no");
    yN = scan.next();
    while (!(yN.equalsIgnoreCase("yes")||yN.equalsIgnoreCase("no"))){
        System.err.println("invalid entry - re-enter");
        System.out.println("Would you like to calculate another Rectangle? yes / no");
        yN = scan.next();
    }
}
        System.out.println("Thank you for using Cydeo Rectangle Calculator APP");
    }
}
/*
5. Write a program that can calculate the area and perimeter of a Rectangle:
                        1. Ask the user "Enter the length of the Rectangle:"
                                if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the length of the rectangle"

                        2. Ask the user "Enter the width of the Rectangle:"
                                if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the width of the rectangle"

                        3. Display:
                                        1. Area of rectangle
                                        2. Perimeter of rectangle

                        4. Ask the user "Would you like to calculate another Rectangle?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Rectangle Calculator APP"

                                If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

                        Hint: you can use  System.exit(1) to terminate the entire program
 */