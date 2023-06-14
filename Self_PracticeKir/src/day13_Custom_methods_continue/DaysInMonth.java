package src.day13_Custom_methods_continue;

public class DaysInMonth {

    public static void main(String[] args) {

        daysInMonth("January");

    }

    public static void daysInMonth(String month) {

        int totalDays = 0;

        month = month.toUpperCase().charAt(0) + month.toLowerCase().substring(1);

        if (month.equals("January") || month.equals("March") || month.equals("May") || month.equals("July") || month.equals("August") || month.equals("October") || month.equals("December")) {
            totalDays = 31;
        } else if (month.equals("February")) {
            totalDays = 28;
        } else if (month.equals("April") || month.equals("June") || month.equals("September") || month.equals("November")) {
            totalDays = 30;
        } else {
            System.out.println("Invalid");
        }
        System.out.println(month + " has " + totalDays + " days");
    }

}
