package src.day38_exceptionsHandlings.shapeTask;

public class TestShape {
    public static void main(String[] args) {


        Circle circle = new Circle(5);

        circle.setRadius(0);

        System.out.println(circle);

    }
}
