public class After {
    public static void main(String[] args) {
        int iterations = 50000000;

        // With Short-Circuit
        withShortCircuit(iterations);
    }

    private static void withShortCircuit(int iterations) {
        boolean result;
        for (int i = 0; i < iterations; i++) {
            result = (i > iterations/2) && (i % 10 == 0);
        }
    }
}
