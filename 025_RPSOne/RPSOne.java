import java.util.Scanner;

public class RPSOne {
    public static void main(String args[]) {
        ///////////////////////////////////////////
        Scanner scan = new Scanner(System.in);
        String computerPlay = "/space holder/";
        String playerin; 
        double rng = (Math.random());
        double computerInt0 = (rng * 3 + 1);
        int computerInt1 = (int) (computerInt0);
        /////////////// setting up player///////////////////////////
        System.out.print("would you like rock(R) paper(P) or scisors(S): ");
        String player = scan.nextLine();
        playerin = player.toUpperCase();
        //////////// stting up the computer/////////////////////////////
        if (computerInt1 == 1) {
            computerPlay = "R";
        } else if (computerInt1 == 2) {
            computerPlay = "P";
        } else if (computerInt1 == 3) {
            computerPlay = "S";
        }
        ///////////// if statments to determin winner//////////////////////////
        if (playerin.equals(computerPlay)) {
            System.out.println("It's a tie");
        }
        /////////////////////////////////////////////////////////////
        else if (playerin.equals("R")) {
            if (computerPlay.equals("S"))
                System.out.println("Rock beats scisors: You win");
            else if (computerPlay.equals("P"))
                System.out.println("Paper beats rock: You lose");}
        ////////////////////////////////////////////////////////////
        else if (playerin.equals("P")) {
            if (computerPlay.equals("S"))
                System.out.println("Scissor beats paper: You lose");
        else if (computerPlay.equals("R"))
                System.out.println("Paper beats rock: You win");}
        ///////////////////////////////////////////////////////////
        else if (playerin.equals("S"))
            if (computerPlay.equals("P"))
                System.out.println("Scissor beats paper: You win");
        else if (computerPlay.equals("R"))
                System.out.println("Rock beats scissors.:  You lose");
        ////////////////////////////////////////////////////////////////////
            else
                System.out.println("Invalid input.");
    }
}
