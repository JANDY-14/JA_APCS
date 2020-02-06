import java.util.Scanner;
public class TabletopDice {
    public static void main(String args[]) {
        double x = (Math.random());
        double y = (x * 4 + 1);
        System.out.println("D4 = " + (int) y);
        /////////////// <D6>/////////////////////////
        double z = (x * 6 + 1);
        System.out.println("D6 = " + (int) z);
        ////////////// <D8>/////////////////////////////
        double w = (x * 8 + 1);
        System.out.println("D8 = " + (int) w);
        ///////////// <D10>///////////////////////////////
        double meow = (x * 10 + 1);
        System.out.println("D10 = " + (int) meow);
        //////////// <D12>//////////////////////////////
        double xen = (x * 12 + 1);
        System.out.println("D12 = " + (int) xen);
        //////////// <D20>//////////////////////////////
        double pen = (x * 20 + 1);
        System.out.println("D20 = " + (int) pen);
        //comment update

    }
}
