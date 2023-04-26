package day30_inheritance.crypto;

public class Cardano extends CryptoToken{
    public Cardano(double price, double quantity, double marketCap, double volume, double circulatingSupply, boolean isMineable) {
        super(price, quantity, marketCap, volume, circulatingSupply, isMineable);
    }
}
