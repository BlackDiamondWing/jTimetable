package de.bremen.jTimetable.classes.valueTypes;

/**
 * Sub-class of GeneralValue that represents a Location which can have several rooms.
 */
public class Location extends GeneralValue {


    /**
     * Constructor.
     *
     * @param id      this.id
     * @param caption this.caption
     * @param active  this.active
     */
    public Location(int id, String caption, boolean active) {
        super(id, caption, active);
    }

}
