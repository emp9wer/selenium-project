package src.day09_scanner;

import java.util.Scanner;

public class DaysInWeek {
    public static void main(String[] args) {


     //   new Scanner(System.in).nextInt();  //used once then collected by garbage collector
        Scanner input = new Scanner(System.in);



        System.out.println("Enter the day number: ");
        int num = input.nextInt();

        String day = "Invalid";

        if (num >=1 && num <=7){
            day = (num==1) ? "Monday" :(num==2)? "Tuesday" :(num==3)? "Wednesday" :(num==4)? "Thursday"
                 :(num == 5) ? "Friday" :(num==6)? "Saturday" : "Sunday";
        }
        System.out.println(day);
        input.close();

    }
}
