package src.day19_Array;

import java.text.DecimalFormat;

public class DecimalFormatPractice {

    public static void main(String[] args) {

        double n1 = 10.587654;

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println(df.format(n1)); //10.59 from 10.587654  (rounds it up)

        DecimalFormat df1 = new DecimalFormat("0");

        System.out.println(df1.format(n1)); //11 from 10.587654  (rounds it up)

    }
}
