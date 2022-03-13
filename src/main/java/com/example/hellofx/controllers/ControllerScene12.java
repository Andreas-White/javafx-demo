package com.example.hellofx.controllers;

import javafx.animation.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerScene12 extends GeneralControllerMethods implements Initializable {

    @FXML
    private AnchorPane scene12;

    @FXML
    private ImageView myImageView;

    /**
     * Returns the user to the 7th scene
     *
     * @param event the event from the button
     */
    @FXML
    public void onBackButtonClick(ActionEvent event) {
        String fxmlPath = "/com/example/hellofx/fxml/scene11.fxml";
        initialiseStage(event, fxmlPath);
        stage.setTitle("KeyEvent");
    }

    /**
     * Gets the user to the 9th scene
     *
     * @param event the event from the button
     */
    @FXML
    public void onNextButtonClick(ActionEvent event) {
        String fxmlPath = "/com/example/hellofx/fxml/scene13.fxml";
        initialiseStage(event, fxmlPath);
        stage.setTitle("MediaView");
    }

    /**
     * Logout the user and terminates the program after confirmation
     */
    @FXML
    public void onLogoutButtonClick() {
        logout(scene12);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        URL imgLocation1 = getClass().getResource("/com/example/hellofx/images/shape.png");
        Image image = new Image(String.valueOf(imgLocation1));

        myImageView.setImage(image);

        // translate
        myImageView.setX(-200);
        myImageView.setY(110);
        TranslateTransition translateTransition = new TranslateTransition();
        translateTransition.setNode(myImageView);
        translateTransition.setDuration(Duration.millis(1000));
        translateTransition.setCycleCount(TranslateTransition.INDEFINITE);
        translateTransition.setByX(450);
        translateTransition.setByY(-250);
        translateTransition.setAutoReverse(true);
        translateTransition.play();

        // rotate
        RotateTransition rotateTransition = new RotateTransition();
        rotateTransition.setNode(myImageView);
        rotateTransition.setDuration(Duration.millis(1000));
        rotateTransition.setCycleCount(TranslateTransition.INDEFINITE);
        rotateTransition.setInterpolator(Interpolator.LINEAR);
        rotateTransition.setByAngle(360);
//        rotateTransition.setAxis(Rotate.X_AXIS);  // Rotate on X axis
//        rotateTransition.setAxis(Rotate.Y_AXIS);  // Rotate on Y axis
        // rotateTransition.setAutoReverse(true); // if you want to reverse the animation
        rotateTransition.play();

        // fade
        FadeTransition fadeTransition = new FadeTransition();
        fadeTransition.setNode(myImageView);
        fadeTransition.setDuration(Duration.millis(1000));
        fadeTransition.setCycleCount(TranslateTransition.INDEFINITE);
        fadeTransition.setInterpolator(Interpolator.LINEAR);
        fadeTransition.setFromValue(1);
        fadeTransition.setToValue(0.3);
        fadeTransition.play();

        // scale
        ScaleTransition scaleTransition = new ScaleTransition();
        scaleTransition.setNode(myImageView);
        scaleTransition.setDuration(Duration.millis(1000));
        scaleTransition.setCycleCount(TranslateTransition.INDEFINITE);
        scaleTransition.setInterpolator(Interpolator.LINEAR);
        scaleTransition.setByX(1.5);
        scaleTransition.setByY(1.5);
        scaleTransition.setAutoReverse(true);
        scaleTransition.play();
    }
}
