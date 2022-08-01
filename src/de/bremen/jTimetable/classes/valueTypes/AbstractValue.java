package de.bremen.jTimetable.classes.valueTypes;

/**
 * Abstract parent class to every database value which only contains the id.
 */
public abstract class AbstractValue {

    /**
     * The values' id in the database table
     */
    private int id;

    /**
     * Default-Constructor
     */
    public AbstractValue() {
    }

    /**
     * Constructor.
     *
     * @param id the value has in the corresponding database-table
     */
    public AbstractValue(int id) {
        this.id = id;
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
     * Setter for id, because it's automatically set by the database.
     *
     * @param id the id the object has in the database (primary key)
     */
    public void setId(int id) {
        this.id = id;
    }
}
