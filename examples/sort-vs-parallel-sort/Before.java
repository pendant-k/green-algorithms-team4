import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Before {

    private static final int N = 1000000;
    private static final List<Integer> testData = new ArrayList<>();

    public static List<Integer> init() {
        Random randomGenerator = new Random();
        for (int i = 0; i < N; i++) {
            testData.add(randomGenerator.nextInt(Integer.MAX_VALUE));
        }
        return testData;
    }

    public static void parallelSort() {

        testData.parallelStream().sorted().collect(Collectors.toList());
    }


    public static void main(String[] args) {

        System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "6");
        init();
        parallelSort();
    }
}