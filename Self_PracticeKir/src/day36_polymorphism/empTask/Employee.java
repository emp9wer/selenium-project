package src.day36_polymorphism.empTask;

public class Employee {

    private String name;
    private int age;
    private char gender;
    private String id;
    private String id2;
    private double salary;

    public Employee(String name, int age, char gender, String id, String id2, double salary) {
      setName(name);
      setAge(age);
      setGender(gender);
      setId(id);
      setId2(id2);
      setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId2() {
        return id2;
    }

    public void setId2(String id2) {
        this.id2 = id2;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                ", id2='" + id2 + '\'' +
                ", salary=" + salary +
                '}';
    }
}
