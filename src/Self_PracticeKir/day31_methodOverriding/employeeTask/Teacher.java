package Self_PracticeKir.day31_methodOverriding.employeeTask;

public class Teacher extends Employee{
    public Teacher(String name, String id, String jobTitle, String companyName, int age, char gender, double salary) {
        super(name, id, jobTitle, companyName, age, gender, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+ " is teaching");
    }
}
