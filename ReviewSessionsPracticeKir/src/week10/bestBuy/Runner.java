package week10.bestBuy;

public class Runner {
    public static void main(String[] args) {

        System.out.println("MAIN METHOD RUNNING");
        System.out.println(BestBuy.ceo);

        BestBuy store1 = new BestBuy("123 Rainbow drive",213,40);
        store1.reportProfits();
        System.out.println(BestBuy.revenue);


        




    }
}
