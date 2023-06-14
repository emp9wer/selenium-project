package src.day28_Encapsulation.credentials;

public class CredentialsTest {

    public static void main(String[] args) {
        Credentials c1 = new Credentials("jojo","Faf0001!");
        System.out.println(c1.getUsername()); //jojo
        System.out.println(c1.getPassword()); //FafaMonteco2000!

        System.out.print("the given string is strong password: ");
        System.out.print(Credentials.isStrongPassWord("FafaMonteco2000"));
        //the given string is strong password: false
    }
}
