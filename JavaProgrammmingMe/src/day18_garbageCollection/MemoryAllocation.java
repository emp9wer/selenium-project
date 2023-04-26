package src.day18_garbageCollection;

class Car{
    public String brand;//null // allocated in heap
    public String model;         // allocated in heap
    public String color;           // allocated in heap
    public int year; // 0            // allocated in heap
}
public class MemoryAllocation { //can only be one public class and has to match file name
    public static void main(String[] args) {
        int a = 100;   // local variable ref to 100, stored in stack

        Car car = new Car(); // car - ref object
        //  stack  // heap
    }

    public static void method1(){ // allocated in stack
        int b =200; // stack // local variable
    }
    public static void method2(){ // allocated in stack
String c = "hello world"; // local variable // reference object , (string object) stored in heap inside string pool
                                                                                            // , variable c in stack

        String d = new String("Hello world");  // d is in stack, object "Hello world" in heap,
                                                                                    // outside string pool in heap
    }




}

