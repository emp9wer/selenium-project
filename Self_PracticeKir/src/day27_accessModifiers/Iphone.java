package src.day27_accessModifiers;

//Create a class named Iphone
//            variables:
//                brand, model, size, color, price, OS, isSmartPhone, madeIn, designedIn
public class Iphone {
    public static String brand, os, madeIn, designedIn;
    public static boolean isSmartphone;

    public String model, color;
    public double size, price;

    // Add a constructor to initialized all the fields
    public Iphone(String model, String color, double size, double price) {
        this.model = model;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    // Add a static block to initialize all the statics
    {
        brand = "Apple";
        os = "Ios";
        madeIn = "China";
        designedIn = "USA";
        isSmartphone = true;
    }

    public void printOperatingSystem() {
        System.out.println(os);
    }

    public void call(long phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    public void text(long phoneNumber) {
        System.out.println("Texting " + phoneNumber);
    }
    public void faceTime(long phoneNumber) {
        System.out.println("faceTime " + phoneNumber);
    }
    public void faceTime(String email) {
        System.out.println("faceTime " + email);
    }

    public String toString() {
        return "Iphone_01{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        Iphone i1 = new Iphone("12", "gold", 12.9, 1200);
        i1.printOperatingSystem();
        i1.call(412333555555L);
        i1.text(412333555555L);
        i1.faceTime(414142232321L);
        i1.faceTime("babaganush@mail.com");

        System.out.println(i1);

    }
}

/*
1. Create a class named Iphone
            variables:
                brand, model, size, color, price, OS, isSmartPhone, madeIn, designedIn

            Add a constructor to initialized all the fields

            Add a static block to initialize all the statics

            Methods:
                printOperatingSystem(): displays the operating system of the iphone
                call(long phoneNumber)
                text(long phoneNumber)
                faceTime(long phoneNumber)
                faceTime(String email)
                toString()
 */