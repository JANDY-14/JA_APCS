import java.util.Scanner;
public class YetAgainRefactorATableOfVariables {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        // <Origen Variable>
        double Oone = 1;
        double Otwo = 2;
        double Othree = 3;
        double Ofour = 4;
        // <Squared Variable>
        double SQone = Math.pow(Oone, 2);
        double SQtwo = Math.pow(Otwo, 2);
        double SQthree = Math.pow(Othree, 2);
        double SQfour = Math.pow(Ofour, 2);
        // <Cubed variable>
        double CUone = Math.pow(Oone, 3);
        double CUtwo = Math.pow(Otwo, 3);
        double CUthree = Math.pow(Othree, 3);
        double CUfour = Math.pow(Ofour, 3);
        //<user var>
        System.out.print("what num do you want: ");
         double Uone = scn.nextDouble();

        System.out.print("what expon do you want: ");
        double expon = scn.nextDouble();

        double Utwo = Math.pow(Uone, expon + 1);
        double Uthree = Math.pow(Uone, expon + 1); 
        double Ufour = Math.pow(Uone, expon + 1);       
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // Finished Table
        System.out.println("A          A^2           A^3");
        System.out.println(Oone + "          " + SQone + "             " + CUone);
        System.out.println(Otwo + "          " + SQtwo + "             " + CUtwo);
        System.out.println(Othree + "          " + SQthree + "             " + CUthree);
        System.out.println(Ofour + "          " + SQfour + "            " + CUfour);
        System.out.println(Uone  + "          " + Utwo + "               " + Ufour);
        //comment update
    }
}