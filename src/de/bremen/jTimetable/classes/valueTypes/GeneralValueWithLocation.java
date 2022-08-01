package de.bremen.jTimetable.classes.valueTypes;

/**
 * Adds a reference to a location to the abstract parent class GeneralValue and is abstract itself.
 */
public abstract class GeneralValueWithLocation extends GeneralValue {

    /**
     * Reference to a locations' id.
     */
    private int locationId;

    /**
     * Constructor.
     *
     * @param id         this.id
     * @param caption    this.caption
     * @param active     this.active
     * @param locationId this.locationId
     */
    public GeneralValueWithLocation(int id, String caption, boolean active, int locationId) {
        super(id, caption, active);
        this.locationId = locationId;
    }

    /*
    Generated getter and setter methods.
     */

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }
}
