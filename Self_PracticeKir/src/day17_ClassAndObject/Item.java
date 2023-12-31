package src.day17_ClassAndObject;

public class Item {

    public String name;
    public double unitPrice;
    public int quantity;


    public void setInfo(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double calcCost(){
        return unitPrice * quantity;
    }


    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", total =" +calcCost()+
                '}';
    }
}
