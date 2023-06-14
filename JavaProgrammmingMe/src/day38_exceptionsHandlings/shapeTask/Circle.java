package src.day38_exceptionsHandlings.shapeTask;

public class Circle {

    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<=0){
            throw new InvalidShapeException("invalid radius set (radius<=0) :  "+radius);
        }
        this.radius = radius;
    }
}
