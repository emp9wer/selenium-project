package day03_variables_practices;
/*
1. Create a class named Rectangle.java
2. Declare the following variables:
1. width
2. Length
3. Write a program that can display the area of the rectangle
Hints: area = width * length
 */
public class Rectangle {
    public static void main(String[] args) {
        float width = 234.98F,
                length = 141.65F;
        float areaOfRectangle = width * length;
        System.out.println("areaOfRectangle = " + areaOfRectangle); // expected output: areaOfRectangle = 33284.917
    }
}
