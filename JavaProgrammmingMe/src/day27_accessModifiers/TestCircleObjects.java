package src.day27_accessModifiers;

public class TestCircleObjects {

    public static void main(String[] args) {


        Circle c1 = new Circle(3.5);

        System.out.println(c1); //Circle{radius=3.5, diameter=7.0, PI=3.14, Area=38.465, Perimeter=21.98}

        Circle.printPiValue(); //3.14




    }
}
