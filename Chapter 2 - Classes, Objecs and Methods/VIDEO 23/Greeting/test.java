package Greeting;

public class test {

     int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // problem calculator = new problem();
        test sum = new test();
        // // Test addition
        int add = sum.add(5, 3);
        System.out.println("Sum of  5, 3: " + add);

        // // Test subtraction
        // int difference = calculator.subtract(8, 3);
        // System.out.println("Difference: " + difference);

        // // Test multiplication
        // int product = calculator.multiply(4, 6);
        // System.out.println("Product: " + product);

        // // Test division
        // double quotient = calculator.divide(10, 2);
        // System.out.println("Quotient: " + quotient);

        // // Test division by zero
        // double invalidQuotient = calculator.divide(8, 0);
        // System.out.println("Invalid Quotient: " + invalidQuotient);

        // // Test Greeting Func
        // calculator.Greet();
    }
}
