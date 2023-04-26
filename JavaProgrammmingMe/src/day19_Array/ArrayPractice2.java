package src.day19_Array;

import java.util.Arrays;

public class ArrayPractice2 {
    
    public static void main(String[] args) {
        
        int[] arr1 = new int[100];

        for (int i = 0, j = 10; i < arr1.length; i++,j+=10) {
            arr1[i] = j;
        }
        System.out.println("Arrays.toString(arr1) = " + Arrays.toString(arr1));
    /* Arrays.toString(arr1) = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, 210, 220, 230, 240, 250, 260, 270, 280, 290, 300, 310, 320, 330, 340, 350, 360, 370, 380, 390, 400, 410, 420, 430, 440, 450, 460, 470, 480, 490, 500, 510, 520, 530, 540, 550, 560, 570, 580, 590, 600, 610, 620, 630, 640, 650, 660, 670, 680, 690, 700, 710, 720, 730, 740, 750, 760, 770, 780, 790, 800, 810, 820, 830, 840, 850, 860, 870, 880, 890, 900, 910, 920, 930, 940, 950, 960, 970, 980, 990, 1000] */

        System.out.println("--------------100to1---------------");
        
        int[] arr2 = new int[100];
        for (int i = arr2.length - 1 , j =1; i >= 0; i--, j++) {
            arr2[i] = j;
        }
        System.out.println("arr2 = " +Arrays.toString(arr2));

        System.out.println("-------------OR-------------");

        int[] arr3 = new int[100];
        for (int i = 0, j =100; i < arr3.length; i++,j--) {
            arr3[i]=j;
        }
        System.out.println("arr3 = " +Arrays.toString(arr3));

        System.out.println("-------------OR-------------");

        int[] arr4 = new int[100];
        for (int i = 0; i < arr4.length; i++) {
            arr4[i]=100-i;
        }
        System.out.println("arr4 = " +Arrays.toString(arr4));
    }
}
