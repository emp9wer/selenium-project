package day24_dateTime;

import java.util.ArrayList;
import java.util.Arrays;

public class CountryNames_6 {
    public static void main(String[] args) {

        ArrayList<String> countries = new ArrayList<>(Arrays.asList("Moldova","Russia","Australia","Germany","New Zealand","Great Britain"));

        System.out.println(countries);

        countries.removeIf(p -> p.length()>=10);
        System.out.println(countries);//[Moldova, Russia, Australia, Germany]

    }
}
/*
6. Create an ArrayList of string called country names, write a program that can remove all the country names that have length of 10 or greater
 */