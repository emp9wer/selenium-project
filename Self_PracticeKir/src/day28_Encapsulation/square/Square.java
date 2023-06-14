package src.day28_Encapsulation.square;

public class Square {
    private double side;

    public void setSide(double side) {
        if(side<0){
            System.exit(0);
        }
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public Square(double side) {
        this.setSide(side);
    }

    public double calcArea(){
        return side*side;
    }
    public double calcPerimeter(){
        return side*4;
    }

    public String toString() {
        return "Square{" +
                " side= " + side +
                " area= " + calcArea() +
                " perimeter= " + calcPerimeter() +
                '}';
    }
}
/*
2. Create a class named Square:
        Private variables:
            side

        Encapsulate all the fields

            Condition:
                side of the square should not be negative

        Add a constructor that allows user to set all the fields when the object is created.


        Methods:
            calcArea(): returns the area of square
            calcPerimeter(): returns the perimeter of square
            toString(): can display the side, area, perimeter of square when object is passed in print statement

 */