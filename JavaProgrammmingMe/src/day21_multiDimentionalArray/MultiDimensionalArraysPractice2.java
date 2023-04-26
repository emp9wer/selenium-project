package src.day21_multiDimentionalArray;

import java.util.Arrays;

public class MultiDimensionalArraysPractice2 {

    public static void main(String[] args) {

        int[][] arr2D  = {{1,2},{3,4,5}};
        int[][] arr2D2 = {{6,7,8,9},{10,11},{12,13,14}};
        int[][] arr2D3 = {{15,16,17,18}};

       // int[][][] arr3D = {arr2D,arr2D2,arr2D3}; // container for 2d arrays



//                             0      1            0        1        2                0         index of 1d array
        int[][][] arr3D = { {{1,2},{3,4,5}} , {{6,7,8,9},{10,11},{12,13,14}} , {{15,16,17,18}} };
//                            0 1   0 1 2       0 1 2 3   0  1    0  1  2        0  1  2  3    index ea element
   //                             0                          1                         2        index of 2d array

        // [x]      index of 2d array
        // [][x]    index of 1d array
        // [][][x]  index of element of 1d array

        System.out.println(Arrays.deepToString(arr3D[1])); //[[6, 7, 8, 9], [10, 11], [12, 13, 14]] 2d from 3d array

        System.out.println(Arrays.toString(arr3D[0][1])); //[3, 4, 5] 1d from 3d array
        System.out.println(Arrays.toString(arr3D[1][0])); // [6, 7, 8, 9] 1d from 3d array

        System.out.println(arr3D[1][2][0]); // 12

        System.out.println("----------------------------------------------------------");

        for (int i = 0; i < arr3D.length; i++) { // i index num of 2d array
            int[][] each2DArray = arr3D[i];
            System.out.println(Arrays.deepToString(each2DArray));

            for (int j = 0; j < each2DArray.length; j++) { // j - each index of 1d array
                int[] each1DArray = each2DArray[j];
                System.out.println(Arrays.toString(each1DArray));

                for (int k = 0; k < each1DArray.length; k++) { // k - each index of element

                    int eachElement = each1DArray[k];
                    System.out.println(eachElement);
                }
            }
        }








    }

}
