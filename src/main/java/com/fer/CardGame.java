package com.fer;

import java.util.ArrayList;

public class CardGame {

  private DeckOfCards deckOfCards;
  private PlayerHand playerHand;
  
  public CardGame() {

  }

  public void initialize() {
    deckOfCards = new DeckOfCards();
  }

  public void dealHand(int handSize) {
    playerHand = new PlayerHand(deckOfCards.dealHand(handSize));
  }

  public String checkHand() {
    if (playerHand.checkFlush() == true) {
      return "The player has a F L U S H !";
    } else {
      return "The player has nothing...";
    }
  }

  public int checkHandSum() {
    return playerHand.getSum();
  }

  public ArrayList<PlayingCard> getHand() {
    return playerHand.getHand();
  }

  public String getHandAsString() {
    return playerHand.getAsString();
  }
}
