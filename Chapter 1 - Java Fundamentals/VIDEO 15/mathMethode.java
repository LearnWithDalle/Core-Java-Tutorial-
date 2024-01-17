public class mathMethode {

    public static void main(String[] args) {
        // Math.abs()
        int absResult = Math.abs(-1054545);
        System.out.println("Math.abs(-10): " + absResult);

        // Math.max()
        int maxResult = Math.max(5, 8);
        System.out.println("Math.max(5, 8): " + maxResult);

        // Math.min()
        int minResult = Math.min(3, 11);
        System.out.println("Math.min(3, 11): " + minResult);

        // Math.round()
        long roundResult = Math.round(7.8);
        System.out.println("Math.round(7.8): " + roundResult);

        // Math.sqrt()
        double sqrtResult = Math.sqrt(25);
        System.out.println("Math.sqrt(25): " + sqrtResult);

        // Math.cbrt()
        double cbrtResult = Math.cbrt(27);
        System.out.println("Math.cbrt(27): " + cbrtResult);

        // Math.pow()
        double powResult = Math.pow(5, 3);
        System.out.println("Math.pow(2, 3): " + powResult);

        // Math.signum()
        double signumResult = Math.signum(-7);
        System.out.println("Math.signum(-7): " + signumResult);

        // Math.ceil()
        double ceilResult = Math.ceil(9.2);
        System.out.println("Math.ceil(9.2): " + ceilResult);

        // Math.copySign()
        double copySignResult = Math.copySign(3.5, +1.0);
        System.out.println("Math.copySign(3.5, -1.0): " + copySignResult);

        // Math.nextAfter()
        double nextAfterResult = Math.nextAfter(5.0, 4.0);
        System.out.println("Math.nextAfter(3.0, 4.0): " + nextAfterResult);

        // Math.nextUp()
        double nextUpResult = Math.nextUp(2.0);
        System.out.println("Math.nextUp(2.0): " + nextUpResult);

        // Math.nextDown()
        double nextDownResult = Math.nextDown(2.0);
        System.out.println("Math.nextDown(2.0): " + nextDownResult);

        // Math.floor()
        double floorResult = Math.floor(6.7);
        System.out.println("Math.floor(6.7): " + floorResult);

        // Math.floorDiv()
        int floorDivResult = Math.floorDiv(10, 3);
        System.out.println("Math.floorDiv(10, 3): " + floorDivResult);

        // Math.random()
        double randomResult = Math.random();
        System.out.println("Math.random(): " + randomResult);

        // Math.rint()
        double rintResult = Math.rint(12.6);
        System.out.println("Math.rint(12.85): " + rintResult);

    }
}
