package src.day20_forEachArrayContinue;

import src.utilities.ArraysUtility;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        System.out.println("-----.toCharArray()---------");
    String str  = "Cydeo School";
    char[] ch =  str.toCharArray(); // str.replace(" ","").toCharArray(); - to remove spaces

        System.out.println(Arrays.toString(ch)); // [C, y, d, e, o,  , S, c, h, o, o, l]


        System.out.println("-----------.split()-----------");


        String str2 = "today is a great day to learn java";
        String[] words = str2.split(" "); // split by space.

        System.out.println(Arrays.toString(words)); //[today, is, a, great, day, to, learn, java]


        System.out.println("-------------reverse sentence------------");

        String sentence = "i love java";

      String[] arr=  ArraysUtility.reverse(sentence.split(" "));
        System.out.println(Arrays.toString(arr)); //[java, love, i]

        String reversedSentence = ""; //java, love, i

        for (int i = 0; i < arr.length; i++) {
            reversedSentence+= arr[i] + " ";
        }
        System.out.println(reversedSentence); // java love i



















}













}