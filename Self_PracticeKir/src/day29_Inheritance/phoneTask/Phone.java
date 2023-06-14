package src.day29_Inheritance.phoneTask;

public class Phone {

    private String brand;
    private String model;
    private double size;
    private double price;
    private String color;


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if(brand.isEmpty()||brand.isBlank()||brand.equals("null")){
            System.err.println("name incorrect");
            System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model.isEmpty()||model.isBlank()||model.equals("null")){
            System.err.println("model incorrect");
            System.exit(1);
        }
        this.model = model;
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
            System.err.println("price incorrect");
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color.isEmpty()||color.isBlank()||color.equals("null")){
            System.err.println("color incorrect");
            System.exit(1);
        }
        this.color = color;
    }

    public void setInfo(String brand, String model, double size, double price, String color) {
        this.setBrand(brand);
        this.setModel(model);
        this.setSize(size);
        this.setPrice(price);
        this.setColor(color);
    }

    public void call(long phoneNumber){
        System.out.println("calling "+ phoneNumber);
    }


    public String toString() {
        return " brand='" +  getBrand()+  '\'' +
                ", model='" + getModel() + '\'' +
                ", size=" + getSize() +
                ", price=" + getPrice() +
                ", color='" + getColor() + '\'' +
                '}';
    }



}
