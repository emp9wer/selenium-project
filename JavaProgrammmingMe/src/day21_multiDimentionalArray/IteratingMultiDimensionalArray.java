package src.day21_multiDimentionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray {
    public static void main(String[] args) {
    //index of elements 0  1  2    0  1  2  3  4    0  1
        int[][] arr2D = {{10,20,30},{40,50,60,70,80},{90,100}};
    //index of 1d array     0             1            2

        for(int i = 0 ; i< arr2D.length ; i++ ){  // i - index number of one 1d arrays in arr2D
             int[] each1D = arr2D[i];
            System.out.println(Arrays.toString(each1D));

            for (int j = 0; j < each1D.length ; j++) { // j index of elements in each 1d array of 2d array

                int eachElement = each1D[j];
                System.out.println(eachElement);
            }

        }

        System.out.println("----------------print each-----------------------");

        for(int[] each1DArray : arr2D ){
            System.out.println(Arrays.toString(each1DArray));

            for (int eachElement : each1DArray) {
                System.out.println(eachElement);
            }
        }


        System.out.println("----------------reverse---------------");


        for (int i = arr2D.length - 1; i >= 0; i--) {
            for (int j = arr2D[i].length - 1; j >= 0; j--) {
                System.out.print(arr2D[i][j]+" "); // 100 90 80 70 60 50 40 30 20 10
            }
        }












    }
}
