import java.util.ArrayDeque;
import java.util.Deque;

public class After {
    public static void main(String[] args) {
        Deque<Integer> arrayDeque = new ArrayDeque<>();

        for (int i = 0; i < 1000000; i++) {
            arrayDeque.addLast(i);
        }

        for (int i = 0; i < 500000; i++) {
            arrayDeque.addFirst(i);
            arrayDeque.removeLast();
        }
    }
}
