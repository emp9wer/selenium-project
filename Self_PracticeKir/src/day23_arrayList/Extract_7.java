package src.day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Extract_7 {
    public static void main(String[] args) {
            String str = "ABCD123$%#@&456EFG!";
            char[] letters = str.toCharArray();
        System.out.println(Arrays.toString(letters)); //[A, B, C, D, 1, 2, 3, $, %, #, @, &, 4, 5, 6, E, F, G, !]

       ArrayList<Character> list1 = new ArrayList<>(); //nums
       ArrayList<Character> list2 = new ArrayList<>(); //chars
       ArrayList<Character> list3 = new ArrayList<>(); //special

        for (char ea : letters) {
            if(Character.isDigit(ea)){
                list1.add(ea);
            } else if (Character.isLetter(ea)) {
                list2.add(ea);
            } else if (!Character.isLetterOrDigit(ea)) {
                list3.add(ea);
            }
        }
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);

    }
}
/*

7. Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
                Ex:
                    str = "ABCD123$%#@&456EFG!"

                output:
                    list1: {1, 2, 3, 4, 5, 6}
                    list2: {A, B, C, D, E, F, G}
                    list3: {$, %, #, @, &, !}
 */