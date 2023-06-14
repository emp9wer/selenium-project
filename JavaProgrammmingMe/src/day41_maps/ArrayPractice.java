package src.day41_maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayPractice {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 2, 3, 0));

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(100, 5, 6, 7, 8));

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(34, 25, 3576));


        List<Integer>[] arrayOfLists = new List[3];
        arrayOfLists[0] = list1;
        arrayOfLists[1] = list2;
        arrayOfLists[2] = list3;

        System.out.println(Arrays.toString(arrayOfLists));

    }
}