package src.day04_concatenation_practices;
import java.util.Scanner;


public class ReplitScanner {
        public static void main(String[] args) {
            //DO NOT TOUCH THESE LINE/LINES.
            Scanner input = new Scanner(System.in);
            String word = input.nextLine();
            String java = "Java";
            String Apple;
            if ((String)word == (String) java) {
                System.out.println("Today's word of the day is: Java");
            } else if (word == "Apple") {
                System.out.println("Today's word of the day is: Apple");
            }
        }
}


