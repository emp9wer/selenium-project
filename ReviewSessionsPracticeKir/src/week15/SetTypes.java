package week15;

import java.util.*;

public class SetTypes {
    public static void main(String[] args) {

        System.out.println("HashSet");
        Set<String> set1 = new HashSet<>();
        set1.add("zebra");
        set1.add("Java");
        set1.add("8");
        set1.add("!hello");
        set1.add(null);
        set1.add("Java");
        set1.add("!hi");
        System.out.println(set1);



        System.out.println("LinkedHashSet");
        Set<String> set2 = new LinkedHashSet<>();
        set2.add("zebra");
        set2.add("Java");
        set2.add("8");
        set2.add("!hello");
        set2.add(null);
        set2.add("Java");
        set2.add("!hi");
        System.out.println(set2);

        //sorting null not allowed - general rule

        System.out.println("TreeSet");
        Set<String> set3 = new TreeSet<>();
        set3.add("zebra");
        set3.add("Java");
        set3.add("8");
        set3.add("!hello");
       // set3.add(null); //null not allowed in treeset
        set3.add("Java");
        set3.add("!hi");
        System.out.println(set3);

           //remove duplicates from string
        String str = "AAABBBBCCCCDDDEEEEEFFF";

        str = (new LinkedHashSet<>(Arrays.asList(str.split(""))).toString().replace(",","").replace(" ","").replace("]","").replace("[",""));

        System.out.println(str); //  ABCDEF






    }

}
