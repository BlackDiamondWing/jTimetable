package de.bremen.jTimetable.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MenuController implements Initializable {

    /**
     * Container.
     */

    /**
     * DatePicker.
     */
    @FXML
    public DatePicker dtpckr_selectDateForTimetable;

    /**
     * Buttons.
     */
    @FXML
    private Button btn_switchToSettings;
    @FXML
    private Button btn_showTimetable;
    @FXML
    public MenuButton mnbtn_selectTimetableFor;
    @FXML
    public MenuButton mnbtn_typeOfObject;

    /**
     * Labels.
     */
    @FXML
    public Label lbl_selectTimetableFor;
    @FXML
    public Label lbl_typeOfObject;
    @FXML
    public Label lbl_mistakeMessage;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        mnbtn_selectTimetableFor.setDisable(true);
        lbl_selectTimetableFor.setDisable(true);
        dtpckr_selectDateForTimetable.setDisable(true);
        btn_showTimetable.setDisable(true);
        lbl_mistakeMessage.setDisable(true);
    }

    @FXML
    private void handle_showTimetable(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Timetable.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Stundenplan");
        //TODO Datum auswerten, richtigen Stundenplan anzeigen (in dessen initialise? oder doch zusammen in controller?)
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void handle_switchToSettings(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Settings.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Einstellungen");
        stage.setScene(scene);
        stage.show();
    }

    public void handle_typeOfObject(ActionEvent actionEvent) {
        //Lade alle Möglichen Objektarten: Raum, Dozent, Verbindungsobjekt zwischen Lehrgang und Studienabschnitt
        //Schreibe die ausgewählte Objektart ins Label
        //enable nächsten abschnitt
    }

    public void handle_selectTimetableFor(ActionEvent actionEvent) {
    }
}
