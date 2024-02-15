public class tryCatchNested {
    public static void main(String[] args) {
        try {
            int[] num = { 1, 2, 3, 4, 5, 6 };
            System.out.println("the 6th Element of Num is : " + num[6]);
            try {
                int ok = 546546 / 0;
                System.out.println("ok : " + ok);
            } catch (ArithmeticException e) {
                System.out.println("Dikat aagai divide by 0");
            }

        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("aukat main ree jyada mat udd");
        }
    }
}
