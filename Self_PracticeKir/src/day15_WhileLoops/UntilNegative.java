package src.day15_WhileLoops;

import java.util.Scanner;

public class UntilNegative {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int res = 0;
        int in = 1;
        while ( in > 0){
            System.out.println("Enter number");
            in = scan.nextInt();
            if(in > 0){
                res+=in;
            }
        }
        System.out.println(res);
        scan.close();
    }
}

/*
5. Create a class named UntilNegative and Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
 */