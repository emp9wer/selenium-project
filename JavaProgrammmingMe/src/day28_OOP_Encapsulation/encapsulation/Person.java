package src.day28_OOP_Encapsulation.encapsulation;

import java.time.LocalDate;

public class Person {

    private String name;
    private int age;
    private char gender;
    private LocalDate dateOfBirth;


    public String getName() {
        if (name==null){
           return "Unknown";
       }
       return name;
    }

    public void setName(String name) {
        if(name == null|| name.isEmpty()||name.isBlank()){
            System.err.println("name is not entered");
            System.exit(1);
        }
        this.name = name;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0||age>120){
            System.err.println("incorrect age");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(gender!='M'||gender!='F'){
            System.err.println("wrong code for gender");
            System.exit(1);
        }
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        if(dateOfBirth.isAfter(LocalDate.now())){
            System.err.println("wrong time entered");
            System.exit(1);
        }
        this.dateOfBirth = dateOfBirth;
    }

    public Person(String name, int age, char gender, LocalDate dateOfBirth) {
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
        this.setDateOfBirth(dateOfBirth);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Pat",12,'M',LocalDate.of(1999,1,22));

        

    }


}
