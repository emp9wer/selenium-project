package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LargestNum_4 {
    public static void main(String[] args) {
      Integer[]  arraylist = {1,3,4,5,6,7,7,8,8,2};

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(arraylist));
        System.out.println("numbers = " + numbers); //numbers = [1, 2, 3, 4, 5, 6, 7, 7, 8, 8]
        Integer n = 5;

        ArrayList<Integer> noDup = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {

            if(noDup.contains(numbers.get(i))){
                continue;
            }
            noDup.add(numbers.get(i));
        }
        Collections.sort(noDup);
        Collections.reverse(noDup);
        System.out.println(noDup);
        System.out.println(noDup.get(n-1));

    }
}
/*
4. write a program that can return the nth largest number from an arraylist
            ex:
	            arraylist = {1,2,3,4,5,6,7,7,8,8}
	            n = 5

            output:
                4
 */