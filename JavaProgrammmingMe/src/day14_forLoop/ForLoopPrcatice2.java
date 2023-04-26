package src.day14_forLoop;

import java.util.Scanner;

public class ForLoopPrcatice2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter a number");
            sum += scan.nextInt();
        }
        System.out.println("sum = " + sum);







    }
}
