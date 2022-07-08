package de.bremen.jTimetable.classes;

/**
 * This class handles the logic of the timetable program. It offers methods to make database
 * queries and handles the results.
 */
public class logic {

    /**
     * Connection to the gui.
     */
    private final GUIConnector gui;

    /**
     *
     */
    private final DatabaseConnector databaseConnector;

    /**
     * Constructor.
     * @param gui connection to the gui
     */
    public logic(GUIConnector gui) {
        this.gui = gui;
        this.databaseConnector = new DatabaseConnector();
    }
}
