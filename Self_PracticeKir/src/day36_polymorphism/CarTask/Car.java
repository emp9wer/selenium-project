package src.day36_polymorphism.CarTask;

public class Car {

    public void drive(){
        System.out.println("driving"+getClass().getSimpleName());
    }
    private String model;
    private String color;
    private int year;
    private double price;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Car(String model, String color, int year, double price) {
        setModel(model);
        setColor(color);
        setYear(year);
        setPrice(price);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+" {" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
