package src.day28_OOP_Encapsulation.encapsulation;

public class TestEmployeeObject {
    public static void main(String[] args) {


        Employee employee1 = new Employee();

        employee1.setSalary(100000);
        System.out.println(employee1.getSalary());
        System.out.println(employee1.getName());


    }
}
