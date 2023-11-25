import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class After {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            map.put("Key" + i, random.nextInt(100000));
        }

        int result = map.get("Key50000");
    }
}
