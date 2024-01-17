Java mein 2 prakar ke loops hote hain: `for` loop aur `while` loop.

### 1. For Loop:

`for` loop ek fixed number of iterations ke liye use hota hai. Yeh loop initialization, condition, aur increment/decrement ka use karta hai.

**Syntax:**
```java
for (initialization; condition; increment/decrement) {
    // Code to be executed in each iteration
}
```

**Example:**
```java
class ForLoopExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }
    }
}
```

Is example mein `for` loop 1 se 5 tak ke numbers ke liye 5 baar chalega aur har baar `Iteration: [current_iteration]` ko print karega.

### 2. While Loop:

`while` loop tab tak chalta hai jab tak condition true hoti hai. Yeh loop flexible hai aur aapko manually control deti hai jab tak aap condition ke base par chahe.

**Syntax:**
```java
while (condition) {
    // Code to be executed as long as the condition is true
}
```

**Example:**
```java
class WhileLoopExample {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println("Iteration: " + i);
            i++;
        }
    }
}
```

Is example mein `while` loop 1 se 5 tak ke numbers ke liye 5 baar chalega aur har baar `Iteration: [current_iteration]` ko print karega.