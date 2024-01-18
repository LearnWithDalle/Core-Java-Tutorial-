/**
 * CalculateFactorial
 */
public class CalculateFactorial {

    
    static long CalculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * CalculateFactorial(n - 1);
        }
    }
}