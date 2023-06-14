package week14.evening.shopping;

public final class EBay extends OnlineShopping implements AllowUsersToSell {
    @Override
    public void uploadProduct() {
        System.out.println("upload listing to ebay");
    }

    @Override
    void viewCart() {
        System.out.println("view listing on ebay");
    }

    @Override
    public void shipItem() {
        System.out.println("ship item on ebay");
    }

    @Override
    void buyItem() {
        System.out.println("buy item on ebay");
    }

    @Override
    void returnItem() {
        System.out.println("return item to user on ebay");
    }
}
