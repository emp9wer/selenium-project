package day13_Custom_methods_continue;

public class IsOdd_01 {
    public static void main(String[] args) {
        System.out.println(isOdd(2));
    }

    public static boolean isOdd(int number){
        return (number % 2 != 0) ? true : false;
    }
}
/*
1. Create a method named isOdd, that can return true if a number is an odd number, otherwise returns false
 */