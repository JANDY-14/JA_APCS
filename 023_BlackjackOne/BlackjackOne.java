import java.util.Scanner;

public class BlackjackOne {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        double ran = (Math.random());
        double ran2 = (Math.random());
        double ran3 = (Math.random());
        double ran4 = (Math.random());
        double ran5 = (Math.random());
        double mew = (ran4 * 10 + 1);
        double mew2 = (ran5 * 10 + 1);
        int dealer = (int) (mew + mew2);
        ///////////////// card one////////////////
        double ocard = (ran * 11 + 1);
        int card = (int) (ocard);
        /////////////////// card two///////////
        double ocard2 = (ran2 * 11 + 1);
        int card2 = (int) (ocard2);
        ///////////////// card three///////////
        int total = (card + card2);
        System.out.println("your current hand = " + total);
        if (total >= 22) {
            System.out.println("you went over 21 so the dealer wins");
        }
        ///////////////// hit or stay///////////////////////
        System.out.print("would you like to hit or stay: ");
        String hos = scn.nextLine();
        hos = hos.toLowerCase();
        if (hos.equals("stay"))

        {
            System.out.println(total);
            if (total > dealer) {
                System.out.println("you win with: " + total + " dealer had: " + dealer);
            } else if (total < dealer) {
                System.out.println("dealer wins with: " + dealer);
            }
        }
        if (hos.equals("hit"))

        {
            double ocard3 = (ran3 * 11 + 1);
            int card3 = (int) (ocard3);
            total = (card + card2 + card3);
            if (total < dealer) {
                System.out.println("Dealer wins with: " + dealer + " you had: " + total);
            } else if (total > dealer) {
                System.out.println("you win with: " + total + " dealer had: " + dealer);
            }

            else if (total >= 22) {
                System.out.println("you went over 21 so the dealer wins");
                //comment update
            }
        }
    
    }
}// noice