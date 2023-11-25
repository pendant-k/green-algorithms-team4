import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class After {

    private static final long totalIterations = 20000000000L;

    public static void multiThread() {

        final int numThreads = 4;

        ExecutorService executorService = Executors.newFixedThreadPool(numThreads);
        long chunkSize = totalIterations / numThreads;
        long chunkStart = 0;

        try {
            long sum = 0;

            Callable<Long> task = () -> {
                long partialSum = 0;
                for (long i = 0; i < chunkSize; i++) {
                    partialSum += i;
                }
                return partialSum;
            };

            Future<Long>[] futures = new Future[numThreads];
            for (int i = 0; i < numThreads; i++) {
                final int threadIndex = i;
                futures[i] = executorService.submit(() -> {
                    long partialSum = 0;
                    long start = chunkSize * threadIndex;
                    for (long j = start; j < start + chunkSize; j++) {
                        partialSum += j;
                    }
                    return partialSum;
                });
            }

            for (int i = 0; i < numThreads; i++) {
                sum += futures[i].get();
            }
    
            // System.out.println(sum);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }
    }

    public static void main(String[] args) {

        multiThread();
    }
}