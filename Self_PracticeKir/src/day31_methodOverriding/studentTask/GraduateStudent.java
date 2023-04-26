package day31_methodOverriding.studentTask;

public class GraduateStudent extends Student{
    public GraduateStudent(String name, int age, char gender, String studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
    }

    @Override
    public void study() {
        super.study();
        System.out.println(" for final exam");
    }
}
