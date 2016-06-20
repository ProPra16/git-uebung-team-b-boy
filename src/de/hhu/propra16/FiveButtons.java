package de.hhu.propra16;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Created by Tobias Witt on 06.06.16.
 */
public class FiveButtons extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/five_buttons" +
                ".fxml"));
        primaryStage.setTitle("Five Buttons");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }
}
