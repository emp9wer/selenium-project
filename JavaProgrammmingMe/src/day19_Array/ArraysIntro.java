package src.day19_Array;
import java.util.Arrays; // arrays utility class to use .toString()
public class ArraysIntro {

    public static void main(String[] args) {

        int score1 = 85;
        int score2 = 75;
        int score3 = 78;
        int score4 = 88;
        int score5 = 95;

        System.out.println("---------------------------");

      //  int[] scores = new int[5]; //index numbers 0-4 // can be initialised in the same line  // min size of array is 0
        // scores = new int [5]; // or can be done on separate line

      //  System.out.println(scores); // when array passed in print statement it gives hash code // [I@27f674d

     //   System.out.println(Arrays.toString(scores)); // one of the ways to print array!

        int[] scores = new int[5]; // index 0~4

        scores[0] = 85;
        scores[1] = 75;
        scores[2] = 78;
        scores[3] = 88;
        scores[4] = 95;
      //scores[5] = 100;   // ArrayIndexOutOfBoundsException
      //scores[-1] = 100;   // ArrayIndexOutOfBoundsException // index starts from 0
      //  scores = new int[10]; // makes previous object collected by Garbage collector = array is empty
        System.out.println(Arrays.toString(scores)); // index 0~9 //old elements are gone

        System.out.println(scores[2]); // 78

        for (int i = 0; i < 5; i++) { // i: index numbers of scores array
            System.out.print(scores[i]+" ");
        }
        System.out.println();
        System.out.println("----------------");

       for (int i = 0; i < scores.length; i++) { // .length is instance variable of array
           System.out.print(scores[i]+" ");
       }
        System.out.println();
        System.out.println("-------------------");

        System.out.println(scores[scores.length-1]); // to print last index number









    }

}
