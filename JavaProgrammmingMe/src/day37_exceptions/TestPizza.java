package src.day37_exceptions;

import src.day36_polymorphism.Circle;

public class TestPizza {

    public static void main(String[] args) {
        Pizza pizza1 = new Pizza('L', 2, 2);
        Pizza pizza2 = new Pizza('L', 2, 2);
        Pizza pizza3 = new Pizza('S', 1, 1);
        System.out.println(pizza1==pizza2); //false
        System.out.println(pizza1.equals(pizza2)); //true
        System.out.println(pizza1.equals(pizza3)); //false
      //  System.out.println(pizza1.equals(122)); //invalid object 122 Process finished with exit code 1

        Object obj = new Pizza('L',2,2);

        System.out.println(obj.equals(pizza1)); // object type determines  implementation of method.

        double total = ((Pizza)obj).calcCost(); // down casting
        System.out.println(total);//22.0

        System.out.println("---------java.lang.ClassCastException-----------");

        double area =  ((Circle)obj).area(); //java.lang.ClassCastException (no "is a relation")
   //     System.out.println(area);


        System.out.println("Test Completed");

    }
}
