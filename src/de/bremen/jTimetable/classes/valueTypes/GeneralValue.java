package de.bremen.jTimetable.classes.valueTypes;

/**
 * Abstract parent class for clustering tables that contain a caption and an active status. Inherits the values id
 * from the parent class AbstractValue.
 */
public abstract class GeneralValue extends AbstractValue {

    /**
     * The values' caption in the database.
     */
    private final String caption;

    /**
     * Status whether the object is active.
     */
    private final boolean active;

    /**
     * Constructor.
     *
     * @param id      this.id
     * @param caption this.caption
     * @param active  this.active
     */
    public GeneralValue(int id, String caption, boolean active) {
        super(id);
        this.caption = caption;
        this.active = active;
    }

    /**
     * Getter for the values' caption.
     *
     * @return this.caption
     */
    public String getCaption() {
        return caption;
    }

    /**
     * Getter for isActive
     *
     * @return true if the value is active (this.isActive)
     */
    public boolean isActive() {
        return active;
    }
}
