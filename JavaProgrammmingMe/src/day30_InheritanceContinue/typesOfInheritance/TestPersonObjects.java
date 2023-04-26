package src.day30_InheritanceContinue.typesOfInheritance;

import java.time.LocalDate;

public class TestPersonObjects {
    public static void main(String[] args) {

        Student student = new Student("Vasya",'M', LocalDate.of(1990,5,15),'A',"A01");

        President president = new President("Daniel",'M',LocalDate.of(1980,12,2),LocalDate.of(2020,2,5));

        Teacher teacher = new Teacher("Emily",'F',LocalDate.of(1985,11,1),"Math teacher","B121",50000);


        System.out.println(student);
        System.out.println(teacher);
        System.out.println(president);

    }
}
