package src.day21_multiDimentionalArray;

import src.utilities.ArraysUtility;

import java.util.Arrays;

public class AddElements {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        int element = 6;
        int[]new_array = Arrays.copyOf(array,array.length+1);
        new_array[new_array.length-1] = element;
        System.out.println(Arrays.toString(new_array)); // [1, 2, 3, 4, 5, 6]

        System.out.println("--------------------");

        int[] numbers = { 100,90,80,70,60};
        System.out.println(Arrays.toString(numbers)); // [100, 90, 80, 70, 60]
       numbers = ArraysUtility.addElements(numbers,50);
        System.out.println(Arrays.toString(numbers)); // [100, 90, 80, 70, 60, 50]

String[] names = {"babba" , "fedya" , "vova"};
names = ArraysUtility.addElements(names,"lolka");
        System.out.println(Arrays.toString(names)); //[babba, fedya, vova, lolka]
names = ArraysUtility.addElements(names,"cheburchai");
        System.out.println(Arrays.toString(names)); //[babba, fedya, vova, lolka, cheburchai]




    }
}
