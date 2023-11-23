import java.lang.reflect.Array;
import java.util.Random;

enum Suit { HEART, SPADE, CLOVER, DIAMOND };

public class Before {
    private static final int LOOP = 1_000_000;

    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < LOOP; i++) {
            int s = random.nextInt(4);
            int n = 1 + random.nextInt(13);
            Card card = new Card(Suit.values()[s], n);
        }
    }

    static class Card {
        private int number;
        private Suit suit;
    
        public Card(Suit suit, int number) {
            this.suit = suit;
            this.number = number;
        }
    }
}