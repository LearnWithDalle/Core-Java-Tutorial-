public class Expretion4 {
    public static void main(String[] args) {
        // opreter Precedence
        int a = 10, b = 5 , c = 1, ans;
        ans =  a - ++b - ++c;
        System.out.println(ans);
        // a++ : increse by 1
        // ++a : add value by 1
    }
}
