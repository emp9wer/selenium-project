package src.day12_Custom_methods;

public class Salary_7 {
    public static void main(String[] args) {
        double hR = 34.6;
        int wH =  38;
        salary(hR,wH);
    }

    public static void salary(double hourlyRate , int weeklyHours){

        System.out.println("You make $" + hourlyRate + " per hour\nYou work "+weeklyHours+ " hours in a week\nYour gross income is $"+ hourlyRate*weeklyHours);

    }
}
