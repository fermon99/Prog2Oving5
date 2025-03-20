import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.fer.CardGame;

class CardGameTest {

  private CardGame cardGame;

  @Test
  void testDealHand() {
    cardGame = new CardGame();
    cardGame.initialize();

    cardGame.dealHand(5);
    assertEquals(5, cardGame.getHand().size());
  }
}
