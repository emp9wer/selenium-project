package src.day09_scanner;

import java.util.Scanner;

public class NextLineVsNext {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter age");
        int age = scan.nextInt(); // 45+enter   or    45\n   = \n - goes to scanner memory
                                  // enter or \n in scanner memory
        scan.nextLine();  // takes enter key from memory

        System.out.println("Enter full name");
        String fullName = scan.nextLine(); // only this method can read enter key(or \n) - memory goes here


        System.out.println("age = " + age);
        System.out.println("Full Name is  " + fullName);



    }
}
