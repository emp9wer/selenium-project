package src.day16_LoopsContinueNested;

import java.util.Scanner;

public class PerimeterOfSquare_4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String yN = "yes";
        while (yN.equalsIgnoreCase("yes")) {
            System.out.println("Enter the side of the square:");
            double side = scan.nextDouble();
            if (side <= 0) {
                System.err.println("Invalid Entry for the side of the square");
                System.exit(1);
            }
            System.out.println("1. Area of square = " + side * side);
            System.out.println("2. Perimeter of square = " + side * 4);
            System.out.println();
            System.out.println("Would you like to calculate another Square? yes / no");
            yN = scan.next();
            while (!(yN.equalsIgnoreCase("yes")||yN.equalsIgnoreCase("no"))){
                System.err.println("re-enter");
                System.out.println("Would you like to calculate another Square? yes / no");
                yN = scan.next();
            }

        }
        System.out.println("Thank you for using Cydeo Square Calculator APP");

















    }
}
/*
4. Write a program that can calculate the area and perimeter of a Square:
                        1. Ask the user "Enter the side of the square:"
                                if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the side of the square"

                        2. Display:
                                        1. Area of square
                                        2. Perimeter of square

                        3. Ask the user "Would you like to calculate another Square?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Square Calculator APP"

                                If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

                        Hint: you can use  System.exit(1) to terminate the entire program

 */