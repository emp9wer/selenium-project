package ReviewSessionsPracticeKir.week9;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Holidays {

    public static ArrayList<LocalDate> dates() {

        ArrayList<LocalDate> holidays = new ArrayList<>(Arrays.asList(
                LocalDate.of(1989, 7, 2),
                LocalDate.of(1990, 12, 5),
                LocalDate.of(1988, 3, 4),
                LocalDate.of(2001, 5, 3)
        ));
  return holidays;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        DateTimeFormatter fromat1 = DateTimeFormatter.ofPattern("MMM - d, yyyy");



        System.out.println("what month do you want to check ");
        int month = in.nextInt();
        for (LocalDate ea : dates()) {
            if (ea.getMonthValue()==month){
                System.out.println(ea.format(fromat1));
            }
        }





    }



}