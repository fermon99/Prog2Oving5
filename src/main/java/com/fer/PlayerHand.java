package com.fer;

import java.util.ArrayList;

public class PlayerHand {
  
  private ArrayList<PlayingCard> hand;
    
      public PlayerHand(ArrayList<PlayingCard> givenHand) {
        this.hand = new ArrayList<>();
        hand = givenHand;
  }

  public int getSum() {
    int sum = 0;
    for (PlayingCard card : hand) {
      sum += card.getFace();
    }
    return sum;
  }

  public boolean checkFlush() {
    int counter = 0;
    for (PlayingCard card : hand) {
      if (card.getSuit() == 'H' || card.getSuit() == 'D') {
        counter += 1;
      }
    }
    
    return counter == hand.size() || counter == 0;
  }

  public ArrayList<PlayingCard> getHand() {
    return hand;
  }

  public String getAsString() {
    StringBuilder handString = new StringBuilder();
    for (PlayingCard card : hand) {
        handString.append(card.getAsString()).append(" ");
    }
    return handString.toString().trim();
  }
}
