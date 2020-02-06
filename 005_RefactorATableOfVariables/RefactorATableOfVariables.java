public class RefactorATableOfVariables {
    public static void main(String[] args) {
        // <Origen Variable>
        int Oone = 1;
        int Otwo = 2;
        int Othree = 3;
        int Ofour = 4;
        // <Squared Variable>
        int SQone = Oone * Oone;
        int SQtwo = Otwo * Otwo;
        int SQthree = Othree * Othree ;
        int SQfour = Ofour * Ofour;
        // <Cubed variable>
        int CUone = Oone * Oone * Oone;
        int CUtwo = Otwo * Otwo * Otwo;
        int CUthree = Othree * Othree * Othree;
        int CUfour = Ofour * Ofour * Ofour;
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
    //Finished Table 
    System.out.println("A          A^2           A^3");
    System.out.println( Oone +"          "+ SQone + "             "+ CUone );
    System.out.println( Otwo +"          "+ SQtwo + "             "+ CUtwo );
    System.out.println( Othree +"          "+ SQthree + "             "+ CUthree );
    System.out.println( Ofour +"          "+ SQfour + "            "+ CUfour );
    //comment update
    }
}