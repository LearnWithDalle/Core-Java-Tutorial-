import math.Calculator;
import geometry.area;

public class pack {
    public static void main(String[] args) {
        // Math Operations
        int sum = Calculator.add(5, 7);
        System.out.println("Sum: " + sum);

        int difference = Calculator.subtract(10, 4);
        System.out.println("Difference: " + difference);

        int product = Calculator.multiply(3, 8);
        System.out.println("Product: " + product);

        double quotient = Calculator.divide(15, 3);
        System.out.println("Quotient: " + quotient);

        // Geometry Operations
        double rectangleArea = area.rectangleArea(4, 6);
        System.out.println("Rectangle Area: " + rectangleArea);

        double rectanglePerimeter = area.rectanglePerimeter(4, 6);
        System.out.println("Rectangle Perimeter: " + rectanglePerimeter);

        double squareArea = area.squareArea(5);
        System.out.println("Square Area: " + squareArea);

        double squarePerimeter = area.squarePerimeter(5);
        System.out.println("Square Perimeter: " + squarePerimeter);

        double rhombusArea = area.rhombusArea(10, 45);
        System.out.println("Rhombus Area: " + rhombusArea);

        double rhombusPerimeter = area.rhombusPerimeter(8);
        System.out.println("Rhombus Perimeter: " + rhombusPerimeter);
    }
}
