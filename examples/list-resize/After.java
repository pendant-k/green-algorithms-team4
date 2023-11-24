import java.util.ArrayList;
import java.util.List;

public class After {

    private static final int ARRAY_SIZE = 10000000;

    private static void fixSizedArrayList() {
        List<String> list = new ArrayList<>(ARRAY_SIZE);
        for(int i=0; i < ARRAY_SIZE; i++) {
            list.add("example");
        }
    }

    public static void main(String[] args) {
        fixSizedArrayList();
    }
}