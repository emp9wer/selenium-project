package day20_forEachArrayContinue;

import java.util.Arrays;

public class REVarr2 {

    public static void main(String[] args) {

        String[] classMates = {"Mike Babb", "Andrew Fffa", "Sarah Jaaaf", "Anna Tasfa", "John Sdsfsdf", "Katie Afdsfds", "Claire Madd", "Bill Jfaa", "Jason Mdas", "Donna Afasf"};

        String[] reversed = new String[classMates.length];

        int a =0;

        for (String each : classMates) {

            for (int i = each.length() - 1; i >= 0; i--) {
                reversed[a]+= "" + each.charAt(i);
            }
            a++;
        }

        System.out.println(Arrays.toString(reversed));
    }
}