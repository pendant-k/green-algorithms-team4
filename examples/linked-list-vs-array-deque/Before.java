import java.util.LinkedList;
import java.util.List;

public class Before {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
        }

        for (int i = 0; i < 500000; i++) {
            linkedList.add(0, i);
            linkedList.remove(linkedList.size() - 1);
        }
    }
}
