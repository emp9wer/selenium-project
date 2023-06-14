package src.day17_ClassAndObject;

public class StudentAttributes {
    public String name;
    public char gender;
    public int age;
    public String studentId;
    public String grade;
    public boolean isFullTime;


    public void setInfo(String name, char gender, int age, String studentId, String grade, boolean isFullTime) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.studentId = studentId;
        this.grade = grade;
        this.isFullTime = isFullTime;
    }


    public String toString() {
        return "StudentAttributes{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", studentId='" + studentId + '\'' +
                ", grade='" + grade + '\'' +
                ", isFullTime=" + isFullTime +
                '}';
    }


public void study(){
    System.out.println(name + " is studying");
}

}
