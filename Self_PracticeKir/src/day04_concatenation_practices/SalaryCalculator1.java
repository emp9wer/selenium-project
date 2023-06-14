package src.day04_concatenation_practices;

public class SalaryCalculator1 {
    public static void main(String[] args) {
int hourlyRate, weeklyHours, stateTaxRate, federalTaxRate, salaryBeforeTax, stateTax,
        federalTax, totalTax, salaryAfterTax, weeksInYear;
hourlyRate = 50;
weeklyHours = 45;
stateTaxRate = 6;
federalTaxRate = 26;
weeksInYear = 52;
salaryBeforeTax = weeksInYear * weeklyHours * hourlyRate;
federalTax = salaryBeforeTax / 100 * federalTaxRate;
stateTax = salaryBeforeTax / 100 * stateTaxRate;
totalTax = stateTax + federalTax;
salaryAfterTax = salaryBeforeTax - totalTax;
        System.out.println("\thourlyRate = $"+hourlyRate+"\n\tweeklyHours = "+ weeklyHours +
                "\n\tstateTax = " +stateTaxRate+"%"+"\n\tfederalTax = "+federalTaxRate+ "%\n\noutput:\n\tGross pay is: $"+ salaryBeforeTax+"\n\t\tFederal tax is: $"+federalTax+"\n\t\tState tax is : $"+stateTax+"\n\t\tTotal tax is: $"+totalTax+"\n\t\t Net income is: $"+salaryAfterTax);




    }
}
/*
Create a class named SalaryCalculator, and declare the following variables:
                hourlyRate
                weeklyHours
                stateTaxRate
                federalTaxRate

    7.1 Use the given info above to calculate the followings:
                salaryBeforeTax
                stateTax
                federalTax
                totalTax
                salaryAfterTax

    7.2 Display each of the above in the following format:
        Ex:
              hourlyRate = $50
              weeklyHours = 45
              stateTax = 6  (given as percentage)
              federalTax = 26 (given as percentage)

        output:
               Gross pay is: $117000
                    Federal tax is: $30420
                    State tax is: $7020
                    Total tax is: $37440
                     Net income is: $79560
*/