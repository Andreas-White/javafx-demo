package com.example.hellofx.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.FlowPane;

public class ControllerScene9 extends GeneralControllerMethods{

    @FXML
    private FlowPane scene9;

    /**
     * Returns the user to the 7th scene
     *
     * @param event the event from the button
     */
    @FXML
    public void onBackButtonClick(ActionEvent event) {
        String fxmlPath = "/com/example/hellofx/fxml/scene8.fxml";
        initialiseStage(event, fxmlPath);
        stage.setTitle("TreeView");
    }

    /**
     * Gets the user to the 9th scene
     *
     * @param event the event from the button
     */
    @FXML
    public void onNextButtonClick(ActionEvent event) {
        String fxmlPath = "/com/example/hellofx/fxml/scene10.fxml";
        initialiseStage(event, fxmlPath);
        stage.setTitle("GridPane");
    }

    /**
     * Logout the user and terminates the program after confirmation
     */
    @FXML
    public void onLogoutButtonClick() {
        logout(scene9);
    }

}
