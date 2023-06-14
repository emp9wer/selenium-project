package week14.evening.shopping;

public class Runner {

    public static void main(String[] args) {

        Target target = new Target();
        target.buyItem();
        target.returnItem();
        target.shipItem();
        System.out.println();
        Amazon amazon = new Amazon();
        amazon.buyItem();
        amazon.shipItem();
        amazon.returnItem();
        amazon.viewCart();
        System.out.println();
        EBay eBay = new EBay();
        eBay.buyItem();
        eBay.returnItem();
        eBay.uploadProduct();
        eBay.viewCart();
        eBay.shipItem();

    }
}
