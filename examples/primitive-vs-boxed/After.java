public class After {
    private static final int LOOP = 1000000;

    public static void main(String[] args) {
        int[] arr = new int[LOOP];
        for (var i = 0; i < LOOP; i++) {
            arr[i] = i;
        }
    }
}
