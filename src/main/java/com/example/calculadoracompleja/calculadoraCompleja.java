package com.example.calculadoracompleja;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class calculadoraCompleja extends Application {
    private double xOffset = 0;
    private double yOffset = 0;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(calculadoraCompleja.class.getResource("calculadoraCompleja-view.fxml"));//Carga el archivo fxml
        Scene scene = new Scene(fxmlLoader.load(), 346, 487);
        stage.setTitle("Calculadora Compleja!");

        stage.setScene(scene);//Añade la escena a la ventana

        stage.setResizable(false); //Hace que la ventana no se pueda redimensionar
        stage.initStyle(StageStyle.UNDECORATED); // Desactiva el decorado de la ventana

        // Permitir mover la ventana arrastrándola desde cualquier punto
        scene.setOnMousePressed(event -> {
            xOffset = event.getSceneX();
            yOffset = event.getSceneY();
        });
        scene.setOnMouseDragged(event -> {
            stage.setX(event.getScreenX() - xOffset);
            stage.setY(event.getScreenY() - yOffset);
        });

        CalculadoraComplejaController controller = fxmlLoader.getController();
        controller.configureKeyInput(scene);

        Button igualButton = (Button) scene.lookup("#buttonIgual");
        if (igualButton != null) {
            igualButton.requestFocus();
        }

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}