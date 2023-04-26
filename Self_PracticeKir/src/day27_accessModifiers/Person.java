package day27_accessModifiers;

public class Person {
    public String name,language;
    public int age;
    public char gender;
    public static String planet;
    public static boolean isHuman, hasNose;
    public static int numberOfWings, numberofHeads;

    public Person(String name, String language, int age, char gender) {
        this.name = name;
        this.language = language;
        this.age = age;
        this.gender = gender;
    }

    {
        planet="Earth";
        isHuman=true;
        hasNose=true;
        numberOfWings=0;
        numberofHeads=1;
    }

    public static void printPlanetName(){
        System.out.println(planet);
    }
    public void eat(String food){
        System.out.println(name+" is eating "+food);
    }
    public void drink(String drink){
        System.out.println(name+" is drinking "+drink);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public static void main(String[] args) {

        Person p1 = new Person("Alex","English",22,'M');
        printPlanetName();
        p1.eat("pasta");
        p1.drink("coke");
        System.out.println(p1);


    }



}
