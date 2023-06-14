package src.day40_collectionsContinue;

import java.util.*;

public class CollectionsPractice {

    public static void main(String[] args) {

        Collection<Integer> collection = new ArrayList<>();
        collection.add(100);
        collection.addAll(Arrays.asList(100,200,100,200,300,400,500,600,700));
        System.out.println(collection);

        System.out.println( ((ArrayList)collection).get(2) );

       // System.out.println( ((Stack) collection).pop() ); //.ClassCastException

        System.out.println("------------------------");

        Collection<Integer> collection2 = new HashSet<>();
        collection2.addAll(Arrays.asList(100,200,100,200,300,400,500,600,700,100,100));
        System.out.println(collection2);

     //   System.out.println(((ArrayList)collection2).get(4));//.ClassCastException

        System.out.println(new ArrayList<>(collection2) );

    }
}
