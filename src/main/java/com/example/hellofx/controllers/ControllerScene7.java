package com.example.hellofx.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerScene7 extends GeneralControllerMethods implements Initializable {

    @FXML
    private Label myLabel;

    @FXML
    private ListView<String> myListView;

    @FXML
    private AnchorPane scene7;

    private String[] foods = {"Pizza", "Pasta", "Sushi", "Burger", "Tortillas"};
    private String currentFood;

    /**
     * Returns the user to the 4th scene
     *
     * @param event the event from the button
     */
    @FXML
    public void onBackButtonClick(ActionEvent event) {
        String fxmlPath = "/com/example/hellofx/fxml/scene6.fxml";
        initialiseStage(event, fxmlPath);
        stage.setTitle("ProgressBar - Spinner");
    }

    /**
     * Gets the user to the 6th scene
     *
     * @param event the event from the button
     */
    @FXML
    public void onNextButtonClick(ActionEvent event) {
        String fxmlPath = "/com/example/hellofx/fxml/scene8.fxml";
        initialiseStage(event, fxmlPath);
        stage.setTitle("TreeView");
    }

    /**
     * Logout the user and terminates the program after confirmation
     */
    @FXML
    public void onLogoutButtonClick() {
        logout(scene7);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        myListView.getItems().addAll(foods);

        myListView.getSelectionModel().selectedItemProperty().addListener((observableValue, string, t1) -> {
            currentFood = myListView.getSelectionModel().getSelectedItem();
            myLabel.setText(currentFood);
        });
    }
}
