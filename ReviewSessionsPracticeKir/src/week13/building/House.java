package week13.building;

public class House extends Building implements HasBackyard{

    int numberOfResidents;

    public House(String location, double price, int numberOfResidents) {
        super(location, price);
        this.numberOfResidents = numberOfResidents;
    }

    @Override
    public void mowLawn() {
        System.out.println("mowing lawn outside the house");
    }

    @Override
    public void pay() {
        System.out.println("paying mortgage");
    }
    @Override
    public String toString() {
        return "number of residents "+ numberOfResidents;
    }


}
