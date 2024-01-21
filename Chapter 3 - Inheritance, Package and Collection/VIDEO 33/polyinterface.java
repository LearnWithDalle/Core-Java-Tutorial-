
interface Animal {
    void makeSound();  // Abstract method
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

public class polyinterface {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();  // Calls makeSound method of Dog
        cat.makeSound();  // Calls makeSound method of Cat
    }
}
