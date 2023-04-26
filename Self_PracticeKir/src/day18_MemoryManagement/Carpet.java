package day18_MemoryManagement;

public class Carpet {
    double width;
    double length;
    double unitPrice;
    boolean isPersian;

    public void setInfo(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost(){
        double total = (width*length) * unitPrice;
        if (isPersian){
            total+=200;
        }
            return total;

    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", total cost $="  + calcCost()+

                '}';
    }
}
