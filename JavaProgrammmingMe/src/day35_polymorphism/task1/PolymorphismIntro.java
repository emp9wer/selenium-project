package src.day35_polymorphism.task1;

import src.day34_abstractionContinue.animalTask.*;

public class PolymorphismIntro {

    Dog dog = new Dog("Max","husky",'M',4,"small","white");
    Cat cat = new Cat("Max","husky",'M',4,"small","white");

    Lion lion = null;
    Parrot parrot = null;

    Animal[] animals = {dog,cat,lion,parrot};

}
