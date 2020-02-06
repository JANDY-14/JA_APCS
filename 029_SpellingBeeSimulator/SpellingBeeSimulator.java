
import java.util.Scanner;

public class SpellingBeeSimulator

{
    public static void main(String args[])
    {       
        Scanner scan = new Scanner(System.in);   
////////////////////////////////////////////////
System.out.println("Type me a word:");
//promting user
 String word = scan.next(); 
for (int i = 0; i < word.length() -1 ; i++){
    String sub = word.substring(i,i + 1);
    System.out.print(sub + "-"); 
    //running for loop that takes the UI and adds dashes 
}

//  System.out.println( word+ "," + wor d +" is spelled");
 
    }


        
}