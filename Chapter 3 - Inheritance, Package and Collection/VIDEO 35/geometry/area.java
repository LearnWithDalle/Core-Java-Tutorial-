package geometry;

public class area {
    public static double rectangleArea(double length, double width) {
        return length * width;
    }

    public static double rectanglePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    public static double squareArea(double side) {
        return side * side;
    }

    public static double squarePerimeter(double side) {
        return 4 * side;
    }

    public static double rhombusArea(double diagonalsProduct, double angle) {
        return diagonalsProduct * Math.sin(Math.toRadians(angle));
    }

    public static double rhombusPerimeter(double side) {
        return 4 * side;
    }
}
