package src.day34_abstractionContinue.animalTask;

public class Duck extends Animal implements Flyable,Swimmable,Playable{
    public Duck(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Duck "+getName()+" is eating worms");
    }

    @Override
    public void fly() {
        System.out.println("duck is flying");
    }

    @Override
    public void swim() {

    }

    @Override
    public void play() {

    }
}
