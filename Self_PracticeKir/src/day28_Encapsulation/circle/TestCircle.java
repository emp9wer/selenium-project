package day28_Encapsulation.circle;

public class TestCircle {
    public static void main(String[] args) {

        Circle c1 = new Circle(10);
        System.out.println(c1.calcArea());
        System.out.println(c1.calcPerimeter());
        System.out.println("radius = "+c1.getRadius());
        System.out.println("diameter = "+c1.getDiameter());
        System.out.println(c1);

    }
}
