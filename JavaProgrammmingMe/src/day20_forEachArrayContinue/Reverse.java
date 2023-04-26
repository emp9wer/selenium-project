package src.day20_forEachArrayContinue;

import src.utilities.ArraysUtility;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        int[] reverse = new int[array.length];

        for (int i = array.length - 1 ,j=0; i >= 0; i--) {
            reverse[j++] = array[i];
        }
        System.out.println(Arrays.toString(reverse));

        System.out.println("-------------------------");

        int[] array1 = {1,2,3,4,5,7,8,90,235,2,35,325,2,53,235,2,6,4,547,4,78,6,86,836,8745,2,53};
        array1 = ArraysUtility.reverse(array1);
        System.out.println(Arrays.toString(array1));
    }
}
