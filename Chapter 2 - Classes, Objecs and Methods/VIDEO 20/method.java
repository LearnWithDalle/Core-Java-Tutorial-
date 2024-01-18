public class method {
    public String getName(String str) {
        System.out.println("This is a String");
        return null;
    }

    public static void main(String[] args) {
        method obj = new method();
        obj.getName("hello");
    }
}
