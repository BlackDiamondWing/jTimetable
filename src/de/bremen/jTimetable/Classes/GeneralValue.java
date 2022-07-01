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
     *
     */
    public boolean active;

    /**
     *
     * @param caption
     * @param id
     * @param active
     */
    public GeneralValue(String caption, int id, boolean active) {
        this.caption = caption;
        this.id = id;
        this.active = active;
    }
}
