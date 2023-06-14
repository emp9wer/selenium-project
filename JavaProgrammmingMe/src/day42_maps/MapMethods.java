package src.day42_maps;

import java.util.LinkedHashMap;
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

        Map<String,String> employees = new LinkedHashMap<>();

        employees.putAll(map); //adds map in map

        System.out.println(employees.equals(map)); //true



    }

}
