import java.util.*;
public class DateTranslator
{
    public static void main(String args[])
    {
        public static void main(String args[]) {
            Scanner scan = new Scanner(System.in);
            /////////////////////////////////////
            System.out.println("DAY");
            int day = scan.nextInt();
             /////////////////////////////////////
            System.out.println("MONTH");
            int month = scan.nextInt();
             /////////////////////////////////////
            System.out.println("YEAR");
            int year = scan.nextInt();
             /////////////////////////////////////
            System.out.println("US or EU");
            String foo = scan.next();
             /////////////////////////////////////
            if (foo.equals("US")) {
                dateUS(m, d, y);
                scan.close();
            } else {
                dateEU(d, m, y);
                scan.close();
            }
    
        }
    
        //////////////////////////////////////////////////////////////////////////
        public static void dateUS(int day, int month, int year) {
            System.out.println("US: " + month + "," + day + "," + year);
        }
    //////////////////////////////////////////////////////////////////////////
        public static void dateEU(int day, int month, int year) {
            System.out.println("EU: " + day + "," + month + "," + year);
        
    }

    } 
}
//noice