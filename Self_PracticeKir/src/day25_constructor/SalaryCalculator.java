package day25_constructor;

public class SalaryCalculator {

    public double hourlyRate;
    public int weeklyHours;
    public double stateTaxRate;
    public double federalTaxRate;

    public SalaryCalculator(double hourlyRate, int weeklyHours, double stateTaxRate, double federalTaxRate) {
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
    }

    public double salary(){
        return hourlyRate * weeklyHours * 52;
    }

    public double stateTax(){
        return salary()*stateTaxRate;
    }

    public double federalTax(){
        return salary()*federalTaxRate;
    }

    public double salaryAfterTax(){
        return salary()-stateTax()-federalTax();
    }


    public String toString() {

        return "SalaryCalculator_2{" +
                "salary=" + salary() +
                ", stateTax=" + stateTax() +
                ", federalTax=" + federalTax() +
                ", salaryAfterTax=" + salaryAfterTax() +
                '}';
    }
}
/*
Task02:
    Create a custom class named SalaryCalculator:
        1.1 Create a class named Salary calculator:
                Attributes:
                    hourlyRate, weeklyHours, stateTaxRate, federalTaxRate

                Add a constructor to set all the fields

                Actions:
                    salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
                    stateTax(): calculates the total state tax
                    federalTax(): calculates the total federal tax
                    salaryAfterTax(): calculates the salary after tax
                    toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object
 */