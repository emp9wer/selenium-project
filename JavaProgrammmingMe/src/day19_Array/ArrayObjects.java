package src.day19_Array;

import java.util.Arrays;

public class ArrayObjects {
    public static void main(String[] args) {

        int[] arr1 = {10,20,30,40,50}; // in heap
        int[] arr2 = arr1; // in stack
        int[] arr3 = arr2; // in stack

        arr1[0]=1000; // will change first index in all 3
        arr2[2]=3000;  // will change first index in all 3

        System.out.println(Arrays.toString(arr1)); //[1000, 20, 3000, 40, 50]
        System.out.println(Arrays.toString(arr2)); //[1000, 20, 3000, 40, 50]
        System.out.println(Arrays.toString(arr3)); //[1000, 20, 3000, 40, 50]

        System.out.println("------------------------");

        String[] a1 = {"Umran","Mehmet"};  // GC
        a1 = new String[]{"James","Daniel","Mike"};
        System.out.println(Arrays.toString(a1)); //[James, Daniel, Mike]



    }
}
