package src.day40_collectionsContinue;

import src.utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindromes {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java","Python","Level","Civic","kayak"));

        Iterator<String> it = names.iterator();
        while (it.hasNext()){
            String each = it.next();
            
            String reverse = "";

            for (int i = each.length()-1; i >= 0; i--) {
                reverse += each.charAt(i);
            }
            if(reverse.equalsIgnoreCase(each)){
                it.remove();
            }
        }
        System.out.println(names);

        System.out.println("===================================================");


        List<String> names1 = new ArrayList<>();
        names1.addAll(Arrays.asList("Java","Python","Level","Civic","kayak"));
        names1.removeIf(p -> StringUtility.reverse(p).equalsIgnoreCase(p));
        System.out.println(names1);

    }


}
