package src.day34_interface.deviceTask;

public abstract class Device {
    private final String brand,model;
    private String size;
    private double price;
    private boolean hasBattery,hasPowerButton;
    private String color;

    public void setSize(String size) {
        if(size.equals("null")||size.isEmpty()){
            System.err.println("size can not be null or empty");
            System.exit(1);
        }
        this.size = size;
    }

    public void setPrice(double price) {
        if(price<0){
            System.err.println("invalid price");
            System.exit(1);
        }
        this.price = price;
    }

    public Device(String brand, String model, String size, double price, boolean hasBattery, boolean hasPowerButton,String color) {
        if(brand.equals("null")||brand.isEmpty()){
            System.err.println("brand can not be null or empty");
            System.exit(1);
        }
        this.brand = brand;
        if(model.equals("null")||model.isEmpty()){
            System.err.println("model can not be null or empty");
            System.exit(1);
        }
        this.model = model;
        setSize(size);
        setPrice(price);
        setHasBattery(hasBattery);
        setHasPowerButton(hasPowerButton);
        setColor(color);
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color.equals("null")||color.isEmpty()){
            System.err.println("color can not be null or empty");
            System.exit(1);
        }
        this.color = color;
    }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
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

    public abstract void turnOn();
    public abstract void turnOff();

    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
