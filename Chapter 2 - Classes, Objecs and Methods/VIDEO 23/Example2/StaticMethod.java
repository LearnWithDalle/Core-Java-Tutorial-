package Example2;

public class StaticMethod {
    public static void main(String[] args) {
        Account acc1 = new Account();
        Account acc2 = new Account();

        Account.modifyRate(0.01);

        System.out.println(" 1. Customer A Information...");
        acc1.setData(201, 1000);
        acc1.quarterRateCal();
        acc1.show();

        System.out.println("\n 1. Customer A Information...");
        acc2.setData(202, 1000);
        acc2.quarterRateCal();
        acc2.show();
    }
}
