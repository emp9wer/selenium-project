package day09_Scanner_Intro;
import java.util.*;
public class Fatima {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int balance = 100;

        System.out.println("Hello, which item would you like?");
        String item = scan.nextLine();
        boolean notInStock = false;
        switch (item) {
            case "Blanket":
                balance -= 60;
                break;
            case "Charger":
                balance -= 5;
                break;
            case "Hat":
                balance -= 25;
                break;
            case "Headphones":
                balance -= 30;
                break;
            case "Laptop":
                balance -= 200;
                break;
            case "Pants":
                balance -= 50;
                break;
            case "Pillow":
                balance -= 40;
                break;
            case "Smartphone":
                balance -= 1000;
                break;
            case "Socks":
                balance -= 5;
                break;
            case "USB cable":
                balance -= 10;
                break;
            default:
                notInStock = true; // used for nested if statement

                break;
        }
        if (notInStock == false) { // if in stock we can print options
            if (balance >= 0) {  // if balance >= we print remainder of balance
                System.out.println("Thank you for your purchase!\n" +
                        "Your current balance is: " + balance + "$");
            } else {            // or we print not this if balance is negative.
                System.out.println("Sorry, not enough funds on your gift card`");
            }
        } else {
            System.out.println("Sorry, that is an invalid item");
        }

    }
}
