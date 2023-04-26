package day20_forEachArrayContinue;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {


        String[] classMates = {"Mike Babb", "Andrew Fffa", "Sarah Jaaaf", "Anna Tasfa", "John Sdsfsdf", "Katie Afdsfds", "Claire Madd", "Bill Jfaa", "Jason Mdas", "Donna Afasf"};

        String[] reversed = new String[classMates.length];

            int a =0;

        for (String each : classMates) {
            String reversedSt ="";
            for (int i = each.length() - 1; i >= 0; i--) {
                reversedSt+= "" + each.charAt(i);
            }
            reversed[a] = "" +reversedSt;
            a++;

        }
        System.out.println(Arrays.toString(reversed));
    }
}
