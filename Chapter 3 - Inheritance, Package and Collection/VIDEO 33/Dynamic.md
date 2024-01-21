Dynamic Method Dispatch / Runtime Polymorphism ek concept hai jiska istemal Java mein polymorphism achieve karne ke liye hota hai. Iska basic idea ye hai ki ek method ko runtime mein decide kiya jaaye, taki ek reference variable ke through multiple objects ke saath kaam kiya ja sake.

**Kyun Use Hota Hai:**

1. **Flexibility:** Isse aap ek common interface (like superclass) ke through multiple classes ka use kar sakte hain, jisse aap code ko flexible bana sakte hain.

2. **Maintainability:** Runtime Polymorphism se aapko har object ke specific type ko yaad rakhne ki zarurat nahi hoti. Aap ek common type ka reference use karke kaam kar sakte hain.

**Implementation (Example):**

Consider a scenario where you have a common interface `Shape` and multiple classes implementing it:

```java
// Common interface
interface Shape {
    void draw();  // Abstract method
}

// Implementing classes
class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

class Triangle implements Shape {
    public void draw() {
        System.out.println("Drawing a Triangle");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();
        Shape shape3 = new Triangle();

        shape1.draw();  // Calls draw method of Circle
        shape2.draw();  // Calls draw method of Rectangle
        shape3.draw();  // Calls draw method of Triangle
    }
}
```

Yahan `Shape` ek interface hai jisme ek `draw` method declare hai. Phir, `Circle`, `Rectangle`, aur `Triangle` classes ne is interface ko implement kiya hai aur apne tareeke se `draw` method provide kiya hai.

Main method mein, humne `Shape` type ke reference variables `shape1`, `shape2`, aur `shape3` banaye hain. Inhe humne alag-alag implementing classes ke objects se initialize kiya hai. Jab hum `draw` method ko call karte hain, toh actual implementation runtime par decide hoti hai.

Yeh runtime polymorphism ka example hai, jisme aap ek common interface ke through multiple classes ke objects ke saath kaam kar rahe hain aur method call runtime par decide ho raha hai.