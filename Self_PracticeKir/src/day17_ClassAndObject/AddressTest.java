package src.day17_ClassAndObject;

public class AddressTest {
    public static void main(String[] args) {
        Address a1 = new Address();
        a1.setInfo(7925,"Jones Branch Dr","McLean","Va",22012);
        System.out.println(a1);
        a1.buildingNumber = 1222;
        System.out.println(a1);
    }

}
