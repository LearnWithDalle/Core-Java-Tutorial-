class A {
    public void methodA() {
        System.out.println("main Method A, Class A ke under huu...!! ");
    }
}

class B extends A {
    public void methodB() {
        System.out.println("main Method B, Class B ke under huu...!! ");
    }
}

class C extends A {
    public void methodC() {
        System.out.println("main Method C, Class C ke under huu...!! ");
    }
}

class D extends B {
    public void methodD() {
        System.out.println("main Method D, Class D ke under huu...!! ");
    }
}

class myClass {
    public void methodB() {
        System.out.println("Methode of Class B");
    }

}
/**
 * example
 */
public class example {

    public static void main(String[] args) {
        B obj1 = new B();
        C obj2 = new C();
        D obj3 = new D();

        obj1.methodA();
        obj2.methodA();
        obj3.methodB();

    }
}