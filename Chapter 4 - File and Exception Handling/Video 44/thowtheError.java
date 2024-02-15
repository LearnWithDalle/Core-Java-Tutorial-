public class thowtheError {
    static void checkSalary(int salary) {
        if (salary < 200000) {
            throw new ArithmeticException(
                    "broo salary bro kum hai broo\n bhukkaa mar jaunga broo \n\t\t bhai thodi zyada kar dee");
        } else {
            System.out.println("wow thanks broo i appriciated");
        }
    }

    public static void main(String[] args) {
        // thowtheError ok = new thowtheError();

        checkSalary(180000);
        System.out.println("Enjoyy....!");
    }

}
