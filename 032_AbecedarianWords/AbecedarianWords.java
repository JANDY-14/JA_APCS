import java.util.Scanner;

public class AbecedarianWords 
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
            System.out.println("Check A Word: ");
                String input = scan.next();
                scan.close();
    /////////////////////////////////////////////////
    boolean che = isAbc(input);
    /////////
    if (che == true) {
        System.out.println(input + " is an abecedarian");
    } else {
        System.out.println(input + " is not an abecedarian");
    }
    ////////
    
}
        
    } //noice