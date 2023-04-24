package week10.morning;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class T1Reservation {

    public static void main(String[] args) {

        Scanner input  =new Scanner(System.in);
        System.out.println("would you like to make a reservation? - please enter a year");
        int year = input.nextInt();

        System.out.println("please enter a month");
        int month = input.nextInt();

        System.out.println("please enter date");
        int date = input.nextInt();

        System.out.println("please enter time in 24h format");
        int hour = input.nextInt();
        input.close();



        LocalDateTime dateTime = LocalDateTime.of(year,month,date,hour,0);
      //  System.out.println(dateTime);

        if(dateTime.getYear() != 2023){
            System.out.println("sorry we cannot make a reservation for year "+ year);
            System.exit(0);
        }

        if(dateTime.isBefore(LocalDateTime.now())){
            System.out.println("this date passed");
            System.exit(0);
        }

        if( (dateTime.getMonthValue()==11 && dateTime.getDayOfMonth()==23) || (dateTime.getMonthValue()==12 && dateTime.getDayOfMonth()==24) ){
            System.err.println("sorry we are booked on that day");
            System.exit(0);
        }
        boolean validTime = dateTime.getHour()>=14 && dateTime.getHour()<=20;
        int dayInWeek=dateTime.getDayOfWeek().getValue();
        boolean isWeekend = dayInWeek==5||dayInWeek==6||dayInWeek==7;
        if(validTime&&isWeekend){
            System.out.println("booked for "+ dateTime.format(DateTimeFormatter.ofPattern("MMM/d/yy | h:mm a")));
        }else {
            if (!validTime) {
                System.out.println("Sorry we only have time from 2pm to 8pm");
            }
            if(!isWeekend){
                System.out.println("Sorry we are only available on the weekends 2pm - 8pm");
            }
        }





    }



}
