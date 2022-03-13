package com.example.hellofx.controllers;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerScene5 extends GeneralControllerMethods implements Initializable {

    @FXML
    private AnchorPane scene5;

    @FXML
    private ColorPicker myColoPicker;

    @FXML
    private Label myLabel, brandLabel, tempLabel;

    @FXML
    private ChoiceBox<String> myChoice;

    private String[] brands = {"Ford","Toyota","Opel","BMW"};

    @FXML
    private Slider vertSlider;

    private int temperature;

    /**
     * Returns the user to the 4th scene
     *
     * @param event the event from the button
     */
    @FXML
    public void onBackButtonClick(ActionEvent event) {
        String fxmlPath = "/com/example/hellofx/fxml/scene4.fxml";
        initialiseStage(event, fxmlPath);
        stage.setTitle("RadioButton Action - DatePicker");
    }

    /**
     * Gets the user to the 6th scene
     *
     * @param event the event from the button
     */
    @FXML
    public void onNextButtonClick(ActionEvent event) {
        String fxmlPath = "/com/example/hellofx/fxml/scene6.fxml";
        initialiseStage(event, fxmlPath);
        stage.setTitle("ProgressBar - Spinner");
    }

    /**
     * Logout the user and terminates the program after confirmation
     */
    @FXML
    public void onLogoutButtonClick() {
        logout(scene5);
    }

    @FXML
    public void changeColor() {
        Color myColor = myColoPicker.getValue();
        myLabel.setTextFill(myColor);
        brandLabel.setTextFill(myColor);
        tempLabel.setTextFill(myColor);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        myChoice.getItems().addAll(brands);
        myChoice.setOnAction(this::getBrand);

        vertSlider.valueProperty().addListener((observableValue, number, t1) -> {
            temperature = (int) vertSlider.getValue();
            tempLabel.setText("Temperature: " + temperature + "°C");
        });
    }

    @FXML
    public void getBrand(ActionEvent event) {
        String brand = myChoice.getValue();
        brandLabel.setText(brand);
    }
}
