package src.day10_string;
import java.util.Scanner;

public class StringIntro {
    public static void main(String[] args) {

Scanner input = new Scanner(System.in);
String str = "Java";
input.close();

        System.out.println("===============By String literal================");

        String s1 = "Cat"; // only 2 String literal objects created in string pool for this 4 objects.
        String s2 = "Cat";
        System.out.println(s1 == s2); // true

        System.out.println("=================By new keyword================= ");

        String str1 = new String("Java"); // creates two objects - 1) in string pool 2) in heap outside string
        String str2 = new String("Java");
        System.out.println(str1 == str2); //false (stored as 2 different objects)
        System.out.println("---------------------------------------------");

        String t1 = "Python"; // 1 String of text "Python" - in string pool
         String t2 = new String("Python"); // 2 outside
        String t3 = new String("Python");
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        System.out.println(t1 == t2); //false
        System.out.println(t2 == t3); //false



    }
}
