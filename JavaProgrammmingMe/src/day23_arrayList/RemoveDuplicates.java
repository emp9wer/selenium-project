package src.day23_arrayList;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("vasil"); //index 0
        names.add("vasil");// index 1
        names.add("samah");
        names.add("samah");
        names.add("ali");
        names.add("sumeve");
        System.out.println(names);
        ArrayList<String> nonDup = new ArrayList<>();

        for (String each : names){
            if(nonDup.contains(each)){
                continue;
            }
            nonDup.add(each);
        }

        names = nonDup;


        System.out.println(names);














    }
}
