package src.day09_scanner;

import java.util.Scanner;

public class NextLineMethodPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in); // enterenter

        System.out.println("Enter full name");
        String fullName = input.nextLine(); // kir kan + enter

        System.out.println("Enter School name");
        String schoolName = input.nextLine(); // cydeo school + enter

        System.out.println("enter gender");
        String gender = input.next(); // male + (enter in memory)

        System.out.println("enter your age");
        int age = input.nextInt(); // 28; + (enter in memory)

        input.nextLine(); // pulls enter(s) from memory and uses it / them
        System.out.println("enter address");
        String address = input.nextLine();


    }
}
