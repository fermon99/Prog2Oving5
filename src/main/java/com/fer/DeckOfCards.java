package com.fer;

import java.util.ArrayList;
import java.util.Random;

public class DeckOfCards {

  private final char[] suit = {'S', 'H', 'D', 'C'};

  private final ArrayList<PlayingCard> deck;

  public DeckOfCards() {
    deck = new ArrayList<>();
    for (int i = 0; i < suit.length; i++) {
      for (int j = 0; j < 13; j++) {
          PlayingCard playingCard = new PlayingCard(suit[i], j+1);
          deck.add(playingCard);
      }
    }   
  }

  public ArrayList<PlayingCard> dealHand(int handSize) {
    ArrayList<PlayingCard> hand = new ArrayList<>();
    for (int i = 0; i < handSize; i++) {
        int rng = new Random().nextInt(getDeck().size());
        PlayingCard playingCard = deck.remove(rng);
        hand.add(playingCard);
    }
    return hand;
  }

  public ArrayList<PlayingCard> getDeck() {
    return deck;
  }
}
