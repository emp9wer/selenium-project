package src.day422;

import java.util.*;

public class Task5 {


    public static void main(String[] args) {

        /*
        3. Given the following lists that conatin the names of the students from each group:






         */

        List<String> group1 = new ArrayList<>(Arrays.asList( "Duygu","Magda","Farangez","Edison","Kerem","Farangis" ));

        List<String> group2 = new ArrayList<>(Arrays.asList( "Margie","Vesele","Iryn","Nilufar","Aziza","Nurcan","Raika","Igor","Elif","Sana","Azamat" ));

        List<String> group9 = new ArrayList<>(Arrays.asList( "Alex","Ali","Andriy","Cassandra","Sevgul","Olha","Tito","Ozan","Serkan","Furkan","Madina","Muharrem" ));

        List<String> group24 = new ArrayList<>(Arrays.asList( "Maria","Kristina","Amin","George","Layan","Amin","Yulia","George","Ayanle","Maxim","Nermin","Doughlas" ));

        List<String> group5 = new ArrayList<>(Arrays.asList("Nazar","Veronika","Mikael","Layla","Badmaa","Zaeir","Anna","Tamara","Eugene" ));


        System.out.println("  3.1 Create map that has integer as keys and List of Strings as values.\n" +
                "        \tadd the group number and students names of that group as a pair to the map");

        Map<Integer,List<String>> maps = new HashMap<>();
        maps.put(1,group1);
        maps.put(2,group2);
        maps.put(5,group5);
        maps.put(9,group9);
        maps.put(24,group24);

        System.out.println(maps);


        System.out.println("    \t3.2 Write a program that can display student names of the each group in 5 separate lines\n");

        for (List<String> value : maps.values()) {
            System.out.println(value);
        }

    }



}
