package Self_PracticeKir.day19_Array;

import java.util.Arrays;

public class MoveZero_me {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 1, 0, 10, 0, 0, 5, 0, 1, 1, 0, 1}; //given array
        //               1  1  10 0 00 0000

        int[] res = new int[numbers.length]; //create result array to store result it. //
        //    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0
        //    1  1  10
            int t =0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) { // we found not 0
                res[t++] = numbers[i]; // if we find in numbers[] element that is != 0   then  array res[] that starts with index 0; (that contains all 0 in all indexes)     at index  t  gets value of numbers[] and index of res[] ++;
            }
        }
        System.out.println(Arrays.toString(res)); // [1, 1, 10, 5, 1, 1, 1, 0, 0, 0, 0, 0, 0]
    }
}
/*
7. write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}

 */