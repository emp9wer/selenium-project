package day18_MemoryManagement;

public class ContactTest {
    public static void main(String[] args) {

        Contact a1 = new Contact();
        a1.setInfo("Zabava Zebra",4123334444L,"zabavazebra@gmail.com");
        a1.call();
        a1.sendMessage();
        a1.sendEmail();
    }
}
