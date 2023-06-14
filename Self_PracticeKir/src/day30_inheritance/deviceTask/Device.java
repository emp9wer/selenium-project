package src.day30_inheritance.deviceTask;

public class Device {
    private String brand, model,color;
    private double size,price;
    private boolean hasBattery,hasPowerButton;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if(brand.equalsIgnoreCase("null")||brand.isEmpty()||brand.isBlank()){
            System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model.equalsIgnoreCase("null")||model.isEmpty()||model.isBlank()){
            System.exit(1);
        }
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<=0){
            System.exit(1);
        }
        this.price = price;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }

    public void turnOn(){
        System.out.println(getBrand()+" "+getModel()+" is turned on");
    }
    public void turnOff(){
        System.out.println(getBrand()+" "+getModel()+" is turned off");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+ " Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", price=" + price +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }

    public Device(String brand, String model, String color, double size, double price, boolean hasBattery, boolean hasPowerButton) {
        setBrand(brand);
        setModel(model);
        setColor(color);
        setSize(size);
        setPrice(price);
        setHasBattery(hasBattery);
        setHasPowerButton(hasPowerButton);

    }
}
