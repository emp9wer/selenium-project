package src.week5.morning;

import java.util.Scanner;

public class T6LongestWithA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1");
       String word1 = scan.nextLine();
        System.out.println("2");
        String word2 = scan.nextLine();
        System.out.println("3");
        String word3 = scan.nextLine();

        String longest = "";
        if (word1.contains("a") && word1.length() > longest.length()){
            longest = word1;
        }
        if (word2.contains("a") && word2.length() > longest.length()){
            longest = word2;
        }
        if (word3.contains("a") && word3.length() > longest.length()){
            longest = word3;
        }
        if (longest.isEmpty()){
            System.out.println("none contain a ");
        }else {
            System.out.println("longest is " + longest);
        }

    }
}
