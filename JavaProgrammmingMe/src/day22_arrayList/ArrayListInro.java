package src.day22_arrayList;

import java.util.Arrays;
import java.util.ArrayList;
public class ArrayListInro {
    public static void main(String[] args) {

        int[] array = new int[5];

        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;
     //   array[5] = 60;   // index out of bound -disadvantage!

        System.out.println(Arrays.toString(array));

        System.out.println("-------------Array List------------");

        // import Java.util.ArrayList;

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println(list);
        System.out.println(list.size()); //0








    }
}
