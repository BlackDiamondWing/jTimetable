package de.bremen.jTimetable.classes;

import java.time.LocalDate;

/**
 * Sub-class of GeneralValue that represents a course (class) that can attend subjects for a certain time period.
 */
public class CourseOfStudy extends GeneralValue {

    /**
     * Date of the beginning of the course.
     */
    private final LocalDate begin;
    /**
     * Date of the end of the course.
     */
    private final LocalDate end;

    /**
     * Constructor.
     *
     * @param id      this.id
     * @param caption this.caption
     * @param active  this.active
     * @param begin   this.begin
     * @param end     this.end
     */
    public CourseOfStudy(int id, String caption, boolean active, LocalDate begin, LocalDate end) {
        super(id, caption, active);
        this.begin = begin;
        this.end = end;
    }

    /**
     * Getter for beginning of course.
     *
     * @return this.begin
     */
    public LocalDate getBegin() {
        return begin;
    }

    /**
     * Getter for ending of course.
     *
     * @return This.end
     */
    public LocalDate getEnd() {
        return end;
    }
}
