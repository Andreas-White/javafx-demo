package com.example.hellofx.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;

public abstract class GeneralControllerMethods {

    Stage stage;

    @FXML
    private MenuItem menuItemLogin, menuItemScene2, menuItemScene3, menuItemScene4, menuItemScene5,
            menuItemScene6, menuItemScene7, menuItemScene8, menuItemScene9, menuItemScene10, menuItemScene11,
            menuItemScene12, menuItemScene13;

    public void initialiseStage(ActionEvent event, String fxmlPath ) {

        try {
            URL fxmlLocation = getClass().getResource(fxmlPath);
            String cssLocation = Objects.requireNonNull(getClass().getResource("/com/example/hellofx/css/style.css")).toExternalForm();

            assert fxmlLocation != null;
            Parent root = FXMLLoader.load(fxmlLocation);

            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            scene.getStylesheets().add(cssLocation);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void initialiseStageFromMenuItem(String fxmlPath, MenuItem menuItem) {

        try {
            URL fxmlLocation = getClass().getResource(fxmlPath);
            String cssLocation = Objects.requireNonNull(getClass().getResource("/com/example/hellofx/css/style.css")).toExternalForm();

            assert fxmlLocation != null;
            Parent root = FXMLLoader.load(fxmlLocation);

            stage = (Stage)menuItem.getParentPopup().getOwnerWindow();
            Scene scene = new Scene(root);
            scene.getStylesheets().add(cssLocation);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void logout(Pane scene) {
        try {

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Logout");
            alert.setHeaderText("You are about to logout");
            alert.setContentText("Do you want to save before exiting");

            if (alert.showAndWait().get() == ButtonType.OK) {
                stage = (Stage) scene.getScene().getWindow();
                stage.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void getToLogin() {
        String fxmlPath = "/com/example/hellofx/hello-view.fxml";
        initialiseStageFromMenuItem(fxmlPath, menuItemLogin);
    }

    @FXML
    public void getToScene2() {
        String fxmlPath = "/com/example/hellofx/fxml/scene2.fxml";
        initialiseStageFromMenuItem(fxmlPath, menuItemScene2);
    }

    @FXML
    public void getToScene3() {
        String fxmlPath = "/com/example/hellofx/fxml/scene3.fxml";
        initialiseStageFromMenuItem(fxmlPath, menuItemScene3);
    }

    @FXML
    public void getToScene4() {
        String fxmlPath = "/com/example/hellofx/fxml/scene4.fxml";
        initialiseStageFromMenuItem(fxmlPath, menuItemScene4);
    }

    @FXML
    public void getToScene5() {
        String fxmlPath = "/com/example/hellofx/fxml/scene5.fxml";
        initialiseStageFromMenuItem(fxmlPath, menuItemScene5);
    }

    @FXML
    public void getToScene6() {
        String fxmlPath = "/com/example/hellofx/fxml/scene6.fxml";
        initialiseStageFromMenuItem(fxmlPath, menuItemScene6);
    }

    @FXML
    public void getToScene7() {
        String fxmlPath = "/com/example/hellofx/fxml/scene7.fxml";
        initialiseStageFromMenuItem(fxmlPath, menuItemScene7);
    }

    @FXML
    public void getToScene8() {
        String fxmlPath = "/com/example/hellofx/fxml/scene8.fxml";
        initialiseStageFromMenuItem(fxmlPath, menuItemScene8);
    }

    @FXML
    public void getToScene9() {
        String fxmlPath = "/com/example/hellofx/fxml/scene9.fxml";
        initialiseStageFromMenuItem(fxmlPath, menuItemScene9);
    }

    @FXML
    public void getToScene10() {
        String fxmlPath = "/com/example/hellofx/fxml/scene10.fxml";
        initialiseStageFromMenuItem(fxmlPath, menuItemScene10);
    }

    @FXML
    public void getToScene11() {
        String fxmlPath = "/com/example/hellofx/fxml/scene11.fxml";
        initialiseStageFromMenuItem(fxmlPath, menuItemScene11);
    }

    @FXML
    public void getToScene12() {
        String fxmlPath = "/com/example/hellofx/fxml/scene12.fxml";
        initialiseStageFromMenuItem(fxmlPath, menuItemScene12);
    }

    @FXML
    public void getToScene13() {
        String fxmlPath = "/com/example/hellofx/fxml/scene13.fxml";
        initialiseStageFromMenuItem(fxmlPath, menuItemScene13);
    }
}
