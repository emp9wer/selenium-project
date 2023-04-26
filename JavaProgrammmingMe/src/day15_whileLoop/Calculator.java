package src.day15_whileLoop;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter you first number");
        double num1= input.nextDouble();
        System.out.println("Enter you second number");
        double num2= input.nextDouble();
        System.out.println("Enter Math operator");
        char operator = input.next().charAt(0);

      while (! (operator == '+' ||operator == '*' ||operator == '*' ||operator == '/')){ // while operator is invalid
          System.err.println("invalid operator");
          operator = input.next().charAt(0);
      }

        if (operator == '+') {
            System.err.println(num1 + num2);
        } else if (operator == '-') {
            System.err.println(num1 - num2);
        }else if (operator == '*') {
            System.err.println(num1 * num2);
        }else{
            System.err.println(num1 / num2);
        }


    }
}
