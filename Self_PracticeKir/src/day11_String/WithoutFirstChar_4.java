package day11_String;

import java.util.Scanner;

public class WithoutFirstChar_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a first word:");
        String word1 = scan.nextLine();
        System.out.println("Enter a second word:");
        String word2 = scan.nextLine();
        String word3;
        word1 = word1.substring(1);
        word2 = word2.substring(1);
        word3 = word1+word2;
        System.out.println(word3);
        scan.close();
    }
}
/**
 * 4. Create a class named WithoutFirstChar. Ask user to enter two words. Print first word without its first character
 *     then print the second word without its first character.
 *             Input:
 *                 apple
 *                 banana
 *             Output:
 *                 ppleanana
 */