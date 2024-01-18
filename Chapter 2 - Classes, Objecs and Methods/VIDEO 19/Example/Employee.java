public class Employee {

    int id;
    String name;
    int age;
    String address;
    String Degignation;
    int salary;

    Employee(String n, int a, String add, int i, String d, int s) {
        name = n;
        age = a;
        address = add;
        id = i;
        Degignation = d;
        salary = s;
    }

    void empDetail() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Id: " + id);
        System.out.println("degignation: " + Degignation);
        System.out.println("Salary: " + salary);
        System.out.println();
    }

}