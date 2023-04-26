package src.day19_Array;

import java.util.Arrays;

public class Array1to100 {
    public static void main(String[] args) {

        int[] oneToHundred = new int[100];
        for (int i = 0; i < oneToHundred.length; i++) {
            oneToHundred[i]=i+1;
        }
        System.out.println(Arrays.toString(oneToHundred));

        System.out.println("--------------OR-------------");

        int[] arr1 = new int[100];
        for (int i = 0, j = 1; i < arr1.length; i++,j++) { // use of another variable that increments;
            arr1[i] = j;
        }
        System.out.println(Arrays.toString(arr1));
    }
}
