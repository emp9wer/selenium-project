package src.day422;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        /*
        1. Create a map that can contain the student name (String) and student scores (int[]) as a pair (Assume that each student has 5 scores and make the student name unique)
		1.1 add at least 5 pairs into the map
		1.2 Write a program that can display each student name and scores
         */

        Map<String,int[]> studentsScores = new LinkedHashMap<>();
        studentsScores.put("James",new int[]{1,2,3,4,5});
        studentsScores.put("Dan",new int[]{4,5,7,5,3});
        studentsScores.put("Max",new int[]{9,8,7,6,5});
        studentsScores.put("Jane",new int[]{2,3,4,1,6});
        studentsScores.put("Asia",new int[]{2,4,6,7,8});

        System.out.println("\t\t1.2 Write a program that can display each student name and scores");

        for (Map.Entry<String, int[]> ea : studentsScores.entrySet()) {
            System.out.println(ea.getKey()+Arrays.toString(ea.getValue()));
        }


        System.out.println("using lambda");


        studentsScores.forEach((k,v)-> {
            System.out.println(k+" "+Arrays.toString(v));
        });



    }
}
