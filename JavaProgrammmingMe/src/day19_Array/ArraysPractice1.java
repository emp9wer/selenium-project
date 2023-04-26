package src.day19_Array;

import java.util.Arrays;

public class ArraysPractice1 {
    public static void main(String[] args) {

        String[] myGroup = new String[5];

        myGroup[0]="Gulcin";
        myGroup[myGroup.length-1]="Aseel"; // last index
        System.out.println(Arrays.toString(myGroup)); // [Gulcin, null, null, null, Aseel]
        myGroup[2]="Sumeve";
        myGroup[1]="Abidullah";
        myGroup[3]="Khashavar";
        System.out.println(Arrays.toString(myGroup)); // [Gulcin, Abidullah, Sumeve, Khashavar, Aseel]

        myGroup[1]="Kuzzat";
        System.out.println(Arrays.toString(myGroup)); // [Gulcin, Kuzzat, Sumeve, Khashavar, Aseel]

        System.out.println("--------------------");

        System.out.println("to print in reverse");
        for (int i = myGroup.length-1; i >= 0; i--) {
            System.out.print(myGroup[i] + " "); // Aseel Khashavar Sumeve Kuzzat Gulcin
        }
        System.out.println();

        System.out.println("--------------------------------");

        for (int i = 0; i < myGroup.length; i++) {  //  myGroup.fori shortcut for loop

        }

        for (int i = myGroup.length - 1; i >= 0; i--) { // myGroup.forr shortcut for reverse loop

        }










    }
}
