package src.day31_InheritanceContinue.animal_methodOverriding;

public class Cat extends Animal {

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    //@Override to check if method is overwritten
  //  public void eat(){
  //      System.out.println("Cat "+getName()+" is eating cat food");
  //  }
    @Override
    public void eat() {
        System.out.println("Cat "+getName()+" is eating cat food");
    }

    @Override
    public void sleep() {
        System.out.println("Cat "+getName()+" 12 hours in a day");
    }


    public void scratch(){
        System.out.println("Cat "+getName()+" is scratching");
    }



}
