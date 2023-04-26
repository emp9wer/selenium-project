package day24_dateTime;

import java.time.LocalDate;

public class LeapYear_8 {
    public static boolean isLeap(int birthYear){

        LocalDate year = LocalDate.of(birthYear,1,1);
        System.out.println(year);
        return year.isLeapYear();
    }

    public static void main(String[] args) {

        System.out.println(LeapYear_8.isLeap(1991));
    }
}

/*
8. Create a function that accepts an int argument birthYear, return true if the person was born on leap year, otherwise return false
 */