package day18_MemoryManagement;

public class Contact {
String name;
long phoneNumber;
String email;

    public void setInfo(String name, long phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public void call(){
        System.out.println("Calling "+name+" now");
    }
    public void sendMessage(){
        System.out.println("sending message to "+phoneNumber+ " now");
    }
    public void sendEmail(){
        System.out.println("sending email to " + email+ " now");
    }
}
