package src.day39_collections.multiThreading;

public class TestMultiThreads {

    public static void main(String[] args) {


        ThreadHelloWorld thread1 = new ThreadHelloWorld();
        ThreadHelloWorld thread2 = new ThreadHelloWorld();

        thread1.start();
        thread2.start();



    }
}
