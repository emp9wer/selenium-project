package src.day21_multiDimentionalArray;

import java.util.Arrays;

public class RemoveExtraSpace {
    public static void main(String[] args) {

        String str = "   Hello world        I       love      java            ";
        String[] words = str.split(" ");
        str ="";
        for (String each : words) {
            if(!each.isEmpty()){
                str+=each +" ";
            }
        }

        System.out.println(str.substring(0,str.length()-1));
    }

}
