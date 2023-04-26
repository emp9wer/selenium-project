package src.day19_Array;

import java.util.Arrays;

public class Array100to1 {
    public static void main(String[] args) {

        int[] hundredToOne = new int[100];

     /* for (int i = hundredToOne.length - 1; i >= 0; i--) {
            hundredToOne[hundredToOne.length-1-i]=i+1;
        }
        System.out.println(Arrays.toString(hundredToOne));*/

                             //or

        for (int i = 0; i < hundredToOne.length; i++) {
            hundredToOne[hundredToOne.length-1-i]=i+1;
        }
        System.out.println(Arrays.toString(hundredToOne));

        System.out.println("---------OR-----------");

        int[] arr2 = new int[100];
        for (int i = arr2.length - 1 , j =1; i >= 0; i--, j++) {
            arr2[i] = j;
        }
        System.out.println("arr2 = " +Arrays.toString(arr2));

    }
}
