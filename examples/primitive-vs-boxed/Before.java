public class Before {
    private static final int LOOP = 1000000;

    public static void main(String[] args) {
        Integer[] arr = new Integer[LOOP];
        for (var i = 0; i < LOOP; i++) {
            arr[i] = i;
        }
    }
}