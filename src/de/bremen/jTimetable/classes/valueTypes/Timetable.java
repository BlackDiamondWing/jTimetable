package de.bremen.jTimetable.classes.valueTypes;

import java.time.LocalDate;

/**
 * TODO weitere Parameter prüfen
 */
public class Timetable extends GeneralValueWithDate {

    /**
     * Constructor.
     *
     * @param id       this.id
     * @param caption  this.caption
     * @param active   this.active
     * @param startDay this.startDay
     * @param endDay   this.endDay
     */
    public Timetable(int id, String caption, boolean active, LocalDate startDay, LocalDate endDay) {
        super(id, caption, active, startDay, endDay);
    }
}
