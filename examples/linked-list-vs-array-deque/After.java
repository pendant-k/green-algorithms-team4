import java.util.ArrayDeque;
import java.util.Deque;

public class After {
    public static void main(String[] args) {
        Deque<Integer> arrayDeque = new ArrayDeque<>();

        for (int i = 0; i < 100000; i++) {
            arrayDeque.addLast(i);
        }

        for (int i = 0; i < 50000; i++) {
            arrayDeque.addFirst(i);
            arrayDeque.removeLast();
        }
    }
}
