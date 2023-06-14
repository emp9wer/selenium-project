package src.day37_exceptions;

import src.day35_polymorphism.transportationTask.Car;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MultiCatchBlock {

    public static void main(String[] args) {

        Car car = null;

        car.drive();


        try{
            car.drive();
        }catch (ArithmeticException e){
            System.out.println("1");
            e.printStackTrace();
        }catch (ClassCastException e ){
            System.out.println("2");
            e.printStackTrace();
        }catch (NullPointerException e ){
            System.out.println("3");
            e.printStackTrace();
        }catch (IndexOutOfBoundsException e){
            System.out.println("4");
            e.printStackTrace();
        }catch (RuntimeException e){
            System.out.println("5");
            e.printStackTrace();
        }
        System.out.println("program ended");
        System.out.println("----------------");
        System.out.println("prog3");

        try {
            FileInputStream file = new FileInputStream("file path");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }


}
