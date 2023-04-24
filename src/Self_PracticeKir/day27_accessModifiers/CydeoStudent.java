package Self_PracticeKir.day27_accessModifiers;

public class CydeoStudent {

    public String name, batchNumber,groupNumber,fieldOfStudy,programmingLanguage;
    public char gender;
    public int age;
    public static String schoolName,secterCode;

    public CydeoStudent(String name, String batchNumber, String groupNumber, String fieldOfStudy, String programmingLanguage, char gender, int age) {
        this.name = name;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
        this.programmingLanguage = programmingLanguage;
        this.gender = gender;
        this.age = age;
    }
    {
        schoolName="CYDEO";
        secterCode="WoodenSpoon";
    }

    public static void  printSchoolName(){
        System.out.println(schoolName);
    }

    public static void  printSecretCode(){
        System.out.println(secterCode);
    }

    public void attendClass(){
        System.out.println(name+" is now attending " + fieldOfStudy);
    }
    public void study(){
        System.out.println(name+" is now studying ");
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", batchNumber='" + batchNumber + '\'' +
                ", groupNumber='" + groupNumber + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        CydeoStudent s1 = new CydeoStudent("Vasya","29B","Anagram","SDET","Java",'M',32);

        printSchoolName();
        printSecretCode();
        s1.attendClass();
        s1.study();
        System.out.println(s1);
    }
}
/*

2. create a class named CydeoStudent
            Variables:
                name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()
 */