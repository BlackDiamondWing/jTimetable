package de.bremen.jTimetable.gui;

import de.bremen.jTimetable.classes.DatabaseConnector;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
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

    /**
     * Variables.
     */
    private DatabaseConnector dbConnector;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        mnbtn_selectTimetableFor.setDisable(true);
        lbl_selectTimetableFor.setDisable(true);
        dtpckr_selectDateForTimetable.setDisable(true);
        btn_showTimetable.setDisable(true);
        lbl_mistakeMessage.setDisable(true);
        this.dbConnector = new DatabaseConnector();
    }

    @FXML
    private void handle_showTimetable(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Timetable.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Stundenplan");
        //TODO Datum auswerten, richtigen Stundenplan anzeigen (in dessen initialise? oder doch zusammen in controller?)
        // Methode, die Daten übergibt?
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

    @FXML
    private void handle_typeOfObject(ActionEvent actionEvent) {
        //Find which label was clicked
        MenuItem clicked = (MenuItem) actionEvent.getSource();
        String clickedText = clicked.getText();

        //Write values into mnbtn_selectTimetableFor
        try (ResultSet selected = this.dbConnector.select(clickedText)) {
            //EventHandler for every MenuItem in the MenuButtonList
            EventHandler<MouseEvent> handle_selectTimeTableFor = mouseEvent -> {
                MenuItem mnI = (MenuItem) mouseEvent.getSource();
                String selectedText = mnI.getText();
                //enable next step in selecting the timetable
                lbl_selectTimetableFor.setText(selectedText);
                dtpckr_selectDateForTimetable.setDisable(false);
                btn_showTimetable.setDisable(false);
            };
            //You access the values of a ResultSet through a cursor which is initially positioned before the first row
            // in the ResultSet. With the method rs.next the cursor moved to the next row. If the cursor is placed
            // after the last row rs.next returns false.
            while (selected.next()) {
                MenuItem mnI = new MenuItem();
                //gets the value from the current row at the column named caption
                mnI.setText(selected.getString("CAPTION"));
                //add eventHandler
                mnI.addEventHandler(MouseEvent.MOUSE_CLICKED, handle_selectTimeTableFor);
                mnbtn_selectTimetableFor.getItems().add(mnI);
            }
        } catch (SQLException e) {
            System.err.println("Das ResultSet in handle_typeOfObject konnte nicht richtig verarbeitet werden.");
            e.printStackTrace();
        }

        //enable next step in selecting the timetable
        mnbtn_selectTimetableFor.setDisable(false);
        lbl_selectTimetableFor.setDisable(false);
        lbl_selectTimetableFor.setText(clickedText);
    }
}
