package src.day42;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Students1 {
    /*
    1. Create a map that can contain the student name (String) and student scores (int[]) as a pair (Assume that each student has 5 scores and make the student name unique)
		1.1 add at least 5 pairs into the map
		1.2 Write a program that can display each student name and scores

     */
    public static void main(String[] args) {

        Map<String,int[]> studentScores = new LinkedHashMap<>();
        studentScores.put("John", new int[]{6, 2, 3, 4, 5});
        studentScores.put("Antony", new int[]{2, 3, 4, 5, 6});
        studentScores.put("Jimmy", new int[]{2, 3, 8, 5, 7});
        studentScores.put("Jalil", new int[]{1, 4, 7, 7, 4});
        studentScores.put("James", new int[]{2, 4, 5, 6, 3});

        for (Map.Entry<String, int[]> stringEntry : studentScores.entrySet())
            System.out.println(stringEntry.getKey()  + Arrays.toString(stringEntry.getValue()));

    }
}
