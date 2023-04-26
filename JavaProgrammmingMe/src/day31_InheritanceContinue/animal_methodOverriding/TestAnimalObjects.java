package src.day31_InheritanceContinue.animal_methodOverriding;

public class TestAnimalObjects {

    public static void main(String[] args) {


        Cat cat = new Cat("emily", "russian blue", 'F', 1, "small", "black");

        Dog dog = new Dog("Max", "husky", 'M', 3, "Medium", "White");

        Lion lion = new Lion("Simba", "African Lion", 'M', 2, "Large", "Yellow", true);

        Eagle eagle = new Eagle("Bella", "American eagle", 'F', 5, "medium", "Black and white");


        System.out.println(cat);
        System.out.println(dog);
        System.out.println(lion);
        System.out.println(eagle);

        System.out.println("---------------");

        cat.eat();

        dog.eat();

        lion.eat();

        eagle.eat();


    }

}
