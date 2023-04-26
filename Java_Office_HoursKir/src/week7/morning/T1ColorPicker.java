package src.week7.morning;

import java.util.Scanner;

public class T1ColorPicker {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int colors =1;

        String selected = "Here are colors that you picked: ";

        while (colors <=3){

            System.out.println("enter color "+colors);
            String currentColor = in.nextLine().toLowerCase().trim();
            if(!selected.contains(currentColor+", ")){
                selected += currentColor+", ";
                colors++;
            }else {
                System.out.println(currentColor+" is already selected");
            }

        }
        System.out.println(selected);

    }
}
