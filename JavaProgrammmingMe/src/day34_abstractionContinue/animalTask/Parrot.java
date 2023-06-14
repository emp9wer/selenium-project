package src.day34_abstractionContinue.animalTask;

public class Parrot extends Animal implements Playable,Flyable{

    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Parrot "+getName()+" is eating parrot food");
    }

    @Override
    public void play() {
        System.out.println("parrot is playing");
    }

    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }
}
