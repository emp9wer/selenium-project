package src.day34_interface.carTask;

public abstract class Car {

    private final String make,model;
    private final int year;
    private double price;
    private String color;

    public Car(String make, String model, int year, double price, String color) {
        if(make.isEmpty()||make.equals("null")){
            System.err.println("make can not be null or empty");
            System.exit(1);
        }
        this.make = make;
        if(model.isEmpty()||model.equals("null")){
            System.err.println("model can not be null or empty");
            System.exit(1);
        }
        this.model = model;
        if(year<1886){
            System.err.println("year can not be less than 1886");
            System.exit(1);
        }
        this.year = year;
        setPrice(price);
        setColor(color);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<0){
            System.err.println("price can not be negative");
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color.isEmpty()||color.equals("null")){
            System.err.println("color can not be null or empty");
            System.exit(1);
        }
        this.color = color;
    }

    public abstract void start();
    public abstract void drive();

    public static void stop(){
        System.out.println("press brake to stop");
    };

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
