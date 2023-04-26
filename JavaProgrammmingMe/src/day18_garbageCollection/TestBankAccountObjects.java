package src.day18_garbageCollection;

public class TestBankAccountObjects {


    public static void main(String[] args) {


        BankAccount obj1 = new BankAccount();
        obj1.setInfo("Babba", 123456789);

        System.out.println(obj1);

        obj1.deposit(100);

        obj1.withdraw(200);

        obj1.checkBalance();

        System.out.println("111111111111111111111111111111111111111111111");


        BankAccount account1 = new BankAccount();

        BankAccount account2 = new BankAccount();

        account1.setInfo("Seba",334636363);
        account2.setInfo("Boriska",1222344456);

        account1.deposit(500);
    }


}



