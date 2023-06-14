package src.day34_abstractionContinue.animalTask;

public class Eagle extends Animal implements Flyable,WildAnimal{


    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Eagle "+getName()+" is eating snake");
    }


    @Override
    public void fly() {
        System.out.println("eagle is flying");
    }

    @Override
    public void hunt() {
        System.out.println("eagle is hunting");
    }
}
