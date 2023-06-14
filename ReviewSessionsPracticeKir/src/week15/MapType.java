package week15;


import java.util.*;

public class MapType {

    public static void main(String[] args) {
        Map<Integer, week10.earth.Person> residents = new LinkedHashMap<>();

        residents.put(1,new week10.earth.Person("Erick",21));
        residents.put(2,new week10.earth.Person("Kelly",30));
        residents.put(3,new week10.earth.Person("Helen",25));
        residents.put(2,new week10.earth.Person("Jane",31));
        System.out.println(residents);

        for(int key : residents.keySet()){
            System.out.println("in apartment "+key+" resides "+residents.get(key).name);
        }

        System.out.println("--------------------------------------------");

        // key: String - Continent, value: List of String - Countries
        Map<String, List<String>> continent = new HashMap<>();
        continent.put("North America", new ArrayList<>(Arrays.asList("US", "Canada", "Mexico")));
        continent.put("Europe", new ArrayList<>(Arrays.asList("Spain", "France", "Germany", "Monaco", "Kosovo")));
        continent.put("Asia", new ArrayList<>(Arrays.asList("China", "Korea", "Japan", "Pakistan")));

        for(Map.Entry<String, List<String>> each : continent.entrySet()) {
            System.out.println("Continent: " + each.getKey());
            System.out.println("\tCountries: " + each.getValue());
        }

        //print first and last leeter of each country

        for ( List<String> each : continent.values()){ // the values are  List<String>
            for (String eachCountry : each){ //iterating through  List<String>
                System.out.println(eachCountry.substring(0,1)+eachCountry.charAt(eachCountry.length()-1));
            }
        }


    }




}
