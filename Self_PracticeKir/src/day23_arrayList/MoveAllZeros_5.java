package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveAllZeros_5 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0));
        System.out.println(nums);//[1, 0, 2, 0, 3, 0, 4, 0]
        int length = nums.size();
        nums.removeAll(Arrays.asList(0));
        int lengthDiff = length-nums.size();
        for (int i = 0; i < lengthDiff; i++) {
            nums.add(0);
        }
        System.out.println(nums);  //[1, 2, 3, 4, 0, 0, 0, 0]

        System.out.println("--------------using loop ez-----------------");

        ArrayList<Integer> nums1 = new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0));

        for (int i = 0; i < nums1.size(); i++) {

            if(nums1.get(i)==0){
                nums1.remove(i);
                nums1.add(0);
            }
        }
        System.out.println(nums1);














    }





}
/*
5. Write a program that can move all the zeros to the last indexes of ArrayList
            ex:
                list: {1,0,2,0,3,0,4,0}

            output:
                [1, 2, 3, 4, 0, 0, 0, 0]
 */