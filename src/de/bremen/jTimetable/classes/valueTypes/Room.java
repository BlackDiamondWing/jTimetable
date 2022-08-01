package de.bremen.jTimetable.classes.valueTypes;

/**
 * Sub-class of GeneralValueWithLocation which represents a room in a Location that can be booked for a Subject.
 */
public class Room extends GeneralValueWithLocation {

    /**
     * Constructor.
     *
     * @param id         this.id
     * @param caption    this.caption
     * @param active     this.active
     * @param locationId this.locationId
     */
    public Room(int id, String caption, boolean active, int locationId) {
        super(id, caption, active, locationId);
    }
}
