package src.day29_Inheritance.employeeTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Developer extends Employee {

    private String programmingLanguage;

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        ArrayList<String>progLanguages = new ArrayList<>(Arrays.asList("Java", "JavaScript", "Python", "Ruby", "C#", "C++", "Swift"));
            if(!progLanguages.contains(programmingLanguage)){
            System.err.println("can not set programming language to "+programmingLanguage);
            System.exit(1);
        }

        this.programmingLanguage = programmingLanguage;
    }


 /*   public void setInfo(String name, char gender, int age, String id, String jobTitle, int salary,String programmingLanguage) {
        setInfo(name, gender, age, id, jobTitle, salary);
        setProgrammingLanguage(programmingLanguage);

    }*/


    public void setInfo(String name, char gender, int age, String id, String jobTitle, int salary,String programmingLanguage){
        setInfo(name, gender, age, id, jobTitle, salary );
        setProgrammingLanguage(programmingLanguage);
    }






    public void coding(){
        System.out.println(getName()+" is coidng");
    }


    /*
    public String toString() {
        return "Developer{" +
                programmingLanguage='" + programmingLanguage
                '}';
    }

     */


    public String toString() {
        return
                "Employee "+getClass().getSimpleName()+ "{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", id='" + getId() + '\'' +
                ", jobTitle='" + getJobTitle() + '\'' +
                ", salary=" + getSalary() +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}
