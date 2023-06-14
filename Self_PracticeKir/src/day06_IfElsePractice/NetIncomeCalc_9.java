package src.day06_IfElsePractice;

public class NetIncomeCalc_9 {
    public static void main(String[] args) {
        double salary = 129000;
        boolean ifMarried = true;

        if ((salary >= 130000) && (!ifMarried)){
            double salaryAftTax = salary - salary * 0.35;
            System.out.println(salaryAftTax);
        }
        if ((salary >= 130000) && (ifMarried)){
            double salaryAftTax = salary - salary * (0.35-0.05);
            System.out.println(salaryAftTax);
        }
        if ((salary <= 129000) && (salary >= 100000) && (!ifMarried)){
            double salaryAftTax = salary - salary * 0.30;
            System.out.println(salaryAftTax);
        }
        if ((salary <= 129000) && (salary >= 100000) && (ifMarried)){
            double salaryAftTax = salary - salary * (0.30-0.05);
            System.out.println(salaryAftTax);
        }
        if ((salary <= 99000) && (salary >= 80000) && (!ifMarried)){
            double salaryAftTax = salary - salary * 0.25;
            System.out.println(salaryAftTax);
        }
        if ((salary <= 99000) && (salary >= 80000) && (ifMarried)){
            double salaryAftTax = salary - salary * (0.25-0.05);
            System.out.println(salaryAftTax);
        }
        if ((salary <= 79000) && (!ifMarried)) {
            double salaryAftTax = salary - salary * 0.20;
            System.out.println(salaryAftTax);
        }
        if ((salary <= 79000) && (ifMarried)){
            double salaryAftTax = salary - salary * (0.20-0.05);
            System.out.println(salaryAftTax);
        }
    }
}
