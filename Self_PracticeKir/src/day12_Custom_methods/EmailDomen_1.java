package day12_Custom_methods;

public class EmailDomen_1 {
    public static void main(String[] args) {
        String email = "lalafff@mail.ru";
        emailDomain(email);

    }
    public static void emailDomain(String domain){

        System.out.println("domain: " + domain.substring(domain.indexOf("@")+1 , domain.lastIndexOf(".")));


    }


}
