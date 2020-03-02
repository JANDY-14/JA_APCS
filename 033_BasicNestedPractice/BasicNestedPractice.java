import java.util.*;
public class BasicNestedPractice
{
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

    /////////////////////////////////////////////////////////
        System.out.println(" Input A Number 1 - 20");
        int r = scan.nextInt();

        System.out.println("Input A Number 1 - 20");
        int c = scan.nextInt();

        System.out.println("Input A One Character");
        String x = scan.next();
        scan.close();

       
        for (int i = 1; i <= r; i++) {

            if (r > 20 || c > 20 || x.length() > 1) {
                
            }
            
            for (int ram = 1; ram <= c; ram ++) {
                System.out.print(x);
            }
            System.out.println();
        }
    }
}//noice catto 