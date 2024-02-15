public class finnaly {
    public static void main(String[] args) {
        // Try block
        try {
            // Try block 1
            try {
                System.out.println("Inside the Try block ");
                int a = 100 / 0;
                System.out.println(a);
            } catch (ArithmeticException e1) {
                System.out.println("try block 1 ke under ka Exception " + e1);
            }
            // Try block 2
            try {
                System.out.println("Inside the Try block ");
                int b = 200 / 0;
                System.out.println(b);
            } catch (ArrayIndexOutOfBoundsException e2) {
                System.out.println("try block 2 ke under ka Exception " + e2);
            }
            System.out.println("Block 1 and block 2 of try complete");
        } catch (ArithmeticException exception) {
            System.out.println("main Try block complete");
            System.out.println("Arithmetic Exception");
        } finally {
            System.out.println("hello....!! i am in the Finally Block");
        }
    }
}