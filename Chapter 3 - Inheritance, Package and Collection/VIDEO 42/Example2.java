
/*
 * Write a package for gaming in java, which have two classes Indoor
 * and Outdoor.Use a Function Display() to genrate the list of playes
 * for specificgame.
 * (Use Parameterized constracter, Finalize() methode and array of object)
 */
import Game.*;
import java.util.*;

/**
 * Example2
 */
public class Example2 {

    public static void main(String[] args) {
        int indoorPlayer, outdoorPlayer, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Indoor player you want: ");
        indoorPlayer = sc.nextInt();
        System.out.println("How many Outdoor player you want: ");
        outdoorPlayer = sc.nextInt();
        Indoor in[] = new Indoor[indoorPlayer];
        Outdoor out[] = new Outdoor[outdoorPlayer];
        for (i = 0; i < indoorPlayer; i++) {
            System.out.print("Enter Indoor " + (i + 1) + " Player Name: ");
            String name = sc.next();
            in[i] = new Indoor(name);
        }
        for (i = 0; i < outdoorPlayer; i++) {
            System.out.print("Enter Outdoor " + (i + 1) + " Player Name: ");
            String name = sc.next();
            out[i] = new Outdoor(name);
        }
        System.out.println("Indoor Players: ");
        for (i = 0; i < indoorPlayer; i++) {
            in[i].Display();
        }
        System.out.println("Outdoor Players: ");
        for (i = 0; i < outdoorPlayer; i++) {
            out[i].Display();
        }

    }

    protected void Finalize() {
        System.out.println("finalized is called");
    }
}