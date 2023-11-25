import java.util.*;

public class Before {

    private static final int LIST_SIZE = 1000000;

    private static void vectorTest() {

        List<Integer> list = new Vector<>();

        for (int i = 0; i < LIST_SIZE; i++) {

            list.add(i);
        }
    }

    public static void main(String[] args) {

        vectorTest();
    }
}
