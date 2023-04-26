package src.day14_forLoop;

import java.util.Scanner;

public class MaxOutOf5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number;
        int maxNumber;
        System.out.println("enter a number");
        maxNumber = scan.nextInt();
        for (int i = 0; i < 4; i++) {
            System.out.println("enter a number");
            number = scan.nextInt();
            if (number > maxNumber) {
                maxNumber = number;
            }
        }
        System.out.println("max number is "+ maxNumber);
    }
}