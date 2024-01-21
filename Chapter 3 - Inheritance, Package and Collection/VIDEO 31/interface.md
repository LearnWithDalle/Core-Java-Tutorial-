**Interface in Java:**

Interface ek blueprint hota hai jise ek class implement karta hai. Yeh abstract methods (jo sirf declaration hote hain, without body) aur constants define karta hai. Koi bhi class ek se zyada interfaces ko implement kar sakti hai, par ek class sirf ek hi class ko extend kar sakti hai.

**Kyun Use Hota Hai:**

1. **Abstraction:** Interface ke through, aap ek set of methods ki declaration provide karte hain, lekin implementation nahi. Ye class ko ye batata hai ki voh kuch specific methods ko zaroor implement karna chahiye.

2. **Multiple Inheritance:** Java mein multiple inheritance class mein allowed nahi hai, lekin ek class multiple interfaces ko implement kar sakti hai.

**Example:**

Consider an example of `Shape` interface:

```java
// Interface
interface Shape {
    double calculateArea();  // Abstract method
    void display();  // Abstract method
}

// Classes implementing the interface
class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public void display() {
        System.out.println("Circle Area: " + calculateArea());
    }
}

class Rectangle implements Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public void display() {
        System.out.println("Rectangle Area: " + calculateArea());
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.display();

        Rectangle rectangle = new Rectangle(4, 6);
        rectangle.display();
    }
}
```

Is example mein, `Shape` ek interface hai jisme do abstract methods hain - `calculateArea` aur `display`. `Circle` aur `Rectangle` classes `Shape` interface ko implement karte hain, jisse unhein `calculateArea` aur `display` methods ko zaroor override karna padta hai.

Interface ka use karke aap abstraction maintain kar sakte hain aur ek set of methods ko multiple classes mein reuse kar sakte hain.