package src.day422;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task2 {
    /*
  Given following map that contains employee name and employee salary:

     */
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
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

        System.out.println(" 2.1 who has the maximum and minimum salary?");
        Integer max = Integer.MIN_VALUE;
        Integer min = Integer.MAX_VALUE;
        String maxName ="";
        String minName ="";
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
        System.out.println("max");
        System.out.println(maxName+" "+max);
        System.out.println("min");
        System.out.println(minName+" "+min);

        System.out.println("2.2 how many employees has the salary between 120k ~ 150K");
            int count=0;
        for (Integer value : map.values()) {
            if(value>120000&&value<150000){
                count++;
            }
        }
        System.out.println("count = " + count);

        System.out.println("2.3 display the names of the employees who are making less than 118k?");

        for (Map.Entry<String, Integer> ea : map.entrySet()) {
            if(ea.getValue()<118000){
                System.out.println(ea.getKey()+"  :  "+ea.getValue());
            }
        }
        System.out.println(map.keySet());//[John, Antony, Jimmy, Jalil, James, Conor, Josh, Cory, Anderson, Steven]

        System.out.println(map.values());//[123000, 100000, 115000, 145000, 110000, 85000, 117000, 118000, 125000, 135000]

        System.out.println(map.entrySet());
        //[John=123000, Antony=100000, Jimmy=115000, Jalil=145000, James=110000, Conor=85000, Josh=117000, Cory=118000, Anderson=125000, Steven=135000]
        System.out.println(map);//{John=123000, Antony=100000, Jimmy=115000, Jalil=145000, James=110000, Conor=85000, Josh=117000, Cory=118000, Anderson=125000, Steven=135000}

        System.out.println(" 2.4 increase the salary of employee by 10K if the current salary of employee is less than 120K");

        for (Map.Entry<String, Integer> ea : map.entrySet()) {
            if(ea.getValue()<120000){
                ea.setValue(ea.getValue()+10000);
            }
        }
        System.out.println(map);

    }
}
