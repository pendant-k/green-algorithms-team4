import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.Arrays;

public class Before {
    public static void main(String[] args) {
        List list = Utils.createArray();

        Set<String> set = new HashSet<>();
        set.addAll(list);
    }
}

class Utils {
    private static final int LOOP = 1000000;

    public static List createArray() {
        var arr = new Integer[LOOP];
        for (var i = 0; i < LOOP; i++) {
            arr[i] = i;
        }
        return Arrays.asList(arr);
    }
}