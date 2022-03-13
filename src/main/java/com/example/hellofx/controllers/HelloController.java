package com.example.hellofx.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;

public class HelloController {
    @FXML
    private TextField userNameField;

    @FXML
    private PasswordField passwordField;

    private final String USERNAME = "Tony";
    private final String PASSWORD = "123456";

    @FXML
    public void onLoginButtonClick(ActionEvent event) {

        try {
            if (userNameField.getText().equals(USERNAME) && passwordField.getText().equals(PASSWORD))
                login(event);
                // Not a good security practice. Never provide information of wrong user credentials
            else {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Login");
                if (!userNameField.getText().equals(USERNAME) && !passwordField.getText().equals(PASSWORD)) {
                    alert.setHeaderText("Wrong Username and Password");
                    alert.setContentText("You provided wrong username and password");
                } else if (!userNameField.getText().equals(USERNAME)) {
                    alert.setHeaderText("Wrong Username");
                    alert.setContentText("You provided wrong username");
                } else if (!passwordField.getText().equals(PASSWORD)) {
                    alert.setHeaderText("Wrong Password");
                    alert.setContentText("You provided wrong password");
                }

                alert.showAndWait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void login(ActionEvent event) {
        try {
            URL fxmlLocation = getClass().getResource("/com/example/hellofx/fxml/scene2.fxml");
            String cssLocation = Objects.requireNonNull(getClass().getResource("/com/example/hellofx/css/style.css")).toExternalForm();

            String username = userNameField.getText();

            assert fxmlLocation != null;
            FXMLLoader fxmlLoader = new FXMLLoader(fxmlLocation);

            Parent root = fxmlLoader.load();

            ControllerScene2 controllerScene2 = fxmlLoader.getController();
            controllerScene2.displayName(username);

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setTitle("Button Action");
            Scene scene = new Scene(root);
            scene.getStylesheets().add(cssLocation);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}