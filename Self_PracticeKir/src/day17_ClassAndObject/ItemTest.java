package src.day17_ClassAndObject;

public class ItemTest {
    public static void main(String[] args) {
        Item i1 = new Item();
        i1.setInfo("Avocado",0.79,4);
        System.out.println(i1);
        i1.quantity = 5;
        System.out.println(i1);
        i1.name = "Bread";
        i1.unitPrice = 2.89;
        i1.quantity = 2;
        System.out.println(i1);
    }
}
