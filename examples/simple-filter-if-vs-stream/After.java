import java.util.List;
import java.util.ArrayList;

public class After {
    private static final int LOOP = 1_000_000;

    public static void main(String[] args) {
        List<Item> list = new ArrayList();
        for (int i = 0; i < LOOP; i++) {
            double d = Math.random();
            list.add(new Item(d));
        }

        List<Item> filtered = new ArrayList();
        for (Item item: list) {
            if (item.value > 0.5) {
                filtered.add(item);
            }
        }
    }

    static class Item {
        double value;

        public Item(double value) {
            this.value = value;
        }
    }
}