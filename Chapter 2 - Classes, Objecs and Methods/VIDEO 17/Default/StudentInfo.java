// package Default;

class StudentInfo {
    int rollNo, marks1, marks2, total;

    // String name;
    StudentInfo() {
        rollNo = 2;
        marks1 = 48;
        marks2 = 69;
    }

    int totalMarks() {
        total = marks1 + marks2;
        return total;
    }

    void displayInfo() {
        System.out.println("Student Roll no: " + rollNo);
        System.out.println("Student Marks 1: " + marks1);
        System.out.println("Student Marks 2: " + marks2);
        System.out.println("Student Total Marks: " + total);
    }

}   