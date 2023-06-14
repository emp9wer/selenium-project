package src.day35_polymorphism;

import src.day34_abstractionContinue.animalTask.*;
import src.day35_polymorphism.transportationTask.*;

public class PolymorphismPractice {


    public static void main(String[] args) {

        Tiger tiger = new Tiger("sh" , "bengal ", 'M',4,"large", "orange");

        tiger.eat();
        tiger.drink();
        tiger.sleep();
        tiger.hunt();

        System.out.println("------------------------");

       // Animal tiger = new Tiger("sh" , "bengal ", 'M',4,"large", "orange");

        tiger.eat();
        tiger.drink();
        tiger.sleep();
       // tiger.hunt();


        Animal animal = new Eagle("hhhh","ggggg",'F',3,"small","white");
        //animal.fly();
        animal.eat();
        animal.sleep();
        animal.drink();
       // System.out.println(obj1.canFly);

        Flyable obj1 = new Eagle("hhhh","ggggg",'F',3,"small","white");
        obj1.fly();
       // obj1.eat();
       // obj1.sleep();
       // obj1.drink();

        System.out.println(obj1.canFly);

        Parrot parrot= null;
        Eagle eagle = null;
        Shark shark =null;
        Dolphin dolphin=null;
        Duck duck =null;
        Dog dog =null;
        Cat cat=null;
        CydeoCar cydeoCar=null;

        Flyable[] birds = {duck,parrot, eagle};
        Swimmable[] fishes = {duck,dolphin,shark,cydeoCar};
        Playable[] animals ={parrot,dog,cat,duck};

      //  boolean isAnilmal = cydeoCar instanceof Animal; // if compiler error - no relationship
        boolean isAnilmal = dog instanceof Animal; // true;

        System.out.println("-----------------------------------------");

        Car car = new Tesla("sss","sffs","safa",2222,212112);

        boolean isTesla = car instanceof Tesla;//true
        boolean isAudi = car instanceof Audi;//false

        System.out.println(isTesla);//true
        System.out.println(isAudi);//false

        System.out.println("-------------------------------------------");

        boolean isElectric = car instanceof Electric;

        System.out.println(isElectric); // true

        boolean hasAutopark = car instanceof AutoPark;
        System.out.println(hasAutopark);//true
        boolean hasAutopark1 = car instanceof AutoPilot;
        System.out.println(hasAutopark1);//true

    }
}
