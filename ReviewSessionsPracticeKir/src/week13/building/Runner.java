package week13.building;

import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {

        House house1 = new House("McLEan",300000,4);
        System.out.println(house1.price);
        System.out.println(house1.location);
        System.out.println(house1.numberOfResidents);
        System.out.println(house1);
        house1.pay();
        house1.mowLawn();

        Building house2 = new House("Chicago",250_000,5);
        System.out.println(((House)house2).numberOfResidents); // bldg ref doesnot have reff to this var
        house2.pay();
        (((HasBackyard)house2)).mowLawn();

        ArrayList<Building> allBuildings = new ArrayList<>(Arrays.asList(house1,house2,new OfficeBuilding("fafaf",222222,3)));

    }
}
