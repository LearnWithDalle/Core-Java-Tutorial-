**Abstract Class in Java:**

Abstract class ek aisi class hoti hai jise aap directly instantiate nahi kar sakte. Matlab, aap abstract class ka object nahi bana sakte, lekin aap use karke derived classes create kar sakte hain. Abstract class mein ek ya multiple abstract methods hote hain, jo ke sirf declaration hote hain, unka actual implementation derived classes mein hota hai.

**Kyun Use Hota Hai:**

1. **Abstraction:** Abstract class ka use abstraction achieve karne ke liye hota hai. Abstract class mein aap method ki sirf declaration dete hain, lekin unki actual implementation derived classes mein hoti hai.

2. **Common Code:** Agar kuch methods ka common code multiple related classes mein hota hai, toh aap us common code ko abstract class mein likh sakte hain, jisse aapko code duplication se bachaya ja sake.

**Implementation (Example):**

Consider a scenario where you have a common abstract class `Shape`:

```java
// Abstract class
abstract class Shape {
    String color;  // Non-abstract field

    // Abstract method (no implementation)
    abstract void draw();

    // Non-abstract method with implementation
    void setColor(String c) {
        color = c;
    }
}

// Concrete classes implementing Shape
class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    // Implementation of abstract method
    void draw() {
        System.out.println("Drawing a Circle with radius " + radius + " and color " + color);
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    // Implementation of abstract method
    void draw() {
        System.out.println("Drawing a Rectangle with length " + length + ", width " + width + " and color " + color);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.setColor("Red");
        circle.draw();

        Rectangle rectangle = new Rectangle(4, 6);
        rectangle.setColor("Blue");
        rectangle.draw();
    }
}
```

Yahan `Shape` ek abstract class hai jisme ek abstract method `draw` aur ek non-abstract method `setColor` hai. `Circle` aur `Rectangle` classes `Shape` class ko extend kar rahi hain aur unke abstract methods ko implement kar rahi hain.

Abstract class ke methods:

- **Abstract Method:** Yeh ek method hota hai jiska koi implementation nahi hoti, sirf declaration hoti hai. Derived classes ko chahiye ki woh is method ko implement karein.

- **Non-Abstract Method:** Yeh ek method hota hai jiska implementation hota hai. Derived classes ise directly use kar sakte hain ya fir override kar sakte hain.

Abstract class ka use inheritance aur common code share karne ke liye hota hai.