package src.day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collection;
import java.util.Collections;


public class CollectionsUtility {

    public static void main(String[] args) {
        // 1) import java.util.Collections;

        System.out.println("---------------Collections.max()  /  min------------------");
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,1,2,3,4,5,6,7,8));
        int max = Collections.max(list);
        System.out.println("max = " + max);
        int min = Collections.min(list);
        System.out.println("min = " + min);;

        System.out.println("--------------Collections.sort()----------------");

        ArrayList<String> items = new ArrayList<>();
        items.addAll(Arrays.asList("eggs","potato","milk","tomato","rice","orange","strawberry","blueberry","paper towels"));

        Collections.sort(items);

        System.out.println("sorted items = " + items);
        //sorted items = [blueberry, eggs, milk, orange, paper towels, potato, rice, strawberry, tomato]

        System.out.println("--------------Collections.reverse()----------------");

        Collections.reverse(items);
        System.out.println("items reversed = " + items);
        //items reversed = [tomato, strawberry, rice, potato, paper towels, orange, milk, eggs, blueberry]

        System.out.println("--------------Collections.swap()----------------");

        ArrayList<String> items1 = new ArrayList<>();
        items1.addAll(Arrays.asList("eggs","potato","milk","tomato","rice","orange","strawberry","blueberry","paper towels"));
    //items1 index 0 swap to index 1 = [potato, eggs, milk, tomato, rice, orange, strawberry, blueberry, paper towels]
        Collections.swap(items1,0,1);
        System.out.println("items1 index 0 swap to index 1 = " + items1);








    }
}
