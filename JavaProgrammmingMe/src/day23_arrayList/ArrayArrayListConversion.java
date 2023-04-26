package src.day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayArrayListConversion {

    public static void main(String[] args) {

        String[] arr = {"A","B","C","D"};

        ArrayList<String> list  = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list); //[A, B, C, D]

        System.out.println("------------------------");

        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Java","Python","C#"));
        String[] languages = list2.toArray(new String[0]); // best to give 0 or list2.size()
        System.out.println(Arrays.toString(languages)); //[Java, Python, C#]


    }
}
