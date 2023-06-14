package src.day39_collections.multiThreading;

public class ThreadHelloWorld extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 6 ; i++) {
            System.out.println("Hello world"+i);
        }
    }








}
