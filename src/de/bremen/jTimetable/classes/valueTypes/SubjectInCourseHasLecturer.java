package de.bremen.jTimetable.classes.valueTypes;

/**
 * This class represents the database table that connects a Subject with a Lecturer and a CourseOfStudy.
 */
public class SubjectInCourseHasLecturer extends AbstractValue {

    /**
     * Reference to the theoreticalPhase id which contains the corresponding course TODO trotzdem Kursreferenz?
     */
    private int theoreticalPhaseId;

    /**
     * Reference to the Subject (just the id, because that's the only value that is in the corresponding database
     * table).
     */
    private int subjectId;

    /**
     * Reference to the Lecturer (just the id, because that's the only value that is in the corresponding database
     * table).
     */
    private int lecturer;

    /**
     * Number of hours that a subject has to be taught. 1 hour = 1 timeslot
     */
    private int targetHours;

    /**
     * Number of hours that are already planned in the timetable. It should be increased if a new lesson is planned and
     * decreased if a lesson has to be canceled.
     */
    private int actualHours;

    /**
     * Constructor.
     *
     * @param id                 values id in the corresponding database table
     * @param subjectId          this.subject (id)
     * @param theoreticalPhaseId this.course (id)
     * @param lecturerId         this.lecturer (id)
     * @param actualHours        this.actualHours (for a new, not existing object should be 0)
     */
    public SubjectInCourseHasLecturer(int id, int subjectId, int theoreticalPhaseId, int lecturerId, int targetHours, int actualHours) {
        super(id);
        this.subjectId = subjectId;
        this.theoreticalPhaseId = theoreticalPhaseId;
        this.lecturer = lecturerId;
        this.targetHours = targetHours;
        this.actualHours = actualHours;
    }

    /**
     * Will increase the amount of taught lessons by one.
     */
    public void increaseActualHours() {
        this.actualHours++;
    }

    /**
     * Will decrease the amount of taught lessons by one.
     */
    public void decreaseActualHours() {
        this.actualHours--;
    }

    /**
     * Checks whether one subject was taught completely by comparing target and actual hours.
     *
     * @return true if targetHours == actualHours, false if not
     */
    public boolean isFinished() {
        return this.targetHours == this.actualHours;
    }

    /*
    Generated getter and setter methods.
     */

    public int getTheoreticalPhaseId() {
        return theoreticalPhaseId;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public int getLecturer() {
        return lecturer;
    }

    public int getTargetHours() {
        return targetHours;
    }

    public int getActualHours() {
        return actualHours;
    }

    public void setTheoreticalPhaseId(int theoreticalPhaseId) {
        this.theoreticalPhaseId = theoreticalPhaseId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public void setLecturer(int lecturer) {
        this.lecturer = lecturer;
    }

    public void setTargetHours(int targetHours) {
        this.targetHours = targetHours;
    }

    public void setActualHours(int actualHours) {
        this.actualHours = actualHours;
    }
}
