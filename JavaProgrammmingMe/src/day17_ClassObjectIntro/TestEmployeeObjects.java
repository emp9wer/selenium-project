package src.day17_ClassObjectIntro;

public class TestEmployeeObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("Malaka", 55, 'F', "Java developer", 90000, "A12");


    Employee employee2 = new Employee();
    employee2.setInfo("Nasos", 21, 'M',"Sdet", 150000, "B32");


    employee2.age = 22; // changes int variable age of employee2   to desired value
        employee2.name = "Arkasha";

        System.out.println(employee1);
        System.out.println(employee2);

        employee2.work();
}
}
