package day11_String;

public class calledEmailTask1_6 {
    public static void main(String[] args) {

        String email = "mike_tyson@gmail.com";
//                      sub1      sub2
        if (email.contains("_")){
            String sub1 = email.substring(0,email.indexOf("_"));
            String sub2 = email.substring((email.indexOf('_')+1), email.indexOf('@')) ;
            System.out.println(sub2+"_"+sub1+"@gmail.com");
        }else{
            System.out.println(email);
        }
    }
}
/*
6. Create a class calledEmailTask1.
   Assume that email address is constructed by person's first name and followed by an underscore and last name.

    Write a program that can swap first name with last name in the email (Separated by an underscore).
    If the email doesn't contain an underscore print the given input email.

        Ex:
            input: mike_tyson@gmail.com
            output: tyson_mike@gmail.com

 */