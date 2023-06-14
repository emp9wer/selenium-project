package src.day36_polymorphism;

public class TestCircleEqualMethod {
    public static void main(String[] args) {


        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(4);

        System.out.println(circle1==circle2);//false // different memory locations
        System.out.println(circle1.equals(circle2));//true
        System.out.println(circle1.equals(circle3));//false
      //  System.out.println(circle1.equals("circle3"));//invalid object Process finished with exit code 1


    }
}