package src.day37_exceptions;

import java.io.File;
import java.io.FileInputStream;

public class ExceptionsIntro {

    public static void main(String[] args) {

        String str = "Java";

      // char ch =  str.charAt(250);//unchecked exception //String index out of range: 250  //Process finished with exit code 1
        //System.out.println(ch);


       Pizza pizza = null;
    //   pizza.calcCost();   // unchecked exception

    //   System.out.println(50/0);  // unchecked exception / unexpected event

       System.out.println("hello world");

        System.out.println("--------------------------------------");

        int score = 100;

        if(score > 59){ // bug example of logical error
            System.out.println("your grade is D");
        } else if (score>70) {
            System.out.println("your grade is C");
        }

        System.out.println("----------------------");

        // FileInputStream file = new FileInputStream(""); // checked exception / unwanted event

        //Thread.sleep(3000);// checked exception / unwanted event







    }






}
