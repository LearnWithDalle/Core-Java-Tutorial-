// Inheriting Data Member : 1 = 2 = 3 == 3 = 2 = 1

class DryFruit {
    int i = 10;
    String s1 = "this is DryFruit";

    void show() {
        System.out.println("\n Enjoy DryFruits....");
        System.out.println("\n \t i = " + i);
        System.out.println("\n \t DryFruit = " + s1);
    }
}

class Pista {
    int j = 20;
    String s2 = "this is Pista";

    void show() {
        DryFruit d1 = new DryFruit();
        d1.show();
        System.out.println("\n \t j = " + j);
        System.out.println("\n \t Pista = " + s2);
    }
}

class ShengDana {
    int k = 30;
    String s3 = "this is ShengDana";

    void show() {
        Pista p1 = new Pista();
        p1.show();
        System.out.println("\n \t k = " + k);
        System.out.println("\n \t ShengDana = " + s3);
    }
}

public class Dry {

    public static void main(String[] args) {
        ShengDana sheng = new ShengDana();
        sheng.show();
    }
}
