package src.day28_Encapsulation.candy;

public class Candy {

    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity <= 0) {
            System.out.println("quantity of candy can not be set to zero or negative");
            System.exit(1);
        }
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("price of candy can not be set to negative");
            System.exit(0);
        }
        this.price = price;
    }

    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }

    public Candy(String brand, int quantity, double price, boolean hasPeanuts) {
        this.setBrand(brand);
        this.setQuantity(quantity);
        this.setPrice(price);
        this.setHasPeanuts(hasPeanuts);
    }


    public String toString() {
        if (price != 0) {
            return "Candy{" +
                    "brand='" + brand + '\'' +
                    ", quantity=" + quantity +
                    ", price=" + price +
                    ", hasPeanuts=" + hasPeanuts +
                    '}';
        } else {
            return "Candy{" +
                    "brand='" + brand + '\'' +
                    ", quantity=" + quantity +
                    ", price=" + "free" +
                    ", hasPeanuts=" + hasPeanuts +
                    '}';
        }
    }
}