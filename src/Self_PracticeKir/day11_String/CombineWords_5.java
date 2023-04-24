package Self_PracticeKir.day11_String;

import java.util.Scanner;

public class CombineWords_5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a first word:");
        String word1 = scan.nextLine();
        System.out.println("Enter a second word:");
        String word2 = scan.nextLine();
        if(word2.charAt(0) == word1.charAt(word1.length()-1)){
            System.out.println(word1+word2.substring(1));
        }else{
            System.out.println(word1+word2);
        }

    }
}
/**
5. Create a class named CombineWords. Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same, print that character once.

                Input:
                    one
                    eight
                Output:
                    oneight
 */