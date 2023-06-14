package src.day35_polymorphism.transportationTask;

import src.day34_abstractionContinue.animalTask.Flyable;

public class CydeoCar extends Car implements Flyable,AutoPilot,Electric, src.day34_abstractionContinue.animalTask.Swimmable {

    public CydeoCar(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void swim() {

    }

    @Override
    public void autoPark() {

    }

    @Override
    public void selfDrive() {

    }

    @Override
    public void charge() {

    }

    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }

    @Override
    public void fly() {

    }
}
