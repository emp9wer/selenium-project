package src.day29_Inheritance.carTask;

public class Car {
    private String make;
    private String model;
    private int year;
    private String color;
    private double price;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year<=0){
            System.err.println("wrong year");
            System.exit(1);
        }

        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<=0){
            System.err.println("wrong price");
            System.exit(1);
        }
        this.price = price;
    }

    public void setInfo( String model, int year, String color, double price) {
        this.make = getClass().getSimpleName();
        this.setModel(model);
        this.setYear(year);
        this.setColor(color);
        this.setPrice(price);
    }


    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}

