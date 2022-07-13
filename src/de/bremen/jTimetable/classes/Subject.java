package de.bremen.jTimetable.classes;

/**
 * Sub-class of GeneralValue which represents a subject that a CourseOfStudy can attend and a Lecturer can teach.
 */
public class Subject extends GeneralValue {

    /**
     * Constructor.
     *
     * @param id      this.id
     * @param caption this.caption
     * @param active  this.active
     */
    public Subject(int id, String caption, boolean active) {
        super(id, caption, active);
    }
}
