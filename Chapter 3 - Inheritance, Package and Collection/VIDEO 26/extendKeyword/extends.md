# `extend` Keyword

`extend` keyword ka istemal inheritance ko establish karne ke liye hota hai Java mein. Jab aap ek class ko kisi aur class ke saath extend karte hain, toh aap ek "parent-child" relationship create karte hain. Child class, parent class ke members aur methods ko inherit karta hai.

Jab child class parent class ko extend karta hai, toh wo child class parent class ke saare members (fields) aur methods ko use kar sakta hai. Agar child class mein koi method ya field already defined hai jo parent class mein bhi hai, toh wo child class mein override ho jaata hai.

Example :

```java
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat(); // Inherited from Animal class
        myDog.bark(); // Specific to Dog class
    }
}
```

Yahan, `Dog` class `Animal` class ko extend kar raha hai. `Dog` class `eat` method ko inherit kar raha hai, aur `bark` method khud define kiya gaya hai.

Inheritance ka use mainly code reusability aur hierarchy banane ke liye hota hai. Agar aapko ek class mein kuch common features hain aur aap dusre class mein un features ko use karna chahte hain toh aap inheritance ka istemal kar sakte hain.