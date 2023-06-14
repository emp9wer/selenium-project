package src.day06_IfElsePractice;

public class Kovertime {
    public static void main(String[] args) {
        double hourlyRate = 30,
                hoursWorked = 41,
                overtime = hoursWorked - 40, // 45-40 = 5
                netpay = (hourlyRate * 40) + (overtime * hourlyRate * 1.5);

        if (hoursWorked > 40){
            System.out.println("this week your pay is: " + netpay);
        }else{
            System.out.println("this week your pay is: " +(hourlyRate * hoursWorked));
        }

    }
    }

