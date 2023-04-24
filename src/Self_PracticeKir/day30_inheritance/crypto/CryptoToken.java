package Self_PracticeKir.day30_inheritance.crypto;

public class CryptoToken {

    private double price;
    private double quantity;
    private double marketCap;
    private double volume;
    private double circulatingSupply;
    private boolean isMineable;
    public double total;



    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<=0){
            System.exit(1);
        }
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        if(quantity<0){
            System.exit(1);
        }
        this.quantity = quantity;
    }

    public double getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(double marketCap) {
        if(marketCap==0){
            System.exit(1);
        }
        this.marketCap = marketCap;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getCirculatingSupply() {
        return circulatingSupply;
    }

    public void setCirculatingSupply(double circulatingSupply) {
        this.circulatingSupply = circulatingSupply;
    }

    public boolean isMineable() {
        return isMineable;
    }

    public void setMineable(boolean mineable) {
        isMineable = mineable;
    }

    public CryptoToken(double price, double quantity, double marketCap, double volume, double circulatingSupply, boolean isMineable) {
        setPrice(price);
      setQuantity(quantity);
      setMarketCap(marketCap);
      setVolume(volume);
      setCirculatingSupply(circulatingSupply);
      setMineable(isMineable);
      total = getQuantity()*getPrice();
    }

    @Override
    public String toString() {
        return "CryptoToken {" + getClass().getSimpleName()+
                " price=" + price +
                ", quantity=" + quantity +
                ", marketCap=" + marketCap +
                ", volume=" + volume +
                ", circulatingSupply=" + circulatingSupply +
                ", isMineable=" + isMineable +
                '}';
    }

    public void totalPrice(){
        System.out.println("total of the " +getClass().getSimpleName()+" " +price*quantity);
    }
}
