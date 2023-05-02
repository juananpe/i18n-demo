package com.example.demohello;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.ResourceBundle;
import static com.example.demohello.Utils.t;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private ResourceBundle bundle;


    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText(t().getString("Welcome"));
    }
}
