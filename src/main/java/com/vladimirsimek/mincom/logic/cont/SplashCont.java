package com.vladimirsimek.mincom.logic.cont;

import com.vladimirsimek.mincom.logic.StageManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class SplashCont {

    @FXML
    public Button startApp;

    public void startApp(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) startApp.getScene().getWindow();
        StageManager mainMenu = new StageManager("/main_menu.fxml", 400, 500, stage, false);
        mainMenu.createScene();
    }
}
