package src.day08_TernariesAndSwitch;

public class AgeGroups_3 {
    public static void main(String[] args) {

        int age = 99;
        String result = "";

        result = (age >= 1 && age <= 2) ? "infant" : (age <= 5) ? "Todler" : (age <= 9) ? "kid" : (age <= 12) ? "Pre-Teen"
                : (age <= 17) ? "Teenager" : (age <= 20) ? "Young Adult" : (age <= 39) ? "Adult"
                : (age <= 49) ? "Young Middle-Aged Adult" : (age <= 54) ? "Middle-Aged Adult"
                : (age <= 64) ? "Very Young Senior Citizen" : (age <= 74) ? "Young Senior Citizen"
                : (age <= 84) ? "Senior Citizen" :  "Old Senior Citizen";
                System.out.println(result);

    }
}


/*
3. Create a class called AgeGroups
		write a program that can define the age groups of a person

	             age groups are:
	                    infant (1 - 2)
	                    Toddler (3 - 5),
	                    Kid (6 - 9),
	                    Pre-Teen (10 - 12),
	                    Teenager (13 - 17),
	                    Young Adult (18 - 20),
	                    Adult (21 - 39),
	                    Young Middle-Aged Adult (40 - 49),
	                    Middle-Aged Adult (50 - 54),
	                    Very Young Senior Citizen (55 - 64),
	                    Young Senior Citizen (65 - 74),
	                    Senior Citizen (75 - 84),
	                    Old Senior Citizen (85+)

        Note: MUST use ternary
 */