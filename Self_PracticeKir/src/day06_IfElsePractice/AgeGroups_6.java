package day06_IfElsePractice;

public class AgeGroups_6 {
    public static void main(String[] args) {
        int a = 999;
        String result = "";

        if ( a >= 1 && a <= 2 ){
            result = "infant";
        }
        if ( a >= 3 && a <= 5 ){
            result = "Toddler";
        }
        if ( a >= 6 && a <= 9 ){
            result = "Kid";
        }
        if ( a >= 10 && a <= 12 ){
            result = "Pre-Teen";
        }
        if ( a >= 13 && a <= 17 ){
            result = "Teenager";
        }
        if ( a >= 18 && a <= 20 ){
            result = "Young Adult";
        }
        if ( a >= 21 && a <= 39 ){
            result = "Adult";
        }
        if ( a >= 40 && a <= 49 ){
            result = "Young Middle-Aged Adult";
        }
        if ( a >= 50 && a <= 54 ){
            result = "Middle-Aged Adult";
        }
        if ( a >= 55 && a <= 64 ){
            result = "Very Young Senior Citizen";
        }
        if ( a >= 65 && a <= 74 ){
            result = "Young Senior Citizen";
        }
        if ( a >= 75 && a <= 84 ){
            result = "Senior Citizen";
        }
        if ( a >= 85 ){
            result = "Old Senior Citizen";
        }
        System.out.println(result);




    }
}
/*
6. Create a class named AgeGroups, an integer variable named age is declared and given. write a program that can define the age groups of a person

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

            Note: Do not use more than one print statement

 */