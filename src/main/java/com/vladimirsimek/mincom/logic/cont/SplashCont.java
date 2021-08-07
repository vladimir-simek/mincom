package com.vladimirsimek.mincom.logic.cont;

import com.vladimirsimek.mincom.logic.StageInit;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class SplashCont {

    @FXML
    public Button startApp;

    public void startApp(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) startApp.getScene().getWindow();
        StageInit splash = new StageInit("/main_menu.fxml", 400, 500, stage, false, true);
        splash.createScene();

    }
}
