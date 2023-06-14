package src.day36_polymorphism;

import src.day29_Inhetitance.animalTask.Animal;
import src.day29_Inhetitance.animalTask.Cat;
import src.day29_Inhetitance.animalTask.Dog;

public class ReferenceTypeCastings {

    public static void main(String[] args) {



        Dog dog = new Dog();

      //  Cat cat = new Dog();

        Animal animal = (Animal) new Dog(); // implicit casting

        System.out.println("-------------------");

        Animal animal1 = new Dog(); // upcasting ===> polymorphism
        animal1.setInfo("max","husky",'M',4,"large","white");

        animal1.eat();
        animal1.eat();
        animal1.sleep();
        //animal1.bark();
        ((Dog)animal1).bark();    // down casting
        //or
       // Dog dog1 = (Dog) animal1; // down casting
      //  dog1.bark();

     //   ((Cat)animal1).scratch(); //ClassCastException // animal1 is  Dog object , has no relationship with Cat



    }
}
