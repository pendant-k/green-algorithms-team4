import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Before {

    private static final long totalIterations = 20000000000L;

    public static void singleThread() {

        long sum = 0;
        for (long i = 0; i < totalIterations; i++) {
            sum += i;
        }
        // System.out.println(sum);
    }

    public static void main(String[] args) {

        singleThread();
    }
}