package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Duplicate_3 {
    public static void main(String[] args) {
        
        Integer[] list = {1,2,3,4,5};
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(list));



        numbers.addAll(numbers);
        System.out.println("numbers duplicate = " + numbers); //numbers duplicate = [1, 2, 3, 4, 5, 1, 2, 3, 4, 5]
        
    }
}
/*
3. Write a program that can duplicate the elements of an arraylist
		 	ex:
                list = [1,2,3,4,5];

            output:
            	[1,2,3,4,5,1,2,3,4,5];
 */