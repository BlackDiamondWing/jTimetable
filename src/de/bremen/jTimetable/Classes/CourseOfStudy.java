package de.bremen.jTimetable.Classes;

import java.time.LocalDate;

/**
 *
 */
public class CourseOfStudy extends GeneralValue {

    LocalDate begin;
    LocalDate end;
    boolean active;

    public CourseOfStudy(String caption, int id) {
        super(caption, id);
    }
}
