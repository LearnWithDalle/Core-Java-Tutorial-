
class Circle  {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

     double calculateArea() {
        return Math.PI * radius * radius;
    }

     void display() {
        System.out.println("Circle Area: " + calculateArea());
    }
}

class Rectangle  {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

     double calculateArea() {
        return length * width;
    }

     void display() {
        System.out.println("Rectangle Area: " + calculateArea());
    }
}

// Main class
public class ok {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.display();

        Rectangle rectangle = new Rectangle(4, 6);
        rectangle.display();
    }
}