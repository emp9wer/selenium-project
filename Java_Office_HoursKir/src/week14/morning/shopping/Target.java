package week14.morning.shopping;

public final class Target extends Shopping implements Shipping{



    @Override
    public void shipItem() {
        System.out.println("shipping from target");
    }

    @Override
    public void buyItem() {
        System.out.println("buying from target");
    }

    @Override
    public void returnItem() {
        System.out.println("returning to target");
    }
}
