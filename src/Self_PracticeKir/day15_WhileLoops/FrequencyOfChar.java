package Self_PracticeKir.day15_WhileLoops;

import java.util.Scanner;

public class FrequencyOfChar {
    public static void main(String[] args) {
        System.out.println("enter a string and a char");
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        char letter = scan.next().charAt(0);
        int count =0;

        for (int i = 0; i <word.length() ; i++) {
            if(word.charAt(i) == letter){
                count++;
            }

        }
        System.out.println(count);



    }
}
/*
3. Create a class named FrequencyOfChar and Write a program that asks user to enter a string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
 */