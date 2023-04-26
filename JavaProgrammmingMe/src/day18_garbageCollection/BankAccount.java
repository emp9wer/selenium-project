package src.day18_garbageCollection;

public class BankAccount {
    public String accountHolder;
    public long accountNumber;
    public double balance;


    public void setInfo(String accountHolder, long accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }


    public String toString() { // to be able to print and not get hashcode
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    }


    public void checkBalance(){
        System.out.println("Your available balance is: $" + balance);
    }


    public void deposit(double depositAmount){
        if(depositAmount < 1){
            System.out.println("Insufficient amount"+ depositAmount);
            return;
        }

        System.out.println("depositing $"+depositAmount+" to "+accountHolder);
        balance += depositAmount;
    }


    public void withdraw(double withdrawAmount){

        if (withdrawAmount>balance){
            System.out.println("Insufficient funds");
            return;
        }

        balance -= withdrawAmount;

        System.out.println("withdrawing $"+withdrawAmount +" from "+accountHolder);


    }





}
