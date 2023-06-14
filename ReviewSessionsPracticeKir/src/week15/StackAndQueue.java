package week15;

import java.util.*;

public class StackAndQueue {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        stack.push("hello");
        stack.push("world");
        stack.push("java");
        stack.push("selenium");

        System.out.println(stack);//prints stack
        System.out.println(stack.peek()); //shows top of the stack (last added element)

        System.out.println("----------PriorityQueue----------");
        Queue<String> queue1 = new PriorityQueue();
        queue1.offer("james");
        queue1.offer("ana");
        queue1.offer("asia");
        System.out.println(queue1);

        System.out.println(queue1.peek()); //element()

        System.out.println("---------ArrayDeque----------");


        Queue<String> queue2 = new ArrayDeque<>();
        queue2.offer("james");
        queue2.offer("ana");
        queue2.offer("asia");
        System.out.println(queue2);

        System.out.println(queue2.peek()); //element() -- checks top of queue
        System.out.println(queue2.poll()); // removes top of queue
        System.out.println(queue2.peek()); //element()
        System.out.println(queue2);
        System.out.println("-------------------");


        List<Integer> list = new ArrayList<>(Arrays.asList(4,2,6,4,8,3,5,7,2,1,6,2,5,5));

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            if(it.next()<5){
                it.remove();
            }
        }
        System.out.println(list);

    }
}
