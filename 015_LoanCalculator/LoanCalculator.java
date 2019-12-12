 import java.util.Scanner;
 public class LoanCalculator

{
    public static void main(String args[])
    {
  //anual intrest rate 
    double AIR;
  // remaining months 
    double RM; 
 // priciple balence 
    double PB; 
  ///////////////////////////////////////////
  Scanner scan = new Scanner(System.in);
  ///////////////PB var /////////////
System.out.print("Enter your Principal Balance: ");
PB= scan.nextDouble();

//////////////AIR var//////////////
System.out.print("Enter your Annual Interest Rate: ");
AIR = scan.nextDouble();

//////////////RM var///////////////
System.out.print("Enter the remaining months on your loan: ");
RM= scan.nextDouble();

 double MI = PB * (AIR/RM);
System.out.println("your monthly intrest is: " +MI);
////////////////////////////////////////////////////
 double MP = PB/RM + MI;
 System.out.println("your monthly payment is: " +MP);
    } 
}//noice