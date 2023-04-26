package day09_Scanner_Intro;
import java.util.Scanner;

public class Natalia {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of roommates:");
        int roommates = input.nextInt();
        if (roommates > 6) {
            if (roommates < 3) {
                System.out.println("Live with less then 3 people");
            } else if (roommates >= 3 && roommates < 6) {
                System.out.println("Live with 3-6 people");
            } else {
                System.out.println("Live with more than 6 people");
            }

        }
    }

}
