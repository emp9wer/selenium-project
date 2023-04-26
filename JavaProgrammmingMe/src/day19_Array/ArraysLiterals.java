package src.day19_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysLiterals {

    public static void main(String[] args) {

        int[] number = new int[5]; // 0~4 index

        int[] nums = {10,20,30,40,50}; // 0~4 index // if you know what elements are and how many; //array literal

        System.out.println(Arrays.toString(number)); // [0, 0, 0, 0, 0]
        System.out.println(Arrays.toString(nums)); // [10, 20, 30, 40, 50]


        System.out.println("----------------days of week task--------------------");

        String[] days = {"Mon","Tue","Wed","Th","Fr","Sat","Sun"};

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number of week 1~7");
        int day = scan.nextInt();
        if(day>=1 && day<=7){
            System.out.println(days[day-1]);
        }else{
            System.out.println("wrong number");
        }

        System.out.println("---------------reverse-----------------");

        String[] months = {"jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};

        System.out.println("months = " +Arrays.toString(months));

        for (int i = months.length - 1; i >= 0; i--) {
            System.out.print(months[i]+", ");

        }







    }


}
