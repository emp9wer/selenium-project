package src.day20_forEachArrayContinue;

import java.util.Arrays;

import src.utilities.ArraysUtility;

public class MergeTwoArrays {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7};

        int[] arr3 = new int[arr1.length+arr2.length]; // to make sure array has capacity for other arrays

       int k = 0;

        for (int i = 0; i < arr1.length; i++,k++) {
           arr3[k] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++,k++) {
            arr3[k] = arr2[i];
        }


        System.out.println(Arrays.toString(arr3));

        System.out.println("-------------using method------------");
// first - import -  import utilities.ArraysUtility;   merge method is overloaded (int double char String)
        int[] a1 = {111,4242,333,44422};
        int[] a2 = {55,62,73};
ArraysUtility.merge(a1,a2);
int[] a3 = ArraysUtility.merge(a1,a2);
System.out.println(Arrays.toString(a3));











    }





}
