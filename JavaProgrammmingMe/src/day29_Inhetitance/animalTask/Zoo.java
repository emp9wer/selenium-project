package src.day29_Inhetitance.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Babaska","Dolmatian",'M',2,"Large","White");

        Cat cat = new Cat();
        cat.setInfo("Felisia","Russian blue",'F',3,"Medium","Black");

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan","Bengal",'M',4,"Large","Orange");



        System.out.println(dog);
        System.out.println(cat);
        System.out.println(tiger);
        System.out.println("-------------");

        dog.eat(); // from parent class
        dog.bark(); // from child class
        System.out.println(dog.getName());
        System.out.println(dog.getColor());
        System.out.println(dog.getAge()); // 2
        dog.setAge(4);
        System.out.println(dog.getAge()); // 4
    }
}
