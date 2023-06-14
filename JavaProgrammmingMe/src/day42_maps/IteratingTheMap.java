package src.day42_maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class IteratingTheMap {
    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Josh", 100000);
        map.put("Dan", 222222);
        map.put("Bob", 444444);
        map.put("Alik", 3344433);
        map.put("Frank", 4141413);
        map.put("Alex", 436363647);
        System.out.println(map);
        //iterating by the keys

        System.out.println("------------iterating map by keys -------map.keySet()------------------");
        //iterating map by keys
        for (String eachKey : map.keySet()) {
          //  map.replace(eachKey,map.get(eachKey)*2);
            System.out.println(eachKey);
        }
        System.out.println(map);


        System.out.println("-------iterating map by values-----map.values()---------------");
        //iterating map by values

        for (Integer eachValue : map.values()) {
            System.out.println(eachValue);
        }

        System.out.println("-------iterating map by entry-----map.entrySet()---------------");

        //return type entry interface
        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            System.out.println(eachEntry); //Josh=100000......prints all sets
        }

        //map.entrySet().for -> enter

        System.out.println("-----------------------");

        for (Map.Entry<String, Integer> eachEnrty : map.entrySet()) {

            String eachKey = eachEnrty.getKey();
            Integer eachValue = eachEnrty.getValue();
            System.out.println(eachKey+"  "+eachValue);
            eachEnrty.setValue(eachValue+10000);
            
        }
        System.out.println(map);
    }



}
