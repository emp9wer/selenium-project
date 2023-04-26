package day06_IfElsePractice;

public class Balance {
    public static void main(String[] args) {
        double balance = 1000;
        double withdrewAmount = 1111;
        double overdraftFee = 100;
        double remainingBalance;
        if(withdrewAmount > balance) {
            remainingBalance = balance - withdrewAmount - overdraftFee;
            System.out.println("Overdraft Warning - fee of "+overdraftFee+" charged");
            System.out.println("remainingBalance = " + remainingBalance);
        }
        if(withdrewAmount <= balance){
            remainingBalance = balance - withdrewAmount;
            System.out.println("remainingBalance = " + remainingBalance);
        }


    }
}
/*
Balance [single if, operators, variables]

	Declare and assign the following variables
		amount balance & withdraw amount

    Check the balance after the withdrawal
        if you withdrew more money that you had in the account add a overdraft fee to the balance by subtracting 100

    In both cases print the remaining balance after withdrawing
 */