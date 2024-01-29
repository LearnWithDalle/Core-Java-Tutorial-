import java.util.ArrayDeque;

/**
 * dequeue
 */
public class dequeue {

    public static void main(String[] args) {
        
        ArrayDeque <Integer> dada = new ArrayDeque<>(3);
        dada.add(564);
        dada.add(55);
        dada.add(56);
        dada.add(54); // 4TH iNDEX
        dada.offerLast(88888);
        dada.addFirst(99999);
        System.out.println(dada);
        dada.removeLast();
        System.out.println(dada);

    }
}