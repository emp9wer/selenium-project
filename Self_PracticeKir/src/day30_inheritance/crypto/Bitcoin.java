package src.day30_inheritance.crypto;

public class Bitcoin extends CryptoToken{
    public Bitcoin(double price, double quantity, double marketCap, double volume, double circulatingSupply, boolean isMineable) {
        super(price, quantity, marketCap, volume, circulatingSupply, isMineable);

    }
    public double totalUp(){
        return getPrice()*getQuantity();
    }
}
