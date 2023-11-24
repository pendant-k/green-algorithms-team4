import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Before {

    private static final int N = 50000000;
    private static final List<Integer> testData = new ArrayList<>();

    public static List<Integer> init() {
        Random randomGenerator = new Random();
        for (int i = 0; i < N; i++) {
            testData.add(randomGenerator.nextInt(Integer.MAX_VALUE));
        }
        return testData;
    }


    public static void classicSort() {

        Collections.sort(testData);
    }
    public static void main(String[] args) {

        init();
        classicSort();
    }
}