package src.day42;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class Employees3 {
    public static void main(String[] args) {
        //Given the following map that contains the names and hired date of employees:

        Map<String, LocalDate> map = new LinkedHashMap<>();
        map.put("John", LocalDate.of(2018, 9, 5));
        map.put("Antony", LocalDate.of(2012, 7, 29));
        map.put("Jimmy", LocalDate.of(2014, 4, 1));
        map.put("James", LocalDate.of(2016, 11, 2));
        map.put("Josh", LocalDate.of(2020, 5, 15));
        map.put("Cory", LocalDate.of(2015, 6, 19));
        map.put("Anderson", LocalDate.of(2013, 8, 24));
        map.put("Steven", LocalDate.of(2017, 10, 2));


        System.out.println(" 3.1 Display the names of the employee who were hired before 2015 \n" +
                "                    Hint: You can use isBefore method of LocalDate");
        for (Map.Entry<String, LocalDate> ea : map.entrySet()) {
            if(ea.getValue().isBefore(LocalDate.of(2015,1,1))){
                System.out.println(ea);
            }
        }

        System.out.println("3.2 Display the name of the employee who were hired on 5/15/2020\n" +
                "                    Hint: You can use isEqual method of LocalDate");

        for (Map.Entry<String, LocalDate> ea : map.entrySet()) {
            if(ea.getValue().isEqual(LocalDate.of(2020,5,15))){
                System.out.println(ea);
            }
        }

        System.out.println("  3.3 How many people were hired after 2014?\n" +
                "                    Hint: You can use isAfter method of LocalDate");

        int count=0;
        for (Map.Entry<String, LocalDate> ea : map.entrySet()) {
            if(ea.getValue().isAfter(LocalDate.of(2014,1,1))){
                count++;
                System.out.println(ea);
            }
        }
        System.out.println(count);

        System.out.println(" 3.4 Display the name and hire date of the employee");

        for (Map.Entry<String, LocalDate> ea : map.entrySet()) {
            System.out.println(ea);
        }


    }
}
