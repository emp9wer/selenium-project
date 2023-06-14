package src.day34_abstractionContinue.animalTask;

public class Lion extends Animal implements WildAnimal{

    public Lion(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Lion "+getName()+" eats Buffalo");
    }


    @Override
    public void hunt() {
        System.out.println("lion is hunting");
    }
}
