package src.day21_multiDimentionalArray;

public class T2 {
    public static void main(String[] args) {
        //Given the Array:
        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };
        //1. print the following output: (add \t between two words)
        //				Apple    Banana   Grape    Avocado
        //				Paper Towels     Toilet Papers   Tissues    Diapers
        //				Coke   Fanta   Arizona Tea   Pepsi   Water
        for (String[] ea1d : items) {
            System.out.println();
            for (String ea : ea1d) {
                System.out.print(ea+" \t");
            }
        }
        System.out.println();
        //2. print the following output: (add \t between two words)
        //				Avocado   Grape    Banana    Apple
        //				Diapers   Tissues   Toilet Papers   Paper Towels
        //				Water    Pepsi    Arizona Tea    Fanta   Coke

        System.out.println("-------------------------");
        for (String[] ea1d : items) {
            System.out.println();
            for (int i = ea1d.length - 1; i >= 0; i--) {
                System.out.print(ea1d[i]+" \t");
            }
        }
        System.out.println();
        System.out.println("-------------------------");

        //3. print the following output: (add \t between two words)
        //				Coke   Fanta   Arizona Tea   Pepsi   Water
        //				Paper Towels     Toilet Papers   Tissues    Diapers
        //				Apple    Banana   Grape    Avocado

        for (int i = items.length - 1; i >= 0; i--) {
            System.out.println();
            String[] ea1 = items[i];
            for (int j = 0; j < items[i].length; j++) {
                System.out.print(ea1[j]+" \t");
            }

        }
        }
    }

    /*
    2. Given the Array:
		String[][] items = {
					{"Apple", "Banana", "Grape", "Avocado"},
					{"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
					{"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
					};

		1. print the following output: (add \t between two words)
				Apple    Banana   Grape    Avocado
				Paper Towels     Toilet Papers   Tissues    Diapers
				Coke   Fanta   Arizona Tea   Pepsi   Water

		2. print the following output: (add \t between two words)
				Avocado   Grape    Banana    Apple
				Diapers   Tissues   Toilet Papers   Paper Towels
				Water    Pepsi    Arizona Tea    Fanta   Coke

		3. print the following output: (add \t between two words)
				Coke   Fanta   Arizona Tea   Pepsi   Water
				Paper Towels     Toilet Papers   Tissues    Diapers
				Apple    Banana   Grape    Avocado
     */




