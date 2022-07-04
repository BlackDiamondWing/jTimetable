package de.bremen.jTimetable.classes;

import java.time.LocalDate;

/**
 *
 */
public class CourseOfStudy extends GeneralValue {

    /**
     *
     */
    LocalDate begin;
    /**
     *
     */
    LocalDate end;

    /**
     *
     * @param caption
     * @param id
     * @param active
     */
    public CourseOfStudy(String caption, int id, boolean active) {
        super(caption, id, active);
    }
}
