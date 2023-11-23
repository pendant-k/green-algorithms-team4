import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Before {
    private static final int LOOP = 10000;

    public static void main(String[] args) {
        List<Item> list = new ArrayList();
        for (int i = 0; i < LOOP; i++) {
            double d = Math.random();
            list.add(new Item(d));
        }

        List<Item> sorted = list.stream()
            .sorted(Comparator.comparingDouble(item -> item.value))
            .collect(Collectors.toList());
    }

    static class Item {
        double value;

        public Item(double value) {
            this.value = value;
        }
    }
}