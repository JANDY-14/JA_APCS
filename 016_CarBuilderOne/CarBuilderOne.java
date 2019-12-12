import java.util.Scanner;

public class CarBuilderOne {
    public static void main(String args[]) {
        int y;
        int mi;
        String mk;
        String md;
        boolean trb;
        ///////////////////////////////////////////////////
        Scanner scn = new Scanner(System.in);
        // //////////////////user input////////////////////
        System.out.print("what make would you like?: ");
        mk = scn.next();

        System.out.print("what what model would you like?: ");
        md = scn.next();

        System.out.print("would you like to have a turbo? true or false: ");
        trb = scn.nextBoolean();

        System.out.print("what year do you want?: ");
        y = scn.nextInt();

        System.out.print("what mileage would you like?: ");
        mi = scn.nextInt();
        /////////////////////////////////////////////////
        Car UserCar = new Car(y, mi, mk, md, trb);
        // System.out.println(y + " " + " " + mi + " " + " " + mk + " " + " " + md+ " "
        // +" " + trb);
        System.out.println(UserCar.year);
    }
}// noice