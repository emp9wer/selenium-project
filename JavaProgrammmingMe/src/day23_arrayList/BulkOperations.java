package src.day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        System.out.println("-----------------.addAll()-------------------");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

    list1.addAll(2,numbers);

        System.out.println(list1); //[1, 2, 10, 20, 30, 40, 3]

        System.out.println("------------------.asList()------------------");

        ArrayList<Integer>scores = new ArrayList<>();

        scores.addAll(Arrays.asList(75,85,95,70,80));

        System.out.println(scores); //[75, 85, 95, 70, 80]

        System.out.println("--------------");

        ArrayList<String>students = new ArrayList<>();

        students.addAll(Arrays.asList("Gadir","Hasan","Abidullah","Bilal"));
        System.out.println(students); //[Gadir, Hasan, Abidullah, Bilal]

       students.addAll(2,Arrays.asList("Shukur","Sumeve","Tatiana"));
        System.out.println(students);//[Gadir, Hasan, Shukur, Sumeve, Tatiana, Abidullah, Bilal]

        System.out.println("-------------------------------------");

        Integer[] nums = {1,2,3,4,5,6,7,8};
        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(nums));
        //l1.addAll( Arrays.asList(nums));
        System.out.println(l1); //[1, 2, 3, 4, 5, 6, 7, 8]

        System.out.println("---------------.containsAll()----------------------");

        ArrayList<String> employeeList = new ArrayList<>();
        employeeList.addAll(Arrays.asList("Alena","Muhtar","Gadir","Ali"));
        System.out.println(employeeList);
        boolean hasAlena = employeeList.contains("Alena");
        boolean hasAlenaGadir = employeeList.containsAll(Arrays.asList("Alena","Gadir"));

        System.out.println("hasAlena = " + hasAlena);

        System.out.println("hasAlenaGadir = " + hasAlenaGadir);

        System.out.println("-----------------------.removeAll()--------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,20,30,40,50,60,70,10,10,10,20,20,20,20));
        list.removeAll((Arrays.asList(10,20)));
        System.out.println(list); //[30, 40, 50, 60, 70]

        System.out.println("---------------.retainAll()----------------");

        ArrayList<String> developers = new ArrayList<>();
        developers.addAll(Arrays.asList("Alena","Muhtar","Gadir","Ali","Kashavar","Madiyar","Muhtar","Muhtar"));

        developers.retainAll(Arrays.asList("Alena","Kashavar"));
        System.out.println(developers);

        
    }
}
