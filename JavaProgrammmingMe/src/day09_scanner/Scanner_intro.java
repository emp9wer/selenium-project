package src.day09_scanner;

import java.util.Scanner;

//import java.util.*;

//keyword //package //class
//SCANNER
//regular import  -    import package.className

//wild import  - used to import everything from package  -   import.package.*       - cost more memory!

//data type // declares variable  // creates scanner object in memory will read input from System.in
// scan / input - preferred names
// System.in - for reading user inputs
// "scan" + enter -fast way to import // then "new" enter then System.in
//scanner methods

public class Scanner_intro {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number ");
        byte num1 = input.nextByte();
        System.out.println("Enter your second number ");
        short num2 = input.nextShort();
        System.out.println("Enter your third number ");
        int num3 = input.nextInt();                      // used often
        System.out.println("Enter your fourth number ");
        long num4 =  input.nextLong();

        System.out.println("First number: " + num1);
        System.out.println("Second number: "+ num2);
        System.out.println("Third number: "+num3);
        System.out.println("Fourth number: "+num4);

        input.close();        // scanner is closed, can not read user inputs further





















    }
}
