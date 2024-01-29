/*
 * Defime an Employee class with suitable attribute having getsalary() 
 * method, which return salary withdrawn by a particular employee. 
 * write a class Maneger which exteds a class Employee, override 
 * the getSalary method, which will return salary of manager by adding 
 * a travlling allowance, House rent allowance, etc.
 */

import java.util.*;

class Employee {
    String name;
    int id;
    float salary;

    void accept() {
        System.out.println("Enter Your name: ");
        Scanner sc = new Scanner(System.in);
        // Don't forgot to show a demo id cause name
        name = sc.next();
        System.out.println("Enter Your ID: ");
        id = sc.nextInt();
    }

    float getSalary() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Salary: ");
        salary = sc.nextFloat();
        return salary;
    }
}

class Manager extends Employee {
    int travllingAllowance, houseAllowance;
    float basicSalary;

    float getSalary() {
        super.accept();
        super.getSalary();
        basicSalary = super.salary;
        System.out.println("Enter Travelling Allowance: ");
        Scanner sc = new Scanner(System.in);
        travllingAllowance = sc.nextInt();
        System.out.println("Enter House Allowance: ");
        houseAllowance = sc.nextInt();
        System.out.println("Employee Gross Salary is: " + (basicSalary + travllingAllowance + houseAllowance));
        return basicSalary + travllingAllowance + houseAllowance;
    }

    void display() {
        float a = getSalary();
    }
}

public class Example3 {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.display();
    }

}