package de.bremen.jTimetable.classes;

import de.bremen.jTimetable.classes.valueTypes.GeneralValue;

public interface GUIConnector {

    /**
     *
     * @param table
     * @param value
     */
    void changeValueInTable(String table, GeneralValue value);
}
