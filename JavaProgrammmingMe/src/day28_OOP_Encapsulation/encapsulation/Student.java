package src.day28_OOP_Encapsulation.encapsulation;

public class Student {
    private int age;
    private String name;


    public String getName() {
        if(name==null){
            System.err.println("name is not given");
            System.exit(1);
        }
        return name;
    }

    public void setName(String name) {
        boolean hasDigit = false;
        for (char each : name.toCharArray()) {
            if(Character.isDigit(each)){
                hasDigit = true;
                break;
            }
        }
if (hasDigit){
    System.err.println("invalid name");
    System.exit(1);
}
        this.name = name;
    }


    public int getAge() { // getter
        if(age==0){
            System.err.println("Age has not been set");
            System.exit(1);
        }

        return age;
    }

    public void setAge(int age) { // setter
        if (age<1){ // if age invalid
            System.err.println("invalid age: " + age);
            System.exit(1); // status 1 means error occured
        }
        this.age = age;
    }


}
