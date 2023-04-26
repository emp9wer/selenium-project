package day12_Custom_methods;

public class HowManyDaysAmonth_5 {
    public static void main(String[] args) {
String a = "JanuAry";
        howManyDaysAMonth(a);
    }

    public static void howManyDaysAMonth(String m){
        System.out.println((m.toLowerCase().equals("january")) ? "January has 31 days" :(m.toLowerCase().equals("february")) ? "February has 28 or 29 in leap years days":(m.toLowerCase().equals("march")) ? "March has 31 days":(m.toLowerCase().equals("april")) ? "April has 30 days":(m.toLowerCase().equals("may")) ? "May has 31 days":(m.toLowerCase().equals("june")) ? "June has 30 days":(m.toLowerCase().equals("july")) ? "July has 31 days":(m.toLowerCase().equals("august")) ? "August has 31 days":(m.toLowerCase().equals("september")) ? "September has 30 days":(m.toLowerCase().equals("october")) ? "October has 31 days":(m.toLowerCase().equals("november")) ? "November has 30 days":(m.toLowerCase().equals("december")) ? "December has 31 days" : "Invalid Input");

    }
}
// could be written better!