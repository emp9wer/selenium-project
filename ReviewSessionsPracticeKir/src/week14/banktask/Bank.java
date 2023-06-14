package week14.banktask;

public class Bank {
    private double balance;
    private long accountNumber;

    public void withdraw(double amount){
        if(amount>balance){
            throw new  NotEnoughMoneyException(amount+" is greater than your balance of "+balance);
        }//unchecked exception
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
}
