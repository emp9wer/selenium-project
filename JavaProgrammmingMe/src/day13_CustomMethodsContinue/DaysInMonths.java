package src.day13_CustomMethodsContinue;

import java.util.Scanner;

public class DaysInMonths {
    public static void main(String[] args) {

    int month = new Scanner(System.in).nextInt();

    if (month > 12 || month < 1){ // used as precondition
        System.err.println("Invalid number");
        return; // terminates the main method
    }

    switch (month){ // 1~12
        case 2:
            System.out.println("28 days");
            break;

        case 4: case 6 : case 9: case 11:
            System.out.println("30 days");

        default:
            System.out.println("31 days");
    }





    }





}
