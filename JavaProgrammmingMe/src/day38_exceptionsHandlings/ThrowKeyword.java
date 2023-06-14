package src.day38_exceptionsHandlings;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {

    public static void main(String[] args) {

        //used to crash program

        System.out.println("enter your age");
        int age = new Scanner(System.in).nextInt();

        if(age<0 || age>150){
            if(age<0){
                throw new InputMismatchException("age<0 -> "+ age);
            }else {
                throw new InputMismatchException("age>150 -> "+age);
            }
        }
        if (age>=21){
            System.out.println("eligible");
        }else {
            System.out.println("not eligible");
        }

        try {
            throw new FileNotFoundException("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
