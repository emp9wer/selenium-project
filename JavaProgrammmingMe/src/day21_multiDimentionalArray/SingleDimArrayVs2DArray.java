package src.day21_multiDimentionalArray;

import java.util.Arrays;

public class SingleDimArrayVs2DArray  {
    public static void main(String[] args) {

        int[] arr1D = new int[10];
        System.out.println(Arrays.toString(arr1D)); // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        int[][] arr2D = new int[5][];

        arr2D[0] = arr1D;

        System.out.println(Arrays.deepToString(arr2D)); // [[0, 0, 0, 0, 0, 0, 0, 0, 0, 0], null, null, null, null]
    }
}
