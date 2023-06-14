package src.day32_finalKeyword.person;

import java.time.LocalDate;

final public class Student extends Person{
    public Student(String name, char gender,  LocalDate dateOfBirth) {
        super(name, gender, dateOfBirth);
    }
}
