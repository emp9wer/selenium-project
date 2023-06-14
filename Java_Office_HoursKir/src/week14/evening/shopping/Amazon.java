package week14.evening.shopping;

public class Amazon extends OnlineShopping{
    @Override
    void viewCart() {
        System.out.println("Amazon view cart option");
    }

    @Override
    public void shipItem() {
        System.out.println("amazon shipping");
    }

    @Override
    void buyItem() {
        System.out.println("purchase on amazon");
    }

    @Override
    void returnItem() {
        System.out.println("return to amazon");
    }
}
