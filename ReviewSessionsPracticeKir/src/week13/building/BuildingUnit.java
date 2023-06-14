package week13.building;

public class BuildingUnit {

    public static double rent(Building building){
        if(building instanceof House){

           return building.price / 360*2;

        } else if (building instanceof OfficeBuilding) {
            return building.price/100;

        }
        return -1; // if the building is not a house or officebuilding  it returns -1
    }


}
