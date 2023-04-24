package Self_PracticeKir.day17_ClassAndObject;

public class SalaryCalculator {
    public double hourlyRate;
    public double stateTaxRate;
    public double federalTaxRate;
    public double weeklyHours;

    public void setInfo(double hourlyRate, double stateTaxRate, double federalTaxRate, double weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }

    public double salary(){
      return  hourlyRate * weeklyHours * 52;
    }

    public double stateTax(){
    return  salary() * stateTaxRate/100;
    }

    public double federalTax(){
        return  salary() * federalTaxRate/100;
    }

    public double salaryAfterTax(){
        return salary()-stateTax()-federalTax();
    }

    public String toString() {
        return "SalaryCalculator{" +
                "salary= " + salary()+", stateTax= " +
                stateTax()+", federalTax= "+federalTax()+ ", salaryAfterTax= " + salaryAfterTax()+
                '}';
    }
}
