package com.vladimirsimek.mincom.logic.cont;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class MainMenuCont {

    public MenuItem create;
    public MenuItem open;
    public MenuItem close;
    public MenuItem save;
    public MenuItem settings;
    public MenuItem quit;
    public MenuItem githubMincom;
    public MenuItem aboutMincom;
    public Label sceneProp;

    public Stage stage;

    public Stage getStage(Label sceneProp) {
        return (Stage) sceneProp.getScene().getWindow();
    }

    public void createPresentation(ActionEvent actionEvent) {

    }

    public void openPresentation(ActionEvent actionEvent) {
    }

    public void closePresentation(ActionEvent actionEvent) {
    }

    public void savePresentation(ActionEvent actionEvent) {
    }

    public void openSettings(ActionEvent actionEvent) {
    }

    public void quitMincom(ActionEvent actionEvent) {
        MenuBarCont.quitMincom();
    }

    public void openMincomWebsite(ActionEvent actionEvent) {
    }

    public void openMincomGithub(ActionEvent actionEvent) {
    }
}
