package day24_dateTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DisplaySecondMaxMin_5 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 1, -2, -2, -2, 3, 4, 5, 6, 7, 8, 8, 8, 8));

        nums.removeIf(p -> p.equals(Collections.max(nums)));
        nums.removeIf(p -> p.equals(Collections.min(nums)));

        Collections.sort(nums);
        System.out.println(nums);
        int secondMax = nums.get(nums.size()-1);
        int secondMin = nums.get(0);
        System.out.println("secondMax = " + secondMax);
        System.out.println("secondMin = " + secondMin);




    }
}
/*
5. Write a program that can display the second maximum and minimum numbers from an arraylist of integers
		ex:
			list = {1, 1, -2, -2, -2, 3, 4, 5, 6, 7, 8, 8, 8, 8}

		output:
			second maximum number is 7
			second minimum number is 1

	Note: DO NOT use any loops
 */