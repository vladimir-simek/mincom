package com.vladimirsimek.mincom.logic;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class StageManager {
    private final Scene scene;
    private final Stage stage;
    private final boolean isResizable;

    public StageManager(String root, int sceneWidth, int sceneHeight, Stage stage, boolean isResizable) throws IOException {
        Parent root1 = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(root)));
        this.scene = new Scene(root1, sceneWidth, sceneHeight);
        this.stage = stage;
        this.isResizable = isResizable;
    }

    public void createScene() {
        stage.setScene(scene);
        stage.setResizable(isResizable);
        stage.show();

    }
}
