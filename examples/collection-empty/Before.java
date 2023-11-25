import java.util.ArrayList;
import java.util.List;

public class Before {
    private static final int LOOP = 1000000;

    public static void main(String[] args) {
        List<Integer>[] arrays = new ArrayList[LOOP];

        // Initialize and populate arrays
        for (int i = 0; i < LOOP; i++) {
            arrays[i] = new ArrayList<>();
            arrays[i].add(i);
        }

        // Check if arrays are empty using Collection.isEmpty()
        int emptyArraysCount = 0;
        for (List<Integer> array : arrays) {
            if (array.size() == 0) {
                emptyArraysCount++;
            }
        }

        System.out.println("Number of empty arrays: " + emptyArraysCount);
    }
}
