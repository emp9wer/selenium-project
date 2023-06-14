package src.day41_maps;

import java.util.*;

public class MapClasses {


    public static void main(String[] args) {
        System.out.println("----------------------HashMap-----------------------");
        Map<String,Integer> hashMap = new HashMap<>(); //random order, accepts null key & null values
        hashMap.put("Daniel",95000);
        hashMap.put("Emily",100000);
        hashMap.put("Kir",140000);
        System.out.println(hashMap);//{Emily=100000, Kir=140000, Daniel=95000} (note order is random)
        //map1.put("Daniel",80000);
        //System.out.println(map1);//{Emily=100000, Kir=140000, Daniel=80000} (note order is random)
        hashMap.put("Aaron",78000);
        hashMap.put("Chris",null);
        hashMap.put("Breana",null);
        hashMap.put(null,100000);
        hashMap.put(null,120000);
        hashMap.put(null,130000); // last one with null key will be accepted

        System.out.println(hashMap);
        //{Aaron=78000, null=130000, Emily=100000, Kir=140000, Chris=null, Breana=null, Daniel=95000}


        System.out.println("----------------------linkedHashMap-----------------------");


        Map<String,Integer> linkedHashMap = new LinkedHashMap<>();//keeps insertion order, accepts null key & null values
        linkedHashMap.put("Daniel",95000);
        linkedHashMap.put("Emily",100000);
        linkedHashMap.put("Kir",140000);
        System.out.println(linkedHashMap);
        linkedHashMap.put("Aaron",78000);
        linkedHashMap.put("Chris",null);
        linkedHashMap.put("Breana",null);
        linkedHashMap.put(null,100000);
        linkedHashMap.put(null,120000);
        linkedHashMap.put(null,130000); // last one with null key will be accepted

        System.out.println(linkedHashMap); // order is kept in insertion order.

        System.out.println("-------------TreeMap-----------------");
        Map<String,Integer> treeMap = new TreeMap<>(); //sorted order(by key), accepts null values
        treeMap.put("Daniel",95000);
        treeMap.put("Emily",100000);
        treeMap.put("Kir",140000);
        System.out.println(treeMap);
        treeMap.put("Aaron",78000);
        treeMap.put("Chris",null); // value can be null
        treeMap.put("Breana",null); // value can be null
       // treeMap.put(null,100000); //key can not be null
       // treeMap.put(null,120000); //key can not be null
       // treeMap.put(null,130000); //key can not be null

        System.out.println(treeMap); //sorted order
        //{Aaron=78000, Breana=null, Chris=null, Daniel=95000, Emily=100000, Kir=140000}


        System.out.println("----------------Hashtable--------------------");
        
        
        Map<String,Integer> hashTable = new Hashtable<>(); //random order, does not accept null key, nul values, synchronized
        hashTable.put("Daniel",95000);
        hashTable.put("Emily",100000);
        hashTable.put("Kir",140000);
        System.out.println(hashTable);
        hashTable.put("Aaron",78000);
       // hashTable.put("Chris",null);  does not accept null key, nul values
       // hashTable.put("Breana",null); does not accept null key, nul values
       // hashTable.put(null,100000);   does not accept null key, nul values
       // hashTable.put(null,120000);   does not accept null key, nul values

        try {
            hashTable.put(null, 130000); //unchecked exception , does not accept null key, nul values
        }catch (RuntimeException e){ // if null changed to "name" - will be added
            e.printStackTrace();
        }
        System.out.println(hashTable);//random order,
 //{Daniel=95000, Emily=100000, Kir=140000, Aaron=78000}




    }
}
