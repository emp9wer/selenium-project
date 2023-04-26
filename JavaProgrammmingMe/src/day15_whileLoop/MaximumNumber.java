package src.day15_whileLoop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
          int min = 2147483647;
        int max = -2147483648;
        for (int i = 0; i < 5; i++) {
            System.out.println("enter number:");
            int num = input.nextInt();

            if(num>max){
                max = num;
            }
            if(num<min){
                min = num;
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        input.close();
    }

}


