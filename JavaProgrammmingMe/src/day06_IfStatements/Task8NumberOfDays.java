package src.day06_IfStatements;

public class Task8NumberOfDays {
    public static void main(String[] args) {
        int n = 12;
        boolean has28days = n==2;
        boolean has30days = n==4 || n==6 || n==9 || n==11;
        boolean has31days = !has28days && !has30days;
        String result = "";
        if(has31days){
            result =" 31 days";
        }
        if(has30days){
            result =" 30 days";
        }
        if(has28days){
            result =" 28 days";
        }
        System.out.println(result);
    }
}
/*
1. Create a class named NumberOfDays.java
2. An integer variable named month is declared and given, Write a
program that can print the number of days in the given month
Ex:
Given:
number = 1
output:
31 days
Hints:
Months that has 31 days are: 1, 3, 5, 7, 8, 10, 12
Months that has 30 days are: 4, 6, 9, 11
Month that has 28 days: 2
 */
