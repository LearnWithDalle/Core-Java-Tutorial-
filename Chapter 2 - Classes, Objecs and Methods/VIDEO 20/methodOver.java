class methodOver {
    int m, n;

    methodOver() { // Default Constracter
        m = 5;
        n = 3;
    }

    methodOver(int p, int q) { // pa Constracter
        m = p;
        n = q;
    }

    methodOver(double x, double y) { // pa Constracter
        double m = x;
        double n = y;
    }

    void Display() {
        System.out.println("m : " + m);
        System.out.println("n : " + n);
        System.out.println("m + n : " + (m + n));
    }

    public static void main(String[] args) {
        methodOver ok1 = new methodOver();
        methodOver ok2 = new methodOver(7, 6);
        methodOver ok3 = new methodOver(35.4, 15.1);
        ok1.Display();
        ok2.Display();
        ok3.Display();
    }
}
