import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.fer.DeckOfCards;
import com.fer.PlayingCard;

class DeckOfCardsTest {

  private DeckOfCards deck;

  @Test
  void testDeckInitialization() {
    deck = new DeckOfCards();
    assertEquals(52, deck.getDeck().size());
  }

  @Test
  void testDeckSizeAfterDealtHand() {
    deck = new DeckOfCards();
    ArrayList<PlayingCard> hand = deck.dealHand(5);
    assertEquals(5, hand.size());
    assertEquals(47, deck.getDeck().size());
  }
}
