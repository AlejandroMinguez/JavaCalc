package com.example.calculadoracompleja;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class calculadoraCompleja extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(calculadoraCompleja.class.getResource("calculadoraCompleja-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 343, 491);
        stage.setTitle("Calculadora Compleja!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}