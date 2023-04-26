package src.day11_string;

import java.util.Scanner;

public class repl {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        //WRITE YOUR CODE BELOW
        if (str.contains("bread"))
            str = str.substring(str.indexOf("bread")+5, str.lastIndexOf("bread"));
            System.out.println(str);

            System.out.println("nothing");




    }
}

