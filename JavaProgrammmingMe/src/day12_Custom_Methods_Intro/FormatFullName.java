package src.day12_Custom_Methods_Intro;

import java.util.Scanner;

public class FormatFullName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first name ");
        String firstName = scan.nextLine().trim().replace(" ","");
        System.out.println("enter last name");
        String lastName = scan.nextLine().trim().replace(" ","");

        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
        System.out.println(firstName + " " + lastName);
    }
}
