package Self_PracticeKir.day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxMin_4 {
    public static void main(String[] args) {
      ArrayList<Integer> list = new ArrayList<>();
      int[] nums={1,2,3,4,5};
      Integer[] n = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            n[i] = nums[i];
        }

      list.addAll(Arrays.asList(n));

        System.out.println(list); //[1, 2, 3, 4, 5]

        int max = list.get(0);
        int min = list.get(0);
        for (Integer ea : list) {
            if(ea>max){
                max=ea;
            }else {
                min=ea;
            }
        }
        System.out.println("max = " + max);//max = 5
        System.out.println("min = " + min);//min = 1
    }
}
/*
4. Write a program that can find the maximum & minimum numbers from an ArrayList of integers
        Ex:
            list = [1,2,3,4,5];

            output:
                Maximum number is 5
                Minimum number is 1

 */