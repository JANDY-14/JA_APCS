import java.util.Scanner;

public class ShippingCalculator {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);    
        ////////user input//////////////////
        System.out.print("What is the whight of your package: ");
        double w = scan.nextDouble();
        ///////////if statement//////////////
        if(w<=0){
        System.out.println("Invallad input");}
        ///////elif/////////////
        else if (w > 0 && w <=1){
        System.out.println("the price to ship your package is $3.50");}
        ///////elif///////////// 
        else if (w > 1 && w <=3){
        System.out.println("the price to ship your package is $5.50");}
        //////elif/////////////
        else if (w > 3 && w <=10){
        System.out.println("the price to ship your package is $8.50");}
        //////elif////////////
        else if (w > 10 && w <=20){
        System.out.println("the price to ship your package is $10.50");}
        //comment update
        


    }
}// noice