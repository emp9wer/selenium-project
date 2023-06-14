package src.day31_methodOverriding.studentTask;

public class CydeoStudent extends Student{

    public CydeoStudent(String name, int age, char gender, String studentId, String fieldOfStudy, char grade, String schoolName, int batchNumber, int groupNumber, String programmingLanguage) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.programmingLanguage = programmingLanguage;
    }

    private int batchNumber, groupNumber;
    private String programmingLanguage;

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        if(batchNumber<=0){
            System.out.println("batchNumber  should not be set to zero or negative");
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        if(groupNumber<=0){
            System.err.println("groupNumber should not be set to zero or negative");
            System.exit(1);
        }
        this.groupNumber = groupNumber;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    @Override
    public void eat(String food) {
        super.eat(food);
        System.out.println("while studying "+getProgrammingLanguage());
    }

    @Override
    public void drink(String drink) {
        super.drink(drink);
        System.out.println("while studying "+getProgrammingLanguage());
    }

    @Override
    public void sleep(int hours) {
        super.sleep(hours);
        System.out.println("while dreaming of "+getProgrammingLanguage());
    }

    @Override
    public String toString() {
        return super.toString().replace("}","")+
        ", batchNumber=" + getBatchNumber() +
        ", groupNumber=" + getGroupNumber() +
        ", programmingLanguage=" + getProgrammingLanguage() +
                "}";
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if(programmingLanguage.equalsIgnoreCase("null")||programmingLanguage.isEmpty()){
            System.err.println("programmingLanguage should not be set to null\n" +
                    "                                    3. programmingLanguage should not empty");
            System.exit(1);
        }
        this.programmingLanguage = programmingLanguage;




    }
}
