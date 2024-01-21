// multiLevel Inheritance : methode overRiding, Handle multiLevel Constracter

class Dairymilk {
    final int i;

    Dairymilk(int i) {
        this.i = i;
        System.out.println(" Enjoy Dairy milk..........!!");
    }

    void Display() {
        System.out.println("\n Kuch Mithaa ho jay. DairyMilk ");
    }

}

class Dairymilk_Silk extends Dairymilk {
    int j;

    Dairymilk_Silk(int i, int j) {
        super(i);
        this.j = j;
        System.out.println(" Enjoy Dairy milk Silk..........!!" + i + j);
    }

    void Display() {
        System.out.println("\n Kuch Mithaa ho jay. DairyMilk Silk..");
    }
}

class Dairymilk_Hazalnut extends Dairymilk_Silk {
    int k;

    Dairymilk_Hazalnut(int i, int j, int k) {
        super(i, j);
        this.k = k;
        System.out.println("  Dairy milk Hazulnut..........Enjoy !!" + i + j);
    }

    void Display() {
        System.out.println("\n Kuch Mithaa ho jay. DairyMilk Hazulnut..");
    }
}

public class Dairy {
    public static void main(String[] args) {
        System.out.println("\n_______________________________");
        Dairymilk d1 = new Dairymilk(100);
        d1.Display();
        System.out.println("\n_______________________________");
        Dairymilk_Silk d2 = new Dairymilk_Silk(200, 300);
        d2.Display();
        System.out.println("\n_______________________________");
        Dairymilk_Hazalnut d3 = new Dairymilk_Hazalnut(300, 400, 500);
        d3.Display();

    }

}

