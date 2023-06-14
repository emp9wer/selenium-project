package src.day38_exceptionsHandlings;

import src.utilities.Library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test {

    public static void main(String[] args) {

        System.out.println("hello cydeo");

        Library.sleep(3.5);

        System.out.println("how are you today?");
    }

    public static void method2() throws  InterruptedException , FileNotFoundException {
// throws Exception parent class
        //parent should not be placed before child
        System.out.println("p1");

        Thread.sleep(3000);

        System.out.println("p1end");

        new FileInputStream(" ");

        Thread.sleep(5000);
        System.out.println("-----------");

      //  throw new BreakTimeException("time to go home");


        throw  new BreakTimeException("message!");
    }

}

