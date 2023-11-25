public class After {
    private final Object lockA = new Object();
    private final Object lockB = new Object();
    private int b = 0;

    public void methodA() {
        methodB();
    }

    public void methodB() {
        synchronized (lockB) {
            b += 1;
        }
    }

    public static void main(String[] args) {
        After example = new After();
        int numberThreadsA = 10;
        int iterA = 1000000;
        int numberThreadsB = 10;
        int iterB = 1000000;

        // Create and start threads that invoke methodA
        Thread[] threadsA = new Thread[numberThreadsA];
        for (int i = 0; i < numberThreadsA; i++) {
            threadsA[i] = new Thread(() -> {
                for (int j = 0; j < iterA; j ++) {
                    example.methodA();
                }
            });
            threadsA[i].start();
        }

        // Create and start another threads that invoke methodB
        Thread[] threadsB = new Thread[numberThreadsB];
        for (int i = 0; i < numberThreadsB; i++) {
            threadsB[i] = new Thread(() -> {
                for (int j = 0; j < iterB; j ++) {
                    example.methodB();
                }
            });
            threadsB[i].start();
        }

        // Wait for all threads to finish
        try {
            for (Thread thread : threadsA) {
                thread.join();
            }
            for (Thread thread : threadsB) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final values of b
        // System.out.println("Final value of b: " + example.b);
    }
}
