package day11_String;

public class EmailTask2_7 {
    public static void main(String[] args) {
        String email = "kirill_kandakov@gmail.com";

        String firstName = email.substring(0,1).toUpperCase() + email.substring(1 , email.indexOf('_'));

        String lastName = email.substring(email.indexOf('_')+1, email.indexOf('_')+2).toUpperCase() + email.substring(email.indexOf('_')+2 , email.indexOf('@'));

        String domain = email.substring(email.indexOf('@')+1 , email.indexOf('.'));

        System.out.println("First name: " + firstName+ "\nLast name: " + lastName +
                "\nDomain: "+domain);












    }
}
/*
7. Create a class called EmailTask2.
   Assume that email address is constructed by person's first name and followed by an underscore and last name.

   Write a program that will print out information about user based on email. Print first name, last name, and domain.

   First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

           Ex:
               input:
                   craig_federighi@apple.com

            Output:
                First name: Craig
                Last name: Federighi
                Domain: apple

 */