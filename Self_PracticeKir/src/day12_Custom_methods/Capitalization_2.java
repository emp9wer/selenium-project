package day12_Custom_methods;

public class Capitalization_2 {
    public static void main(String[] args) {
    displayDomain("sandra", "dion");
    }


    public static void displayDomain(String a,String b){
        System.out.println("full name: " + a.substring(0,1).toUpperCase() + a.substring(1) +" " + b.substring(0,1).toUpperCase() + b.substring(1));

    }
}
