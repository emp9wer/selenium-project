package src.day22_arrayList;

import java.util.ArrayList;

public class IteratingArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);
        numbers.add(3,255);
       // numbers.add(100,122); // index out of bound
        System.out.println(numbers); // [100, 200, 300, 255, 400, 500]

        System.out.println("----------iterate using for loop----------");

        for(int i = 0; i < numbers.size(); i++){
            int each = numbers.get(i);
            System.out.print(each+" "); //100 200 300 255 400 500
        }
        System.out.println();
        System.out.println("-------reverse---------");
        for (int i = numbers.size() - 1; i >= 0; i--) {
            int each = numbers.get(i);
            System.out.print(each+" "); //500 400 255 300 200 100
        }
        System.out.println();
        System.out.println("------for loop--------");
        for (Integer each : numbers) {
            System.out.print(each+" ");//100 200 300 255 400 500
        }


    }
}
