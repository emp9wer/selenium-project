package src.week10.evening;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class T1Reservation {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter year");
        int year = scan.nextInt();
        System.out.println("enter month");
        int month = scan.nextInt();
        System.out.println("enter day");
        int day = scan.nextInt();
        System.out.println("enter hour");
        int hour = scan.nextInt();
        int minute = 0;

        LocalDateTime reservationDate = LocalDateTime.of(year, month, day, hour, minute);

        if (reservationDate.getYear() != 2023) {
            System.err.println("sorry we can not make a reservation for the year " + year);
            System.exit(1);
        }
        LocalDateTime now = LocalDateTime.now();

        if (reservationDate.isBefore(now)) {
            System.err.println("sorry that date passed");
            System.exit(1);
        }

        LocalDate reserved1 = LocalDate.of(2023, 11, 23);
        LocalDate reserved2 = LocalDate.of(2023, 12, 24);
        LocalDate reservationDateDayAndMonth = LocalDate.of(year, month, day);
        if (reservationDateDayAndMonth.isEqual(reserved1) || reservationDateDayAndMonth.isEqual(reserved2)) {
            System.err.println("sorry its booked for this time");
            System.exit(1);
        }


        switch (reservationDate.getDayOfWeek().getValue()) {
            case 5:
            case 6:
            case 7:
                if (reservationDate.getHour() >= 14 && reservationDate.getHour() <= 20) {
                    System.out.println("booked for " + reservationDate.format(DateTimeFormatter.ISO_DATE_TIME)); //or// ofPattern("DD/MM/YYYY")
                } else {
                    if (reservationDate.getHour() < 14) {
                        System.err.println("not open yet");
                    }
                    if (reservationDate.getHour() > 20) {
                        System.err.println("closed for the day");
                    }
                }
                break;
            case 1:
            case 2:
            case 3:
            case 4:
                System.err.println("wrong day of week - only available on weekends");
                break;

        }


    }

}
