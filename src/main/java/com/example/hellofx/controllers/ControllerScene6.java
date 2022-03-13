package com.example.hellofx.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerScene6 extends GeneralControllerMethods implements Initializable {

    @FXML
    private Spinner<Integer> mySpinner;

    @FXML
    private Label myLabel, spinnerLabel;

    @FXML
    private ProgressBar myProgressBar;

    @FXML
    private AnchorPane scene6;

    private double progress;
    private int currentValue;

    /**
     * Returns the user to the 4th scene
     *
     * @param event the event from the button
     */
    @FXML
    public void onBackButtonClick(ActionEvent event) {
        String fxmlPath = "/com/example/hellofx/fxml/scene5.fxml";
        initialiseStage(event, fxmlPath);
        stage.setTitle("ColorPicker - ChoiceBox - Slider");
    }

    /**
     * Gets the user to the 6th scene
     *
     * @param event the event from the button
     */
    @FXML
    public void onNextButtonClick(ActionEvent event) {
        String fxmlPath = "/com/example/hellofx/fxml/scene7.fxml";
        initialiseStage(event, fxmlPath);
        stage.setTitle("ListView");
    }

    /**
     * Logout the user and terminates the program after confirmation
     */
    @FXML
    public void onLogoutButtonClick() {
        logout(scene6);
    }

    public void increaseProgress() {
        progress += 0.1;
        BigDecimal bigDecimal = new BigDecimal(String.format("%.2f", progress));
        progress = bigDecimal.doubleValue();
        if (progress % 1.1 == 0.0)
            progress = 0.0;
        myProgressBar.setProgress(progress);

        myLabel.setText("Progress: " + ((int) (progress * 100) % 110) + "%");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//        myProgressBar.setStyle("-fx-accent: red;"); // if not specified in the css file

        SpinnerValueFactory<Integer> spinnerValueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1,10);
        spinnerValueFactory.setValue(1);
        mySpinner.setValueFactory(spinnerValueFactory);

        spinnerLabel.setText(String.valueOf(mySpinner.getValue()));
        mySpinner.valueProperty().addListener((observableValue, integer, t1) -> spinnerLabel.setText(String.valueOf(mySpinner.getValue())));
    }
}
