package day24_dateTime;

import java.time.LocalDate;
import java.util.ArrayList;

public class RemoveDates_9 {
    public static void main(String[] args) {

        ArrayList<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.of(2000,2,21));
        dates.add(LocalDate.of(2003,7,21));
        dates.add(LocalDate.of(2022,5,17));
        dates.add(LocalDate.of(2015,4,11));
        dates.add(LocalDate.of(2013,6,25));
        dates.add(LocalDate.of(2016,8,16));

            dates.removeIf(p -> p.isBefore(LocalDate.of(2016,8,15)));
        System.out.println(dates);
    }
}
/*
9. create an Arraylist of LocalDate, write a program that can remove all the dates before August-15-2016
 */