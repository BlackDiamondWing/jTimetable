package de.bremen.jTimetable.classes.valueTypes;

/**
 * Clarifies in which section of studying a course currently is (which subjects they have to do in their theoretical
 * phase).
 */
public class StudySection extends GeneralValue {

    /**
     * Constructor.
     *
     * @param id      this.id
     * @param caption this.caption
     * @param active  this.active
     */
    public StudySection(int id, String caption, boolean active) {
        super(id, caption, active);
    }
}
