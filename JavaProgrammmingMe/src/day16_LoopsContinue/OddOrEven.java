package src.day16_LoopsContinue;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String answer = "yes";
        while (answer.equals("yes")) {

            System.out.println("enter a number");
            int number = input.nextInt();

            if (number % 2 == 0) {
                System.out.println(number + " even number");

            } else {
                System.out.println(number + " odd number");
            }
            System.out.println("would you like to enter another number? Yes/No");
            answer = input.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))){ // while user provides invalid answer
                System.err.println("invalid entry! - enter yes / no");
                answer = input.next().toLowerCase();
            }

        }
    }
}