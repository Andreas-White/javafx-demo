package com.example.hellofx.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.net.URL;

public class ControllerScene2 extends GeneralControllerMethods {

    @FXML
    private Label nameLabel;

    @FXML
    private AnchorPane scene2;

    @FXML
    private ImageView imgView;

    private int count = 1;

    @FXML
    public void displayName(String username) {
        nameLabel.setText("Hello: " + username);
    }

    /**
     * Returns the user to the initial scene
     *
     * @param event the event from the button
     */
    @FXML
    public void onBackButtonClick(ActionEvent event) {
        String fxmlPath = "/com/example/hellofx/hello-view.fxml";
        initialiseStage(event, fxmlPath);
        stage.setTitle("Login");
    }

    /**
     * Logout the user and terminates the program after confirmation
     */
    @FXML
    public void onLogoutButtonClick() {
        logout(scene2);
    }

    /**
     * Changes the image inside the imageView element in scene 2
     */
    public void displayImage() {
        URL imgLocation1 = getClass().getResource("/com/example/hellofx/images/random.jpg");
        Image image1 = new Image(String.valueOf(imgLocation1));

        URL imgLocation2 = getClass().getResource("/com/example/hellofx/images/random2.jpg");
        Image image2 = new Image(String.valueOf(imgLocation2));

        Image[] images = new Image[2];
        images[0] = image1;
        images[1] = image2;

        imgView.setImage(images[count % 2]);
        count++;
    }

    /**
     * Gets the user to the 3rd scene
     *
     * @param event the event from the button
     */
    @FXML
    public void onNextButtonClick(ActionEvent event) {
        String fxmlPath = "/com/example/hellofx/fxml/scene3.fxml";
        initialiseStage(event, fxmlPath);
        stage.setTitle("CheckBox Action");
    }
}