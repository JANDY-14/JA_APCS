import java.time.Year;
import java.util.Scanner;

public class PowerAttack {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        double numRoll = (Math.random());
        double numRoll2 = (Math.random());
        double attack = (numRoll * 20 + 1);
        double chance = (numRoll2 * 60 + 1);
        int playerStat = (3);
        int monsterStat = (11);
        int monsterHP = (1000);
        int hitReg = ((int) attack + playerStat + monsterStat);
        // System.out.println(monsterStat + (int)attack);
        System.out.print("A level 11 Cloaked Monster has Appered would you like to attack the monster (Y)(N) ");
        String playerin = scan.next();
        String axSwing = playerin.toUpperCase();
        //////////////////////////////////////////
        if (axSwing.equals("Y")) {
            // System.out.println("you hit the monster for " + playerStat + monsterStat);
            // System.out.println(hitReg);
            if (chance < 60) {
                System.out.println("YOU HIT THE MONSTER! Your chance roll was " + chance);
                System.out.println(" the monsters HP is at" + monsterHP - hitReg);
                //
                //
                if (monsterHP.equals(0)) {
                    System.out.println("you have killed the monster");
                }
                //
                //
                if (chance > 60) {
                    System.out.println("YOU MISSED! AND HAVE DIED");
                }
                //
                //

            }

        }

    }
}// noice