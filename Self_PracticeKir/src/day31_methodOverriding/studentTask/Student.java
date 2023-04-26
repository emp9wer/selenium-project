package day31_methodOverriding.studentTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Student extends Person{

    public Student(String name, int age, char gender, String studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender);
        setStudentId(studentId);
        setFieldOfStudy(fieldOfStudy);
        setGrade(grade);
        setSchoolName(schoolName);
    }

    private String studentId;
    private String fieldOfStudy;
    private char grade;
    private String schoolName;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if(fieldOfStudy.equalsIgnoreCase("null")||fieldOfStudy.isEmpty()){
            System.err.println("filedOfStudy should not be set to null or empty");
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        ArrayList<Character> chars = new ArrayList(Arrays.asList('A', 'B', 'C', 'D', 'F'));
        if(!chars.contains(grade)){
            System.err.println("grade must be valid (A, B, C, D, F)");
            System.exit(1);
        }
        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        if(schoolName.equalsIgnoreCase("null")||schoolName.isEmpty()){
            System.err.println("schoolName should not be set to null or empty");
            System.exit(1);
        }
        this.schoolName = schoolName;
    }

    public void study(){
        System.out.println(getName()+" is studying");
    }

    @Override
    public String toString() {
        return super.toString().replace("}","")+
                ", studentId=" + getStudentId() +
                ", fieldOfStudy=" + getFieldOfStudy() +
                ", grade=" + getGrade() +
                ", schoolName=" + getSchoolName() + "}"
                ;
    }
}
