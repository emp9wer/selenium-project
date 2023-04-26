package src.day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObject {

    public static void main(String[] args) {

        Person[] people = {new Person(), new Person(), new Person(), new Person(), new Person()};

        people[0].setInfo("Daniel",'M', LocalDate.of(1989,2,25));
        people[1].setInfo("Mike",'M', LocalDate.of(1992,8,20));
        people[2].setInfo("Peter",'M', LocalDate.of(1986,7,2));
        people[3].setInfo("Aika",'F', LocalDate.of(1965,5,11));
        people[4].setInfo("Masha",'F', LocalDate.of(1959,2,21));

        ArrayList<Person> studentList = new ArrayList<>();
        studentList.addAll(Arrays.asList(people));
        // print name &  dob of ea person
        // remove all the person objects that has age > 55

        for (Person ea : studentList) {
            System.out.println(ea.name + " : " + ea.dateOfBirth+" : "+ea.age);
        }

        studentList.removeIf(p -> p.age>55);
        System.out.println("----------------");
        for (Person ea : studentList) {
            System.out.println(ea.name + " : " + ea.dateOfBirth);
        }



    }
}
