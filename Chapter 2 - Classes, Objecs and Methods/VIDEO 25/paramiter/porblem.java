package paramiter;

public class porblem {
    public static void main(String[] args) {
        int a = 26;
        int b = 24;

        calculater Calculater = new calculater();

        // add
        System.out.println("the sum of " + a + " or " + b + " is: " + Calculater.sum(a, b));
        // sub
        System.out.println("the Sub of " + a + " or " + b + " is: " + Calculater.sub(a, b));
        // add
        System.out.println("the Mul of " + a + " or " + b + " is: " + Calculater.mul(a, b));
        // add
        System.out.println("the Div of " + a + " or " + b + " is: " + Calculater.div(a, b));
        // add
        System.out.println("the sum of all Number" + Calculater.add(a, b, 23, 5, 4, 23, 54, 5, 23, 45, 23));
    }
}
