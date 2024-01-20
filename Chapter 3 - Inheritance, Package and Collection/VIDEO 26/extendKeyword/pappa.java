package extendKeyword;

class father {
    int i, j;

    void show() {
        System.out.println("i: " + i);
        System.out.println("j: " + j);
    }

}

class son extends father {
    int k;

    void display() {
        System.out.println("k is: " + k);
    }

    void sum() {
        System.out.println("I + J + K is: " + (i + j + k));
    }

}

public class pappa {
    public static void main(String[] args) {
        father baap = new father();
        son beta = new son();
        // data fill in father (baap)
        baap.i = 5;
        baap.j = 10;
        System.out.println("baap (Father)ke undar ka data: ");
        baap.show();
        // data fill in son (beta)
        System.out.println();
        beta.i = 15;
        beta.j = 16;
        beta.k = 18;
        System.out.println("beta (son)ke undar ka data: ");
        beta.show();
        beta.display();
        System.out.println();
        System.out.print("sum of I, J, K is: ");
        beta.sum();
    }
}
