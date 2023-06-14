package day32_finalKeyword;

import java.time.LocalDate;

public class FinalKeyword {

    public static void main(String[] args) {

        final char gender = 'M';
        System.out.println(gender); //M
        //gender = 'F'; // compiler error
        System.out.println(gender);

        System.out.println("-----------------------------");

        final LocalDate dateOfBirth = LocalDate.now(); // good example of use of final
        System.out.println(dateOfBirth); //2023-04-28

        System.out.println("-----------------------------");









    }

}
