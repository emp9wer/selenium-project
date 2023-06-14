package src.day06_IfElsePractice;

public class NetIncomeCalc_9_01 {
    public static void main(String[] args) {
        int salary = 100_000;
        int tax;
        boolean married = true;

        if (salary >= 130_000) tax = 35;
        else if (salary >= 100_000) tax = 30;
        else if (salary >= 80_000) tax = 25;
        else tax = 20;

        if (married) tax -= 5;

        int salaryAfterTax = salary - salary * tax / 100;

        System.out.println("tax = " + tax);
        System.out.println("salaryAfterTax = " + salaryAfterTax);
    }
}

