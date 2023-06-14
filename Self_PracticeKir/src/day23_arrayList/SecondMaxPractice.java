package src.day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class SecondMaxPractice {
    public static void main(String[] args) {

        ArrayList <Integer> nums = new ArrayList<>(Arrays.asList(99,1,2,3,4,5,6,7,8,8,9,9,9,22,21));

        int max = Integer.MIN_VALUE;
                int secondTomax = nums.get(0);

        for (Integer ea : nums) {
            if(ea>max){
                secondTomax=max;
                max=ea;
            }
            if(secondTomax<ea && ea < max){
                secondTomax= ea;
            }

        }
        System.out.println(secondTomax);





    }
}
