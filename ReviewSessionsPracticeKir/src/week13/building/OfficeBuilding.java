package week13.building;

public class OfficeBuilding extends Building implements HasElevator{

   public int a;

    public OfficeBuilding(String location, double price, int a) {
        super(location, price);
        this.a = a;
    }

    @Override
    public void pay() {

    }

    @Override
    public void elevator(int floor) {
        System.out.println("using elevator - going to "+floor);
    }
}
