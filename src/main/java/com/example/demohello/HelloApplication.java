package com.example.demohello;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ResourceBundle;

import static com.example.demohello.Utils.t;

public class HelloApplication extends Application {

    private ResourceBundle bundle = Utils.t();

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
                HelloApplication.class.getResource("hello-view.fxml"),
                bundle);

        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle( t("Hello") );
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
