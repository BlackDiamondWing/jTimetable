package de.bremen.jTimetable.Classes;

import java.sql.Statement;

public interface GUIConnector {

    /**
     *
     * @param table
     * @param value
     */
    void changeValueInTable(String table, GeneralValue value);
}
