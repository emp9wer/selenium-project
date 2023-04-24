package Self_PracticeKir.day28_Encapsulation.rectangle;

public class Rectangle {
    private double width;
    private double length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width<0){
            System.exit(0);
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length<0){
            System.exit(1);
        }
        this.length = length;
    }

    public Rectangle(double width, double length) {
        this.setWidth(width);
        this.setLength(length);
    }

    public double calcArea(){
        return width*length;
    }
    public double calcPerimeter(){
        return (width*2)+(length*2);
    }


    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}
