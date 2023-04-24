package Self_PracticeKir.day29_Inheritance.employeeTask;

public class Employee {

    private String name;
    private char gender;
    private int age;
    private String id;
    private String jobTitle;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if((gender!='M') && (gender!='F')){
            System.err.println("wrong gender format");
            System.exit(1);
        }
        this.gender = gender;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0||age<18||age>68){
            System.err.println("wrong age entered");
            System.exit(1);
        }
        this.age = age;
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



    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if(salary<0){
            System.err.println("salary can not be negative");
            System.exit(1);
        }
        this.salary = salary;
    }


    public void setInfo(String name, char gender, int age, String id, String jobTitle, int salary) {
      setName(name);
       setGender(gender);
        setAge(age);
        setId(id);
        setJobTitle(jobTitle);
        setSalary(salary);

    }


    public String toString() {
        return "Employee "+getClass().getSimpleName()+ "{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
