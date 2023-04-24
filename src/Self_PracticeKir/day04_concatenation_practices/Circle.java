package Self_PracticeKir.day04_concatenation_practices;

public class Circle {
    public static void main(String[] args) {

        int radius = 5;
        float radiusSquare = (float) Math.pow(radius,2);
        float area = 3.14f * radiusSquare,
                perimeter = (float) (2*radius*3.14);
        System.out.println("Area of the circle is "+area+"\nPerimeter of the circle is " + perimeter);

    }
}
/*
Create a class named Circle and declare the following variables:
                radius
                area
                perimeter

    6.1 Write a program that can calculate the area and perimeter of a circle with any given radius
            Ex:
                  radius = 5

            output:
                   Area of the circle is 78.5
                   Perimeter of the circle is 31.4
*/