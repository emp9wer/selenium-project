package src.day42_maps;

import src.day41_maps.MapClasses;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "bbcccaaaaa";

        Map<Character,Integer> map = new LinkedHashMap<>();

        for(String each : str.split("")){
            int frequency = Collections.frequency(Arrays.asList(str.split("")),each);
           // System.out.println(each+" "+frequency);
            map.put(each.charAt(0),frequency);
        }
        System.out.println(map);

        System.out.println("----------------------------------------------");


        for(String each : str.split("")){
            int frequency = Collections.frequency(Arrays.asList(str.split("")),each);
            // System.out.println(each+" "+frequency);
            map.put(each.charAt(0),frequency);
        }
        System.out.println(map);





    }


}
