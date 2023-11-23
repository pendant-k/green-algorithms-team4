import java.util.List;
import java.util.LinkedList;
import java.util.Random;

public class Before {
    private static final int LOOP = 1_000_000;

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }

        Random random = new Random();
        for (int i = 0; i < LOOP; i++) {
            int index = random.nextInt(list.size());
            index = list.get(index);
        }
    }
}
