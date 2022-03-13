package com.example.hellofx.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.AnchorPane;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ControllerScene4 extends GeneralControllerMethods{

    @FXML
    private AnchorPane scene4;

    @FXML
    private Label displayLabel;

    @FXML
    private RadioButton radioBtn1, radioBtn2, radioBtn3;

    @FXML
    private DatePicker myDatePicker;

    /**
     * Changes the displayed label according to the radio button
     */
    public void getProgram() {

        if (radioBtn1.isSelected()) {
            displayLabel.setText("You chose Software Technology");
        }else if (radioBtn2.isSelected()) {
            displayLabel.setText("You chose Network Security");
        }else if (radioBtn3.isSelected()) {
            displayLabel.setText("You chose another program");
        }else
            displayLabel.setText("You chose nothing");
    }

    /**
     * Attaches a Date as a String to the displayed label
     */
    public void getDate() {
        LocalDate localDate = myDatePicker.getValue();
        String dateFormatted = localDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        if (displayLabel.getText().length() > 30 && displayLabel.getText().substring(10).startsWith("S"))
            displayLabel.setText(displayLabel.getText().substring(0,29) + " in " + dateFormatted);
        else if (displayLabel.getText().length() > 30 && displayLabel.getText().substring(10).startsWith("N"))
            displayLabel.setText(displayLabel.getText().substring(0,26) + " in " + dateFormatted);
        else if (displayLabel.getText().length() > 30 && displayLabel.getText().substring(10).startsWith("a"))
            displayLabel.setText(displayLabel.getText().substring(0,25) + " in " + dateFormatted);
        else
            displayLabel.setText(displayLabel.getText() + " in " + dateFormatted);
    }

    /**
     * Returns the user to the 3rd scene
     *
     * @param event the event from the button
     */
    @FXML
    public void onBackButtonClick(ActionEvent event) {
        String fxmlPath = "/com/example/hellofx/fxml/scene3.fxml";
        initialiseStage(event, fxmlPath);
        stage.setTitle("CheckBox Action");
    }

    /**
     * Gets the user to the 5th scene
     *
     * @param event the event from the button
     */
    @FXML
    public void onNextButtonClick(ActionEvent event) {
        String fxmlPath = "/com/example/hellofx/fxml/scene5.fxml";
        initialiseStage(event, fxmlPath);
        stage.setTitle("ColorPicker - ChoiceBox - Slider");
    }

    /**
     * Logout the user and terminates the program after confirmation
     */
    @FXML
    public void onLogoutButtonClick() {
        logout(scene4);
    }
}
