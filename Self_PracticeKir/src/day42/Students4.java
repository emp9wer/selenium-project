package src.day42;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Students4 {
    public static void main(String[] args) {
        System.out.println("4. Given the following arrays that contains the names of the students from each group:");
        String[] group1 = {"Alex","Cat","Mike"};
        String[] group2 = {"Nick","Dan","Maria"};
        String[] group3 = {"Nina","Pedro","Asia"};
        String[] group4 = {"Lola","Jane","Bob"};
        String[] group5 = {"Kane","Vasil","Kate"};

        System.out.println("4.1 Create a map that contains group id and names of group members");
        Map<Integer, String[]> groups = new LinkedHashMap();
        groups.put(1,group1);
        groups.put(2,group2);
        groups.put(3,group3);
        groups.put(4,group4);
        groups.put(5,group5);

        System.out.println("4.2 Display the names of each student with group id of 1");
        for (Map.Entry<Integer, String[]> ea : groups.entrySet()) {
            if(ea.getKey()==1){
                System.out.println(Arrays.toString(ea.getValue()));
            }
        }

        System.out.println("4.3 Display the names of each student from each groups");

        for (String[] value : groups.values()) {
            System.out.println(Arrays.toString(value));
        }







    }

}
