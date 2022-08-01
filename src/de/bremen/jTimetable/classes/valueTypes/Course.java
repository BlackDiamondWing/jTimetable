package de.bremen.jTimetable.classes.valueTypes;

import java.time.LocalDate;

/**
 * Sub-class of GeneralValue that represents a course (class) that can attend subjects for a certain time period.
 */
public class Course extends GeneralValueWithDate {

    /**
     * Constructor.
     *
     * @param id       this.id
     * @param caption  this.caption
     * @param active   this.active
     * @param startDay this.startDay
     * @param endDay   this.endDay
     */
    public Course(int id, String caption, boolean active, LocalDate startDay, LocalDate endDay) {
        super(id, caption, active, startDay, endDay);
    }
}
