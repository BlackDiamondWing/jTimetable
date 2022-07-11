package de.bremen.jTimetable.classes;

/**
 * Abstract parent class to the values that can be stored in the database.
 */
public abstract class GeneralValue {

    /**
     * The values' id in the database table
     */
    private int id;

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
     * @param caption this.caption
     * @param id      this.id
     * @param active  this.active
     */
    public GeneralValue(String caption, int id, boolean active) {
        this.caption = caption;
        this.id = id;
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
     * Getter for the values' id.
     *
     * @return this.id
     */
    public int getId() {
        return id;
    }

    /**
     * Getter for isActive
     *
     * @return true if the value is active (this.isActive)
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Setter for id, because it's automatically set by the database.
     * @param id the id the object has in the database (primary key)
     */
    public void setId(int id) {
        this.id = id;
    }
}
