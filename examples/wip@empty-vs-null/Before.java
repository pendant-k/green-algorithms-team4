import java.util.List;
import java.util.ArrayList;

public class Before {
    private static final int LOOP = 1_000_000;

    public static void main(String[] args) {
        Deck deck = new Deck();
        List<Integer> cards = deck.getCards();

        for (int i = 0; i < LOOP; i++) {
            int card = (int)(Math.random() * 100);
            if (card % 2 == 0) deck.addCards(card);
            if (cards != null && cards.contains(card)) {
                ;
            }
        }
    }

    static class Deck {
        private final List<Integer> cards = new ArrayList();

        public List<Integer> getCards() {
            return cards.isEmpty() ? null : cards;
        }

        public void addCards(int card) {
            cards.add(card);
        }
    }
}