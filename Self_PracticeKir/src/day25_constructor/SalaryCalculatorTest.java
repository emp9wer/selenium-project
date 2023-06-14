package src.day25_constructor;

public class SalaryCalculatorTest {

    public static void main(String[] args) {

        SalaryCalculator c1 = new SalaryCalculator(25,40,0.07,0.15);



        System.out.println(c1.salary());
        System.out.println(c1.stateTax());
        System.out.println(c1.federalTax());
        System.out.println(c1.salaryAfterTax());
        System.out.println(c1);
    }
}
