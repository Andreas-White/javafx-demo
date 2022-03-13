package com.example.hellofx.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.net.URL;

public class ControllerScene3 extends GeneralControllerMethods {

    @FXML
    private AnchorPane scene3;

    @FXML
    private CheckBox myCheckBox;

    @FXML
    private Label myLabel;

    @FXML
    private ImageView myImageView;

    /**
     * Returns the user to the 2nd scene
     *
     * @param event the event from the button
     */
    @FXML
    public void onBackButtonClick(ActionEvent event) {
        String fxmlPath = "/com/example/hellofx/fxml/scene2.fxml";
        initialiseStage(event, fxmlPath);
        stage.setTitle("Button Action");
    }

    /**
     * Gets the user to the 4th scene
     *
     * @param event the event from the button
     */
    @FXML
    public void onNextButtonClick(ActionEvent event) {
        String fxmlPath = "/com/example/hellofx/fxml/scene4.fxml";
        initialiseStage(event, fxmlPath);
        stage.setTitle("RadioButton Action - DatePicker");
    }

    /**
     * Logout the user and terminates the program after confirmation
     */
    @FXML
    public void onLogoutButtonClick() {
        logout(scene3);
    }

    @FXML
    public void change() {
        URL imgLocation1 = getClass().getResource("/com/example/hellofx/images/off.jpg");
        Image image1 = new Image(String.valueOf(imgLocation1));

        URL imgLocation2 = getClass().getResource("/com/example/hellofx/images/on.jpg");
        Image image2 = new Image(String.valueOf(imgLocation2));

        if (myCheckBox.isSelected()) {
            myImageView.setImage(image2);
            myLabel.setText("ON");
        }else {
            myImageView.setImage(image1);
            myLabel.setText("OFF");
        }
    }
}
