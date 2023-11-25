public class Before {
    public static void main(String[] args) {
        int iterations = 50000000;

        // Without Short-Circuit
        withoutShortCircuit(iterations);
    }

    private static void withoutShortCircuit(int iterations) {
        boolean result;
        for (int i = 0; i < iterations; i++) {
            result = (i % 10 == 0) || (i * 2 > iterations);
        }
    }
}
