package week10.vendingMachine;

import java.util.ArrayList;

public class DrinkVending {

  /*
    Create a DrinkVending class:
        create a instance variable: allDrinks (ArrayList of Drink objects)
        create a constructor that will create an empty ArrayList
        create an overloaded constructor that will accept a ArrayList of Drinks of objects to initialize the vending machine with some Drinks
        create a toString to display the drinks in a nice format
     */

    ArrayList<Drink> allDrinks;

    public DrinkVending() {
        allDrinks = new ArrayList<>();
    }

    public DrinkVending(ArrayList<Drink> inputDrinks) {
        this(); // calls the no arg constructor
        allDrinks.addAll(inputDrinks); // add all of the Drinks objects from the inputDrinks into the instance allDrinks ArrayList
    }

    /*
        Create a method stock() that will accept an ArrayList of Drinks to fill the allDrinks ArrayList up. If the Drink exists add to the quantity
     */

    public void stock(ArrayList<Drink> newDrinks) {

        outer:
        for (Drink each : newDrinks) { // each is the new Drinks

            for (Drink vending : allDrinks) { // vending is the existing drinks
                if (vending.name.equalsIgnoreCase(each.name)) {
                    vending.quantity += each.quantity;
                    continue outer; // if this runs the drink will not be duplicated in our vending
                }
            }

            allDrinks.add(each); // if the Drink is not in the machine already it will be added

        }
    }

    /*
        Create a method vend(): that will accept a String for the Drink name the person wants
        Search for the drink in the the vending machine
            -> if we have the drink return the price
            -> if the drink is out of stock print: Sorry $name is out of stock and return -1
            -> if the drink is not in the vending machine print: Sorry $name not offered and return -2

        For the valid scenario after the price is printed reduce the quantity of that drink by 1.
     */

    public double vend(String drink) {
        for (Drink each : allDrinks) {
            if (each.name.equalsIgnoreCase(drink)) {
                if (each.quantity > 0) {
                    return each.price;
                } else {
                    System.out.println("Sorry " + drink + " is out of stock");
                    return -1;
                }
            }
        }
        System.out.println("Sorry " + drink + " not offered");
        return -2;
    }

    public String toString() {
        String output = "";
        for (Drink each : allDrinks) {
            output += each + "\n";
        }
        return output;
    }


}

// mini task: give me the name of the first drink in the ArrayList
    /* DrinkVending machine = new DrinkVending()
        assume there is drinks already
        machine.allDrinks.get(0).name -> access to the name of the first drink
     */





