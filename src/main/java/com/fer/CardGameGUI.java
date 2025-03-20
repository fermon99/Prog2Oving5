package com.fer;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CardGameGUI extends Application {

    private final javafx.scene.control.Label handLabel = new Label("Hand: ");
    private final javafx.scene.control.Label checkHandLabel = new Label("Checked: ");
    private final javafx.scene.control.Label sumLabel = new Label("Sum: ");

    private final CardGame cardGame = new CardGame();
    
    @Override
    public void start(Stage primaryStage) {
        cardGame.initialize();

        // Buttons
        Button dealButton = new Button("Deal Hand");
        Button checkButton = new Button("Check Hand");
        Button sumButton = new Button("Sum Hand");

        dealButton.setOnAction(e -> dealHand());
        checkButton.setOnAction(e -> checkHand());
        sumButton.setOnAction(e -> checkHandSum());

        // Interface
        VBox layout = new VBox(10, handLabel, checkHandLabel, sumLabel, dealButton, checkButton, sumButton);
        layout.setStyle("-fx-padding: 20px; -fx-alignment: center;");

        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Card Game");
        primaryStage.show();
    }

    private void dealHand() {
      cardGame.dealHand(5);
      handLabel.setText("Hand: " + cardGame.getHandAsString());
    }

    private void checkHand() {
      String result = cardGame.checkHand();
      checkHandLabel.setText("Checked: " + result);
    }

    private void checkHandSum() {
      int sum = cardGame.checkHandSum();
      sumLabel.setText("Sum: " + sum);
    }

    public static void main(String[] args) {
        launch(args);
    }

  }