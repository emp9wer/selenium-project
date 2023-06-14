package src.day12_Custom_methods;

public class MonthName_3 {
    public static void main(String[] args) {
        int a = 12;
        monthName(a);
    }

    public static void monthName(int monthNumber) {
        System.out.println((monthNumber == 1) ? "January" : (monthNumber == 2) ? "February" : (monthNumber == 3)
                ? "March" : (monthNumber == 4) ? "April" : (monthNumber == 5) ? "May" : (monthNumber == 6) ? "June"
                : (monthNumber == 7) ? "July" : (monthNumber == 8) ? "August" : (monthNumber == 9) ? "September"
                : (monthNumber == 10) ? "October" : (monthNumber == 11) ? "November" : (monthNumber == 12) ? "December"
                : "Invalid Number");

    }

}
