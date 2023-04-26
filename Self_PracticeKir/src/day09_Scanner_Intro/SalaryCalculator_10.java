package day09_Scanner_Intro;

import java.util.Scanner;

public class SalaryCalculator_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter hourlyRate");
        double hourlyRate = scan.nextDouble();
        System.out.println("how many hours you work in a week");
        double hoursWeek = scan.nextDouble();
        System.out.println("enter state tax (in percentage)");
        double stateTax = scan.nextDouble();
        System.out.println("enter federal tax (in percentage)");
        double federalTax = scan.nextDouble();

        double salary = hourlyRate * hoursWeek * 52;
        double stateTaxDecimal = stateTax / 100;
        double federalTaxDecimal = federalTax / 100;
        double totalTaxDecimal = stateTaxDecimal + federalTaxDecimal;
        double netIncome = salary - (salary * totalTaxDecimal);
        double totalTax = stateTax + federalTax;

        System.out.println("salary = " + salary);
        System.out.println("stateTax = %" + stateTax);
        System.out.println("federalTax = %" + federalTax);
        System.out.println("totalTax = %" + totalTax);
        System.out.println("netIncome = " + netIncome);
        scan.close();

    }
}
/*
10. Crreate a class named SalaryCalculator:
		- Ask the user to enter his/her hourlyRate
        - Ask the user how many hours he/she works in a week
        - Ask the user to enter state tax (in percentage)
        - Ask the user to enter federal tax (in percentage)

         -Calculate the:
                    3.4.1 salary
                    3.4.2 sateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome
 */