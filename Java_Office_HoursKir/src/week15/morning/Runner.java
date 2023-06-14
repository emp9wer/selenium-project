package week15.morning;

public class Runner {
    public static void main(String[] args) {
        System.out.println("--start--");

        Library.getLibraryCard("Fairfax");

        try {
            Library.borrow(true);
        } catch (FailToCheckOutException e) {
            e.printStackTrace();
        }

        try {
            Library.borrow(false);
        } catch (FailToCheckOutException e) {
            e.printStackTrace();
        }finally {
            System.out.println("finally block");
        }
        System.out.println("--finish--");
    }
}
