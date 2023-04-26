package day09_Scanner_Intro;

import java.util.Scanner;

public class CentsToDollars_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter cents");
        int cents = scan.nextInt(); // 225
        int dollar = 0;
        int centsRemain = 0;


        if (cents > 100){
        dollar = cents / 100;
        centsRemain = cents - dollar * 100 ;
            System.out.println(cents+ " cents equal to: "+ dollar +" 22dollars and "+ centsRemain+" cents");
        }else {
            System.out.println(cents+ " cents equal to: "+ cents+" cents");
        }
        scan.close();

    }
}
/*
5. Create a class named CentsToDollars, write a program that can convert cents to dollars
	if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents
 */