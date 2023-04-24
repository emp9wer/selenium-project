package Self_PracticeKir.day09_Scanner_Intro;

import java.util.Scanner;

public class Claculator_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter the first number");
        double firstNumber = scan.nextDouble();
        System.out.println("enter a math operator");
        char mathOperator = scan.next().charAt(0);
       double secondNumber = 0;
        double result = 0;

        if(mathOperator == '+' || mathOperator == '-' || mathOperator == '/' || mathOperator == '*'){
            System.out.println("enter the second number");
            secondNumber = scan.nextDouble();
            if (mathOperator == '+'){
                result = firstNumber + secondNumber;
            } else if (mathOperator == '-') {
                result = firstNumber - secondNumber;
            } else if (mathOperator == '*') {
                result = firstNumber * secondNumber;
            } else {
                result = firstNumber / secondNumber;
            }
            System.out.println("result = " + result);
        }else {
            System.out.println("Invalid entry");
        }
        scan.close();

    }
}

/*
9. Create a class named Claculator:
		- Ask the user to enter the first number (double)
		- Ask user to enter a math operator (char)
		- Ask user to enter the second number

		- print the calculation result,
		- if the operator is not a vliad math operator (+, -, *, /), then print "Invalid entry"
 */