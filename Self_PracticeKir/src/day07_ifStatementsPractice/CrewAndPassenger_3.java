package src.day07_ifStatementsPractice;

public class CrewAndPassenger_3 {
    public static void main(String[] args) {

        int peopleOnTheShip = 50; //valid input 50 || 75 || 100
        int crew = 0;
        int passengers = 0;
        String result = "";
        if (peopleOnTheShip == 50 || peopleOnTheShip == 75 || peopleOnTheShip == 100) {
            if (peopleOnTheShip == 50) {
                crew = 20;
                passengers = 30;
            } else if (peopleOnTheShip == 75) {
                crew = 25;
                passengers = 50;
            } else {
                crew = 30;
                passengers = 70;
            }
            result = crew + " crew, " + passengers + " passengers";
        } else {
            result = "number of people on the ship is not valid";
        }
        System.out.println(result);
    }

}
/*
3. Create a class called CrewAndPassenger, Given a number of people on the ship (int number), determine how many need to be crew members and how many can be passengers. Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */