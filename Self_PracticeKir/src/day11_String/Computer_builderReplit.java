package day11_String;

import java.util.Scanner;

public class Computer_builderReplit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Select screen size:");
        double screenSize = scan.nextDouble(); //`13.3`, add `$200`||`15.0`, add `300`||`17.3`, add `$400`
        System.out.println("Select CPU type:");
        String cpu = scan.next(); //`i3`, add `$150` || `i5`, add `$250` || `i7`, add `$350`
        System.out.println("Select RAM size:");
        int ram = scan.nextInt(); // Add `$50` to the total price for every 4GB of ram. Assume the ram amounts will be divisible by 4
        System.out.println("Select storage type:");
        String storageType = scan.next(); // SSD // HDD
        System.out.println("Select storage size:");
        int storageSize = scan.nextInt();  // For `HDD`, add `$50` to the total price for every 500GB
                                            //For `SSD`, add `$100` to the total price for every 500GB
        System.out.println("Select screen resolution:");
        String resolution = scan.next(); //`FULLHD`, add `$100` || `4K`, add `$200`
        double total = 0;
        total += (screenSize == 13.3) ? 200 :(screenSize==15) ? 300 : 400;
        total += (cpu.equals("i3")) ? 150 :(cpu.equals("i5")) ? 250 : 350;
        total += ram / 4 * 50;
        total += storageType.equals("SSD") ? (storageSize / 500 * 100) : (storageSize / 500 * 50);
        total += resolution.equals("FULLHD") ? 100 : 200;
        System.out.println("Final price is: $"+total);













    }

}
