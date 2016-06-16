package de.hhu.propra16;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Tobias Witt on 06.06.16.
 */
public class FiveButtonsController {
    public Label dateLabel;

    public void showDate(ActionEvent actionEvent) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date now = new Date();
        String dateString = sdf.format(now);

        dateLabel.setText(dateString);
    }
}
