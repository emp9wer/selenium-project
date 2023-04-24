package Self_PracticeKir.day11_String;

import java.util.Scanner;

public class ReplaceX_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scan.nextLine();
        word = word.replace('x','a');
        word = word.replace('X','a');
        System.out.println(word);
        scan.close();


    }
}
/*
2. Create a class named ReplaceX, and write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea

 */