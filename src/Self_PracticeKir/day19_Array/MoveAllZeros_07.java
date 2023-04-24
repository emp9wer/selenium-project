package Self_PracticeKir.day19_Array;

import java.util.Arrays;

public class MoveAllZeros_07 {
    public static void main(String[] args) {

        int[] array = {10, 0, 5, 0, 1, 0,};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[count++] = array[i];
            }
        }
        while (count < array.length) {
            array[count++] = 0;
        }
        System.out.println(Arrays.toString(array));
    }
}
/*
7. write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}
 */