import java.util.*;

public class LINKED {

    public static void main(String[] args) {

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(12);
        list1.add(123);
        list1.add(4);
        list1.add(6);
        list1.add(12);
        list1.add(7);
        list1.add(8);
        list1.add(2, 13);
        System.out.println(list1);
        System.out.println(list1.contains(6));
        System.out.println(list1.lastIndexOf(12));
    }
}