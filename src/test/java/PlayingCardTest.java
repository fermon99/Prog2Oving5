import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.fer.PlayingCard;

class PlayingCardTest {

    @Test
    void testPlayingCardCreation() {
        PlayingCard card = new PlayingCard('H', 5);
        assertEquals('H', card.getSuit());
        assertEquals(5, card.getFace());
    }
}