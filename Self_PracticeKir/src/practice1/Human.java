package src.practice1;

import java.util.InputMismatchException;

public class Human {

    String name;
    private int age; //encapsulation
    boolean hasSoul;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0||age>200) {
            throw new InputMismatchException("invalid age (age<0||age>200): " + age);
        }
        this.age = age;
    }

    public void eat(String food){
        System.out.println(name+ " is eating "+ food);
    }

    public void poop(){
        System.out.println(name+ " is pooping");
    }

    public Human(String name, int age, boolean hasSoul) {
        this.name = name;
        setAge(age);
        this.hasSoul = hasSoul;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hasSoul=" + hasSoul +
                '}';
    }


}
