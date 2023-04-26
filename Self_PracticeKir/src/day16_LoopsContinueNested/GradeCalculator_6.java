package day16_LoopsContinueNested;

import java.util.Scanner;

public class GradeCalculator_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String yN = "yes";

        while (yN.equalsIgnoreCase("yes")) {
            System.out.println("Enter your score");
            int score = scan.nextInt();

            if (score > 100 || score < 0) {
                System.err.println("Invalid Entry");
                System.exit(1);
            }
            if (score >= 90 && score <= 100) {
                System.out.println("A");
            } else if (score >= 80 && score <= 89) {
                System.out.println("B");
            } else if (score >= 70 && score <= 79) {
                System.out.println("C");
            } else if (score >= 60 && score <= 69) {
                System.out.println("D");
            } else {
                System.out.println("F");
                System.out.println();
                System.out.println("would you like to continue? yes/no");

            }
                yN = scan.next();
                if(!((yN.equalsIgnoreCase("yes"))||yN.equalsIgnoreCase("no"))){
                    System.err.println("Invalid Entry");
                    System.exit(1);
                }

            }
        System.out.println("Thank you for using Cydeo Grade Calculator APP");
        }

    }

/*
6. Write a program for grade calculator:
                        1. Ask the user "Enter your score"
                                If user enters invalid score, terminate the program after displaying the error message "Invalid Entry"

                         2. Display the grade of the student.
                                        90 ~ 100 ==> A
                                        80 ~ 89 ==> B
                                        70 ~ 79 ==> C
                                        60 ~ 69 ==> D
                                        0 ~ 59 ==> F

 */