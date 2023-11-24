import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class After {

    private static final List<Integer> list = new ArrayList<>();
    private static final int LIST_SIZE = 100000000;
    private static int MIN = Integer.MAX_VALUE;

    public static void init() {
        Random random = new Random();
        for (int i = 0; i < LIST_SIZE; i++) {
            list.add(random.nextInt());
        }
    }

    public static void forEachTest() {

        MIN = Integer.MAX_VALUE;
        list.forEach(item -> {
            if (item < MIN) {
                MIN = item;
            }
        });
    }

    public static void main(String[] args) {

        init();
        forEachTest();
    }
}