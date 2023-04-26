package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;


public class RemovaAll_2 {
    public static void main(String[] args) {

      String[] list = {"John", "Ahmed", "Daniel", "Ahmed", "James", "Muhammed"};

        ArrayList<String> names = new ArrayList<>(Arrays.asList(list));

        System.out.println("names = " + names);

        names.removeAll(Arrays.asList("Ahmed"));

        System.out.println("namesNoAhmed = " + names);



    }
}
/*
2. Write a program that can remove all the names "Ahmed" from an arraylist of String
			ex:
                list = ["John", "Ahmed", "Daniel", "Ahmed", "James", "Muhammed"];

            output:
            	["John", "Daniel", "James", "Muhammed"];
 */