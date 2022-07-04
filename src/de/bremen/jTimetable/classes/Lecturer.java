package de.bremen.jTimetable.classes;

public class Lecturer extends GeneralValue{

    /**
     *
     */
    private String firstName;

    /**
     *
     */
    private String lastName;

    /**
     *
     */
    private int refLocationId;

    /**
     * Constructor.
     *
     * @param caption
     * @param id
     */
    public Lecturer(String caption, int id, boolean active) {
        super(caption, id, active);
    }
}
