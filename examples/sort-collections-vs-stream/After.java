import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class After {
    private static final int LOOP = 10000;

    public static void main(String[] args) {
        List<Item> list = new ArrayList();
        for (int i = 0; i < LOOP; i++) {
            double d = Math.random();
            list.add(new Item(d));
        }

        list.sort(Comparator.comparingDouble(item -> item.value));
    }

    static class Item {
        double value;

        public Item(double value) {
            this.value = value;
        }
    }
}