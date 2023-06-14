package src.day39_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class ListDemo {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();// array based class  // get is faster
        //arrayList.get(0);


        List<Integer> linkedList = new LinkedList<>();// node based class  // get is slower => add,addAll,remove, removeAll,retainAll - are faster
    //    linkedList.get(0);

        System.out.println("------------");

        Stack<Integer> stack = new Stack<>();
        stack.add(100);
        stack.add(200);
        stack.add(300);
        System.out.println(stack);
        int lastElement = stack.pop();
        System.out.println(stack);

      int secondLastElement = stack.pop();
        System.out.println(secondLastElement);








    }
}
