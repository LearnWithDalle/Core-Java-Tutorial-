class Outclass {
    int a = 5;

    public static class InClass {
        int b = 10;

        void inMethod() {
            // Creating an object of the enclosing class
            Outclass outObj = new Outclass();
            System.out.println("a of Outclass = " + outObj.a);
            System.out.println("b of Inclass = " + b);
        }
    }
}

class TestNested {
    public static void main(String args[]) {
        // Creating an object of the nested class without creating an object of the enclosing class
        Outclass.InClass inObj = new Outclass.InClass();
        inObj.inMethod();
    }
}
