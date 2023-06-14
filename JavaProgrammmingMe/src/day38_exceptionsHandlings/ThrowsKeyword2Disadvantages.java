package src.day38_exceptionsHandlings;

public class ThrowsKeyword2Disadvantages {

    public static void main(String[] args) throws InterruptedException {
        //not permanent solution // exception is not gone
        // only handled in method - caller still has to use throws InterruptedException
        method1();


    }

    public static void pauseFor5Seconds() throws InterruptedException {
        Thread.sleep(5000);
    }

    public static void method1() throws InterruptedException {
        System.out.println("hello world");
        pauseFor5Seconds();
        System.out.println("hello cydeo");
    }
}
