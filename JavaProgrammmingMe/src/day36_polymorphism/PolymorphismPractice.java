package src.day36_polymorphism;

import src.day30_InheritanceContinue.phoneTask.Iphone;
import src.day30_InheritanceContinue.phoneTask.Nokia;
import src.day30_InheritanceContinue.phoneTask.Phone;
import src.day30_InheritanceContinue.phoneTask.Samsung;

public class PolymorphismPractice {



    public static void main(String[] args) {
        Phone[] phones = {
                new Iphone("Iphone 11 Pro", "Large", "Black", 900),
                new Iphone("Iphone 12 Pro Max", "Large", "Black", 1200),
                new Iphone("Iphone 9", "Medium", "Gold", 800),
                new Samsung("Galaxy S19", "Medium", "Pink", 700),
                new Samsung("Galaxy S20", "Large", "Silver", 850),
                new Samsung("Galaxy S21", "Large", "Silver", 950),
                new Nokia("XR20", "Small", "Silver", 350),
                new Nokia("G10", "Medium", "Silver", 99),
                new Nokia("G50", "Large", "Silver", 250),
                new Iphone("Iphone 12 Pro", "Large", "Black", 1200),
                new Iphone("Iphone 11 Pro Max", "Large", "Silver", 1100),
                new Samsung("Galaxy S18", "Medium", "White", 750),
                new Samsung("Galaxy S17", "Large", "Silver", 650),
                new Nokia("G10", "Medium", "Black", 99),
                new Iphone("Iphone 6", "Smalle", "Gold", 400),
                new Iphone("Iphone 7", "Smalle", "White", 500)
        };

        System.out.println(" 1. print the model, color and price of each phone object in the following format\n" +
                "    \t\t\t\tmodel - color - price");
        for (Phone ea : phones) {
            System.out.println(ea.getModel()+" "+ea.getColor()+" "+ea.getPrice());
        }


        System.out.println("2. How many Iphones in the array of phones?");
        int countIphone =0;
        for (Phone ea : phones) {
            if(ea instanceof Iphone){
                countIphone++;
            }
        }
        System.out.println("countIphone = " + countIphone);;


        System.out.println("3. How many Samsungs in the array of phones?");

        int countSamsung =0;
        for (Phone ea : phones) {
            if(ea instanceof Samsung){
                countSamsung++;
            }
        }
        System.out.println("countSamsung = " + countSamsung);;


        System.out.println("4. Display the models of Iphones and samsung that has the price of 700 or greater");

        for (Phone ea : phones) {
            if((ea instanceof Iphone && ea.getPrice()>=700)||(ea instanceof Samsung && ea.getPrice()>=700)){
                System.out.println(ea.getModel()+" "+ea.getPrice());
            }
        }

    }
/*

    1. print the model, color and price of each phone object in the following format
    				model - color - price

	2. How many Iphones in the array of phones?

	3. How many Samsungs in the array of phones?

	4. Display the models of Iphones and samsung that has the price of 700 or greater

 */



}
