package src.day34_abstractionContinue.animalTask;

public class Dolphin extends Animal implements Swimmable {

    Dolphin(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Dolphin "+getName()+" eats fish");
    }

    @Override
    public void swim() {
        System.out.println("dolphin is swimming");
    }
}
