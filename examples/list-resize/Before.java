import java.util.ArrayList;
import java.util.List;

public class Before {

    private static final int ARRAY_SIZE = 10000000;

    private static void dynamicResizedArrayList() {

        List<String> list = new ArrayList<>();
        for(int i=0; i < ARRAY_SIZE; i++) {
            list.add("example");
        }
    }

    public static void main(String[] args) {
        dynamicResizedArrayList();
    }
}