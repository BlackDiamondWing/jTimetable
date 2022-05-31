package de.bremen.jTimetable.Classes;

public class Lecturer extends GeneralValue{
    //TODO check caption
    /**
     *
     */
    private String firstname;
    /**
     *
     */
    private String lastname;
    /**
     *
     */
    private int refLocationId;
    /**
     *
     */
    boolean active;

    /**
     * Constructor.
     *
     * @param caption
     * @param id
     */
    public Lecturer(String caption, int id) {
        super(caption, id);
    }
}
