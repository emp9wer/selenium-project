package src.day34_abstractionContinue.animalTask;

public class Tiger extends Animal implements WildAnimal{
    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Tiger "+getName()+" eats deer");
    }

    @Override
    public void hunt() {
        System.out.println("tiget is hunting");
    }
}
