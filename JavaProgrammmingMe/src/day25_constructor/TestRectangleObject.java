package src.day25_constructor;

public class TestRectangleObject {

    public static void main(String[] args) {
/*
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setInfo(3,4);
        System.out.println(rectangle1); //Rectangle{length=3.0, width=4.0, area=12.0

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setInfo(5,7);
        System.out.println(rectangle2);//Rectangle{length=5.0, width=7.0, area=35.0}
*/

Rectangle rectangle1 = new Rectangle(3,4);
Rectangle rectangle2 = new Rectangle(4,5);
Rectangle rectangle3 = new Rectangle(6,7);


        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(rectangle3);

    }


}
