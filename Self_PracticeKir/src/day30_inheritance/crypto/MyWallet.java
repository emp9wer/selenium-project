package day30_inheritance.crypto;

public class MyWallet {

    public static void main(String[] args) {

        Bitcoin bitcoin = new Bitcoin(30000,0.65,14411414,1241412,214214,true);
        Ethereum ethereum = new Ethereum(400,23,14124,12441241,12412412,true);
XRP xrp = new XRP(1,1,1,1,1,false);
        bitcoin.totalPrice();
        ethereum.totalPrice();


        double totalAsset = bitcoin.total+ ethereum.total+xrp.total;
        System.out.println("total assets "+totalAsset);

        

    }
}
