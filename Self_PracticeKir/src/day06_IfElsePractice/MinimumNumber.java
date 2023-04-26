package day06_IfElsePractice;

public class MinimumNumber {
    public static void main(String[] args) {
        int n1 = 8;
        int n2 = 8;
        if(n1<n2){
            System.out.println(n1+ " is the minimum number");
        }
        if(n2<n1){
            System.out.println(n2+ " is the minimum number");
        }
        if(n1==n2){
            System.out.println("Equal");
        }
    }
}
/*
1. Create a class named MinimumNumber.java
2. Declare the following variables:
1. num1
2. num2
3. Write a program that can print the minimum number between the
two numbers above, if both are equal then print Equal
Ex:
num1 = 10
num2 = 20
output:
10 is the minimum number
 */