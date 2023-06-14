package src.day40_collectionsContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterableExample {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,1,1,8,9,0,0,5,35,5,5,5,6,7,11));

        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){
          Integer each = it.next();
          if(each<5){
              it.remove();
          }
        }
        System.out.println(list);

        System.out.println("--------------------");

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1,2,3,4,5,1,1,8,9,0,0,5,35,5,5,5,6,7,11));

        for (Iterator<Integer> i = list3.iterator(); i.hasNext();){
            Integer each = i.next();
            if(each<5){
                i.remove();
            }
        }
        System.out.println(list3);
        System.out.println("-----------------------------");
        List<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(1,2,3,4,5,1,1,8,9,0,0,5,35,5,5,5,6,7,11));

        list4.removeIf( each -> each<5);
        System.out.println(list4);



        System.out.println("---------------------------------");
        List<Integer> list5 = new ArrayList<>();
        list5.addAll(Arrays.asList(1,2,3,4,5,1,1,8,9,0,0,5,35,5,5,5,6,7,11));

        System.out.println(list5);


    }



}
