package src.day27_accessModifiers;

public class Dog {

    public String breed, color,name;
    public char size, gender;
    public int age;
    public boolean isFriendly;
    public static int numberOfLegs, numberOfEyes, numberOfWings;

    public Dog(String name, String breed, String color, char size, char gender, int age, boolean isFriendly) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.size = size;
        this.gender = gender;
        this.age = age;
        this.isFriendly = isFriendly;
    }

    {
        numberOfEyes =2;
        numberOfLegs=4;
        numberOfWings=0;
    }

    public void eat(){
        System.out.println(name+" is eating");
    }
    public void drink(){
        System.out.println(name+" is drinking");
    }
    public void sleep(){
        System.out.println(name+" is sleeping");
    }
    public void play(){
        System.out.println(name+" is playing");
    }
    public void bark(){
        System.out.println(name+" is barking");
    }


    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", gender=" + gender +
                ", age=" + age +
                ", isFriendly=" + isFriendly +
                '}';
    }

    public static void main(String[] args) {


        Dog d1 = new Dog("babaska","chao chao", "black", 'M', 'M', 1, true);
        d1.eat();
        d1.drink();
        d1.sleep();
        d1.play();
        d1.bark();

        System.out.println(d1);

    }



}
