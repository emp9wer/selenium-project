package src.day06_IfStatements;

public class IfAndElseStatementIntro {
    public static void main(String[] args) {

        // if else - used for 2 outcomes ex yes no / true false

        int age = 28;

        if (age >=21){
            System.out.println("eligible");
        }
        if(age < 21){
            System.out.println("not eligible");
        }
        System.out.println("-------------------------------------");

        if (age >=21){
            System.out.println("1eligible");
        }
        else {
            System.out.println("1not eligible");
        }
    }
}
