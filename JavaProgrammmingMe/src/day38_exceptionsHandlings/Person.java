package src.day38_exceptionsHandlings;

public class Person {

    private String name;
    private int age;
    private final char gender;


    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);

        if(!(gender=='M'||gender=='F')){ //if gender is invalid
            throw new RuntimeException("invalid gender: "+gender);//throws the runtime exception and crash program
        }
        this.gender = gender;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        if(age==0){
            throw new RuntimeException("age has not been set");
        }
        return age;
    }

    public void setAge(int age) {
        if(age<0||age>150){//if age is invalid
            throw new RuntimeException("age<0||age>150 - invalid age: "+ age);//throw runtime exception with message & crash program
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }



}
