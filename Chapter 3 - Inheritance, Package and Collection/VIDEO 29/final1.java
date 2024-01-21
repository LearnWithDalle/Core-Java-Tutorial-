import java.lang.Math;

// Create a class which is help to find the area of all types(Square, rectangle, Triangle, Circle, Parallelogram)
// 1. Square
// Create class for Square
class Square {
    // Value Declare
    int side;
    int area;

    // Create Constracter`
    Square(int side) {
        this.side = side;
    }

    // Methode to find the area of Square
     int AreaOfSquare() {
        area = (side * side);
        System.out.println("Area of Square is : " + area);
        return area;
    }

    double sideOfSquare(int area) {
        double side = Math.sqrt(area);
        System.out.println("Side of Square is: " + side);
        return side;

    }
}

// 2. rectangle
// Create Rectangle Class
class Rectangle {
    // variable Declare
    int length;
    int width;
    int area;

    // Create Contrecter
    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // method to find the area of Rectangle
    int areaOfRectangle() {
        area = length * width;
        System.out.println("Area of Recrtangle is : " + area);
        return area;
    }

    int findLength(int area) {
        length = area / width;
        System.out.println("the Length of rectangle is: " + length);
        return length;
    }
    int findWidth(int area) {
        width = area / length;
        System.out.println("the widgth of rectangle is: " + length);
        return width;
    }
}

// 3. Triangle
// Create Triangle Class
class Triangle {
    int heigth;
    int base;
    int area;

    // Create Contrecter
    Triangle(int heigth, int base) {
        this.base = base;
        this.heigth = heigth;
    }

    // method to find the area of Triangle
    int areaofTriangle() {
        area = (base * heigth) * 1 / 2;
        System.out.println("Area of triangle is : " + area);
        return area;
    }

}

// 4. Circle
// Create class
class Circle {
    static final float pi = 3.141F;
    int radius;
    float area;

    // Constracter
    Circle(int radius) {
        this.radius = radius;
    }

    float areaOfCircle() {
        area = pi * (radius * radius);
        System.out.println("The area of Circle is: " + area);
        return area;
    }

}

// Parallelogram
class Parallelogram {
    int base;
    int height;
    int area;

    Parallelogram(int base, int height) {
        this.base = base;
        this.height = height;
    }

    int areaofParallelogram() {
        area = base * height;
        System.out.println("the area of Parallelogram is: " + area);
        return area;
    }

}

/**
 * final1
 */
public class final1 {

    public static void main(String[] args) {
        // 1. Square
        int s1 = 49; // Side variable
        // Create obj
        Square sq = new Square(s1);
        sq.AreaOfSquare();
        // sq.sideOfSquare(s1);
        // 2. Rectangle
        int recLen = 25; // length
        int recWid = 15; // widgth
        int recarea = 30;
        // Create obj
        Rectangle rec = new Rectangle(recLen, recWid);
        rec.areaOfRectangle();
        rec.findLength(recarea);
        // 3. Triangle
        int trihei = 15; // height of Triangle
        int tribase = 20; // base of Triangle
        // Create obj
        Triangle tri = new Triangle(trihei, tribase);
        tri.areaofTriangle();
        // 4. Circle
        int radius = 8; // Radius of Circle
        // Create obj
        Circle cir = new Circle(radius);
        cir.areaOfCircle();
        // 5. Parallelogram
        int base = 8;
        int height = 7;
        // Create obj
        Parallelogram pall = new Parallelogram(base, height);
        pall.areaofParallelogram();

    }
}
