interface emp_info{
    int empId = 77;
    int empSalary = 77000;
    String empName = "Mahesh";
    String empAdd = "Pune, Maharastra";
    void display1();
}

interface emp_show  extends emp_info{
    void display2();  
}

class Employee implements emp_show{
    public void display(){
        System.out.println("Display Function ke under....");
        System.out.println("\n");
    }
    public void display1(){
        System.out.println("Employee Id: " + empId);
        System.out.println("Employee Name: " + empName);
    }
    public void display2(){
        System.out.println("Employee Salary: " + empSalary);
        System.out.println("Employee Address: " + empAdd);
    }
}

/**
 * ok
 */
public class ok {

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        System.out.println("method 1 ke under");
        emp1.display1();
        System.out.println();
        System.out.println("method 2 ke under");
        emp1.display2();
    }
}