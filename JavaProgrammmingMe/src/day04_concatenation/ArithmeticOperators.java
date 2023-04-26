package src.day04_concatenation;

public class ArithmeticOperators {
    public static void main(String[] args) {

        // ADDITION OPERATOR +
        int a, b, c;
        a = 2;
        b = 3;
        c = a + b;
        System.out.println(c); // 5
        System.out.println(100 + 200); // 300

        // SUBTRACTION OPERATOR -
        System.out.println(40 - 10); // 30

        // DIVISION OPERATOR /
        System.out.println((double) 20 / (double) 6); // 3.3333333333333335
        System.out.println(20.0 / 6);                 // 3.3333333333333335
        System.out.println(20 / 6);                   // 3
        // int / int = int value
        // int / double = double
        //double / int = double
        System.out.println(50 / 6); // 8
        System.out.println(50 / 6.0);            // 8.333333333333334
        System.out.println(50.0 / 6);            // 8.333333333333334
        System.out.println(50d / 6);             // 8.333333333333334
        System.out.println(2.5 / 0.5);           // 5.0
        System.out.println( (int) (2.5 / 0.5) ); // 5
        // System.out.println( 9 / 0 );   // !!!Exception in thread "main" java.lang.ArithmeticException: / by zero!!!

        // MULTIPLICATION OPERATOR *
        System.out.println(10 * 2); // 20
        System.out.println( 20 * 12 ); // 240

        // MODULUS OPERATOR % (REMAINDER) (leftovers)
        // remainder: numerator - (denominator * integer result)
        // 10 % 3 ==> 10 / 3 = 3.3333... ; remainder = 10 - (3 * 3) = 1 /////// 10 % 3 = 1

        System.out.println(10 % 3); // 1
        System.out.println(2.2 % 2); // 0.20000000000000018
        System.out.println(2.2d % 2); // 0.20000000000000018
        System.out.println(2.2f % 2); // 0.20000005
        System.out.println(20 % 6); // 2
        System.out.println(20 % 5); // 0
        System.out.println(100 % 13); // 9
        System.out.println(24 % 48); // 24
        System.out.println( 25 % 48); // 25





    }
}