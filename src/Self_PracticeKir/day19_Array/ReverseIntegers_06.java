package Self_PracticeKir.day19_Array;

import java.util.Arrays;

public class ReverseIntegers_06 {
    public static void main(String[] args) {
       int[] array = {1,2,3,4,5};
       int[] reversedArray = new int[array.length];

        for (int i = 0, j = array.length-1; i < array.length; i++ , j--) {
            reversedArray[j]=array[i];
        }

        System.out.println(Arrays.toString(reversedArray)); // [5, 4, 3, 2, 1]
    }
}
/*
6.  Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};
 */