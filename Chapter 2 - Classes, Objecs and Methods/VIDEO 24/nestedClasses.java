// non Stattic nested class 

class OuterClass {
    String outerVariable = "This is Outer Class";

    // Method in the outer class
    void outerMethod() {
        // Creating an instance of the inner class
        InnerClass innerObj = new InnerClass();
        innerObj.innerMethod();
    }

    // Inner class nested inside the outer class
    class InnerClass {
        String innerVariable = "This is Inner Class";

        // Method in the inner class
        void innerMethod() {
            // Accessing variables from the outer and inner classes
            System.out.println("Outer Variable: " + outerVariable);
            System.out.println("Inner Variable: " + innerVariable);
        }
    }
}

// Test class to demonstrate the usage of the nested classes
class TestClass {
    public static void main(String[] args) {
        // Creating an instance of the outer class
        OuterClass outerObj = new OuterClass();
        
        // Calling the method in the outer class, which in turn uses the inner class
        outerObj.outerMethod();
        
        // Creating an instance of the inner class using the outer class reference
        OuterClass.InnerClass innerObj = outerObj.new InnerClass();
        
        // Calling the method in the inner class
        innerObj.innerMethod();
    }
}
