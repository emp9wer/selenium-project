package src.day21_multiDimentionalArray;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "heart";
        String str2 = "earth";

     //  String[] a1 = str1.split("");                      // str1.split("")
     //  String[] a2 = str2.split("");
       char[] a1 = str1.toCharArray(); // [h, e, a, r, t]  // .toCharArray()
       char[] a2 = str2.toCharArray(); // [e, a, r, t, h]

        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));

        Arrays.sort(a1); // Arrays.sort
        Arrays.sort(a2);

        System.out.println(Arrays.toString(a1)); // [a, e, h, r, t]
        System.out.println(Arrays.toString(a2)); // [a, e, h, r, t]

        boolean isAnagram = Arrays.equals(a1,a2);  // Arrays.equals
        System.out.println(isAnagram); // true

    }
}
