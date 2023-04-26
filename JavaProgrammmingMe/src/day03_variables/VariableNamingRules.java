package src.day03_variables;

public class VariableNamingRules {
    public static void main(String[] args) {
        // 1) readable, understandable, meaningful.
        // 2) must be UNIQUE.
        //examples

        //age of the student is 28
        //salary is 10000

        int age = 28;
        int salary = 10000;
        // int age = 32 // compiler error - must be unique - already used

        int phoneNumberOfTheUser = 123456789; //use of camel case - starting from 2nd word - Upper case; _ or $ can be used else.

        double salaryBeforeTax = 10000.5;
        double salary_after_tax$ = 80000.5; // use of _ and $ - no other special characters can be used.
        // variable names can not start with a digit! - example
        // int 10number = 10; - compiler error
        // int number10 = 10; // no error

        // variable names can not be java reserved words. example //  int boolean = 100;  // = error
        //-----------------------------------------------------------------------------------------
        // String: for String of text (non primitive)
        // example
        //gender is male
        //String gender = "Male";
        //String fullName - "Cydeo School";







    }
}
