package day31_methodOverriding.studentTask;

public class Person {

    private String name;
    private int age;
    private char gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()||name.isBlank()||name.equalsIgnoreCase("null")){
            System.err.println("name shall not be empty blank or null");
            System.exit(1);
        }
            for (char c : name.trim().toCharArray()) {
                if(!Character.isLetterOrDigit(c)){
                    System.err.println("name shall not contain special characters");
                    System.exit(1);
                }
            }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){
            System.err.println("wrong age - shall not be negative");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(gender!='F' && gender!='M'){
            System.err.println("invalid gender entered");
            System.exit(1);
        }
        this.gender = gender;
    }


    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public void eat(String food){
        System.out.println(getName()+ " is eating "+ food);
    }
    public void drink(String drink){
        System.out.println(getName()+ " is drinking "+ drink);
    }
    public void sleep(int hours){
        if (hours == 1){
            System.out.println(getName()+ " is sleeping for "+hours+" hour");
        }else {
        System.out.println(getName()+ " is sleeping for "+hours+" hours");
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
