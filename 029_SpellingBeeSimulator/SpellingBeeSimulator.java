
import java.util.Scanner;

public class SpellingBeeSimulator

{
    public static void main(String args[])
    {       
        Scanner scan = new Scanner(System.in);   
////////////////////////////////////////////////
System.out.println("Type me a word:");
 String word = scan.next(); 
for (int i = 0; i < word.length() -1 ; i++){
    String sub = word.substring(i,i + 1);
    System.out.print(sub + "-"); 
}

//  System.out.println( word + "," + word +" is spelled");
 
    }


        
}