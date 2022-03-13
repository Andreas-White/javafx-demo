package com.example.hellofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        URL imgLocation = getClass().getResource("/com/example/hellofx/images/icon.jpg");
        Image icon = new Image(String.valueOf(imgLocation));

        String cssLocation = Objects.requireNonNull(getClass().getResource("/com/example/hellofx/css/style.css")).toExternalForm();


        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        scene.getStylesheets().add(cssLocation);
        stage.setTitle("Login");
        stage.getIcons().add(icon);
        stage.setScene(scene);
        stage.show();

        // If the user press the X button or Alt+F4 in order to close the program
        stage.setOnCloseRequest(windowEvent -> {
            windowEvent.consume(); // It consumes the event in case the user presses CANCEL
            logout(stage);
        });
    }

    /**
     * Prompts the user to confirm in order to terminate the program
     * @param stage the stage to be closed
     */
    public void logout(Stage stage) {
        try {

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Logout");
            alert.setHeaderText("You are about to logout");
            alert.setContentText("Do you want to save before exiting");

            if (alert.showAndWait().get() == ButtonType.OK) {
                stage.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}