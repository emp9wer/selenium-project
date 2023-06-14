package src.day422;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Task6 {
    public static void main(String[] args) {

        /*






         */
        System.out.println(" 4. Given the following maps that contains the different car informations:");


        Map<String, Object> car1 = new Hashtable<>();
        car1.put("brand", "BMW");
        car1.put("model", "X5");
        car1.put("color", "Red");
        car1.put("year", 2021);
        car1.put("price", 55000);
        car1.put("electric", false);

        Map<String, Object> car2 = new Hashtable<>();
        car2.put("brand", "Audi");
        car2.put("model", "Q7");
        car2.put("color", "Gray");
        car2.put("year", 2022);
        car2.put("price", 50000);
        car2.put("electric", false);

        Map<String, Object> car3 = new Hashtable<>();
        car3.put("brand", "Tesla");
        car3.put("model", "Model Y");
        car3.put("color", "White");
        car3.put("year", 2015);
        car3.put("price", 60000);
        car3.put("electric", true);

        System.out.println("(Create 3 more map objects and store 3 different car informations in them)");

        Map<String, Object> car4 = new Hashtable<>();
        car4.put("brand", "Chevy");
        car4.put("model", "Model Y2");
        car4.put("color", "White");
        car4.put("year", 2014);
        car4.put("price", 61000);
        car4.put("electric", false);

        Map<String, Object> car5 = new Hashtable<>();
        car5.put("brand", "Tesla1");
        car5.put("model", "Model Y1");
        car5.put("color", "White");
        car5.put("year", 1999);
        car5.put("price", 5000);
        car5.put("electric", true);

        Map<String, Object> car6 = new Hashtable<>();
        car6.put("brand", "Ford");
        car6.put("model", "150");
        car6.put("color", "Yellow");
        car6.put("year", 2022);
        car6.put("price", 50000);
        car6.put("electric", false);




        System.out.println("\n" +
                "        4.1 Create a map named myCars that takes car number as a key and car info as a value\n" +
                "        \t\tHint: key of the map need to be integer and value of the map need to be a map with String as key and Object as value");

        Map<Integer,Map<String, Object>> myCars = new HashMap<>();
        myCars.put(1,car1);
        myCars.put(2,car2);
        myCars.put(3,car3);
        myCars.put(4,car4);
        myCars.put(5,car5);
        myCars.put(6,car6);

        System.out.println(myCars);

        System.out.println("4.2 Display the brand-model-price of each car");

        for (Map.Entry<Integer, Map<String, Object>> ea : myCars.entrySet()) {
            System.out.println(ea.getValue().get("brand")+" "+ea.getValue().get("model")+" "+ea.getValue().get("price"));
        }


        System.out.println("\t\t4.3 Display all the electric cars\n");

        for (Map.Entry<Integer, Map<String, Object>> ea : myCars.entrySet()) {
            if((Boolean) ea.getValue().get("electric")){
                System.out.println(ea);
            }
        }


        System.out.println("4.4 Display the most expensive car");

        Integer max = Integer.MIN_VALUE;
        Object a = new Object();

        for (Map.Entry<Integer, Map<String, Object>> ea : myCars.entrySet()) {
            if((Integer)ea.getValue().get("price")>max){
                max = (Integer) ea.getValue().get("price");
                a=ea;
            }
        }
        System.out.println(a);


    }
}
