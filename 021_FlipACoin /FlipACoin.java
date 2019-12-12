import java.util.Scanner;
public class FlipACoin
{
    public static void main(String args[])
    {
    double ran = (Math.random());
    double ocoin = (ran * 100 + 1); 
    int coin = (int)(ocoin);
    if(coin>=50){
        System.out.println("Heads");
    }
    else{
        System.out.println("Tails");
    }
    
    } 
}//noice