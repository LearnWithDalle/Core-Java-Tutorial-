/*
 * Inheritance with Overriding Method.
 */

class Pappa {
    Pappa() {
        System.out.println("pappa Class Constrecter ");
    }
    
    void display() {
        System.out.println("Yee hai Pappa ka Method Class");
    }
    void updateDisplay() {
        System.out.println("Yee hai Pappa ka 2nd Method jho beta ke under ka method class ker raha hai");
    }
}

public class Example5 extends Pappa{ // suppose this is beta class
    
    Example5(){
        System.out.println("Beta Class Constrecter ");
    }
    void display() {
        System.out.println("Yee hai Beta ka Method Class");
        System.out.println("Jho pappa ke methode ko call ker raha hai");
        super.updateDisplay();
    }
    public static void main(String[] args) {
        Example5 beta = new Example5();
        beta.display();
    }
}
