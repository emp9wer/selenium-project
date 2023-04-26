package src.day23_arrayList;

import java.util.ArrayList;

public class UniqueElements {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("vasil"); //index 0
        names.add("vasil");// index 1
        names.add("samah");
        names.add("samah");
        names.add("ali");
        names.add("sumeve");
        names.add("shukir");
        names.add("marika");// index 7

        for (String each : names) {
            if(names.indexOf(each)==names.lastIndexOf(each)){
                System.out.println(each); //ali
                break; //if only first element needed
            }
        }
        boolean hasMuhtar = names.contains("Muhtar"); // false
        boolean hasAli = names.contains("ali"); // true



    }
}
