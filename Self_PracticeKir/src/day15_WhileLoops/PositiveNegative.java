package src.day15_WhileLoops;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int positiveCount = 0, negativeCount = 0, input=0;
        for (int i = 0; i < 5; i++) {
            System.out.println("enter a number: ");
            input = scan.nextInt();
            if(input>0){
                positiveCount++;
            }
            if(input<0){
                negativeCount++;
            }


        }
        System.out.println(positiveCount+" positive and "+negativeCount+ " negative");
    }
}