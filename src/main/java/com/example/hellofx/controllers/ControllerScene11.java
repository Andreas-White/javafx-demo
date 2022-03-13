package com.example.hellofx.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class ControllerScene11 extends GeneralControllerMethods{

    @FXML
    private AnchorPane scene11;

    /**
     * Returns the user to the 7th scene
     *
     * @param event the event from the button
     */
    @FXML
    public void onBackButtonClick(ActionEvent event) {
        String fxmlPath = "/com/example/hellofx/fxml/scene10.fxml";
        initialiseStage(event, fxmlPath);
        stage.setTitle("GridPane");
    }

    /**
     * Gets the user to the 9th scene
     *
     * @param event the event from the button
     */
    @FXML
    public void onNextButtonClick(ActionEvent event) {
        String fxmlPath = "/com/example/hellofx/fxml/scene12.fxml";
        initialiseStage(event, fxmlPath);
        stage.setTitle("Animations");
    }

    /**
     * Logout the user and terminates the program after confirmation
     */
    @FXML
    public void onLogoutButtonClick() {
        logout(scene11);
    }

    public void getKeyPressed() {
        Scene scene = stage.getScene();
        scene.setOnKeyPressed((event) -> System.out.println(event.getCode()));
    }
}
