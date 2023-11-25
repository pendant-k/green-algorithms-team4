import java.util.ArrayList;
import java.util.List;

public class Before {

    private static final int INSERT_COUNT = 100000;
    private static final List<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {

        for (int i = 1; i <= INSERT_COUNT; i++) {

            numbers.add(0, i);
        }
    }
}
