package src.day11_String;

import java.util.Scanner;

public class ReallyNeverMind_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scan.nextLine();

        if (word.endsWith("ly")){
            System.out.println("really???");
        }else{
            System.out.println("never mind");
            scan.close();
        }
    }
}
/*
3. Create a class named ReallyNeverMind. Ask the user to enter a word. if the word ends with "ly", print "really???" ,  otherwise, print "never mind"
 */