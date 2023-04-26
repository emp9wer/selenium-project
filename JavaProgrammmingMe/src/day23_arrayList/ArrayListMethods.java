package src.day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {
    public static void main(String[] args) {

        System.out.println("-------------.set()--------------");

        ArrayList<String> groceriesList = new ArrayList<>();
        groceriesList.add("Eggs");
        groceriesList.add("paper towels");
        groceriesList.add("Apples");
        groceriesList.add("Cooking oil");

        System.out.println(groceriesList); //[Eggs, paper towels, Apples, Cooking oil]
        groceriesList.set(2,"oranges");
        System.out.println(groceriesList); //[Eggs, paper towels, oranges, Cooking oil]

        System.out.println("----------------.remove(index / object)--------------");
        groceriesList.remove(0);
        System.out.println(groceriesList); //[paper towels, oranges, Cooking oil]
        groceriesList.remove("paper towels");
        System.out.println(groceriesList); //[oranges, Cooking oil]

        System.out.println("------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10); //0
        numbers.add(20); //1
        numbers.add(30); //2
        numbers.add(40); //3
        numbers.add(50); //4

        boolean r1 = numbers.remove(Integer.valueOf(10));

        System.out.println(numbers);
        System.out.println(r1);

        System.out.println("---------.clear();------------");
        // numbers.clear();
      //  System.out.println(numbers); //[]

        ArrayList<String> names = new ArrayList<>();

        names.add("vasil"); //index 0
        names.add("vasil");// index 1
        names.add("samah");
        names.add("samah");
        names.add("ali");
        names.add("sumeve");
        names.add("shukir");
        names.add("marika");
        names.add("marika");

        //  System.out.println(names.indexOf("vasil")); //0
        //   System.out.println(names.lastIndexOf("vasil")); // 1

        for (String each : names) {
            if ( names.indexOf(each) == names.lastIndexOf(each)){
                System.out.println(each); //ali
                break; // if only first unique needed
            }
        }

        boolean hasMuhtar = names.contains("Muhtar"); // false
        boolean hasAli = names.contains("ali"); // true

        System.out.println("--------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = list1;

        list1.add(10);

        System.out.println(list1); //[10]
        System.out.println(list2); //[10]

        System.out.println(list1 == list2); // true
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(10);
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(10);
        System.out.println(l1==l2); // false (stored in diff memory)
        System.out.println(l1.equals(l2));//true

        System.out.println("------------------");

        ArrayList<Integer> n1 = new ArrayList<>();
        n1.add(10);
        n1.add(20);
        n1.add(30);
        ArrayList<Integer> n2 = new ArrayList<>();
        n2.add(30);
        n2.add(10);
        n2.add(20);
        System.out.println(n1.equals(n2)); // false



    }
}
