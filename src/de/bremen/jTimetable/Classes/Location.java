package de.bremen.jTimetable.Classes;

/**
 *
 */
public class Location extends GeneralValue{

    /**
     *
     */
    private boolean active;

    /**
     * Constructor.
     *
     * @param caption
     * @param id
     */
    public Location(String caption, int id) {
        super(caption, id);
    }
}
