package src.week8.evening;

public class T2BeginningEnding {
    /*
    T2BeginningEnd [array, loop, String]

    Create a program that will define a String array with some name values. Determine how many of the names begin with and end with the same character.

    Ex:
        {Anna, Mike, Aliya, Remus, Gina, Hannah, Nathan, Otto, Kevin, Kelly}

        -> 5

    Bonus challenge: Collect all the names that start and end with the same character into an array
     */

    public static void main(String[] args) {
        String[] names = {"Anna", "Mike", "Aliya", "Remus", "Gina", "Hannah", "Nathan", "Otto", "Kevin", "Kelly"};
        int counter = 0; //initialise counter;
        for (String each : names) {
            if((each.charAt(0)+"").equalsIgnoreCase(each.charAt(each.length()-1)+"")){ // if first and last letters of string elements are ==
                counter++; // counter goes up 1;
            }
        }
        System.out.println(counter); //5
    }
}
