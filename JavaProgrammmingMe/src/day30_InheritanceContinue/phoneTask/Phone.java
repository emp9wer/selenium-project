package src.day30_InheritanceContinue.phoneTask;
import java.util.Arrays;
public class Phone {
    private String brand, model, size, color;
    private double price;

    public Phone(String brand, String model, String size, String color, double price) {
        this.setBrand(brand);
        this.setModel(model);
        this.setSize(size);
        this.setColor(color);
        this.setPrice(price);
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if(price<=0){
            System.err.println("invalid price: "+price);
            System.exit(1);
        }
        this.price = price;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        String[] colors = {"Black", "White", "Silver", "Gold", "Pink"};
        if (Arrays.asList(colors).contains(color)) {

            this.color = color;
        }else {
            System.err.println("Invalid color: "+color+ " color only can be \n"+ Arrays.toString(colors));
            System.exit(1);
        }

    }

    public void call(long  phoneNumber){
        System.out.println(getBrand()+" is calling "+phoneNumber);
    }
    public void text(long  phoneNumber){
        System.out.println(getBrand()+" is texting "+phoneNumber);
    }










}
