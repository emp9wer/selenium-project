package src.day20_forEachArrayContinue;

import java.util.Arrays;

public class ArrayUtilityMethods {
    public static void main(String[] args) {

        System.out.println("----------Arrays.toString---------");

        int[] score = {70,100,80,90,65};
        System.out.println(Arrays.toString(score)); // [70, 100, 80, 90, 65]

        String result = Arrays.toString(score); // convert array to string
        System.out.println(result); // [70, 100, 80, 90, 65]


        System.out.println("-----------Arrays.equals()---------");

        int[] a1 = {1,2,3,4,5};
        int[] a2 = {1,2,3,4,5};
        boolean isEqual = Arrays.equals(a1,a2);
        System.out.println(isEqual); // true

        char[] ch1 = {'A','B'};
        char[] ch2 = {'B','A'};
        boolean isEqualch = Arrays.equals(ch1,ch2);
        System.out.println(Arrays.equals(ch1,ch2)); // false


        System.out.println("-----------sort()-----------"); // ascending order

        int [] nums = {100, 80 ,90, 75,88,99,0,5,4,155,32536};

        System.out.println(Arrays.toString(nums));//[100, 80, 90, 75, 88, 99, 0, 5, 4, 155, 32536]
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));//[0, 4, 5, 75, 80, 88, 90, 99, 100, 155, 32536]

        System.out.println("min num: "+ nums[0]);
        System.out.println("max num: "+ nums[nums.length-1]);

        System.out.println("---------------------------");

        String[] b1 = {"C","B","A"};
        String[] b2 = {"A","C","B"};
        Arrays.sort(b1); // {A, B, C}
        Arrays.sort(b2); // {A, B, C}
        System.out.println(Arrays.equals(b1,b2)); // true

        System.out.println("----------------------------");

        String[] students = {"Makalak","Magagad","Allamssa","Ajjahfa","Ujidak"};
        System.out.println(Arrays.toString(students));//[Makalak, Magagad, Allamssa, Ajjahfa, Ujidak]
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));//[Ajjahfa, Allamssa, Magagad, Makalak, Ujidak]


        System.out.println("------------copyOf()---------------");

        int[] array = {10,20,30,40,50,60,70};

        int[] array2 = Arrays.copyOf(array,7);

        System.out.println(Arrays.toString(array2)); // [10, 20, 30, 40, 50, 60, 70]

        int[] array3 = Arrays.copyOf(array,5);

        System.out.println(Arrays.toString(array3)); // [10, 20, 30, 40, 50]

        int[] array4 = Arrays.copyOf(array,10);

        System.out.println(Arrays.toString(array4)); // [10, 20, 30, 40, 50, 60, 70, 0, 0, 0]

        System.out.println("-------------------------------------");

        int[] n1 = {1,2,3,45,5,7,89,4};
        int[] n2 = {346,33,2232};
        int[] n3 = Arrays.copyOf(n1,n1.length+n2.length);
        System.out.println(Arrays.toString(n3)); //[1, 2, 3, 45, 5, 7, 89, 4, 0, 0, 0]

        for (int i = 0 , j= n1.length; i < n2.length; i++,j++) {
        n3[j] = n2[i];
        }
        System.out.println(Arrays.toString(n3)); // [1, 2, 3, 45, 5, 7, 89, 4, 346, 33, 2232]


        System.out.println("----------copyOfRange()-----------");

        char[] ch = {'a','b','c','d','e','f','g'};
        // index      0   1   2   3   4   5   6
        char[] res1 = Arrays.copyOfRange(ch,2,5); // does not include last index
        System.out.println(Arrays.toString(res1)); // [c, d, e]

        char[] res2 = Arrays.copyOfRange(ch,2,ch.length); // does not include last index ( to include last use .length
        System.out.println(Arrays.toString(res2)); // [c, d, e, f, g]

























    }
}
