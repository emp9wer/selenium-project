package week7;

import java.util.Scanner;

public class Memory {
    public static void main(String[] args) {

        Scanner front = new Scanner(System.in);
        // reference: Scanner input
        // object: new Scanner(System.in);
        Scanner back; // just a reference, no object
        back = front; // the back reference also has access to the same object from line 8

        front = null; // the front reference no longer has access to the object from line 8
        // Q: is the object one line 8 eligible for GC?
        // NO, back reference still has access

        back = null; // I removed the other reference of the object, so now it is eligible for GC

        int[] a = {1, 2, 3};
        a = new int[]{1, 2, 3, 4, 5}; // creates a new array

    }
}
