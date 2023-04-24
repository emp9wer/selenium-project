package practice01;
import java.util.Scanner;
import java.util.Random;


public class Rpg_game01 {

    private static int hp, mp, defense, attack, eDefense, eAttack, eHp, hpLvlUp,
            mpLevelUp, defenseLvlUp, attackLvlUp, heal, eHpRemain, pHpRemain, healingPotionInventoryQty;

    static void human() {
        hp = 100;
        mp = 30;
        defense = 3;
        attack = 11;
    }

    static void elf() {
        hp = 90;
        mp = 40;
        defense = 5;
        attack = 8;
    }

    static void dwarf() {
        hp = 110;
        mp = 20;
        defense = 4;
        attack = 9;
    }

    static void swordWithShield() {

        defense = defense + 4;
        attack = attack + 2;
    }

    static void twoHandedAxe() {
        defense = defense + 0;
        attack = attack + 4;
    }

    static void bow() {
        defense = defense - 2;
        attack = attack + 7;
    }

    static void enemyZombie() {
        eDefense = 2;
        eHp = 50;
        eAttack = 12;
    }

    static void enemyEvilBat() {
        eDefense = 3;
        eHp = 60;
        eAttack = 15;
    }

    static void enemyGiantSpider() {
        eDefense = 1;
        eHp = 80;
        eAttack = 17;
        System.out.println("enemyGiantSpider: hp " + eHp + " attack " + eAttack + " defense  " + eDefense);
    }

    static void enemyGiantSpiderGraphics() {
        System.out.println("        /\\  .-\"\"\"-.  /\\\n" +
                "       //\\\\/  ,,,  \\//\\\\\n" +
                "       |/\\| ,;;;;;, |/\\|\n" +
                "       //\\\\\\;-\"\"\"-;///\\\\\n" +
                "      //  \\/   .   \\/  \\\\\n" +
                "     (| ,-_| \\ | / |_-, |)\n" +
                "       //`__\\.-.-./__`\\\\\n" +
                "      // /.-(() ())-.\\ \\\\\n" +
                "     (\\ |)   '---'   (| /)\n" +
                "      ` (|           |) `");
    }

    static void levelUp() {
        defenseLvlUp = defense + 4;
        attackLvlUp = attack + 8;
    }

    static void healingPotion() {
        hp = hp + 30;
    }

    static void battlePlayerHits() {
        eHp = (eHp + eDefense) - attack;
        System.out.println("You deal " + attack + " damage to an enemy");
        System.out.println("Enemy has " + eHp + " hp remaining");
    }

    static void battleEnemyHits() {
        hp = (hp + defense) - eAttack;
        System.out.println("Enemy deals " + eAttack + " damage");
        System.out.println("You have " + hp + "hp remaining");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to a silly RPG game\n press 1 for human\n press 2 for elf\n press 3 for dwarf");
        int raceChoice;
        Scanner scanner = new Scanner(System.in);
        raceChoice = scanner.nextInt();

        if (raceChoice == 1) {
            human();
            System.out.println("you chose Human");
        } else if (raceChoice == 2) {
            elf();
            System.out.println("you chose Elf");
        } else if (raceChoice == 3) {
            dwarf();
            System.out.println("you chose Dwarf");
        }
        System.out.println("your race stats are  " + hp + "  hp " + mp + "  mp  " + attack + "  attack  " + defense + "  defense  ");
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("Choose your weapon\n1 for sword with shield\n2 for two handed axe\n3 for bow");
        int weaponChoice;
        weaponChoice = scanner.nextInt();
        if (weaponChoice == 1) {
            swordWithShield();
            System.out.println("you chose sword with shield");

        } else if (weaponChoice == 2) {
            twoHandedAxe();
            System.out.println("you chose two handed axe");
        } else if (weaponChoice == 3) {
            bow();
            System.out.println("you chose bow");
        }
        System.out.println("You now have " + hp + "  hp  " + mp + "  mp  " + attack + "  attack  " + defense + "  defense");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("To travel to the spider nest press 1");
        int startFight = scanner.nextInt();
        if (startFight == 1) {
            System.out.println("----------------------------------------------------------------");
            enemyGiantSpiderGraphics();
            System.out.println("----------------------------------------------------------------");
            System.out.println("You have encountered a Giant Spider");
            System.out.println("-----------------------------------");
            enemyGiantSpider();
            System.out.println("-----------------------------------");

            System.out.println("To Hit the Giant Spider  -  press 1");


            for (int i = 0; i < 100; i++) {
                int beginBattle = scanner.nextInt();
                if (beginBattle == 1) {
                    battlePlayerHits();
                    if (eHp > 0) {
                        battleEnemyHits();
                        System.out.println("To Hit the Giant Spider  -  press 1");
                    } else if (eHp <= 0) {
                        System.out.println("enemy defeated!");
                        break;
                    } else if (hp <= 0){
                        System.out.println("you defeated!");
                        break;
                    }
                }
            }
                System.out.println("Giant Spider has fallen and dropped mystery gift");
            System.out.println("------------------PRESS 1 TO PICK UP -----------------");

                int pickUp;
                int randomNumber = new Random().nextInt(4)+1;
                pickUp = scanner.nextInt();
                if (pickUp == 1) {
                    healingPotionInventoryQty = healingPotionInventoryQty + randomNumber;
                    System.out.println("You have picked up " + healingPotionInventoryQty + " healing potion/s");
                    System.out.println("-----------------------------------");
                    System.out.println("You now have " + healingPotionInventoryQty + " healing Potion/s");
                }

            System.out.println("To use healing potion press 1 \nTo continue press 2");
            for (int i = 0; i < 100; i++) {
                int useHeal = scanner.nextInt();
                if (useHeal == 1) {
                    healingPotion();
                    System.out.println("You restored 30 hp with healing potion now you have " + hp + "hp");
                    healingPotionInventoryQty = healingPotionInventoryQty - 1;
                    System.out.println("To use healing potion press 1 \nTo continue press 2");

                }  if (healingPotionInventoryQty == 0) {
                    System.out.println("You have used all healing potion/s");
                    break;}
                        else if (useHeal == 2) {
                         break;
                }
            }
                    System.out.println("After defeating you first enemy you walked through the spider nest to the woods and discovered Bats Nest");
            System.out.println("     ,*-~\"`^\"*u_                                _u*\"^`\"~-*,\n" +
                    "  p!^       /  jPw                            w9j \\        ^!p\n" +
                    "w^.._      /      \"\\_                      _/\"     \\        _.^w\n" +
                    "     *_   /          \\_      _    _      _/         \\     _* \n" +
                    "       q /           / \\q   ( `--` )   p/ \\          \\   p\n" +
                    "       jj5****._    /    ^\\_) o  o (_/^    \\    _.****6jj\n" +
                    "                *_ /      \"==) ;; (==\"      \\ _*\n" +
                    "                 `/.w***,   /(    )\\   ,***w.\\\"\n" +
                    "                  ^ ilmk ^c/ )    ( \\c^      ^\n" +
                    "                          'V')_)(_('V'\n" +
                    "                              `` ``");


            }



        }
    }


       /*
        }
        for(int i = 0; i <100; i++){

        }



       /* int enemyChoice;
            Random random = new Random();
            enemyChoice = random.nextInt();
            if (enemyChoice == 1){
                System.out.println("You are in the first area");
            }

/*
        /\  .-"""-.  /\
       //\\/  ,,,  \//\\
       |/\| ,;;;;;, |/\|
       //\\\;-"""-;///\\
      //  \/   .   \/  \\
     (| ,-_| \ | / |_-, |)
       //`__\.-.-./__`\\
      // /.-(() ())-.\ \\
     (\ |)   '---'   (| /)
      ` (|           |) `
*/
