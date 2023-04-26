package day31_methodOverriding.employeeTask;

public class Employee {

    private String name,id,jobTitle,companyName;
    private int age;
    private char gender;
    private double salary;


    public char getGender() {
        return gender;

    }

    public void setGender(char gender) {
        if(gender=='M'||gender=='F'){
            this.gender = gender;
        } else {
            System.err.println("gender can only be set to 'M' or 'F'");
            System.exit(1);
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<=0||age<18){
            System.err.println(" 1. Age can not be zero or negative\n" +
                    "                    2. Age can not be less than 18");
            System.exit(1);
        }
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary<0){
            System.err.println("salary can not be negative");
            System.exit(1);
        }
        this.salary = salary;
    }

    public Employee(String name, String id, String jobTitle, String companyName, int age, char gender, double salary) {
        setName(name);
        setId(id);
        setJobTitle(jobTitle);
        setCompanyName(companyName);
        setAge(age);
        setGender(gender);
        setSalary(salary);
    }

    public void work(){
        System.out.println(getName()+" is working");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }
}
