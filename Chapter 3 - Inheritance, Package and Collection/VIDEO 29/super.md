**`super` Keyword:**

`super` keyword ka istemal inheritance (virasat) mein hota hai, jab ek class doosri class ko extend karti hai. Jab aap ek subclass mein ek method ya field declare karte hain jo superclass mein bhi hota hai, toh aap `super` keyword ka istemal karke us superclass ke member ko refer kar sakte hain.

**Example:**
```java
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void eat() {
        super.eat();  // Calling the eat method of the superclass
        System.out.println("Dog is eating");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();
    }
}
```
Is example mein `Dog` class `Animal` class ko extend kar rahi hai. `eat` method mein `super.eat()` line se `Animal` class ke `eat` method ko call kiya gaya hai.

In keywords ka istemal code ko secure banane aur behavior ko control karne ke liye hota hai.