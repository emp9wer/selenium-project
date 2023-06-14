package week14.evening.shopping;

public final class Target extends Shopping implements Shipping {
    @Override
    public void shipItem() {
        System.out.println("ship item from target");
    }

    @Override
    void buyItem() {
        System.out.println("buy item at target");
    }

    @Override
    void returnItem() {
        System.out.println("return item to target");
    }
}
