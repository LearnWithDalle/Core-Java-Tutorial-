public class example {
    public static double divide(int dividend, int divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("Divide by zero error");
        }
        return (double) dividend / divisor;
    }

    public static void main(String[] args) {
        try {
            double result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        }
    }
}
