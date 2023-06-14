package src.day15_WhileLoops;

import java.util.Scanner;

public class LogInFunction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String username = "Cydeo";
        String password = "Cydeo123";
        String enterUser = "";
        String enterPass = "";
        for (int i = 0; i < 3; i++) {
            System.out.println("enter username");
            enterUser = scan.nextLine();
            System.out.println("enter password");
            enterPass = scan.nextLine();
            if ((username.equals(enterUser) && password.equals(enterPass))) {
                System.out.println("Logged in.");
                break;
            }
        }
        if (!(username.equals(enterUser) && password.equals(enterPass))) {
            System.out.println("Your account is locked.");
            scan.close();
        }
    }
}
/*
7. you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials and if all three attempts are failed, then print "Your account is lucked."

 */