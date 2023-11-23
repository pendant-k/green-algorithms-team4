import java.util.HashMap;
import java.util.Random;
import java.util.Map;
import java.util.stream.IntStream;

enum Suit { HEART, SPADE, CLOVER, DIAMOND };

public class After {
    private static final int LOOP = 1_000_000;

    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < LOOP; i++) {
            int s = random.nextInt(4);
            int n = 1 + random.nextInt(13);
            Card card = Card.of(s, n);
        }
    }

    static class Card {
        private static final int MIN_NUMBER = 1;
        private static final int MAX_NUMBER = 13;
    
        private static Map<Integer, Card> cache = new HashMap<>();
    
        static {
            IntStream.range(MIN_NUMBER, MAX_NUMBER)
                .forEach(n -> {
                    cache.put(n, new Card(Suit.HEART, n));
                    cache.put(n + 13, new Card(Suit.SPADE, n));
                    cache.put(n + 13*2, new Card(Suit.CLOVER, n));
                    cache.put(n + 13*3, new Card(Suit.DIAMOND, n));
                });
        }
    
        private int number;
        private Suit suit;
    
        private Card(Suit suit, int number) {
            this.suit = suit;
            this.number = number;
        }
    
        public static Card of(int suit, int number) {
            return cache.get(suit * 13 + number);
        }
    }
}
