package src.day40_collectionsContinue;

import java.util.*;

public class IterablePractice1 {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1));
        Iterator<Integer> iterator = list.iterator();
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());

        System.out.println("------------------------------------------");

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ahmed","ahmed","babba","chris"));
       Iterator<String> it = names.iterator();

       while(it.hasNext()){
        String each = it.next();
        if(each.equalsIgnoreCase("ahmed")){
            it.remove();
        }
       }
        System.out.println(names);

        System.out.println("-------------------");

        int n = 5;

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,7,0,5,67,98,9,9,0,0,1));

        for (int i = 0; i<n-1; i++){
            numbers.removeIf(p -> Collections.max(numbers)==p);

        }
        int max = Collections.max(numbers);
        System.out.println(max);







    }



}
