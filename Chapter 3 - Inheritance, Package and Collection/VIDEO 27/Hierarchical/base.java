package Hierarchical;

class Pappa {
    void func1() {
        System.out.println("This function is in Pappa class.");
    }
}

class Beta1 extends Pappa {
    void func2() {
        System.out.println("This function is in Beta 1.");
    }
}

class Beta2 extends Pappa {
    void func3() {
        System.out.println("This function is in Beta 2.");
    }
}

class Beta3 extends Pappa {
    void func4() {
        System.out.println("This function is in Beta 3.");
    }
}

public class base {
    public static void main(String[] args) {
        Beta1 son1 = new Beta1();
        Beta2 son2 = new Beta2();
        Beta3 son3 = new Beta3();

        son1.func1();
        son1.func2();
        son2.func1();
        son2.func3();
        son3.func1();
        son3.func4();
    }
}
