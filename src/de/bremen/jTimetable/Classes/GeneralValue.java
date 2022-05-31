package de.bremen.jTimetable.Classes;

/**
 *
 */
public abstract class GeneralValue {

    /**
     *
     */
    public String caption;
    /**
     *
     */
    public int id;

    /**
     * Constructor.
     * @param caption
     * @param id
     */
    public GeneralValue(String caption, int id) {
        this.caption = caption;
        this.id = id;
    }
}
