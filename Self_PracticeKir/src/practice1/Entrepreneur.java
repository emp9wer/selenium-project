package src.practice1;

public class Entrepreneur extends Human implements Business{

    public Entrepreneur(String name, int age, boolean hasSoul) {
        super(name, age, hasSoul);
    }

    @Override
    public void makeBusiness() {
        System.out.println("starting business");
    }
}
