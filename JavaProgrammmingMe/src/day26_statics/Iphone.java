package src.day26_statics;

public class Iphone {

    public static String brand = "Apple"; // "Apple"
    public String model;
    public String color;
    public double price;
    public static String os = "Ios";
    public static String madeIn = "China";
    public static boolean hasBattery = true;
    public static boolean IsTouchScreen = true;

    public Iphone(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }



// public static void printPhoneInfo(){ // static only accepts statics
    //    System.out.println("brand = " + brand);
 //   }


    public void printPhoneInfo(){ // instance variables belong to object
        System.out.println("brand = " + brand);
        System.out.println("model = " + model);
        System.out.println("color = " + color);
        System.out.println("price = " + price);

    }

    //the only way to create static method is when method does not need any instance variables!!!

    public static void printOs(){  // benefit no object needed!
        System.out.println("os = " + os);
    }




}


/*
Attributes :
brand // same brand - apple //static
model // different //instance
color // different //instance
price // different //instance
os // same os // static //
madeIn // same country // static
 */