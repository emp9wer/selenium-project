package src.day22_arrayList;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        System.out.println("------------.add()--------------");
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println(list); //[]

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);
        //list.add(5.5); // compiler error (Double to Integer)
        System.out.println(list); //[10, 20, 30, 10]

        list.add(1,15);

        System.out.println(list); //[10, 15, 20, 30, 10]

        list.add(2,25);

        System.out.println(list); //[10, 15, 25, 20, 30, 10]

        System.out.println("------------ .get()--------------");

        ArrayList<String> studentsList = new ArrayList<>();

        studentsList.add("Mohhamed");
        studentsList.add("Abdurasul");
        studentsList.add("Abidullah");
        studentsList.add("Tatiana");

        System.out.println(studentsList.size()); //4
        System.out.println(studentsList); //[Mohhamed, Abdurasul, Abidullah, Tatiana]
        //                        index          0          1         2         3
        String student1 = studentsList.get(0);
        System.out.println("student1 = " + student1); //student1 = Mohhamed

        String studentLast = studentsList.get(studentsList.size()-1);
        System.out.println("studentLast = " + studentLast);//studentLast = Tatiana

    }
}
