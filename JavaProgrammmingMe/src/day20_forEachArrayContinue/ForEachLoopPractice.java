package src.day20_forEachArrayContinue;

import java.util.Arrays;

public class ForEachLoopPractice {
    public static void main(String[] args) {

        int[] numbers  ={1,2,3,4,5,6,7,8,9,10,11};

        for (int each : numbers) {
            if(each%2 !=0){
                System.out.println(each);
            }
        }

        System.out.println("----------maxmin--------------------");

        int[] nums = {100,20,30,40,5,4,3,1,2,1000,300,500};

        int max = nums[0];
        int min = nums[0];
        for (int ea : nums) {
            if(ea>max){
                max = ea;
            }
            if (ea < min){
                min = ea;
            }
        }
        System.out.println(max); // 1000
        System.out.println(min); // 1

        System.out.println("-----------------------merge---------------------");

        int[] a1 = {100,2410,3041};
        int[] a2 = {415,4443,100,300,500};

        int[] a3 = new int [a1.length+a2.length];

        int k =0;

        for (int i : a1) {
            a3[k++] =i;
        }

        for (int i : a2) {
            a3[k++] =i;
        }
        System.out.println(Arrays.toString(a3)); //[100, 2410, 3041, 415, 4443, 100, 300, 500]


        System.out.println("----------------------");

        String[] names = {"baba haha", "maka saka" , "shaka laka", "lolka bolka","naka malaka"};

        for (String each : names) {
            System.out.println(each.charAt(0)+"."+each.charAt(each.lastIndexOf(" ")+1));
        }

    }
}
