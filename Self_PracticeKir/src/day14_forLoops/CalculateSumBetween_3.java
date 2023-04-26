package day14_forLoops;

import java.util.Scanner;

public class CalculateSumBetween_3 {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int result = 0;
        for (int i = 1; i <= number ; i++) {
           result += i;
        }
        System.out.println(result);

    }
}
/*
3. write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275
 */