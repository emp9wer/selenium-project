package src.day38_exceptionsHandlings;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword {

    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
//throws InterruptedException - used only with checked exceptions!
        // System.out.println(100/0); //unchecked exception
        //advantage faster shorter clean code readable code
        System.out.println("p1");
        Thread.sleep(1000); // checked exception
        System.out.println("p1end");

        System.out.println("------------------");

        System.out.println("p2");
        Thread.sleep(1000); // checked exception
        System.out.println("p2end");

        System.out.println("-------------------");

        System.out.println("p3");
        //FileInputStream file = new FileInputStream("");
        Thread.sleep(1000); // checked exception
        System.out.println("p3end");

    }
}
