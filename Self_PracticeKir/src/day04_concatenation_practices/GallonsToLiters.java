package day04_concatenation_practices;

public class GallonsToLiters {
    public static void main(String[] args) {

        double gallon, liters, gallonsToLiters;
        gallon = 10;
        gallonsToLiters = gallon * 3.79;
        int gallonInt;
        gallonInt = (int) gallon;
        System.out.println(gallonInt+" gallons is equal to "+gallonsToLiters+" litters");
    }
}
/*
Create a class named GallonsToLiters and declare the following variables:
                gallon
                liters

    4.1 Write a program that can convert the any given number of gallons to liters
        Ex:
              gallon = 10

        output:
              10 gallons is equal to 37.9 litters

           Hint:  1 gal = 3.79 L
 */