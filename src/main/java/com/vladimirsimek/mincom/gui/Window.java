package com.vladimirsimek.mincom.gui;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

import com.vladimirsimek.mincom.logic.StageManager;

public class Window extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        StageManager splash = new StageManager("/splash.fxml", 400, 500, primaryStage, false);
        splash.createScene();
    }
}
