package src.day19_Array;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class AvarageNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("how many numbers would you like to enter");
        int total = input.nextInt();

        int[] numbers = new int[total];

        System.out.println("enter number for given number of times:");
            int sum =0;
        for (int i = 0; i < total; i++) {
            System.out.println("enter number " +(i+1));
            numbers[i] = input.nextInt();
            sum +=numbers[i];
        }
        DecimalFormat df = new DecimalFormat("0.000");
        double avarage = (double) sum / (double) total; // (double) needs to be applied to one of them
        System.out.println(Arrays.toString(numbers));
        System.out.println("sum is: " + sum);
        System.out.println("avarage is: "+df.format(avarage));

    }
}
/*
5. AverageNumber:
	            1. Ask the user how many numbers they want to enter
	            2. get all the inputs from the user and store them into an array
	            3. Iterate the array & return the average number
 */