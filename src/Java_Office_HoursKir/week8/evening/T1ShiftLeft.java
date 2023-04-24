package Java_Office_HoursKir.week8.evening;

import java.util.Arrays;

public class T1ShiftLeft {
    public static void main(String[] args) {

        int[] a = {1,2,3};
   // index        0 1 2

        int temp = a[0];
             //value  1

        for (int i = 0; i < a.length-1; i++) {
            a[i] = a[i+1];
            //1      2
            //2      3
            // int[] a = {2,3,3};
        }
            a[a.length-1]= temp;
         //  // int[] a = {2,3,1};
        System.out.println(Arrays.toString(a));

        System.out.println();

        int[] a1 = {1,2,3,4,5,6,7};
        int[] res = new int[a1.length];

        for (int i = 0; i < a1.length-1; i++) {
            res[i]=a1[i+1];
        }
        res[res.length-1]=a1[0];
        System.out.println(Arrays.toString(res)); //[2, 3, 4, 5, 6, 7, 1]
    }
}
/*
T1ShiftLeft [array, loop]

    Create a program that will define an int array with any number of elements. Print out the array with all the elements shifted one position to the left. The first element would be moved to the end

    Ex:
        {1, 2, 3} -> [2, 3, 1]
        {17, 14, 5, 10} -> [14, 5, 10, 17]
        {7, 0, 1} -> [0, 1, 7]
 */