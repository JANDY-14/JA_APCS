import java.util.Scanner;

public class SimpleCounter

{
    public static void main(String args[])
    {       
        Scanner scan = new Scanner(System.in);
        System.out.print("what number would you like to count up to: ");
        int u = scan.nextInt();
        for(int i = 0; i < u; i++)  
        System.out.println(i+1);  
        //comment update
    }
}// noice