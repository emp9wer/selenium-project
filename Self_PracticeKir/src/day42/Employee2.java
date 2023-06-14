package src.day42;

import java.util.LinkedHashMap;
import java.util.Map;

public class Employee2 {
//2. Given following map that contains employee name and employee salary:
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);

        System.out.println("2.1 who has the maximum and minimum salary?");
        Integer max = Integer.MIN_VALUE;
        Integer min = Integer.MAX_VALUE;
        String maxName="";
        String minName="";

        for (Map.Entry<String, Integer> ea : map.entrySet()) {
            if(ea.getValue()<min){
                min=ea.getValue();
                minName=ea.getKey();
            }
            if(ea.getValue()>max){
                max=ea.getValue();
                maxName=ea.getKey();
            }
        }
        System.out.println(minName+" "+min);
        System.out.println( maxName+" "+max);

        System.out.println("2.2 how many employees has the salary between 120k ~ 150K?");

        int count=0;

        for (Integer value : map.values()) {
            if(value>=120000&&value<=150000){
                count++;
            }
        }
        System.out.println(count);

        System.out.println("2.3 display the names of the employees who are making less than 118k?");

        for (Map.Entry<String, Integer> ea : map.entrySet()) {
            if(ea.getValue()<118000){
                System.out.println(ea.getKey()+" : "+ea.getValue());
            }
        }

        System.out.println("2.4 increase the salary employee by 10K if the current salary of employee is less than 120K");
        System.out.println(map);
        for (Map.Entry<String, Integer> ea : map.entrySet()) {
            if(ea.getValue()<120000){
                map.replace(ea.getKey(),ea.getValue()+10000);
            }
        }
        System.out.println(map);


    }
}
