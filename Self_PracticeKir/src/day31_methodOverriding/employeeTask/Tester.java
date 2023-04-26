package day31_methodOverriding.employeeTask;

public class Tester extends Employee{
    public Tester(String name, String id, String jobTitle, String companyName, int age, char gender, double salary) {
        super(name, id, jobTitle, companyName, age, gender, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is testing");
    }
}
