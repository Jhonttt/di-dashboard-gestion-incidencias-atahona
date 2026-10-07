package es.ies.incidencias;

import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        System.out.println("Hola mundo!");
    }

    public static void main(String[] args) {
        launch();
    }
}