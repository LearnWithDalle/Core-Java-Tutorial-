// Abstract class
abstract class Shape {
    // non- Abstract Field
    String color;

    // Abstract Method
    abstract void draw();

    void setColor(String c) {
        color = c;
    }
}

class Circle extends Shape {
    Double radius;

    Circle(Double r) {
        this.radius = r;
    }

    void draw() {
        System.out.println("Drawing a Circle with radius " + radius + " and Color will be " + color);
    }
}

class Rectangle extends Shape {
    Double Length;
    Double Breadth;

    Rectangle(Double l, Double b) {
        this.Length = l;
        this.Breadth = b;
    }

    void draw() {
        System.out.println("Drawing a Rectangle with Length " + Length + " and breadth is " + Breadth
                + " & Color will be " + color);
    }
}

public class abs {
    public static void main(String[] args) {

        Shape circle = new Circle(5.0);
        circle.setColor("Red");
        circle.draw();
        System.out.println("");
        Shape rectangle = new Rectangle(5.0, 7.0);
        rectangle.setColor("Blue");
        rectangle.draw();
    }

}