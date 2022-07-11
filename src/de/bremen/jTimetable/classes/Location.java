package de.bremen.jTimetable.classes;

/**
 * Sub-class of GeneralValue that represents a Location which can have several rooms.
 */
public class Location extends GeneralValue {


    /**
     * Constructor.
     *
     * @param caption this.caption
     * @param id      this.id
     * @param active  this.active
     */
    public Location(String caption, int id, boolean active) {
        super(caption, id, active);
    }

}
