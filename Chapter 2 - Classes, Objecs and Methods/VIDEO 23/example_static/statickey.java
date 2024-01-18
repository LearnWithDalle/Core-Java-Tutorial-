package example_static;

public class statickey {

    static int i;
    int j;
    static {
        i = 10;
        System.out.println("this is Static block");
    }
}
