package src.day25_constructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterIntro {
    public static void main(String[] args) {

        DateTimeFormatter df = DateTimeFormatter.ofPattern("y/MMM/dd");
        LocalDate today = LocalDate.now();

        System.out.println(today); //2023-04-03
        System.out.println(today.format(df)); //2023/Apr/03

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("");





    }
}
