class dadaji {
    void display() {
        System.out.println("Dadajii: betaaa main dadaji.... kuch dikaii nahi dee raha hai... kuch karoo");
    }
}

class pappa extends dadaji {
    void display() {
        System.out.println("Pappajii: aare pitasriii aap sankoch naa karee main aabhi dalle ko keker kuch karwata huu");
    }
}

class dalla extends pappa {
    void display() {
        System.out.println("Dalla: aare pappa main kya ker sakta huu ismain... main khuud pareshan ho gaya huu..");
    }
}

public class example1 {

    public static void main(String[] args) {
        dadaji beta = new dalla();
        dadaji dada = new dadaji();
        dadaji pappa = new pappa();
        dada.display();
        pappa.display();
        beta.display();
    }
}