package ReviewSessionsPracticeKir.week10.bestBuy;

public class BestBuy {


    String address;
    double grossIncome;
    double expenses;

    static String ceo;
    static String hq;
    static double revenue;

    static { // the static block can do more than just assign
        System.out.println("STATIC BLOCK RUNNING");
        ceo = "Corie Barry";
        hq = "Richfield , Minnesota";
        revenue = 51.76;
    }

    public BestBuy(String address, double grossIncome, double expenses) {
        System.out.println("CONSTRUCTOR RUNNING");
        this.address = address;
        this.grossIncome = grossIncome;
        this.expenses = expenses;
    }

    void  reportProfits(){
       revenue+= grossIncome - expenses;
    }


}
