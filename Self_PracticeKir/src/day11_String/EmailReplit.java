package day11_String;

import java.util.Scanner;

public class EmailReplit {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        //WRITE YOUR CODE BELOW
        String firstname, lastname , domain;

        firstname = email.substring(0,email.indexOf('_'));
        firstname = firstname.substring(0,1).toUpperCase() +""+firstname.substring(1);

        lastname = email.substring(email.indexOf('_')+1,email.indexOf('@'));
        lastname = lastname.substring(0,1).toUpperCase() +""+lastname.substring(1);

        domain = email.substring(email.indexOf('@')+1 , email.indexOf('.'));
        domain = domain.substring(0,1).toUpperCase() +""+domain.substring(1);
        System.out.println("First name: "+firstname+"\n" +
                "Last name: "+lastname+"\n" +
                "Domain: "+domain);
scan.close();

    }
}
