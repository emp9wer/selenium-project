package src.day42_maps;

import java.time.LocalDate;
import java.util.*;

public class MapPractice2 {

    public static void main(String[] args) {

        Map<String, Object> person1 = new LinkedHashMap<>();
        person1.put("name", "Arthur");
        person1.put("gender", 'M');
        person1.put("age", 32);
        person1.put("job_title", "Developer");
        person1.put("salary", 100000.5);
        person1.put("hire_date", LocalDate.of(2021,1,15));
        person1.put("married", true);

        Map<String, Object> person2 = new LinkedHashMap<>();
        person2.put("name", "Nora");
        person2.put("gender", 'F');
        person2.put("age", 31);
        person2.put("job_title", "Back end Developer");
        person2.put("salary", 120000.5);
        person2.put("hire_date", LocalDate.of(2022,4,22));
        person2.put("married", true);

        System.out.println(person2.get("name"));
        System.out.println(person2.get("job_title"));


        Map<String, Object> person3 = new LinkedHashMap<>();
        person3.put("name", "Fiby");
        person3.put("gender", 'F'); 
        person3.put("age", 22);
        person3.put("job_title", "Back end ");
        person3.put("salary", 212122);
        person3.put("hire_date", LocalDate.of(2022,5,21));
        person3.put("married", false);

        Map<String, Object> person4 = new LinkedHashMap<>();
        Map<String, Object> person5 = new LinkedHashMap<>();

        List<Map<String,Object>> listOfMap= new ArrayList<>();

        listOfMap.add(person1);
        listOfMap.add(person2);
        listOfMap.add(person3);
        System.out.println(listOfMap); //2 size

      //  listOfMap.addAll(Arrays.asList(person3,person4,person5));
     //   System.out.println(listOfMap);//5 size

        for (Map<String, Object> eachMap : listOfMap) {
            System.out.println(eachMap);

            for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()) {
                System.out.println(eachEntry);
            }
        }


        System.out.println("------------------2022------------------");
        for (Map<String, Object> eachMap : listOfMap) {

            if(eachMap.get("hire_date").toString().substring(0,4).equals("2022")){
                System.out.println(eachMap.get("name"));
            }
        }
        for (Map<String, Object> eachMap : listOfMap) {

            for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()) {
                if(eachEntry.getKey().equals("hire_date")){
                    if(((LocalDate)eachEntry.getValue()).getYear() == 2022){
                        System.out.println(eachMap);
                    }
                }
            }


        }

        System.out.println("--------------------------------------------");

        listOfMap.get(0).replace("name","Vasyl");
        listOfMap.get(listOfMap.size()-1).replace("salary", ((Integer)listOfMap.get(listOfMap.size()-1).get("salary"))+50000  );
        System.out.println(listOfMap);

        listOfMap.get(1).replace("age",((Integer)listOfMap.get(1).get("age"))+1);
        System.out.println(listOfMap);


        System.out.println("--------------------------------");

        Map<String,Object> car1 = new LinkedHashMap<>();
        car1.put("brand","BMW");
        car1.put("model","X5");
        car1.put("year",2021);
        car1.put("color","red");
        car1.put("price",45000.5);

        Map<String,Object> car2 = new LinkedHashMap<>();
        Map<String,Object> car3 = new LinkedHashMap<>();
        Map<String,Object> car4 = new LinkedHashMap<>();

        List<Map<String,Object>> cars = new ArrayList<>();
        cars.addAll(Arrays.asList(car1,car2,car3,car4));













        }







    }





