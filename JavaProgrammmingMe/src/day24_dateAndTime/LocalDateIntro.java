package src.day24_dateAndTime;

import java.time.LocalDate;

public class LocalDateIntro {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        System.out.println(today); //2023-04-02

        LocalDate birthDay = LocalDate.of(1991,01,28);

        System.out.println(birthDay); //2000-11-30

        System.out.println("-------------------------------------");

        System.out.println(today.getYear()); //2023

        System.out.println(today.getMonth()); //APRIL

        System.out.println(today.getMonthValue()); //4

        System.out.println(today.getDayOfWeek());//SUNDAY
        System.out.println(birthDay.getDayOfWeek()); //MONDAY

        System.out.println("-----------------");

       today =  today.plusYears(1);
        System.out.println(today); //2024-04-02

        System.out.println("-----------");

    LocalDate graduationDate = LocalDate.of(2025,6,4);

    graduationDate = graduationDate.plusYears(2);
        System.out.println(graduationDate); //2027-06-04

        graduationDate=graduationDate.plusMonths(7);
        System.out.println(graduationDate); //2028-01-04


        graduationDate = graduationDate.plusWeeks(7);
        System.out.println(graduationDate);//2028-02-22

        graduationDate = graduationDate.plusDays(100);
        System.out.println(graduationDate);//2028-06-01


        System.out.println();

    }
}
