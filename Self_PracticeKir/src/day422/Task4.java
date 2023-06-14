package src.day422;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task4 {
    /*
    4. Given the following arrays that contains the names of the students from each group:
	        String[] group1 = {};
	        String[] group2 = {};
	        String[] group3 = {};
	        String[] group4 = {};
	        String[] group5 = {};



	            Map<Integer, String[]> groups = new LinkedHashMap();

	        add all the group 1d and group members into the map named groups




     */

    public static void main(String[] args) {

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

        System.out.println(" 4.2 Display the names of each student with group id of 1");
        System.out.println(Arrays.toString(groups.get(1)));


        System.out.println("4.3 Display the names of each student from each groups");

        for (String[] value : groups.values()) {
            System.out.println(Arrays.toString(value));
        }



    }
}
