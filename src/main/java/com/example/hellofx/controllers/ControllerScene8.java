package com.example.hellofx.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerScene8 extends GeneralControllerMethods implements Initializable {

    @FXML
    private Label myLabel;

    @FXML
    private AnchorPane scene8;

    @FXML
    private TreeView<String> myTreeView;

    /**
     * Returns the user to the 7th scene
     *
     * @param event the event from the button
     */
    @FXML
    public void onBackButtonClick(ActionEvent event) {
        String fxmlPath = "/com/example/hellofx/fxml/scene7.fxml";
        initialiseStage(event, fxmlPath);
        stage.setTitle("ListView");
    }

    /**
     * Gets the user to the 9th scene
     *
     * @param event the event from the button
     */
    @FXML
    public void onNextButtonClick(ActionEvent event) {
        String fxmlPath = "/com/example/hellofx/fxml/scene9.fxml";
        initialiseStage(event, fxmlPath);
        stage.setTitle("FlowPane");
    }

    /**
     * Logout the user and terminates the program after confirmation
     */
    @FXML
    public void onLogoutButtonClick() {
        logout(scene8);
    }

    public void selectItem() {
        TreeItem<String> item = myTreeView.getSelectionModel().getSelectedItem();

        if (item != null)
            myLabel.setText(item.getValue());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        URL imgLocation1 = getClass().getResource("/com/example/hellofx/images/folder.png");
        URL imgLocation2 = getClass().getResource("/com/example/hellofx/images/picture_folder.png");
        URL imgLocation3 = getClass().getResource("/com/example/hellofx/images/video_folder.png");
        URL imgLocation4 = getClass().getResource("/com/example/hellofx/images/music_folder.png");

        TreeItem<String> rootItem =
                new TreeItem<>("Documents", new ImageView(new Image(String.valueOf(imgLocation1))));

        TreeItem<String> picturesBranchItem = new TreeItem<>("Pictures", new ImageView(new Image(String.valueOf(imgLocation2))));
        TreeItem<String> videosBranchItem = new TreeItem<>("Videos", new ImageView(new Image(String.valueOf(imgLocation3))));
        TreeItem<String> musicBranchItem = new TreeItem<>("Music", new ImageView(new Image(String.valueOf(imgLocation4))));

        TreeItem<String> innerPicturesBranchItem1 = new TreeItem<>("2022", new ImageView(new Image(String.valueOf(imgLocation1))));
        TreeItem<String> innerPicturesBranchItem2 = new TreeItem<>("2021", new ImageView(new Image(String.valueOf(imgLocation1))));
        TreeItem<String> innerPicturesBranchItem3 = new TreeItem<>("2020", new ImageView(new Image(String.valueOf(imgLocation1))));

        TreeItem<String> innerVideosBranchItem1 = new TreeItem<>("Anime", new ImageView(new Image(String.valueOf(imgLocation1))));
        TreeItem<String> innerVideosBranchItem2 = new TreeItem<>("Movies", new ImageView(new Image(String.valueOf(imgLocation1))));
        TreeItem<String> innerVideosBranchItem3 = new TreeItem<>("Shorts", new ImageView(new Image(String.valueOf(imgLocation1))));

        TreeItem<String> innerMusicBranchItem1 = new TreeItem<>("Metal", new ImageView(new Image(String.valueOf(imgLocation1))));
        TreeItem<String> innerMusicBranchItem2 = new TreeItem<>("Rock n' Roll", new ImageView(new Image(String.valueOf(imgLocation1))));
        TreeItem<String> innerMusicBranchItem3 = new TreeItem<>("Hip-Hop", new ImageView(new Image(String.valueOf(imgLocation1))));

        picturesBranchItem.getChildren().addAll(innerPicturesBranchItem1, innerPicturesBranchItem2, innerPicturesBranchItem3);
        videosBranchItem.getChildren().addAll(innerVideosBranchItem1, innerVideosBranchItem2, innerVideosBranchItem3);
        musicBranchItem.getChildren().addAll(innerMusicBranchItem1, innerMusicBranchItem2, innerMusicBranchItem3);

        rootItem.getChildren().addAll(picturesBranchItem, videosBranchItem, musicBranchItem);

//        myTreeView.setShowRoot(false);    // for not showing the root
        myTreeView.setRoot(rootItem);
    }
}
