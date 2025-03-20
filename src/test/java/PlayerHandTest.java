import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import com.fer.PlayerHand;
import com.fer.PlayingCard;

class PlayerHandTest {

  private PlayerHand playerHand;

  @Test
  void testHandSum() {
      ArrayList<PlayingCard> hand = new ArrayList<>();
      hand.add(new PlayingCard('H', 2));
      hand.add(new PlayingCard('D', 3));
      hand.add(new PlayingCard('S', 4));
      playerHand = new PlayerHand(hand);
      assertEquals(9, playerHand.getSum());
  }

  @Test
  void testFlushHand() {
      ArrayList<PlayingCard> flushHand = new ArrayList<>();
      flushHand.add(new PlayingCard('H', 2));
      flushHand.add(new PlayingCard('H', 5));
      flushHand.add(new PlayingCard('H', 8));
      playerHand = new PlayerHand(flushHand);
      assertTrue(playerHand.checkFlush());
  }

  @Test
  void testNonFlushHand() {
      ArrayList<PlayingCard> mixedHand = new ArrayList<>();
      mixedHand.add(new PlayingCard('H', 2));
      mixedHand.add(new PlayingCard('D', 5));
      mixedHand.add(new PlayingCard('S', 8));
      playerHand = new PlayerHand(mixedHand);
      assertFalse(playerHand.checkFlush());
  }
}
