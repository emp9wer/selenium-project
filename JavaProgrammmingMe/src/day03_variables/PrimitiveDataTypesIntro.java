package src.day03_variables;

public class PrimitiveDataTypesIntro {
    public static void main(String[] args) {
        // DataType variableName = Data; --------------------
      // byte a = "aafgaf"; // byte ONLY accepts integer values (-128 ~ 127)
      // byte a = 20.5; // byte can not take decimal numbers
      // byte a = 2000; // out of Byte's range
        //  preferred Primitive data types are int and double --------------
        byte a = 20;

        // price of the car is $17500

        short p = 17500;

        System.out.println("car price is "+"$"+p);

        // salary is $95000

        int s = 95000; // int is a preferred data type
        System.out.println("salary is $"+s);

        long n = 999999999L; // do not forget "L" at the end of numeric value
        System.out.println(n);

        // gpa is 3.5

        double gpa = 3.5; // preferred for decimals
        System.out.println(gpa);

        float gpa2 = 3.5F;



    }
}
