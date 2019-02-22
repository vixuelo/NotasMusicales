package application;

import javafx.event.Event;
import java.io.File;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.event.ActionEvent;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Label infoLbl = new Label("Toca las teclas q,w,e,r,u,i,o,p para emitir sonidos");
			root.setCenter(infoLbl);
			Scene scene = new Scene(root, 400, 400);
			primaryStage.setScene(scene);
			primaryStage.show();
			scene.setOnKeyPressed(new EventHandler<KeyEvent>() {


				@Override
				public void handle(KeyEvent event) {
					switch (event.getCode()) {
					case Q:
						Media sound = new Media(new File("audio/do.wav").toURI().toString());
						MediaPlayer mediaPlayer = new MediaPlayer(sound);
						mediaPlayer.play();
						break;
					case W:
						sound = new Media(new File("audio/do8.wav").toURI().toString());
						mediaPlayer = new MediaPlayer(sound);
						mediaPlayer.play();
						break;
					case E:
						sound = new Media(new File("audio/fa.wav").toURI().toString());
						mediaPlayer = new MediaPlayer(sound);
						mediaPlayer.play();
						break;
					case R:
						sound = new Media(new File("audio/la.wav").toURI().toString());
						mediaPlayer = new MediaPlayer(sound);
						mediaPlayer.play();
						break;
					case U:
						sound = new Media(new File("audio/mi.wav").toURI().toString());
						mediaPlayer = new MediaPlayer(sound);
						mediaPlayer.play();
						break;
					case I:
						sound = new Media(new File("audio/re.wav").toURI().toString());
						mediaPlayer = new MediaPlayer(sound);
						mediaPlayer.play();
						break;
					case O:
						sound = new Media(new File("audio/si.wav").toURI().toString());
						mediaPlayer = new MediaPlayer(sound);
						mediaPlayer.play();
						break;
					case P:
						sound = new Media(new File("audio/sol.wav").toURI().toString());
						mediaPlayer = new MediaPlayer(sound);
						mediaPlayer.play();
						break;
					}

				}

			});

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
