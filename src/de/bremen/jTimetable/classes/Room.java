package de.bremen.jTimetable.classes;

/**
 * Sub-class of GeneralValue which represents a room in a Location that can be booked for a Subject.
 */
public class Room extends GeneralValue {


    /**
     * Reference to the Location where the room is.
     */
    private final Location location;

    /**
     * Constructor.
     *
     * @param id      this.id
     * @param caption this.caption
     * @param active  this.active
     */
    public Room(int id, String caption, boolean active, Location location) {
        super(id, caption, active);
        this.location = location;
    }

    /**
     * Getter for Location reference
     *
     * @return this.location
     */
    public Location getLocation() {
        return location;
    }
}
