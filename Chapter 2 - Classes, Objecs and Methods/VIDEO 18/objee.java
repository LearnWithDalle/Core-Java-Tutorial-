// THIS IS Parameterized Constracter 

class objee {
    public static void main(String[] args) {
        int t1, t2, grandtotal;
        Student dalle = new Student(1, 49, 72);
        Student Priyanka = new Student(7, 92, 98);
        t1 = dalle.total();
        t2 = Priyanka.total();
        grandtotal = t1 + t2;
        dalle.dispayResult();
        Priyanka.dispayResult();
    }

}
