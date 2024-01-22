**Packages in Java:**

Packages ek tareeka hai Java mein code ko organize karne ka. Isse aap apne code ko modules mein divide kar sakte hain, jisse code maintainable hota hai. Har package mein ek alag namespace hota hai jisse naming conflicts se bacha ja sake.

**Kyun Use Hota Hai:**

1. **Organization:** Packages ka use karke aap apne code ko logically organize kar sakte hain, jisse code maintainable aur scalable hota hai.

2. **Encapsulation:** Aap packages ka istemal karke access control ko manage kar sakte hain. Kuch classes aur methods sirf apne package ke andar hi accessible hote hain.

3. **Namespace Management:** Packages namespace provide karte hain, jisse naming conflicts se bacha ja sake. Agar do alag packages mein ek hi naam ka class hai, toh unko distinguish karne mein namespace ka use hota hai.

**Implementation (Example):**

Consider a scenario where you have a project with different functionalities like `math` and `geometry`:

```java
// math package
package math;

public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }
}

// geometry package
package geometry;

public class Circle {
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        int sum = math.Calculator.add(5, 7);
        System.out.println("Sum: " + sum);

        double area = geometry.Circle.calculateArea(3);
        System.out.println("Circle Area: " + area);
    }
}
```

Yahan, `math` aur `geometry` do packages hain, har ek apne alag namespace ke saath. `Calculator` class `math` package mein hai aur `Circle` class `geometry` package mein hai.

**Access and Use:**

1. **Using Package Name:**
   ```java
   import math.Calculator;

   public class Main {
       public static void main(String[] args) {
           int sum = Calculator.add(5, 7);
           System.out.println("Sum: " + sum);
       }
   }
   ```

2. **Using PackageName.ClassName:**
   ```java
   import geometry.Circle;

   public class Main {
       public static void main(String[] args) {
           double area = Circle.calculateArea(3);
           System.out.println("Circle Area: " + area);
       }
   }
   ```

3. **Using Fully Qualified Name:**
   ```java
   public class Main {
       public static void main(String[] args) {
           int sum = math.Calculator.add(5, 7);
           System.out.println("Sum: " + sum);

           double area = geometry.Circle.calculateArea(3);
           System.out.println("Circle Area: " + area);
       }
   }
   ```

Jab aap packages ka istemal karte hain, aap inhe import karke use kar sakte hain. Fully Qualified Name mein aap directly package name ke saath class name use karte hain.