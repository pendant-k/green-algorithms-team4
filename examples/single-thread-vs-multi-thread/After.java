import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class After {

    private static final long totalIterations = 20000000000L;

    public static void multiThread() {

        final int numThreads = 4; // 여기에서 적절한 스레드 수를 선택할 수 있습니다.

        ExecutorService executorService = Executors.newFixedThreadPool(numThreads);
        long chunkSize = totalIterations / numThreads;

        try {
            long sum = 0;

            // Callable을 사용하여 각 스레드의 작업을 정의합니다.
            Callable<Long> task = () -> {
                long partialSum = 0;
                for (long i = 0; i < chunkSize; i++) {
                    partialSum += i;
                }
                return partialSum;
            };

            // 각각의 작업을 스레드 풀에 제출하고 결과를 받습니다.
            Future<Long>[] futures = new Future[numThreads];
            for (int i = 0; i < numThreads; i++) {
                futures[i] = executorService.submit(task);
            }

            // 각 스레드에서 얻은 결과를 더합니다.
            for (int i = 0; i < numThreads; i++) {
                sum += futures[i].get();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 스레드 풀을 종료합니다.
            executorService.shutdown();
        }
    }

    public static void main(String[] args) {

        multiThread();
    }
}