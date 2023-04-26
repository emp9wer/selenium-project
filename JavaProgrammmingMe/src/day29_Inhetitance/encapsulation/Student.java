package src.day29_Inhetitance.encapsulation;

public class Student {

    private String name;
    private int age;
    private char gender,grade;
    private String SchoolName;


    public String getName(){
        if (name == null){
            name = "Unknown";
        }
        return name;
    }
    public void setName(String name){
        if(name.isEmpty()){
            System.err.println("invalid name");
            //return;
            System.exit(1);
        }
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

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getSchoolName() {
        return SchoolName;
    }

    public void setSchoolName(String schoolName) {
        SchoolName = schoolName;
    }
}
