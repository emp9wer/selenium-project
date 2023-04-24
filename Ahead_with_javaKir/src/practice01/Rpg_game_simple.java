package practice01;

import java.util.Scanner;

public class Rpg_game_simple {
    public static void main(String[] args) {
        System.out.println("HELLO PLAYER - WELCOME TO THE RPG GAME\nChoose your race\n1. Human\n2. Elf");
        Scanner sc = new Scanner(System.in);

        int health = 0;
        int attack = 0;
        int defense = 0;
        int race = sc.nextInt(); // 1 = Human, 2 = Elf
        if (race == 1) {
            System.out.println("You chose Human");

        } else System.out.println("You chose Elf");

        System.out.println("Choose your weapon\nSword and Shield press 1\nTwo handed Axe press 2");
        int weapon = sc.nextInt();
        if (weapon == 1) {
            System.out.println("You Chosen Sword and Shield");

        } else System.out.println("You Chosen Two handed Axe");

        if (race == 1) {
            health = 100;
            attack = 10;
            defense = 10;
        } else if
        (race == 2) {
            health = 120;
            attack = 8;
            defense = 12;
        }
        int attack1;
        int defense1;
        if (weapon == 1) {
            attack1 = attack + 1;
            defense1 = defense + 4;
        } else {
            attack1 = attack + 5;
            defense1 = defense + 1;
        }
        System.out.println("You have " + health + " health   " + attack1 + " attack   " + defense1 + " defense");

        class Zombie {
            int zHealth;
            int zAttack;
            int zDefense;
            String Zombie;
        }
        String Zombie;
        int zHealth = 15;
        int zAttack = 22;
        int zDefense = 5;

        System.out.println("\nyou have encountered a zombie with 15 health 22 att 5 defence   Press 1 to fight");

        int zHpRemain = 1;
        int PlayerHpRemain = 0;
        int fight = sc.nextInt();
        int zHealthStat = zHealth + zDefense;
        int PlayerHealthStat = health + defense1;


        if (fight == 1 && zHpRemain > 0) {
            zHpRemain = zHealthStat - attack1;
            System.out.println("You have attacked zombie with " + attack1 + "damage   Zombie has " + zHpRemain + " health left");
            PlayerHpRemain = PlayerHealthStat - zAttack;
            System.out.println("Zombie has attacked you with " + zAttack + "damage   You have " + PlayerHpRemain + " health left");
        }
        System.out.println("to continue press 1");
        
        int zHpRemain2 = 1;
        int PlayerHpRemain2;
        int fight2 = sc.nextInt();
        int zHealthStat2 = zHpRemain + zDefense;
        int PlayerHealthStat2 = PlayerHpRemain + defense1;
        
        if (fight2 == 1 && zHpRemain > 0) {
            zHpRemain2 = zHealthStat2 - attack1;
            System.out.println("You have attacked zombie with " + attack1 + "damage   Zombie has " + zHpRemain2 + " health left");
            PlayerHpRemain2 = PlayerHealthStat2 - zAttack;
            System.out.println("Zombie has attacked you with " + zAttack + "damage   You have " + PlayerHpRemain2 + " health left");

/*   PlayerHpRemain = PlayerHealthStat - zAttack;
            System.out.println(PlayerHpRemain);

                if (zHpRemain <= 0) {
                    System.out.println("You defeated the zombie!");
                    break;
                } else if (PlayerHpRemain <= 0) {
                    System.out.println("You were defeated by the zombie. Game over.");
                    break;
                }
                zHealth = zHpRemain;
                health = PlayerHpRemain;
            }

            System.out.println("Your remaining hp is " + PlayerHpRemain);
        }*/
        }
    }
}