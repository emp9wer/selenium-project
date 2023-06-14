package src.day37_exceptions;

import java.util.ArrayList;

public class ErrorExample {
    public static void main(String[] args) {


        ArrayList<Pizza> pizzas = new ArrayList<>();

        while (true) {

            pizzas.add(new Pizza('S',2,2));
        } // out of memory error Java heap space
//Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
        //due to the lack of system resource



    }
}
