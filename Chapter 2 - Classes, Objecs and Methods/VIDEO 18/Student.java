public class Student {
    int rollNo;
    int mark1;
    int mark2;
    int total;

    Student(int roll_No, int m1, int m2) { // this is an arguments
        rollNo = roll_No;
        mark1 = m1;
        mark2 = m2;
    }

    int total() { // Creating the Total Method
        total = mark1 + mark2;
        return total;
    }

    void dispayResult() {
        System.out.println("Student Roll no: " + rollNo);
        System.out.println("Student Marks 1: " + mark1);
        System.out.println("Student Marks 2: " + mark2);
        System.out.println("Student Total Marks: " + total);
    }
}