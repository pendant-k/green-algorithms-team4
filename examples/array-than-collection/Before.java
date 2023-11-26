import java.util.ArrayList;
import java.util.List;

public class Before {

    public static void main(String[] args) {
        // 컬렉션을 사용합니다.
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 1000000; i++) {
            numbers.add(i);
        }
    }
}
