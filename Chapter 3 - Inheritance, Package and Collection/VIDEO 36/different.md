**Import Statement in Java:**

Import statement ka use Java programming mein kisi bhi package ya class ko code mein include karne ke liye hota hai. Isse aap code mein un elements ko access kar sakte hain jo aapke current package ya class ke bahar hote hain.

**Example of Import Statement:**

```java
import java.util.ArrayList;  // Importing ArrayList class from java.util package

public class Example {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        // ... rest of the code ...
    }
}
```

Yahan `import java.util.ArrayList;` statement ka use kiya gaya hai taki `ArrayList` class ka use kiya ja sake.

**Static Import in Java:**

Static import ka use karte waqt aap kisi class ke static members (fields aur methods) ko directly use kar sakte hain, bina class name ke.

**Example of Static Import:**

```java
import static java.lang.Math.*;  // Importing all static members of Math class

public class MathOperations {
    public static void main(String[] args) {
        double result = sqrt(25);  // No need to use Math.sqrt, directly use sqrt
        System.out.println("Square root: " + result);
    }
}
```

Yahan `import static java.lang.Math.*;` statement ka use kiya gaya hai taki `Math` class ke saare static members ko directly use kiya ja sake, jaise `sqrt` method.

**Note:**
- Import statement ka use tab hota hai jab aap kisi package ya class ke members ko use karna chahte hain.
- Static import ka use tab hota hai jab aap kisi class ke static members ko directly use karna chahte hain, bina class name ke.

Both import and static import statements help in organizing and simplifying the code.