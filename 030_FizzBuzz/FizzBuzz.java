  
import java.util.Scanner;

public class FizzBuzz {
    public static int x;

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What number do you want to count to?");
        //asking the user of the number that the program will count to 
        x = scan.nextInt();
        scan.close();
        //closing the scanner and running if statements 
///////////////////////for loop//////////////////////////////
        for (int i = 1; i < x + 1; i++) {
            System.out.println(  i);
////////////////////if statement////////////////////////////////           
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");  
                }
                ////////////////elif///////////////////// 
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } 
                ///////////////elif/////////////////////
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
        
        }
    }
}//noice




