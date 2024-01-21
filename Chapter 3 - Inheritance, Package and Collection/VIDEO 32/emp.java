class Employee {
    String empName;

    void getName(String name) {
        empName = name;
    }

    void printName() {
        System.out.println("Name: " + empName);
    }
}

class totalSalary extends Employee {
    float basic, dearNess, homeRent, all;

    void calculateTotalSalary(int b, int d, int h) {
        basic = b;
        dearNess = d;
        homeRent = h;
        all = basic + dearNess + homeRent;
    }

    void printSalary() {
        System.out.println(" Gross Salary: " + all);
    }
}

interface taxtes {
    float ptax = 200F;
    float itaxpercent = 20F;
    float allTax();
}

class Salary extends totalSalary implements taxtes {
    public float allTax() {
        return ptax + (all * itaxpercent / 100);
    }

    void display() {
        float tax = allTax();
        float netSalary = all;
        printName();
        printSalary();
        System.out.println("TAX: " + tax);
        System.out.println("Net Salary: " + netSalary);
    }
}

public class emp {

    public static void main(String[] args) {
        Salary empSal = new Salary();
        empSal.getName("Dalle Mahesh");
        empSal.calculateTotalSalary(50000, 500, 100);
        empSal.display();
    }
}