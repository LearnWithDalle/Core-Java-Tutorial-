Samajh gaya. Yeh raha ek detailed MD format mein cheatsheet on inheritance, super and final keywords, interfaces, access control, packages, built-in packages, import statements, static import, collection framework, and related topics:

# Java BBA CA Cheatsheet

## Inheritance

### Types of Inheritance
1. **Single Inheritance:** A class extends only one class.
   ```java
   class SubClass extends SuperClass { }
   ```

2. **Multilevel Inheritance:** A class extends another derived class.
   ```java
   class SubClass1 extends SuperClass { }
   class SubClass2 extends SubClass1 { }
   ```

3. **Hierarchical Inheritance:** Multiple classes extend a single base class.
   ```java
   class SubClass1 extends SuperClass { }
   class SubClass2 extends SuperClass { }
   ```

### Super and Final Keywords

#### `super` Keyword
- Used to refer to the immediate parent class object.
  ```java
  super.method(); // Call method of the superclass
  ```

#### `final` Keyword
- Used to declare constants, make a method final to prevent overriding, or make a class final to prevent inheritance.

## Interfaces

### Interface Declaration
```java
interface MyInterface {
  void myMethod(); // Method signature, no implementation
}
```

### Interface Implementation
```java
class MyClass implements MyInterface {
  public void myMethod() {
    // Implementation of the interface method
  }
}
```

### Reverse Dynamic Method Dispatch (Runtime Polymorphism)
- When a method of a subclass overrides a method of the superclass.
- Resolved at runtime based on the object type.
  
## Abstract Class

- **Comparison with Interface:**
  - Abstract classes can have both abstract and concrete methods.
  - Interfaces support multiple inheritance, abstract classes don't.

- **Abstract Class Example:**
  ```java
  abstract class MyAbstractClass {
    abstract void myAbstractMethod();
    void myConcreteMethod() {
      // Concrete method implementation
    }
  }
  ```

### Access Control

#### Access Modifiers
- **Private:** Accessible only within the class.
- **Default (Package-Private):** Accessible within the same package.
- **Protected:** Accessible within the same package and by subclasses.
- **Public:** Accessible from any class.

## Packages

### Package Concept
- Organizes classes into namespaces.
- **Declaration:**
  ```java
  package com.example.mypackage;
  ```

### Java Built-in Packages

- **Example:**
  ```java
  import java.util.ArrayList;
  import java.util.HashMap;
  ```

## Static Import

- **Example:**
  ```java
  import static java.lang.Math.*;
  ```

## Collection Framework

### Interface and Classes

#### List
- [ArrayList](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/ArrayList.html)

#### Set
- [HashSet](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/HashSet.html)

#### Map
- [HashMap](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/HashMap.html)

#### Classes
- [Vector](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Vector.html)
- [LinkedList](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/LinkedList.html)

### Collection Interfaces
- [List Interface](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html)
- [Set Interface](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html)
- [Map Interface](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html)

---

Yeh ek comprehensive cheatsheet hai. Kuch aur specific chahiye ho toh batao.