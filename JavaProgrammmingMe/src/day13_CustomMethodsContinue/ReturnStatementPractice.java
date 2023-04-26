package src.day13_CustomMethodsContinue;

import java.util.Scanner;

public class ReturnStatementPractice {

    public static void main(String[] args) {

        char grade = new Scanner(System.in).next().charAt(0);


        boolean isValid = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F';

        if(!isValid) {
            System.err.println("Invalid grade");
            return;
        }

        System.out.println( (grade == 'A') ? "Excellent" :(grade =='B') ? "Great Job" :(grade=='C') ? "Good"
                :(grade == 'D')? "Passed" : "Failed");

    }

}
