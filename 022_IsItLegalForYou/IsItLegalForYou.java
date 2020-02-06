import java.util.Scanner;
public class IsItLegalForYou
{
public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        ///////////////// UI /////////////////
        System.out.print("How old are you: ");
        int age = scn.nextInt();     
        ////////////////if/////////////////////
        if(age >= 16)
        {
        System.out.println("you have the ability to get a Driver’s license");
        }
       ///////////////////////next if////////////////////////////
       if(age >= 18)
       {
       System.out.println("you have the ability to Buy cancer sticks, and go to a casino");
       }
       //////////////////////next if ////////////////////////////////////
       if(age >= 21)
       {
       System.out.println("you have the ability to rent a car and buy booze");
       //comment update
       }
    }
}