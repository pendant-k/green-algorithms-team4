import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class After {
    private static final int LOOP = 1_000_000;

    public static void main(String[] args) {
        Deck deck = new Deck();
        List<Integer> cards = deck.getCards();

        for (int i = 0; i < LOOP; i++) {
            int card = (int)(Math.random() * 100);
            if (card % 2 == 0) deck.addCards(card);
            if (cards.contains(card)) {
                ;
            }
        }
    }

    static class Deck {
        private final List<Integer> cards = new ArrayList();

        public List<Integer> getCards() {
            return cards.isEmpty() ? Collections.EMPTY_LIST : cards;
        }

        public void addCards(int card) {
            cards.add(card);
        }
    }
}