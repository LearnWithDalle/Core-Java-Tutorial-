package Greeting;

public class test {
    // TestArithmeticOperations.java


    public static void main(String[] args) {
        problem calculator = new problem();

        // Test addition
        int sum = calculator.add(5, 3);
        System.out.println("Sum: " + sum);

        // Test subtraction
        int difference = calculator.subtract(8, 3);
        System.out.println("Difference: " + difference);

        // Test multiplication
        int product = calculator.multiply(4, 6);
        System.out.println("Product: " + product);

        // Test division
        double quotient = calculator.divide(10, 2);
        System.out.println("Quotient: " + quotient);

        // Test division by zero
        double invalidQuotient = calculator.divide(8, 0);
        System.out.println("Invalid Quotient: " + invalidQuotient);

        // Test Greeting Func
        calculator.Greet();
    }
}

