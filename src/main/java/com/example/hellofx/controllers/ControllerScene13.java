package com.example.hellofx.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerScene13 extends GeneralControllerMethods implements Initializable {

    @FXML
    private AnchorPane scene13;

    @FXML
    private MediaView myMediaView;

    @FXML
    private Button resetBtn, playBtn, pauseBtn;

    private File file;
    private Media media;
    private MediaPlayer mediaPlayer;

    /**
     * Returns the user to the 7th scene
     *
     * @param event the event from the button
     */
    @FXML
    public void onBackButtonClick(ActionEvent event) {
        String fxmlPath = "/com/example/hellofx/fxml/scene12.fxml";
        initialiseStage(event, fxmlPath);
        stage.setTitle("Animations");
    }

    /**
     * Logout the user and terminates the program after confirmation
     */
    @FXML
    public void onLogoutButtonClick() {
        logout(scene13);
    }

    public void onReset() {
        mediaPlayer.stop();
    }

    public void onPlay() {
        mediaPlayer.play();
    }

    public void onPause() {
        mediaPlayer.pause();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        try {
            URL mediaLocation = getClass().getResource("/com/example/hellofx/media/waves.mp4");
            System.out.println(mediaLocation.toString());
            file = new File(String.valueOf(mediaLocation));
            media = new Media(file.toURI().toASCIIString());
            mediaPlayer = new MediaPlayer(media);
            myMediaView.setMediaPlayer(mediaPlayer);

            media = new Media(file.toURI().toASCIIString());
            mediaPlayer = new MediaPlayer(media);
            myMediaView.setMediaPlayer(mediaPlayer);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
