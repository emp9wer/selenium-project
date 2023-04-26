package src.day09_scanner;

import java.util.Scanner;

public class ScannerIntro3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

/*
        System.out.println("type in one word");
        String oneWord = scan.next();  // can not take more then one word.
        System.out.println(oneWord);

        System.out.println("type in character");
        char ch = scan.next().charAt(0);
        System.out.println("You have entered: " +ch );
*/
        System.out.println("type in few words");
        String sentence = scan.nextLine(); // weakness = when used with other next methods - will get issue
        System.out.println(sentence);
    }
}
