package src.day25_constructor;

public class PizzaTest {
    public static void main(String[] args) {

        Pizza p1 = new Pizza('L',1,1);
        System.out.println(p1);
        System.out.println(p1.calcCost());

    }
}
