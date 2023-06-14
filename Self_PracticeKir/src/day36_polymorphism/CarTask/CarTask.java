package src.day36_polymorphism.CarTask;

import java.util.ArrayList;

public class CarTask {
    public static void main(String[] args) {


        Car[] cars = {
                new Honda("Pilot", "White", 2010, 25000),
                new Audi("Q6", "Red", 2014, 32000),
                new Honda("Accord", "White", 2011, 20000),
                new Audi("Q4", "Blue", 2015, 33000),
                new Audi("A7", "Black", 2019, 35000),
                new Audi("Q8", "White", 2018, 40000),
                new Audi("Q5", "Purple", 2009, 30000),
                new Audi("A4", "Black", 2011, 30000),
                new Honda("Civic", "Red", 2018, 30000),
                new Honda("CR-V", "Red", 2012, 23000),
                new Honda("HR-V", "Blue", 2019, 35000),
                new Tesla("Model 3", "White", 2015, 45000),
                new Tesla("Model Y", "Black", 2017, 65000),
                new Tesla("Model X", "White", 2016, 48000),
                new Tesla("Model X", "Blue", 2014, 48000),
        };
        System.out.println("\n\n---------1.2 Write a program that can display all the cars that are eligible for recall");
        for (Car ea : cars) {
            if(ea.getClass().getSimpleName().equals("Honda")){
                if(ea.getYear()==2010||ea.getYear()==2011){
                    System.out.println(ea);
                }
            }
            if(ea.getClass().getSimpleName().equals("Audi")){
                if(ea.getYear()>=2015||ea.getYear()<=2019){
                    System.out.println(ea);
                }
            }
            if(ea.getClass().getSimpleName().equals("Tesla")){
                if(ea.getYear()==2015||ea.getYear()==2016){
                    System.out.println(ea);
                }
            }
        }
        System.out.println("\n\n---------1.3 Write a program that can display the car that has the highest price");

        double highestPrice =0;
        Car highestPriceCar =null;

        for (Car ea : cars) {
            if(ea.getPrice()>highestPrice){
                highestPrice=ea.getPrice();
                highestPriceCar=ea;
            }
        }
        System.out.println(highestPriceCar);

        System.out.println("\n\n----------1.3 Write a program that can display the car that has the lowest price");
    Car lowestPriceCar = null;
        double lowestPrice = highestPrice;
        for (Car ea : cars) {
            if(ea.getPrice()<lowestPrice){
                lowestPrice=ea.getPrice();
                lowestPriceCar=ea;
            }
        }
        System.out.println(lowestPriceCar);

        System.out.println("\n\n---------1.4 Create an arraylist of Tesla named teslaCars and store all the tesla cars from cars array to the arrayList:\n" +
                "\t\t\t\t\t\tArrayList<Tesla> teslaCars = new ArrayList<>()");

        ArrayList<Tesla> teslaCars= new ArrayList<>();

        for (Car ea : cars) {
            if(ea.getClass().getSimpleName().equals("Tesla")){

                teslaCars.add((Tesla)ea);
            }
        }

        System.out.println(teslaCars);

    }

}
