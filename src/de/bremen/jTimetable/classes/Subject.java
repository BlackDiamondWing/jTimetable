package de.bremen.jTimetable.classes;

/**
 * Sub-class of GeneralValue which represents a subject that a CourseOfStudy can attend and a Lecturer can teach.
 */
public class Subject extends GeneralValue {

    /**
     * Constructor.
     *
     * @param caption this.caption
     * @param id      this.id
     * @param active  this.active
     */
    public Subject(String caption, int id, boolean active) {
        super(caption, id, active);
    }
}
