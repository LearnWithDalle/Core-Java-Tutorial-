/**
 * try_Catch
 */
public class try_Catch {

    public static void main(String[] args) {
        try {
            int i, j;
            i = 5;
            j = 10 / i;
            System.out.println("Value of J is: " + j);
        } catch (ArithmeticException exception) {
            System.out.println("This is no work ");
            System.out.println("You can-not divide by zero");
        }
        System.out.println("Try Catch block complet");
    }
}