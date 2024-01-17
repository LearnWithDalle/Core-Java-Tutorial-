class studentResult {
    public static void main(String[] args) {

        int total1, total2, grandTotal;
        StudentInfo student1 = new StudentInfo();
        StudentInfo student2 = new StudentInfo();
        total1 = student1.totalMarks();
        total2 = student2.totalMarks();
        grandTotal = total1 + total2;
        student1.displayInfo();
        student2.displayInfo();
        System.out.println("Grand Total : " + grandTotal);

    }
}
