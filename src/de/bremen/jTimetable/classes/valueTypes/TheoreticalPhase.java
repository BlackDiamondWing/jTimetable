package de.bremen.jTimetable.classes.valueTypes;

import java.time.LocalDate;

/**
 * Within a theoretical phase courses hav to complete their current study section.
 */
public class TheoreticalPhase extends GeneralValueWithDate {

    /**
     * Reference to a courses' id.
     */
    private int courseId;

    /**
     * Reference to a StudySections id.
     */
    private int studySectionId;

    /**
     * For one theoretical phase one course should remain in the same room.
     * TODO einfach Raum für den kompletten Zeitraum blocken und überprüfung für jede einzelne Stunde weglassen?
     *  --> muss das dann in den Konstructor?
     */
    private int roomId;

    /**
     * Constructor.
     *
     * @param id             this.id
     * @param caption        this.caption
     * @param active         this.active
     * @param startDay       this.startDay
     * @param endDay         this.endDay
     * @param courseId       this.courseId
     * @param studySectionId this.studySectionId
     * @param roomId         this.roomId
     */
    public TheoreticalPhase(int id, String caption, boolean active, LocalDate startDay, LocalDate endDay, int courseId,
                            int studySectionId, int roomId) {
        super(id, caption, active, startDay, endDay);
        this.courseId = courseId;
        this.studySectionId = studySectionId;
        this.roomId = roomId;
    }

    /*
    Generated getter and setter methods.
     */

    public int getCourseId() {
        return courseId;
    }

    public int getStudySectionId() {
        return studySectionId;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void setStudySectionId(int studySectionId) {
        this.studySectionId = studySectionId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }
}
