class myerror extends Exception {
    private int detail;

    myerror(int a) {
        detail = a;
    }

    public String toString() {
        return "myerror[" + detail + "]";
    }
}

public class customError {
    static void compute(int a) throws myerror {
        System.out.println("calling the comput (" + a + ")");
        if (a > 10)
            throw new myerror(a);
        System.out.println("Normal exit");
    }

    public static void main(String[] args) {
        try {
            compute(8);
            compute(11);
        } catch (myerror e) {
            System.out.println("Got U: " + e);
        }
    }
}