import java.util.*;

public class After {

    private static final int LIST_SIZE = 1000000;

    private static void arrayListTest() {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < LIST_SIZE; i++) {

            list.add(i);
        }
    }

    public static void main(String[] args) {

        arrayListTest();
    }
}
