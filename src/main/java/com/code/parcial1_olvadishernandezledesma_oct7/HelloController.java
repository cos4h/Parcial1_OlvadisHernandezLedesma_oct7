package com.code.parcial1_olvadishernandezledesma_oct7;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
  @FXML
  private Label welcomeText;

  @FXML
  protected void onHelloButtonClick() {
    welcomeText.setText("Welcome to JavaFX Application!");
  }
}