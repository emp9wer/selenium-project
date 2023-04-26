package src.day28_OOP_Encapsulation.encapsulation;

public class Employee {
    private String name;
    private int age;
    private String jobTitle;
    private double salary;



    public String getName() {
        if (name==null){
            return "Unknown";
        }

        return name;

    }

    public void setName(String name) {
        if(name.isBlank()||name.isEmpty()){
            System.err.println("name not entered");
            System.exit(1);
        }


        this.name = name;

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}
