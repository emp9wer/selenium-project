package src.day21_multiDimentionalArray;

import java.util.Arrays;

public class MultidimensionalArrayIntro {
    public static void main(String[] args) {

        int[] arr1 = {10,20,30};
        int[] arr2 ={40,50,60,70,80};
        int[] arr3 ={90,100};

        System.out.println("-------------------------------");

        int[][] arr2D = {{10,20,30},{40,50,60,70,80},{90,100}};
                   //         0             1            2
        System.out.println(arr2D.length); // 3

        System.out.println(Arrays.toString(arr2D[0])); // [10, 20, 30]
        System.out.println(Arrays.toString(arr2D[1])); // [40, 50, 60, 70, 80]
        System.out.println(Arrays.toString(arr2D[2])); // [90, 100]

        System.out.println(arr2D[2][0]); // 90




    }
}
