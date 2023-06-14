package src.day38_exceptionsHandlings;

public class TestPerson {

    public static void main(String[] args) {

        Person person1 = new Person("muhtar",22,'M');



        System.out.println(person1);
        try {
            person1.setAge(-21); //Exception in thread "main" java.lang.RuntimeException: age<0||age>150 - invalid age: -21
        }catch (RuntimeException e){
            e.printStackTrace();
        }

        System.out.println(person1);







    }
}
