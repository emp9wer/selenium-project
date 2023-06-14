package week14.morning.shopping;

public final class Ebay extends  OnlineShopping implements  AllowUsersToSell{
    @Override
    public void uploadProduct() {
        System.out.println("uploading product to ebay");
    }

    @Override
    public void viewCart() {
        System.out.println("viewing ebay cart");
    }

    @Override
    public void shipItem() {
        System.out.println("shipping item on ebay");
    }

    @Override
    public void buyItem() {

        System.out.println("buy item on ebay");

    }

    @Override
    public void returnItem() {
        System.out.println("returning item to ebay");
    }
}
