import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class Before {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();

        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            map.put("Key" + i, random.nextInt(100000));
        }

        int result = map.get("Key50000");

    }
}
