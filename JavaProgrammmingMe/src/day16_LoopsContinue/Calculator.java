package src.day16_LoopsContinue;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
String answer = "yes";
        while(answer.equals("yes")){
            System.out.println("enter first number");
            double num1 = input.nextDouble();

            System.out.println("enter the math operator");
            char o = input.next().charAt(0);
            while (!(o=='+' || o=='-' || o=='*'|| o=='/')){ // while operator is invalid
                System.err.println("invalid operator - please re-enter the math operator");
                o = input.next().charAt(0);
            }
            System.out.println("enter second number");
            double num2 = input.nextDouble();

            double result = (o=='+')? num1+num2 :(o=='-')? num1-num2 :(o=='*')? num1*num2 : num1/num2;
            System.out.println("result = " + result);
            System.out.println("would you like to continue - yes/no?");
            answer = input.next().toLowerCase();
            while (!(answer.equals("yes")|| answer.equals("no"))){
                System.err.println("invalid answer! - enter yes/no");
                answer = input.next().toLowerCase();
            }


        }






    }
}
