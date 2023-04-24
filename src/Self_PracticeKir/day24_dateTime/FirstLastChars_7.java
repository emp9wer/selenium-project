package Self_PracticeKir.day24_dateTime;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstLastChars_7 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"));
        System.out.println(names);

        names.removeIf(p -> p.toLowerCase().charAt(0)==p.toLowerCase().charAt(p.length()-1));
        System.out.println(names); //[Canada, Lan, Ebrahim, Farida]


     }
}
/*
7. Write a program that can remove string elements from an arraylist if the firt and last characters of the string are same
	ex:
		list = {"Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"}

	output:
		["Lan", "Ebrahim", "Farida"]

 */