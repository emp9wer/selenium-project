package src.day41_maps;

import java.util.Map;
import java.util.TreeMap;

public class MapMethods {
    public static void main(String[] args) {

        Map<String,String> map = new TreeMap<>();
        map.put("C01","Josh");
        map.put("C02","Lea");
        map.put("C03","Nora");
        map.put("C04","Kyle");
        map.put("C05","Bob");
        map.put("C06","Donna");
        map.put("C07","Alex");
        System.out.println(map.size()); //7 // prints size
        System.out.println(map);//{C01=Josh, C02=Lea, C03=Nora, C04=Kyle, C05=Bob, C06=Donna, C07=Alex}
        System.out.println(map.get("C04")); //Kyle
        //keys can not be changed! (they are final) // however there is remove option
        //values can be changed
        map.put("C04","Mike");
        System.out.println(map);//{C01=Josh, C02=Lea, C03=Nora, C04=Mike, C05=Bob, C06=Donna, C07=Alex}
        System.out.println(map.get("C04")); //Mike
        //.put() can be used for updating values of map keys

        map.replace("C02","Aseel"); // it only replaces. its also faster
        map.replace("C099","Aseel"); // it only replaces. its also faster
        System.out.println(map.get("C02")); //Aseel
        System.out.println(map); //{C01=Josh, C02=Aseel, C03=Nora, C04=Mike, C05=Bob, C06=Donna, C07=Alex}

        map.remove("C01");
        System.out.println(map); //{C02=Aseel, C03=Nora, C04=Mike, C05=Bob, C06=Donna, C07=Alex}
        System.out.println(map.size()); //6

        System.out.println(map.containsKey("C099")); //false
        System.out.println(map.containsKey("C03")); //true

        System.out.println(map.containsValue("aaaaaaaaaaa")); //false
        System.out.println(map.containsValue("Nora")); //true

        System.out.println(map.isEmpty());//false
        System.out.println(map.equals(map));//true

        //map.clear();
       // System.out.println(map); //sets size to 0 (empty map) //{}

        Map<String,String>employees = new TreeMap<>();
        employees.putAll(map);
        System.out.println(employees.equals(map));//true


    }


}
/*
PAIR: id - name
 */