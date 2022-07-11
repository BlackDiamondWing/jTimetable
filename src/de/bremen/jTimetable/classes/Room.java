package de.bremen.jTimetable.classes;

/**
 * Sub-class of GeneralValue which represents a room in a Location that can be booked for a Subject.
 */
public class Room extends GeneralValue {


    /**
     * Reference to the Location where the room is.
     */
    private final int location;

    /**
     * Constructor.
     *
     * @param caption this.caption
     * @param id      this.id
     * @param active  this.active
     */
    public Room(String caption, int id, boolean active, int location) {
        super(caption, id, active);
        this.location = location;
    }

    /**
     * Getter for Location reference
     *
     * @return this.location
     */
    public int getLocation() {
        return location;
    }
}
