package de.hhu.propra16;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * Created by Tobias Witt on 06.06.16.
 */
public class FiveButtons extends Application {
    public Button TooManyButtons=new Button("Button a)");


    public static void main(String[] args) {
        launch(args);
    }

    public void setAlert() {
        TooManyButtons.setOnAction(event -> {
            Alert Warnung=new Alert(Alert.AlertType.ERROR);
            Warnung.setContentText("Too Many Buttons");
        });
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/five_buttons" +
                ".fxml"));
        root.getChildrenUnmodifiable().add(TooManyButtons);
        setAlert();
        primaryStage.setTitle("Five Buttons");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }
}
