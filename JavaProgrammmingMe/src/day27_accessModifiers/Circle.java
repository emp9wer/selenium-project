package src.day27_accessModifiers;

public class Circle {
    public double radius, diameter; //instance in heap

    public static double pi = 3.14; // static

    public Circle(double radius) {
        this.radius = radius;
        diameter = radius * 2;
    }

    //  public static double calcArea(){return radius*radius*pi;}  static only accepts statics
    public double calcArea() {
        return radius * radius * pi;
    }

    public double calcPerimeter() {
        return diameter * pi;
    }

    public static void printPiValue(){
        System.out.println(pi);
    }


    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", PI=" + pi +
                ", Area=" + calcArea() +
                ", Perimeter=" + calcPerimeter() +
                '}';
    }
}
/*

    Create a class named Circle:

		Attributes:
			radius, diameter, pi

		Add a constructor that can set All the fields (instances)

		Actions:
			calcArea(): returns the area of Circle
			calcPerimeter(): returns the perimeter of Circle
			printPi(): displays PI value
			toString(): displays the radius, diameter, pi, area and perimeter of the circle when the object of circle is passed in the print statement



Access Modifiers:

	public > protected > default > private




 */