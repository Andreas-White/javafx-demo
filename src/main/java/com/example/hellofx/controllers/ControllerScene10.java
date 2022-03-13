package com.example.hellofx.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

public class ControllerScene10 extends GeneralControllerMethods{

    @FXML
    private AnchorPane scene10;

    /**
     * Returns the user to the 7th scene
     *
     * @param event the event from the button
     */
    @FXML
    public void onBackButtonClick(ActionEvent event) {
        String fxmlPath = "/com/example/hellofx/fxml/scene9.fxml";
        initialiseStage(event, fxmlPath);
        stage.setTitle("FlowPane");
    }

    /**
     * Gets the user to the 9th scene
     *
     * @param event the event from the button
     */
    @FXML
    public void onNextButtonClick(ActionEvent event) {
        String fxmlPath = "/com/example/hellofx/fxml/scene11.fxml";
        initialiseStage(event, fxmlPath);
        stage.setTitle("KeyEvent");
    }

    /**
     * Logout the user and terminates the program after confirmation
     */
    @FXML
    public void onLogoutButtonClick() {
        logout(scene10);
    }
}
