package com.vladimirsimek.mincom.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

import com.vladimirsimek.mincom.logic.StageInit;

public class Window extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException, InterruptedException {
        StageInit splash = new StageInit("/splash.fxml", 400, 500, primaryStage, false, true);
        splash.createScene();
    }
}
