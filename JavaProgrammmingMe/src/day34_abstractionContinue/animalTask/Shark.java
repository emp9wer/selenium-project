package src.day34_abstractionContinue.animalTask;

public class Shark extends Animal implements Swimmable,WildAnimal{
    public Shark(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Shark "+getName()+" eats dolphins");
    }


    @Override
    public void swim() {
        System.out.println("shark is swimming");
    }

    @Override
    public void hunt() {
        System.out.println("shark is hunting");
    }
}
