package src.day04_concatenation;

public class ConcatenationIntro {
    public static void main(String[] args) {

        System.out.println("This is " + "one string."); // This is one string.
        // use of + operator for concatenation

        String name = "Alexander";
        int age = 35;
        int salary = 85_000;

        System.out.println("Hello " + name + "."); // Hello Alexa nder.
        System.out.println("You are " + age + " years old."); // You are 35 years old.
        System.out.println("Your salary is " + salary + " USD"); // Your salary is 85000 USD

        int number = 100_000_000; // _ - to make numbers readable

        System.out.println("number = " + number); // number = 100000000




    }
}
