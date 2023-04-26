package src.day25_constructor;

import java.time.LocalDate;

public class TestEmployeeObjects {
    public static void main(String[] args) {

        Employee e1 = new Employee("Frankie",28,'M',"SDET",130000, LocalDate.of(2022,12,2));
        Employee e2 = new Employee("Babaganush",44,'M',"JavaDev",140000, LocalDate.of(2012,1,23));
        Employee e3 = new Employee("Malika",33,'F',"PO",150000, LocalDate.of(2021,5,11));
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

    }
}
