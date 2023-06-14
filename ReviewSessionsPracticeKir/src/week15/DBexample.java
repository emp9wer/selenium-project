package week15;

import week13.ExerciseTask.Lifting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DBexample {

    /*
    FIRST_NAME
    LAST_NAME
    ADDRESS
     */

    public static void main(String[] args) {
        Map<String,String> person1 = new HashMap<>();
        person1.put("FIRST_NAME","James");
        person1.put("LAST_NAME","Bond");
        person1.put("ADDRESS","007 M16 Lane");
        System.out.println(person1.get("FIRST_NAME"));

        List<Map<String,String>> allPeople = new ArrayList<>();
        allPeople.add(person1);
        allPeople.add(Map.of("FIRST_NAME","Perry","LAST_NAME","Boondo","ADDRESS","14124 fafaf way"));
        System.out.println(allPeople);
        //what is the element of the List?? MAp of String, String

        //mini task: last name of everyone

        for (Map<String, String> allPerson : allPeople) {
            System.out.println(allPerson.get("LAST_NAME"));
        }


    }

}
