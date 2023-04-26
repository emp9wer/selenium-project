package day30_inheritance.crypto;

public class Doge extends CryptoToken{
    public Doge(double price, double quantity, double marketCap, double volume, double circulatingSupply, boolean isMineable) {
        super(price, quantity, marketCap, volume, circulatingSupply, isMineable);
    }
}
