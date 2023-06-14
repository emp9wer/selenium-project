package src.day40_collectionsContinue;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {

        Queue<Integer> queue1 = new PriorityQueue<>();
        queue1.addAll(Arrays.asList(10,200,300,40,90));
        queue1.addAll(Arrays.asList(10,200,300,40,90));
        queue1.addAll(Arrays.asList(10,200,300,40,90));
        queue1.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println(queue1);

        Queue<Integer> queue2 = new PriorityQueue<>();


        Queue<Integer> queue3 = new PriorityQueue<>();


        System.out.println("-------------------------------");
        List<Integer> list = new LinkedList<>();
        list.addAll(Arrays.asList(10,200,300,40,90));
        System.out.println(list.get(1));
        System.out.println(list);
        ((LinkedList)list).poll();
        System.out.println(list);
     //   ( (Stack)list).pop();

    }
}
