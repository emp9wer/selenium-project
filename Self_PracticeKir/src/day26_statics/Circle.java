/*
package day26_statics;

import utilities.MathUtil;

import java.text.DecimalFormat;

public class Circle {

    public double radius;
    public double diameter;
    public static double pi = Math.PI;
    public Circle(double radius) {
        this.radius = radius;
        diameter = radius*2;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + MathUtil.format(radius) +
                ", diameter=" + MathUtil.format(diameter) +
                ", pi =" +MathUtil.format(Math.PI)+
                ", area =" + calcArea() +
                ", perimeter =" + calcPerimeter() +
                '}';
    }

    public double calcArea(){
        return MathUtil.format(Math.PI*radius*radius);
    }

    public double calcPerimeter(){
        return MathUtil.format(2*Math.PI*radius);
    }

    public static void printPi(){
        System.out.println(MathUtil.format(Math.PI));
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(3);
        DecimalFormat df = new DecimalFormat("0.000");
        System.out.println(c1.calcArea());
        System.out.println(( c1.calcArea()));
        System.out.println((c1.calcPerimeter()) );
        printPi();
        System.out.println(c1);


    }

}
/*
2. Circle Task:
		1. Create a class named Circle:

				Attributes:
					instance: radius, diameter
					static: pi

				Add a constructor that can set All the fields (instances)
					HINT: we only need to know the radius to set the radius & diameter

				Actions:
					calcArea(): returns the area of Circle
					calcPerimeter(): returns the perimeter of Circle
					printPi(): displays PI value
					toString(): displays the radius, diameter, pi, area and perimeter of the circle when the object of circle is passed in the print statement

 */