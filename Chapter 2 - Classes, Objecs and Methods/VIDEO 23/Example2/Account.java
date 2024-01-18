package Example2;

public class Account {
    int accountNo; // account ID
    double balance;
    static double rate = 0.05;

    void setData(int n, double bal) {
        accountNo = n;
        balance = bal;
    }

    void quarterRateCal() {
        double interest = balance * rate * 0.25;
        balance += interest;
    }

    static void modifyRate(double incr) {
        rate += incr;
        System.out.println("Modified Rate of Interest: " + rate);
    }

    void show() {
        System.out.println("Account Number: " + accountNo);
        System.out.println("Rate of Interest: " + rate);
        System.out.println("Balance: " + balance);
    }
}

