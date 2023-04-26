package src.day24_dateAndTime;

import java.time.LocalTime;

public class LocalTimeIntro {

    public static void main(String[] args) {

        LocalTime starting_time = LocalTime.of(10,30);

        System.out.println(starting_time); //10:30

        LocalTime rightNow = LocalTime.now();
        System.out.println(rightNow); //00:12:26.677062100

        LocalTime time1 = LocalTime.of(23,59,59);// max
        System.out.println(time1); // 23:59:59 // max

    }
}
