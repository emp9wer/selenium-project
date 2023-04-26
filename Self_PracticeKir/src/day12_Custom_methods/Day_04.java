package day12_Custom_methods;

public class Day_04 {
    public static void main(String[] args) {
        int a = 6;
        dayNumberToWord(a);
    }

    public static void dayNumberToWord(int day) {
        System.out.println((day == 1) ? "Mon" : (day == 2) ? "Tue" : (day == 3)
                ? "Wed" : (day == 4) ? "Th" : (day == 5) ? "Fr" : (day == 6) ? "Sat"
                : (day == 7) ? "Sun" : "Invalid Number");

    }
}
